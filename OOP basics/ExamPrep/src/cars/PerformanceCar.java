package cars;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends BaseCar {
    private static final int HP_BOOST = 50;
    private static final int SUSUPENSION_PENALTY = 25;

    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower + horsepower/2, acceleration, suspension - suspension /4, durability);
        this.addOns = new ArrayList<>();
    }

    @Override
    public void setAddOns(int count, String addOn) {
        this.addOns.add(addOn);
    }

    @Override
    public String check() {
        StringBuilder sb = new StringBuilder();
        sb.append(baseCheck());
        sb.append("Add-ons: ");

        if (this.addOns.size() <= 0) {
            sb.append("None");
        } else {
            for (String addOn : addOns) {
                sb.append(addOn).append(", ");
            }
        }
        String result = sb.toString().substring(0, sb.length() - 2);
        return result;
    }


}
