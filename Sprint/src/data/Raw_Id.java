package data;

import java.time.LocalDate;


public class Raw_Id {
	private int Id;
	private String place;
	private LocalDate date;
	private String status;
	
	public Raw_Id(int Id, String place, LocalDate date, String status){
		this.Id = Id;
		this.place = place;
		this.date = date;
		this.status = status;
	}
	
	public int getId(){
		return Id;
	}
	public String getPlace(){
		return place;
	}
	public LocalDate getDate(){
		return date;
	}
	public String getStatus(){
		return status;
	}
	
	
	public void setId(int Id){
		this.Id = Id;
	}
	
	public void setPlace(String place){
		this.place = place;
	}
	public void setDate(LocalDate date){
		this.date = date;
	}
	public void setStatus(String status){
		this.status = status;
	}
	
	
	
	

}
