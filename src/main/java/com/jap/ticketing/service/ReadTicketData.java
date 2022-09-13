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

    public List<BusTicket> busTicketList(String fileNAme) {
        List<BusTicket> busTicketList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNAme))) {
            String readLine = bufferedReader.readLine();
            while ((readLine = bufferedReader.readLine()) != null) {
                String [] data = readLine.split(",");
                String scheduledNumber = data[0].trim();
                String routeNumber = data[1].trim();
                int ticketFromStopId = Integer.parseInt(data[2].trim());
                int ticketFromStopSeqNumber = Integer.parseInt(data[3].trim());
                int ticketTillStopId = Integer.parseInt(data[4].trim());
                int ticketTillStopSeqNumber = Integer.parseInt(data[5].trim());
                String ticketDate = data[6].trim();
                String ticketTime = data[7].trim();
                double totalTicketAMount = Double.parseDouble(data[8].trim());
                double travelledKM = Double.parseDouble(data[9].trim());;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return busTicketList;
    }
}
