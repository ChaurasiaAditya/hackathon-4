/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.ticketing.model;

public class BusTicket {
    private String scheduleNumber;
    private String routeNumber;
    private int ticketFromStopId;
    private int ticketFromStopSeqNumber;
    private int ticketTillStopId;
    private int ticketTillStopSeqNumber;
    private String ticketDate;
    private String ticketTime;
    private double totalTicketAMount;
    private double travelledKM;

    public BusTicket() {
    }
}
