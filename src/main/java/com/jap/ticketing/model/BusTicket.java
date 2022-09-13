/*
 * Author Name: Aditya Chaurasia
 * Date: 13-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.ticketing.model;

import java.util.Objects;

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


    public double getTotalTicketAMount() {
        return totalTicketAMount;
    }

    public double getTravelledKM() {
        return travelledKM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusTicket busTicket = (BusTicket) o;
        return ticketFromStopId == busTicket.ticketFromStopId && ticketFromStopSeqNumber == busTicket.ticketFromStopSeqNumber && ticketTillStopId == busTicket.ticketTillStopId && ticketTillStopSeqNumber == busTicket.ticketTillStopSeqNumber && Double.compare(busTicket.totalTicketAMount, totalTicketAMount) == 0 && Double.compare(busTicket.travelledKM, travelledKM) == 0 && Objects.equals(scheduleNumber, busTicket.scheduleNumber) && Objects.equals(routeNumber, busTicket.routeNumber) && Objects.equals(ticketDate, busTicket.ticketDate) && Objects.equals(ticketTime, busTicket.ticketTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleNumber, routeNumber, ticketFromStopId, ticketFromStopSeqNumber, ticketTillStopId, ticketTillStopSeqNumber, ticketDate, ticketTime, totalTicketAMount, travelledKM);
    }

    @Override
    public String toString() {
        return "BusTicket : { " +
                "scheduleNumber = " + scheduleNumber + '\'' +
                ", routeNumber = " + routeNumber + '\'' +
                ", ticketFromStopId = " + ticketFromStopId +
                ", ticketFromStopSeqNumber = " + ticketFromStopSeqNumber +
                ", ticketTillStopId = " + ticketTillStopId +
                ", ticketTillStopSeqNumber = " + ticketTillStopSeqNumber +
                ", ticketDate = " + ticketDate + '\'' +
                ", ticketTime =" + ticketTime + '\'' +
                ", totalTicketAMount = " + totalTicketAMount +
                ", travelledKM = " + travelledKM +
                " } \n";
    }
}
