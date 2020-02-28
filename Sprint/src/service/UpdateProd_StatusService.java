package service;

import java.time.LocalDate;
import java.util.List;

import status.UpdateProd_Status;
import exception.NoDataFoundException;

public class UpdateProd_StatusService {
UpdateProd_Status ups = new UpdateProd_Status();
	
	public String updatestatusservice(int Id, String place, LocalDate date, String status){
		
		String result = "Not valid id";
		List<Integer> list = ups.getId();
		for(Integer i:list){
			if(i==Id){
				result=ups.updateproductStatus(Id, place, date, status);
			}
		}
		return result;
	}
	
	public boolean validateService(int Id) throws NoDataFoundException{
		boolean check = false;
		for(Integer i : ups.getId()){
			if(i == Id){
				check=true;
			}
		}
		if(check){
			return check;
		}
		else{
			throw new NoDataFoundException("OrderId doesn't exist!");
		}
		
		
	}
	public boolean dateValidate(String date){
		if(date.matches("\\d{4}-\\d{2}-\\d{2}")){
			return true;
		}
		else{
			return false;
		}
	}
	public List<Integer>getId(){
		return ups.getId();
	}
	

}
