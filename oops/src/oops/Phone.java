package oops;

public class Phone {
private int imei;
private int serialnumber;
private String model;
private String colour;

 public void setmodel(String model) {
	 this.model=model;
 }
 public void setcolour(String colour) {
	 this.colour=colour;
 }
	 public String getmodel() {
		 return this.model;
	 }
	 public String getcolour() {
		 return this.colour;
	 }
 }
