package com.naztech.dao;

import static org.junit.Assert.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.naztech.model.Worker;
import com.naztech.util.JDBCConnectionPool;


public class WorkerDaoTest {
	JDBCConnectionPool jdbcConnection = new JDBCConnectionPool();
	WorkerDao wd=new WorkerDao();
	
	@Test
	public void testSave() throws ClassNotFoundException, SQLException {
		Worker w=new Worker();
		w.setId(1);
		w.setName("Sajal");
		w.setSalary(1000);
		w.setDept("NT");
		
		 jdbcConnection.getConnection();
		assertTrue(wd.save(w)); 
	
	}

	@Test
	public void testUpdate() throws ClassNotFoundException, SQLException {
		
			
		    Worker w=new Worker();
		    w.setId(3);
			w.setName("naztech");
			w.setSalary(12000);
			w.setDept("DD");
		    
		    jdbcConnection.getConnection();
		    
			assertTrue(wd.update(w));
		
		
	}

	@Test
	public void testDelete() throws ClassNotFoundException, SQLException {
		 Worker wk=new Worker();
	    wk.setId(1);
	    jdbcConnection.getConnection();
	    
		assertTrue(wd.delete(wk));
		
	}

	@Test
	public void testFind() throws ClassNotFoundException, SQLException {
		
	    
	}

	@Test
	public void testGetAll() throws ClassNotFoundException, SQLException {
		
		Worker wk = new Worker();
		List<Worker> empList = new ArrayList<Worker>();
		 jdbcConnection.getConnection();
		empList = wd.getAll();
		
		assertEquals(empList.size(),4);

	}
	
	@Test
	public void testmin() throws ClassNotFoundException, SQLException {
		
			
	}
	@Test
	public void testMaxValue() throws ClassNotFoundException, SQLException {
		
	    
	}
		
}
