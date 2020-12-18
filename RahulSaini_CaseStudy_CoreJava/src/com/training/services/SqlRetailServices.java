package com.training.services;

import org.apache.log4j.Logger;
import java.sql.*;
import com.training.iface.DataAccess;
import com.training.models.Products;

public class SqlRetailServices implements DataAccess<Products>{

	private Connection connection;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	public SqlRetailServices(Connection connection) {
		super();
		this.connection = connection;
			      
	    String sql = "CREATE TABLE inventory " +
	                   "(Date VARCHAR(20) not NULL, " +
	                   " ItemName VARCHAR(20), " + 
	                   " Quantity INTEGER, " + 
	                   " Category VARCHAR(20) )";
	    
	   
		try( PreparedStatement pstmt = connection.prepareStatement(sql);) {
		    pstmt.executeUpdate(sql);

		} catch (SQLException e) {
			log.info("Table Exists");
		}
	}

	
	@Override
	public boolean add(Products t, String date) {
		
		String sql="insert into inventory values(?,?,?,?)";
		
		int rowAdded=0;
		
		try (PreparedStatement pstmt = connection.prepareStatement(sql);){
			
			pstmt.setString(1, date);
			pstmt.setString(2, t.getItemName());
			pstmt.setDouble(3, t.getQuantity());
			pstmt.setString(4, t.getClass().getSimpleName());

			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowAdded==1?true:false;
	}

	@Override
	public void findAllTopSelling(String category, int month) {
		
		int i=0;
		String sql="select ItemName,SUM(Quantity) as Quantity from (Select * from inventory where Date like ? ) as dummy group by ItemName,Category having Category IN(?) order by Quantity desc";		
		try (PreparedStatement pstmt = connection.prepareStatement(sql);){
			
			pstmt.setString(1, "%"+month+"%");
			pstmt.setString(2, category);
			
			ResultSet rst = pstmt.executeQuery();
			
			while(rst.next() && i<3) {
				System.out.println((i+1) + "\t  "+rst.getString("ItemName")+ "\t        "+ rst.getInt("Quantity"));
				i++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
