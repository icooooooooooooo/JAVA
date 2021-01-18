package pr01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Engine {
    private List<Field> fieldList;

    protected Engine(Class inputClass) {
        fieldList = new ArrayList<>();
        fieldList.addAll(Arrays.stream(inputClass.getDeclaredFields()).collect(Collectors.toList()));
    }

    protected void printPrivate() {
        for (Field field : fieldList) {
            if (Modifier.isPrivate(field.getModifiers())){
                System.out.println(String.format("private %s %s",field.getType().getSimpleName(), field.getName().toString()));
            }
        }
    }

    protected void printPublic() {
        for (Field field : fieldList) {
            if (Modifier.isPublic(field.getModifiers())){
                System.out.println(String.format("public %s %s",field.getType().getSimpleName(), field.getName()));
            }
        }
    }

    protected void printProtected() {
        for (Field field : fieldList) {
            if (Modifier.isProtected(field.getModifiers())){
                System.out.println(String.format("private %s %s",field.getType().getSimpleName(), field.getName()));
            }
        }
    }

    protected void printAll() {
        for (Field field : fieldList) {
            String modifierStratus = ModifierValues.getName(field.getModifiers());
                System.out.println(String.format("%s %s %s", modifierStratus ,field.getType().getSimpleName(), field.getName()));
        }
    }
}
