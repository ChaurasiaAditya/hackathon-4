/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.ticketing.service;

import com.jap.ticketing.model.BusTicket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTicketData {

    /**
     * It reads the file line by line, splits the line by comma, and creates a BusTicket object from the data
     *
     * @param fileNAme The name of the file to read from.
     * @return A list of BusTicket objects.
     */
    public List<BusTicket> busTicketList(String fileNAme) {
        List<BusTicket> busTicketList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNAme))) {
            String readLine = bufferedReader.readLine();
            while ((readLine = bufferedReader.readLine()) != null) {
                String[] data = readLine.split(",");
                BusTicket busTicket = new BusTicket();
                busTicket.setScheduleNumber(data[0].trim());
                busTicket.setRouteNumber(data[1].trim());
                busTicket.setTicketFromStopId(Integer.parseInt(data[2].trim()));
                busTicket.setTicketFromStopSeqNumber(Integer.parseInt(data[3].trim()));
                busTicket.setTicketTillStopId(Integer.parseInt(data[4].trim()));
                busTicket.setTicketTillStopSeqNumber(Integer.parseInt(data[3].trim()));
                busTicket.setTicketDate(data[6].trim());
                busTicket.setTicketTime(data[7].trim());
                busTicket.setTotalTicketAMount(Double.parseDouble(data[8].trim()));
                busTicket.setTravelledKM(Double.parseDouble(data[9].trim()));
                busTicketList.add(busTicket);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return busTicketList;
    }
}
