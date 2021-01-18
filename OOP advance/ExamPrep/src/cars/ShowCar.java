package cars;

public class ShowCar extends BaseCar {
    private static final int MIN_STARS = 0;
    private static final int DEFAULT_STAR_INCREASE = 0;

    private int stars;


    public void increaseStars(int starIndex) {
        this.stars += starIndex;
    }

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.stars = MIN_STARS;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String check() {
        StringBuilder sb = new StringBuilder();
        sb.append(baseCheck());
        sb.append(String.format("%d *", getStars()));

        return sb.toString();
    }

    @Override
    public void setAddOns(int count, String addon) {
        this.increaseStars(count);
    }

}
