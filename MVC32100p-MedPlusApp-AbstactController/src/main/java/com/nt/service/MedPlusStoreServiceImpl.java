package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.MedicineDetailsBO;
import com.nt.dao.MedPlusStoreDAO;
import com.nt.dto.MedicineDetailsDTO;

@Service("medService")
public class MedPlusStoreServiceImpl implements MedPlusStoreService {
   @Autowired
	private  MedPlusStoreDAO dao;



	@Transactional(propagation=Propagation.REQUIRED,readOnly=true,transactionManager="dsTxMgmr")
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
