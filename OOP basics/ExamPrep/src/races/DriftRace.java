package races;

import cars.BaseCar;

import java.util.ArrayList;
import java.util.List;

public class DriftRace extends BaseRace {
    public DriftRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public List<BaseCar> race() {
        //•	A DriftRace determines its winners based on their Suspension Performance (SP) (in DESCENDING order).
        // Suspension Performance, of EACH CAR, is calculated by the following formula:
        //(suspension + durability)
        List<BaseCar> list = new ArrayList<>();

        getParticipants().stream()
                .sorted((x, y) -> {
                    int overallPerformanceX = x.getSuspension() + x.getDurability();
                    int overallPerformanceY = y.getSuspension() + y.getDurability();
                    return overallPerformanceY - overallPerformanceX;
                })
                .limit(Math.min(getParticipants().size(), 3))
                .forEach(x -> list.add(x));

        for (BaseCar car : list) {
            int overallPerformanceX = car.getSuspension() + car.getDurability();

            performancePoints.add(overallPerformanceX);
        }
        setOver();
        return list;
    }
}