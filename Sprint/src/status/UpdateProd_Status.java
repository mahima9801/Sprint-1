package status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import data.Prod_Id;
import repository.ProductOrder;

public class UpdateProd_Status {
Map<Integer, Prod_Id> prod;
	
	public UpdateProd_Status(){
		prod = ProductOrder.get();
	}
	public List<Integer> getId(){
		List<Integer> OrderIdlist = new ArrayList<Integer>();
		
		for(Entry<Integer, Prod_Id> map : prod.entrySet()){
			OrderIdlist.add(map.getKey());
		}
		return OrderIdlist;
	}
	public String updateproductStatus(int Id, String place, LocalDate date, String status){
		String check="not valid id";
		
		for(Entry<Integer, Prod_Id> map : prod.entrySet()){
			if(map.getKey() == Id){
				map.getValue().setPlace(place);
				map.getValue().setDate(date);
				map.getValue().setStatus(status);
				
				check = "data updated";
			}
		}
		return check;
	}
	public String getData(int Id){
		String result = null;
		for(Map.Entry<Integer, Prod_Id> obj:prod.entrySet()){
			result = obj.getValue().getProd_Id()+"\n"+obj.getValue().getPlace()+"\n"+obj.getValue().getDate()+"\n"+obj.getValue().getStatus();
		}
		return result;
	}


}
