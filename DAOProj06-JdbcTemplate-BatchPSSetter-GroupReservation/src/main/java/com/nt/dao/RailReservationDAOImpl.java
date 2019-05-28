package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.nt.bo.TicketDetailsBO;
/*create table Railway_tickets(pnr number(10) primary key,
		    trainNO number(6),pass_name varchar2(20),source varchar2(20),destination varchar2(20));
*/
@Repository
public class RailReservationDAOImpl implements RailReservationDAO {
	private static final String  INSERT_RAILWAY_TICKETS="INSERT INTO  RAILWAY_TICKETS(PNR,TRAINNO,PASS_NAME,SOURCE,DESTINATION) VALUES(?,?,?,?,?)";
	@Autowired
	private  JdbcTemplate jt;

	@Override
	public int[] insertGroupTickets(List<TicketDetailsBO> listBO) {
	int result[]=null;
	result=jt.batchUpdate(INSERT_RAILWAY_TICKETS,new BatchPreparedStatementSetter() {
		
		
		
		@Override
		public void setValues(PreparedStatement ps, int i) throws SQLException {
			System.out.println("setValues(-,-)");
		    ps.setInt(1, listBO.get(i).getPnr());
		    ps.setInt(2, listBO.get(i).getTrainNo());
		    ps.setString(3, listBO.get(i).getPassName());
		    ps.setString(4, listBO.get(i).getSource());
		    ps.setString(5, listBO.get(i).getDest());
		}
		
		@Override
		public int getBatchSize() {
			System.out.println("getBatchSize()");
			return listBO.size();
		}
	});
		return null;
	}

}
