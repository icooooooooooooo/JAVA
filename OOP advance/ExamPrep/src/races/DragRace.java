package races;

import cars.BaseCar;

import java.util.ArrayList;
import java.util.List;

public class DragRace extends BaseRace {
    public DragRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public List<BaseCar> race() {
        //•	A DragRace determines its winners based on their Engine Performance (EP) (in DESCENDING order).
        // Engine Performance, of EACH CAR, is calculated by the following formula:
        //(horsepower / acceleration)
        List<BaseCar> list = new ArrayList<>();

        getParticipants().stream()
                .sorted((x, y) -> {
                    int overallPerformanceX = x.getHorsepower() / x.getAcceleration();
                    int overallPerformanceY = y.getHorsepower() / y.getAcceleration();
                    return overallPerformanceY - overallPerformanceX;
                })
                .limit(Math.min(getParticipants().size(), 3))
                .forEach(x -> list.add(x));

        for (BaseCar car : list) {
            int overallPerformanceX = car.getHorsepower() / car.getAcceleration();
            addPerformancePoints(overallPerformanceX);
        }
        setOver();

        return list;

    }
}
