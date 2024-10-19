package LearnSolid.Liskov;

import java.util.ArrayList;
import java.util.List;

public class Liskov {

    public static void main(String args[])
    {
        List<EngineVehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        //vehicleList.add(new Bicycle());

        for(EngineVehicle vehicle: vehicleList){
            System.out.println(vehicle.hasEngine());
        }
    }



}
