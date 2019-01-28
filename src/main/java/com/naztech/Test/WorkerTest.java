package com.naztech.Test;

import java.sql.SQLException;

import com.naztech.dao.WorkerDao;
import com.naztech.model.Worker;
import com.naztech.util.JDBCConnectionPool;

public class WorkerTest {
	

	public static void main(String[] args) {
		//JDBC Connection
		JDBCConnectionPool jdbcConnection = new JDBCConnectionPool();
		//Repository
		WorkerDao dao = new WorkerDao(); 
        // Create instance of Employee object
        Worker wk = new Worker();
        jdbcConnection.getConnection();
        //For SAVING data into Employee Table
        try {
        	
	        wk.setSalary(dao.min());
	        System.out.println("MIN Value : "+wk.getSalary());
	        
	        wk.setSalary(dao.maxValue());
	        System.out.println("Max Value : "+wk.getSalary());
	        
	        
	        
        	
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
        //save
//        try {         
//        wk.setName("Sanowar");
//        wk.setSalary(20000);
//        wk.setDept("Soft");
//          
//        // Get MySQL Connection
//       
//        // Save user in DB
//        dao.save(wk);
//        
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Update
		
		
//		JDBCConnectionPool jdbcConnection = new JDBCConnectionPool();
//		WorkerDao dao = new WorkerDao(); 
//		Worker wk=new Worker();
//		 jdbcConnection.getConnection();
//		try { 
//		
//        	wk.setId(4);
//            wk.setName("Raz");
//            wk.setSalary(500);
//            wk.setDept("ky");
//            
//            
//            
//            // Save user in DB
//            dao.update(wk);
//            
//            System.out.println("Updating");
//            
//    		} catch (ClassNotFoundException e) {
//    			e.printStackTrace();
//    		} catch (SQLException e) {
//    			e.printStackTrace();
//    		}
//        
}

}
	 
	 


