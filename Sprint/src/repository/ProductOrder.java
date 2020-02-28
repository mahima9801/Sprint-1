package repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import data.Prod_Id;

public class ProductOrder {
	public ProductOrder(){
		
	}
	static Map<Integer, Prod_Id> prod = new HashMap<>();
	static{
		prod.put(101, new Prod_Id(101,"Hyderabad",LocalDate.of(2019, 01, 15), "Packaging"));
		prod.put(102, new Prod_Id(102, "Gurugram",LocalDate.of(2018, 05, 24), "Dispatched"));
		prod.put(103, new Prod_Id(103, "Bangalore",LocalDate.of(2019, 05, 26), "Dispatched"));
		prod.put(104, new Prod_Id(104, "Pune",LocalDate.of(2020, 01, 19), "Not delivered"));
	}
	static public Map<Integer, Prod_Id> get(){
		return prod;
	}

}
