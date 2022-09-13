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

    /**
     * This function takes a list of BusTicket objects as input and returns a list of BusTicket objects sorted by the
     * distance travelled in descending order
     *
     * @param busTicketList The list of BusTicket objects that you want to sort.
     * @return A list of BusTicket objects sorted by the distance travelled.
     */
    public List<BusTicket> getAllTicketDetailSortedByDistanceTravelled(List<BusTicket> busTicketList) {

        Comparator<BusTicket> BusTicketComparator = (BusTicket o1, BusTicket o2) -> Double.compare(o2.getTravelledKM(), o1.getTravelledKM());
        busTicketList.sort(BusTicketComparator);
        return busTicketList;
    }

    /**
     * > This function takes a list of bus tickets and returns the total amount of money collected from the sales of those
     * tickets
     *
     * @param busTicketList A list of BusTicket objects.
     * @return The total amount of money collected from all the tickets sold.
     */
    public double totalCollectionsMadeFromSales(List<BusTicket> busTicketList) {
        return busTicketList.stream().mapToDouble(BusTicket::getTotalTicketAMount).sum();
    }
}