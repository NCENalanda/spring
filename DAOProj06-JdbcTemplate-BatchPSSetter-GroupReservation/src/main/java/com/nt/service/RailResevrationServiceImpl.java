package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.TicketDetailsBO;
import com.nt.dao.RailReservationDAO;
import com.nt.dto.TicketDetailsDTO;

@Service("railService")
public class RailResevrationServiceImpl implements RailReservationService {
	@Autowired
	private RailReservationDAO dao;

	@Override
	public String performGroupTicketReservation(List<TicketDetailsDTO> listDTO) {
		List<TicketDetailsBO>  listBO=new ArrayList();
		int result[]=null;
		//Convert listDTO to listBO
		listDTO.forEach(dto->{
			TicketDetailsBO bo=new TicketDetailsBO();
			BeanUtils.copyProperties(dto,bo);
			listBO.add(bo);
		});
		//use DAO
		result=dao.insertGroupTickets(listBO);
		if(result!=null)
			return "Group Reservation is done";
		else
			return "Group Reservation is not done";
	}//method
}//class
