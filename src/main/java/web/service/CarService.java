package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        Car car1 = new Car("blue", "lada", 2012);
        Car car2 = new Car("white", "bwv", 2015);
        Car car3 = new Car("black", "ford", 2019);
        Car car4 = new Car("yellow", "lada", 2020);
        Car car5 = new Car("black", "ferrari", 2016);
        Car car6 = new Car("orange", "volga", 1999);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
    }
    public List<Car> showCarList(String count) {
        List<Car> finalCarList;
        if (count == null) {
            finalCarList = carList;
        }
        else if (Integer.parseInt(count) < 5) {
            finalCarList = carList.stream().limit(Integer.parseInt(count)).toList();
        }
        else {
            finalCarList = carList;
        }
        return finalCarList;
    }



}
