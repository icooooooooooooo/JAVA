package controller;

import cars.BaseCar;
import cars.PerformanceCar;
import cars.ShowCar;
import garage.Garage;
import races.BaseRace;
import races.CasualRace;
import races.DragRace;
import races.DriftRace;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarManager implements CarManagerInterface {
    private Map<Integer, BaseCar> cars;
    private Map<Integer, BaseRace> races;
    private Garage garage;

    public CarManager() {
        this.cars = new HashMap<>();
        this.races = new HashMap<>();
        this.garage = new Garage();
    }

    @Override
    public void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        BaseCar car = null;
        switch (type) {
            case "Performance":
                car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            case "Show":
                car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            default:
                throw new InvalidParameterException();
        }
        cars.putIfAbsent(id, car);

    }

    @Override
    public String check(int id) {
        //•	The “check” command should RETURN a String representation of the CAR with the GIVEN ID:
        //o	“{brand} {model} {yearOfProduction}
        //o	 {horsepower} HP, 100 m/h in {acceleration} s
        //o	 {suspension} Suspension force, {durability} Durability”
        //o	If the car is a PerformanceCar, you must print “Add-ons: {add-ons}”, on the last line – each add-on separated by a comma and a space “, “. In case there are NO add-ons, print “None”.
        //o	If the car is a ShowCar, you must print “{stars} *”, on the last line.
        try {
            BaseCar car = cars.get(id);

            return car.check();
        } catch (InvalidParameterException ex) {
            return ex.getMessage();
        }
    }

    @Override
    public void open(int id, String type, int length, String route, int prizePool) {
//•	open {id} {type} {length} {route} {prizePool}
//o	OPENS a race of the given type, with the given id, and stats.
//o	The race type will be either “Casual”, “Drag” or “Drift”.
        BaseRace race = null;
        switch (type) {
            case "Casual":
                race = new CasualRace(length, route, prizePool);

                break;
            case "Drag":
                race = new DragRace(length, route, prizePool);

                break;
            case "Drift":
                race = new DriftRace(length, route, prizePool);

                break;
            default:
                throw new InvalidParameterException();
        }
        races.putIfAbsent(id, race);
    }

    @Override
    public void participate(int carId, int raceId) {
//o	ADDS a car as a participant in the given race.
//o	Once added, a car CANNOT turn down a race or be REMOVED from it.
        try {
            if (cars.get(carId).isParked() == false) {
                cars.get(carId).setRaceParticipant(true);
                races.get(raceId).setParticipants(cars.get(carId));
            }

        } catch (InvalidParameterException ex) {

        }
    }

    @Override
    public String start(int id) {
        //•	start {raceId}
        //o	INITIATES the race with the given id.
        //o	RETURNS detailed information about the race result.

        //TODO break into another class
        if (races.get(id).isOver() == true) {
            return "Race is over";
        }
        BaseRace race = races.get(id);
        String result = "";
        try {
            if (race.getParticipants().size() > 0) {

                List<BaseCar> list = race.race();
                List<Integer> performancePoints = race.getPerformancePoints();
                for (BaseCar car : list) {
                    car.setRaceParticipant(false);
                }
                StringBuilder sb = new StringBuilder();
                sb
                        .append(String.format("%s - %d", race.getRoute(), race.getLength()))
                        .append(System.lineSeparator());

                int racerPosition = 0;
                for (int i = 0; i < list.size(); i++) {

                    racerPosition++;
                    double prize = 0;
                    BaseCar racer = list.get(i);
                    switch (racerPosition) {
                        case 1:
                            prize = 0.5;
                            break;
                        case 2:
                            prize = 0.3;
                            break;
                        case 3:
                            prize = 0.2;
                            break;
                        default:
                            return "No Prize";
                    }

                    String brand = racer.getBrand();
                    String model = racer.getModel();
                    int performanceStats = performancePoints.get(i);
                    double moneyPrize = race.getPrizePool() * prize;
                    String racerStat = String.format("%d. %s %s %dPP - $%.0f"
                            , racerPosition
                            , brand
                            , model
                            , performanceStats
                            , moneyPrize);
                    sb.append(racerStat);
                    if (i != list.size() - 1) {
                        sb.append(System.lineSeparator());
                    }

                    //o	“{route} - {length}
                    //o	 1. {brand} {model} {performancePoints}PP - ${moneyWon}
                    //o	 2. {brand} {model} {performancePoints}PP - ${moneyWon}
                    //o	 3. {brand} {model} {performancePoints}PP - ${moneyWon}

                    //The 1st place winner takes 50 % of the race’s prize pool.
                    //The 2nd place winner takes 30 % of the race’s prize pool.
                    //The 3rd place winner takes 20 % of the race’s prize pool.
                }
                result = sb.toString();
            }
        } catch (IllegalArgumentException exception) {
            result = "Cannot start the race with zero participants.";
        }
        return result;
    }

    @Override
    public void park(int carId) {
        this.garage.add(carId, cars.get(carId));
    }

    @Override
    public void unpark(int id) {
        this.garage.remove(id);
    }

    @Override
    public void tune(int tuneIndex, String addOn) {
        //•	tune {tuneIndex} {tuneAddOn}
        //o	Tunes the currently parked CARS with the given index and the given add-on.
        //o	You should increase a car’s horsepower by the given index, and the suspension, by HALF of the given index.
        //–	150 tuneIndex = 150 increase in the horsepower and 75 increase in suspension.
        garage.modify(tuneIndex, addOn);
        //o	If the car is a ShowCar it should increase its stars by the given tuneIndex.
        //o	Upon tuning, a PerformanceCar adds the given add-on to its collection of add-ons.
    }
}
