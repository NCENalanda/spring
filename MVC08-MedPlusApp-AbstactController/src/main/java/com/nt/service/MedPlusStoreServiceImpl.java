package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.MedicineDetailsBO;
import com.nt.dao.MedPlusStoreDAO;
import com.nt.dto.MedicineDetailsDTO;

public class MedPlusStoreServiceImpl implements MedPlusStoreService {
	private  MedPlusStoreDAO dao;

	public MedPlusStoreServiceImpl(MedPlusStoreDAO dao) {
		this.dao = dao;
	}

	public List<MedicineDetailsDTO> getAllMedicines() {
		List<MedicineDetailsBO> listBO=null;
		final List<MedicineDetailsDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.retrieveAllMedicines();
		//copy ListBO to ListDTO
		listBO.forEach(bo->{
			MedicineDetailsDTO dto=new MedicineDetailsDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
