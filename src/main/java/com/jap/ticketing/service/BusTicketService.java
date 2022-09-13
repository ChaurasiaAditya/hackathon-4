/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.ticketing.service;

import com.jap.ticketing.model.BusTicket;

import java.util.Comparator;
import java.util.List;

public class BusTicketService {

    public List<BusTicket> getAllTicketDetailSortedByDistanceTravelled(List<BusTicket> busTicketList){

        Comparator<BusTicket> BusTicketComparator = new Comparator<BusTicket>() {
            @Override
            public int compare(BusTicket o1, BusTicket o2) {
                return Double.compare(o2.getTravelledKM(),o1.getTravelledKM());
            }
        };busTicketList.sort(BusTicketComparator);
        return busTicketList;
    }
}
