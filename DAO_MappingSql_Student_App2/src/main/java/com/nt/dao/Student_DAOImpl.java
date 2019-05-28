package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.nt.bo.StudentBO;

public class Student_DAOImpl implements Student_DAO {
	private static final String INSERT_STUDENT="INSERT INTO STUDENT_TAB1(NAME,RANK,SID) VALUES (?,?,SEQ_SID.NEXTVAL)";
	private static final String GET_STUDENT_BY_SID="SELECT NAME,RANK,SID FROM STUDENT_TAB1 WHERE SID=?";
	private static final String UPDATE_STUDENT="UPDATE STUDENT_TAB1 SET NAME=?,RANK=? WHERE SID=?";
	private static final String DELETE_STUDENT="DELETE FROM STUDENT_TAB1 WHERE  SID=?";
	private static final String ALL_STUDENT   =" SELECT NAME,RANK,SID FROM STUDENT_TAB1";
	//update  student_tab1 set name='Rohan',rank=109 where sid=1239;
	// DELETE FROM STUDENT_TAB1 WHERE  SID=1238;
	private DataSource ds;
	
	private Student_AllRecords   all_slector;
	private Student_GetInfo      get_slector;
	private Student_UpdateInfo   update_updator;
	private Student_DeleteInfo   delete_updator;
	private Student_InsertInfo   insert_updator;
	

	public Student_DAOImpl(DataSource ds) {
		// TODO Auto-generated constructor stub
		all_slector    =  new Student_AllRecords(ds, ALL_STUDENT);
		get_slector    =  new Student_GetInfo(ds, GET_STUDENT_BY_SID);
		update_updator =  new Student_UpdateInfo(ds, UPDATE_STUDENT);
		delete_updator =  new Student_DeleteInfo(ds, DELETE_STUDENT);
		insert_updator =  new Student_InsertInfo(ds, INSERT_STUDENT);
		
	}
	
	@Override
	public int insertInfo(StudentBO bo) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("bo in service "+bo.toString());
		count=insert_updator.update(bo.getName(),bo.getRank());
		System.out.println("Count "+count);
		return count;
	}

	@Override
	public Object getInfo(StudentBO bo1) {
		// TODO Auto-generated method stub
		StudentBO bo=null;
		bo=get_slector.findObject(bo1.getId());
		
		return bo;
	}

	@Override
	public int updateInfo(StudentBO bo) {
		// TODO Auto-generated method stub
		int count=0;
		//System.out.println(bo.toString());
		count=update_updator.update(bo.getName(),bo.getRank(),bo.getId());
		return count;
	}

	@Override
	public int deleteInfo(int id) {
		// TODO Auto-generated method stub
		int count =0;
		count=delete_updator.update(id);
		return count;
	}

	@Override
	public List<StudentBO> fetchAllRecords() {
		// TODO Auto-generated method stub
		List<StudentBO> listBO=null;
		listBO=all_slector.execute();
		return listBO;
	}// close fetchAllRecords()
	
	
	
	/**         Inner Class 05                                  */
	
	private class Student_AllRecords extends MappingSqlQuery<StudentBO>{
		
		public Student_AllRecords(DataSource ds, String query) {
			//call Super class  Specific Constructor
			super(ds, query);
			//call Super class method
			super.compile();
			System.out.println("in Student_AllRecords 0 param constructor");
		}//constructor

		@Override
		protected StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			System.out.println("In maRow " );
			StudentBO bo=null;
			bo=new StudentBO();
			bo.setName(rs.getString(1));
			bo.setRank(rs.getInt(2));
			bo.setId(rs.getInt(3));
			return bo;
		}//method
			
	}// close inner class

	/**         Inner Class 02                                  */
	
	private class Student_GetInfo extends MappingSqlQuery<StudentBO>{
		
		public Student_GetInfo(DataSource ds,String query) {
			// TODO Auto-generated constructor stub
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}

		@Override
		protected StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			StudentBO bo=null;
			bo=new StudentBO();
			bo.setName(rs.getString(1));
			bo.setRank(rs.getInt(2));
			bo.setId(rs.getInt(3));
			return bo;
		}//close mapRow()
			
	}//close Inner class 02
	
	                   /**      INNER CLASS 03                       */
	
	private final class Student_UpdateInfo extends SqlUpdate {
		
		public Student_UpdateInfo(DataSource ds, String query) {
			// TODO Auto-generated constructor stub
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}//close Constructor
			
	}//close inner class 03
	
	
	 /**      INNER CLASS 04                      */
	
private final class Student_DeleteInfo extends SqlUpdate {
		
		public Student_DeleteInfo(DataSource ds, String query) {
			// TODO Auto-generated constructor stub
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}//close Constructor
			
	}//close inner class 04


/**      INNER CLASS 04                      */

private final class Student_InsertInfo extends SqlUpdate {
		
		public Student_InsertInfo(DataSource ds, String query) {
			// TODO Auto-generated constructor stub
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			
			super.compile();
		}//close Constructor
			
	}//close inner class 04

}
