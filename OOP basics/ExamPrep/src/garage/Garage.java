package garage;

import cars.BaseCar;
import races.BaseRace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage implements Modify {

    private Map<Integer, BaseCar> cars;

    public Garage() {
        this.cars = new HashMap<>();
    }

    public void add(int id, BaseCar car) {
        if (car.isRaceParticipant() == false) {
            this.cars.putIfAbsent(id, car);
            car.setParked("true");
        }
    }

    public void remove(int id) {
        cars.get(id).setParked("false");
        cars.remove(cars.get(id));

    }


    @Override
    public void modify(int tuneIndex, String addOn) {
        for (BaseCar car : cars.values()) {
            car.setAddOns(tuneIndex, addOn);
            car.tune(tuneIndex);
        }
    }
}
