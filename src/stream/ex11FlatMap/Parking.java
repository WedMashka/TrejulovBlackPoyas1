package stream.ex11FlatMap;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    List<Car> carlist = new ArrayList<>();

    public Parking(List<Car> carlist) {
        this.carlist = carlist;
    }
    public Parking() {
    }
    public Parking(Car...car) {
        addCar(car);
    }

    public void addCar(Car...car){
        for (Car c:car){
            carlist.add(c);
        }
    }

    public List<Car> getCarlist(){
        return carlist;
    }

}
