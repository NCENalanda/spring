package com.nt.test;


import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.TicketDetailsDTO;
import com.nt.service.RailReservationService;

public class BatchInsertionTest {

	public static void main(String[] args) {
		Scanner sc=null;
		TicketDetailsDTO dto=null;
		List<TicketDetailsDTO> listDTO=null;
		ApplicationContext ctx;
		RailReservationService service=null;
	    int groupSize=0;
		//read inputs
	    listDTO=new ArrayList();
		sc=new Scanner(System.in);
		System.out.println("Enter Group Size::");
		groupSize=sc.nextInt();
		for(int i=0;i<groupSize;++i){
			System.out.println("Enter "+(i+1)+ "Passenger details");
			dto=new TicketDetailsDTO();
			System.out.println("Enter pnr::");
			   dto.setPnr(sc.nextInt());
			   System.out.println("Enter Train No::");
			   dto.setTrainNo(sc.nextInt());
			   System.out.println("Enter Passenger Name::");
			   dto.setPassName(sc.next());
			   System.out.println("Enter Source ::");
			   dto.setSource(sc.next());
			   System.out.println("Enter Destination ::");
			   dto.setDest(sc.next());
           //add dto to ListDTO
			   listDTO.add(dto);
		}//for
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("railService",RailReservationService.class);
		//invoke method
		System.out.println(service.performGroupTicketReservation(listDTO));
		//close Container
		((AbstractApplicationContext) ctx).close();
	}

}
