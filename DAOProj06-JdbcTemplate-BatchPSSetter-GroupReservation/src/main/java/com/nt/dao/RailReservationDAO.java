package com.nt.dao;

import java.util.List;

import com.nt.bo.TicketDetailsBO;

public interface RailReservationDAO {
	public int[]  insertGroupTickets(List<TicketDetailsBO> listBO);

}
