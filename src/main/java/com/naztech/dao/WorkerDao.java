package com.naztech.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naztech.model.Worker;
import com.naztech.util.JDBCConnectionPool;

public class WorkerDao implements GenericDao<Worker> {
	//JDBC Connection
		JDBCConnectionPool jdbcConnection = new JDBCConnectionPool();
		
		PreparedStatement pstm= null;
	

	public boolean save(Worker sql) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		pstm= jdbcConnection.con.prepareStatement("Insert into dbo.T_Masum_Worker values(?,?,?,?)");
		pstm.setInt(1, sql.getId());
		pstm.setString(2, sql.getName());
		pstm.setInt(3, sql.getSalary());
		pstm.setString(4, sql.getDept());
		pstm.execute();
		pstm.close();
		return true;
	}

	public boolean update(Worker sql) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		pstm= jdbcConnection.con.prepareStatement("Update dbo.T_Masum_Worker SET name=?, salary=?, dept=? WHERE id=? ");
		pstm.setString(1, sql.getName());
		pstm.setFloat(2, sql.getSalary());
		pstm.setString(3, sql.getDept());
		pstm.setInt(4, sql.getId());
		
		pstm.executeUpdate();
		pstm.close();
		
		return true;
	}

	public boolean delete(Worker sql) throws ClassNotFoundException, SQLException {
		pstm= jdbcConnection.con.prepareStatement("Delete from dbo.T_Masum_Worker where id=?");
		pstm.setInt(1, sql.getId());
		pstm.executeUpdate();
		return true;
	}

	public Worker find(int id) throws ClassNotFoundException, SQLException {
		Worker wk = null;
		  
		  try {
			pstm = jdbcConnection.con.prepareStatement("SELECT * FROM dbo.T_Masum_Worker WHERE id=?");
		  	pstm.setInt(1, id); // Set 1st WHERE to int
		  	
		  	ResultSet resultSet = pstm.executeQuery();
		  
		  if (resultSet.next()) {
			  wk = new Worker();
			  
			  wk.setId(resultSet.getInt(1));
			  wk.setName(resultSet.getString(2));
			  wk.setSalary(resultSet.getInt(3));
			  wk.setDept(resultSet.getString(4));			 
			  
			  
		  }
		  resultSet.close(); 
		  pstm.close();
		  } catch (SQLException e) { //e.printStackTrace(); throw new
		  }
		  return wk; }
	

	public List<Worker> getAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 ArrayList<Worker> worker = new ArrayList<Worker>();
		 
		  try { 
			pstm = jdbcConnection.con.prepareStatement("Select * from dbo.T_Masum_Worker");
		  
			ResultSet resultSet = pstm.executeQuery();
		  
			Worker wk = null;
			
		      while (resultSet.next()) {
		  
		    	  wk = new Worker();
			  
		    	  wk.setId(resultSet.getInt(1));
				  wk.setName(resultSet.getString(2));
				  wk.setSalary(resultSet.getInt(3));
				  wk.setDept(resultSet.getString(4));
			   
				  worker.add(wk);
			  }
			  resultSet.close(); 
			  pstm.close();

		  } catch (SQLException e) {
			  e.printStackTrace();
			throw new
			  	RuntimeException(e); 
			  }
		  
		  return worker;
		  }
		 
	
	public int maxValue() throws ClassNotFoundException, SQLException {
		//Worker wk=null;
			int id = 0;
		  
		  try {
			pstm = jdbcConnection.con.prepareStatement("SELECT  MAX(salary) FROM dbo.T_Masum_Worker");
		  	//pstm.setInt(1, id); // Set 1st WHERE to int
		  	
		  	ResultSet resultSet = pstm.executeQuery();
		  
		  if (resultSet.next()) {
			 
		            id = resultSet.getInt(1) ;
				
				// wk= new Worker(); wk.setSalary(id); System.out.println(wk.getSalary());
				 
		        
		    
			  
		  }
		  
		  resultSet.close(); 
		  pstm.close();
		  } catch (SQLException e) { //e.printStackTrace(); throw new
		  }
		return id;

		  
		  }

	public int min() throws ClassNotFoundException, SQLException {
	 	//Worker wk=null;
		int id = 0;
	  
	  try {
		pstm = jdbcConnection.con.prepareStatement("SELECT  MIN(salary) FROM dbo.T_Masum_Worker");
	  	//pstm.setInt(1, id); // Set 1st WHERE to int
	  	
	  	ResultSet resultSet = pstm.executeQuery();
	  
	  if (resultSet.next()) {
		 
	            id = resultSet.getInt(1) ;
			
//			 wk= new Worker();
//			 wk.setSalary(id);
//			 System.out.println("MIN Salary"+wk.getSalary());
//			 
//	        
	    
		  
	  }
	  
	  resultSet.close(); 
	  pstm.close();
	  } catch (SQLException e) { //e.printStackTrace(); throw new
	  }
	return id;

	  
	  }

	}