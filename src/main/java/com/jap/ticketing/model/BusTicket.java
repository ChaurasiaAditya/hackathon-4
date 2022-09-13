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

    public String getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(String scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getTicketFromStopId() {
        return ticketFromStopId;
    }

    public void setTicketFromStopId(int ticketFromStopId) {
        this.ticketFromStopId = ticketFromStopId;
    }

    public int getTicketFromStopSeqNumber() {
        return ticketFromStopSeqNumber;
    }

    public void setTicketFromStopSeqNumber(int ticketFromStopSeqNumber) {
        this.ticketFromStopSeqNumber = ticketFromStopSeqNumber;
    }

    public int getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(int ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public int getTicketTillStopSeqNumber() {
        return ticketTillStopSeqNumber;
    }

    public void setTicketTillStopSeqNumber(int ticketTillStopSeqNumber) {
        this.ticketTillStopSeqNumber = ticketTillStopSeqNumber;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public double getTotalTicketAMount() {
        return totalTicketAMount;
    }

    public void setTotalTicketAMount(double totalTicketAMount) {
        this.totalTicketAMount = totalTicketAMount;
    }

    public double getTravelledKM() {
        return travelledKM;
    }

    public void setTravelledKM(double travelledKM) {
        this.travelledKM = travelledKM;
    }
}
