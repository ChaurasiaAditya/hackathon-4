/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.ticketing.service;

import com.jap.ticketing.model.BusTicket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTicketData {

    public List<BusTicket> busTicketList(String fileNAme){
        List<BusTicket> busTicketList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNAme))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return busTicketList;
    }
}
