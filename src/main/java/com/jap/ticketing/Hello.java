package com.jap.ticketing;

import com.jap.ticketing.model.BusTicket;
import com.jap.ticketing.service.TicketService;
import com.jap.ticketing.service.TicketData;

import java.util.List;

public class Hello {

    public static void main(String[] args) {

        // create an object for Read ticket class
        TicketData ticketData = new TicketData();

        System.err.println("Welcome to Florida Red Line LLC");
        // Call the read ticket method and store in an Array List
        List<BusTicket> busTicketList = ticketData.busTicketList("src/main/resources/sample.csv");

        // Print the bus Ticket List
        System.out.println("--------------------------------------- Ticket List Before Sorting -------------------------------");
        System.out.println("Schedule Number    Route Number    From Stop Id     From Stop Seq Number    Till Stop ID    Till Stop Seq Number      Date               Time             Amount       Distance In KM");
        System.out.println(busTicketList);

        // Create an object for Bus Ticket service
        TicketService ticketService = new TicketService();

        // Call the Sorted method and Store in an Array List
        List<BusTicket> sortedBusTicketList = ticketService.getAllTicketDetailSortedByDistanceTravelled(busTicketList);

        // Print the Sorted Bus Ticket List
        System.out.println("------------------------------------------ Ticket List After Sorting ---------------------------------------");
        System.out.println("Schedule Number    Route Number    From Stop Id     From Stop Seq Number    Till Stop ID    Till Stop Seq Number      Date               Time             Amount       Distance In KM");
        System.out.println(sortedBusTicketList);

        // call the total collection method and Store the amount in a variable
        double totalCollectionsFromBus = ticketService.totalCollectionsMadeFromSales(busTicketList);

        // Print the Total Collection from Tickets
        System.out.println("-----------------------------------------");
        System.out.println("Total Collection From Tickets = $" + totalCollectionsFromBus);
        System.out.println("-----------------------------------------");
    }
}
