package races;

import cars.BaseCar;

import java.util.*;

public abstract class BaseRace implements BaseRaceInterface {


    private int length;
    private String route;
    private int prizePool;
    private List<BaseCar> participants;
    List<Integer> performancePoints;

    public boolean isOver() {
        return isOver;
    }

    private boolean isOver;

    public int getPrizePool() {
        return prizePool;
    }

    public List<Integer> getPerformancePoints() {
        return Collections.unmodifiableList(this.performancePoints);
    }

    public List<BaseCar> getParticipants() {
        return Collections.unmodifiableList(participants);
    }

    public int getLength() {
        return length;
    }

    public String getRoute() {
        return route;
    }

    public void addPerformancePoints(int performancePoints){
        this.performancePoints.add(performancePoints);
    }

    public void setParticipants(BaseCar car) {
        if (car.isParked() == false) {
            this.participants.add(car);
        }
    }

    protected void setOver() {
        this.isOver = true;
    }

    private BaseRace() {
        this.participants = new ArrayList<>();
        this.performancePoints = new ArrayList<>();
        this.isOver = false;
    }

    public BaseRace(int length, String route, int prizePool) {
        this();
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
    }

}