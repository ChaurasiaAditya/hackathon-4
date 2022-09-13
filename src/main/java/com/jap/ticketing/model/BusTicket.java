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

    public BusTicket(String scheduleNumber,
                     String routeNumber,
                     int ticketFromStopId,
                     int ticketFromStopSeqNumber,
                     int ticketTillStopId,
                     int ticketTillStopSeqNumber,
                     String ticketDate,
                     String ticketTime,
                     double totalTicketAMount,
                     double travelledKM) {
        this.scheduleNumber = scheduleNumber;
        this.routeNumber = routeNumber;
        this.ticketFromStopId = ticketFromStopId;
        this.ticketFromStopSeqNumber = ticketFromStopSeqNumber;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSeqNumber = ticketTillStopSeqNumber;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAMount = totalTicketAMount;
        this.travelledKM = travelledKM;
    }
}
