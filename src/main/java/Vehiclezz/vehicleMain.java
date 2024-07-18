package Vehiclezz;

import java.util.ArrayList;
import java.util.List;

public class vehicleMain {

    public static void main(String[] args){

        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle v=new Vehicle("hyundi","grey","2017");
         vehicleList.add(v);
        Vehicle v1=new Vehicle("honda","white","2015");
        vehicleList.add(v1);
        Vehicle v2=new Vehicle("bmw","graniteblack","2019");
        vehicleList.add(v2);

        for(Vehicle vh : vehicleList){
            if(vh.getModel().equals("bmw")){
                System.out.println("model: "+vh);
            }
        }

    }



}
