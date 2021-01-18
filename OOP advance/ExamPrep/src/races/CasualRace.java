package races;

import cars.BaseCar;

import java.util.ArrayList;
import java.util.List;

public class CasualRace extends BaseRace {
    public CasualRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public List<BaseCar> race() {
        //•	A CasualRace determines its winners based on their Overall Performance (OP) (in DESCENDING order).
        // Overall Performance, of EACH CAR, is calculated by the following formula:
        //
        //(horsepower / acceleration) + (suspension + durability)
        List<BaseCar> list = new ArrayList<>();
        getParticipants().stream()
                .sorted((x, y) -> {
                    int overallPerformanceX = x.getHorsepower() / x.getAcceleration() + x.getSuspension() + x.getDurability();
                    int overallPerformanceY = y.getHorsepower() / y.getAcceleration() + y.getSuspension() + y.getDurability();
                    return overallPerformanceY - overallPerformanceX;
                })
                .limit(Math.min(getParticipants().size(), 3))
                .forEach(x -> list.add(x));

        for (BaseCar car : list) {
            int overallPerformanceX = (car.getHorsepower() / car.getAcceleration()) + car.getSuspension() + car.getDurability();

            performancePoints.add(overallPerformanceX);
        }
        setOver();
        return list;
    }

}
