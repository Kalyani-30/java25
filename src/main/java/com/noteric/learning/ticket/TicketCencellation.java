package com.noteric.learning.ticket;

import java.util.Date;

public interface TicketCencellation {

    double refundforCancellation(Ticket ticket, Date cancelDate);

}
