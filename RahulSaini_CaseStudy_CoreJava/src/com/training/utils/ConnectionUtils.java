package com.training.utils;

import java.sql.*;
import java.util.Properties;
import org.apache.log4j.Logger;
import java.io.*;

public class ConnectionUtils {
	
	static Logger log = Logger.getLogger(ConnectionUtils.class.getName());

	private static  String[] getPropsAsArray() throws IOException {
		
		String fileName = "resources/DbConnection.properties";
		InputStream stream = ConnectionUtils.class.getClassLoader().getResourceAsStream(fileName);
		
		Properties props = new Properties();
		
		props.load(stream);
		String url = props.getProperty("database.url");
		String passWord = props.getProperty("database.passWord");
		String userName = props.getProperty("database.userName");		
		
		return new String[] {url,userName,passWord};
	}
	
	public static Connection getMySqlConnection() {
		
		Connection connection = null;
				
		try {
			
			String[] values = getPropsAsArray();
			
		    log.info("Connecting to the database");
			connection = DriverManager.getConnection(values[0], values[1], values[2]);
			log.info("Connected to database successfully");

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
			
		return connection;
	}
	

}
