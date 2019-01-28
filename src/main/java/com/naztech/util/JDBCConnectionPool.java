package com.naztech.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionPool {
	

	// Connection er akta variable newa hoyeche than oitar instance ke null kora hoyeche
		public static Connection con;
		private static Connection instance=null;

		     public static void getConnection() {
		 
		         try {
		             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		             con = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433; databaseName=DEV_TEST; user= dev_test_dbo; password = dev_test_dbo123");
		             
		             //Connection holo kina ta confirm howar jonno... na dileo chole
		        	 if(con != null) {
		        		 System.out.println("Connected");
		            	 //DatabaseMetaData metaObj = (DatabaseMetaData) con.getMetaData();
		            	 //System.out.println("Driver Name?= " + metaObj.getDriverName() + ", Driver Version?= " + metaObj.getDriverVersion() + ", Product Name?= " + metaObj.getDatabaseProductName() + ", Product Version?= " + metaObj.getDatabaseProductVersion());
		             }
		 
		         } catch(Exception sqlException) {
		             sqlException.printStackTrace();
		         }
		     }
	}     
		
