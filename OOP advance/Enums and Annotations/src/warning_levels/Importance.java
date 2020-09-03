package warning_levels;

public enum Importance {
    LOW, NORMAL, MEDIUM, HIGH;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1);
    }

}
