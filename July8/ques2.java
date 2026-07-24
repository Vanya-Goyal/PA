package ques2;
import java.util.*;

public class ques2 {
    
    // oops concepts 
    // parking lot
    // car
    // bus
    // truck

    public static void main(String[] args){

    }
}

public class vehicle{
    
}
public class Car{
    private String carNo;
    private String ticketNo;
    private String ticketPrice;
    public void setCarNo(String carNo){
        this.carNo = carNo;
    }
    public String getCarNo(){
        return this.carNo;
    }
    public void displayCarNo(){
        System.out.println("Car Number: " + this.carNo);
    }
    
}
public class Bus{
    private String busNo;
    private String ticketNo;
    private String ticketPrice;
    public void setBusNo(String busNo){
        this.busNo = busNo;
    }
    public String getBusNo(){
        return this.busNo;
    }
    public void displayBusNo(){
        System.out.println("Bus Number: " + this.busNo);
    }
}
public class Truck{
    private String truckNo;
    private String ticketNo;
    private String ticketPrice;
    public void setTruckNo(String truckNo){
        this.truckNo = truckNo;
    }
    public String getTruckNo(){
        return this.truckNo;
    }
    public void displayTruckNo(){
        System.out.println("Truck Number: " + this.truckNo);
    }
}