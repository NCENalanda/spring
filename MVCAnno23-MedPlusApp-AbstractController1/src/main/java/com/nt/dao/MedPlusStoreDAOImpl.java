package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.MedicineDetailsBO;

@Repository("medDAO")
public class MedPlusStoreDAOImpl implements MedPlusStoreDAO {
	private static final String ALL_MEDICINES_DETAILS="SELECT MID,MEDNAME,PRICE,MFGDATE,EXPIRYDATE FROM  MEDPLUS_STORE";
   @Autowired
	private JdbcTemplate jt;



	public List<MedicineDetailsBO> retrieveAllMedicines() {
      List<MedicineDetailsBO> listBO=null;
      listBO=jt.query(ALL_MEDICINES_DETAILS, new MedPlusExtractor());
		return listBO;
	}
	
	private class MedPlusExtractor  implements ResultSetExtractor<List<MedicineDetailsBO>>{

		public List<MedicineDetailsBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			  List<MedicineDetailsBO> listBO=null;
			  MedicineDetailsBO  bo=null;
			  listBO=new ArrayList();
			  //copy ResultSet obj records ListBO collection
			  while(rs.next()){
				  bo=new MedicineDetailsBO();
				  bo.setMid(rs.getInt(1));
				  bo.setMedName(rs.getString(2));
				  bo.setPrice(rs.getInt(3));
				  bo.setMfgDate((java.util.Date)rs.getDate(4));
				  bo.setExpiryDate(rs.getDate(5));
				  listBO.add(bo);
			  }//while
			return listBO;
		}//method
	}//class

}
