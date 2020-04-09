package javaBasicsDemo.java;

public class cars {
       private String car_name;
       private String car_model;
       private String car_reg;
       private String car_color;
       
       private static void speedIncrease(){
    	   System.out.println("Car Speed is increasing");
    	   
    	   // as the variables or members are private to the class 
    	   // so to access to the outside world we need use getters and setters
    	   
       	   
    	   
    	   
       }

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getCar_reg() {
		return car_reg;
	}

	public void setCar_reg(String car_reg) {
		this.car_reg = car_reg;
	}

	public String getCar_color() {
		return car_color;
	}

	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}
}
