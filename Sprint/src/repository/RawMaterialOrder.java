package repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import data.Raw_Id;

public class RawMaterialOrder{
	public RawMaterialOrder(int i, String string, LocalDate of) {
	}
	static Map<Integer, Raw_Id> raw = new HashMap<Integer, Raw_Id>();
	static
	{
		raw.put(1001, new Raw_Id(1001, "Kanpur",LocalDate.of(2018, 04, 24), "Dispatched"));
		raw.put(1002, new Raw_Id(1002, "Pune",LocalDate.of(2019, 02, 21),"Not Delivered"));
		raw.put(1003, new Raw_Id(1003, "Mumbai",LocalDate.of(2019, 07, 21),"Packaging"));
		raw.put(1004, new Raw_Id(1004, "Gurugram",LocalDate.of(2020, 01, 01),"Not Delivered"));
		}
	static public Map<Integer, Raw_Id> get()
	{
		return raw;
	}

}
