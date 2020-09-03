package coding_tracker;

import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.text.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {

    public static void printMethodsByAuthor(Class<?> cl) {
        Map<String, List<String>> methodsByAuthor = new HashMap<String, List<String>>();

        Method[] methods = cl.getDeclaredMethods();

        for (Method method : methods) {
            Author author = method.getDeclaredAnnotation(Author.class);
            if (author != null) {
                if (!methodsByAuthor.containsKey(author.name())) {
                    List<String> methodList = new ArrayList<>();
                    methodsByAuthor.put(author.name(), methodList);
                    methodsByAuthor.get(author.name()).add(method.getName());
                } else {
                    if (methodsByAuthor.get(author.name()).size() == 0) {
                        List<String> methodList = new ArrayList<>();
                    }
                    methodsByAuthor.get(author.name()).add(method.getName());
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> stringListEntry : methodsByAuthor.entrySet()) {
            sb.append(stringListEntry.getKey()).append(": ");
            String name = stringListEntry.getKey();
            for (String s : methodsByAuthor.get(name)) {
                sb.append(s).append(", ");
            }
            sb.replace(sb.length() - 2, sb.length(), "");
            sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString());

    }

}
