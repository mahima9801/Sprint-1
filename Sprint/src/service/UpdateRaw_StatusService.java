package service;

import java.time.LocalDate;
import java.util.List;

import status.UpdateRaw_Status;
import exception.NoDataFoundException;

public class UpdateRaw_StatusService {
	UpdateRaw_Status uds = new UpdateRaw_Status();
	
	public String updatestatusservice(int Id, String place,LocalDate date, String status){
		
		String result = "Not valid id";
		List<Integer> list = uds.getId();
		for(Integer i:list){
			if(i==Id){
				result=uds.updaterawStatus(Id, place,date, status);
			}
		}
		return result;
	}
	
	public boolean validateService(int Id) throws NoDataFoundException{
		boolean check = false;
		for(Integer i : uds.getId()){
			if(i== Id){
				check=true;
			}
		}
		if(check){
			return check;
		}
		else{
			throw new NoDataFoundException();
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
			return uds.getId();
		}
	

}
