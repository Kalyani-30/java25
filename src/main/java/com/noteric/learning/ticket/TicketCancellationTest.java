package com.noteric.learning.ticket;

import java.util.Date;

public class TicketCancellationTest {
    public static void main(String[] args) {
        TicketCencellation ticketCencellation=new Bus();
        Date bookingDate=new Date(System.currentTimeMillis()+(2*24)*60*60*1000);
        Date cancellationDate=new Date(System.currentTimeMillis()+24*60*60*1000);
        System.out.println(bookingDate);
        System.out.println(cancellationDate);
        Ticket ticket=new Ticket(500,bookingDate);
        ticketCencellation.refundforCancellation(ticket,cancellationDate);
    }
}