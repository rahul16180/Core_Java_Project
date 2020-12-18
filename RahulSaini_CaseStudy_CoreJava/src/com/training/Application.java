package com.training;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.training.iface.Constant;
import com.training.services.ProductServices;
public class Application {

	public static void main(String[] args) {
		
		String date;
		int dayOfYear;
		ProductServices[] service = new ProductServices[366];
		
		//For Date : 11 Nov 2020
		date = "11-11-2020";
		dayOfYear = (LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-LL-yyyy"))).getDayOfYear();
		service[dayOfYear] = new ProductServices(date);

		service[dayOfYear].addEdible(1, "Lays", 10, 5, "14-05-2020", "14-12-2020", "Veg");
		service[dayOfYear].addEdible(2, "Coke", 40, 10, "14-05-2020", "14-12-2020", "Veg");
		service[dayOfYear].addGarments(1, "Jeans", 500, 2, "M", "Gents");
		service[dayOfYear].addElectronics(1, "Plug", 100, 1, "2x2 cm", 2, 15.5);
		
		service[dayOfYear].printReportByDay(Constant.EDIBLES);
		service[dayOfYear].printReportByDay(Constant.GARMENTS);
		service[dayOfYear].printReportByDay(Constant.ELECTRONICS);
		
		
		
		//For Date : 12 Nov 2020
		date = "12-11-2020";
		dayOfYear = (LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-LL-yyyy"))).getDayOfYear();		
		service[dayOfYear] = new ProductServices("12-11-2020");

		service[dayOfYear].addEdible(1, "Lays", 50, 10, "14-05-2020", "14-12-2020", "Veg");
		service[dayOfYear].addGarments(1, "Jeans", 500, 2, "L", "Female");
		service[dayOfYear].addElectronics(1, "TV", 20000, 1, "200x200 cm", 5, 155);
		
		service[dayOfYear].printReportByDay(Constant.EDIBLES);
		service[dayOfYear].printReportByDay(Constant.GARMENTS);
		service[dayOfYear].printReportByDay(Constant.ELECTRONICS);
		
		
		//Print Top Selling List using SQL Table
		service[0] = new ProductServices();
		service[0].printTopSelling(Constant.EDIBLES,11); // 11 is month ie November
		service[0].printTopSelling(Constant.GARMENTS,11);
		service[0].printTopSelling(Constant.ELECTRONICS,11);


	}

}
