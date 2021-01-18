package pr01HarvestingFields;

public enum ModifierValues {
    PUBLIC(1),
    PRIVATE(2),
    PROTECTED(4);

    ModifierValues(int num) {
        this.value = num;
    }

    final int value;

    public static String getName(int modifierValue) {
        for (ModifierValues value : values()) {
            if (value.value == modifierValue) {
                return value.name().toLowerCase();
            }
        }
        throw new IllegalArgumentException("Value does not exist");
    }
}
