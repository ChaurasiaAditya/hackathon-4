package com.jap.ticketing;

import com.jap.ticketing.model.BusTicket;
import com.jap.ticketing.service.BusTicketService;
import com.jap.ticketing.service.ReadTicketData;

import java.util.List;

public class Hello {

    public static void main(String[] args) {

        // create an object for Read ticket class
        ReadTicketData readTicketData = new ReadTicketData();

        // Call the read ticket method and store in an Array List
        List<BusTicket> busTicketList = readTicketData.busTicketList("src/main/resources/sample.csv");

        // Print the bus Ticket List
        System.out.println(busTicketList);

        // Create an object for Bus Ticket service
        BusTicketService busTicketService = new BusTicketService();

        // Call the Sorted method and Store in an Array List
        List<BusTicket> sortedBusTicketList = busTicketService.getAllTicketDetailSortedByDistanceTravelled(busTicketList);

        // Print the Sorted Bus Ticket List
        System.out.println(sortedBusTicketList);

        // call the total collection method and Store the amount in a variable
        double totalCollectionsFromBus = busTicketService.totalCollectionsMadeFromSales(busTicketList);

        // Print the Total Collection from Tickets
        System.out.println("Total Collection From Tickets = $" + totalCollectionsFromBus);
    }
}
