package com.nt.service;

import java.util.List;

import com.nt.dto.TicketDetailsDTO;

public interface RailReservationService {
	public  String  performGroupTicketReservation(List<TicketDetailsDTO> listDTO);

}
