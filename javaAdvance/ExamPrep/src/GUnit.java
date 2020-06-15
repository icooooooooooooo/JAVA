import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GUnit {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

//        {class name} | {method name} | {unit test name}

        Map<String, Map<String, Set<String>>> database = new HashMap<> ();
        String input = scan.readLine ();
        while (!"It's testing time!".equals (input)) {
            String[] raw = input.split ("[ \\\\| ] ");
            String className = raw[0].trim ();
            String methodName = raw[1].trim ();
            String unitName = raw[2].trim ();
            if (validator (className, methodName, unitName)) {

                database.putIfAbsent (className, new HashMap<> ());
                database.get (className).putIfAbsent (methodName, new HashSet<> ());
                database.get (className).get (methodName).add (unitName);
            }
            input = scan.readLine ();
        }
        StringBuilder output = new StringBuilder ();

        database.entrySet ().stream ()
                .sorted ((c1, c2) -> {
                    // 1. The classes should be ordered first by the amount of unit tests it has – descending,
                    int unitTestsC1 = c1.getValue ().values ().stream ().mapToInt (x -> x.size ()).sum ();
                    int unitTestsC2 = c2.getValue ().values ().stream ().mapToInt (x -> x.size ()).sum ();

                    int unitAmountCompare = unitTestsC2 - unitTestsC1;
                    if (unitAmountCompare != 0) {
                        return unitAmountCompare;
                    }
                    // then by the amount of methods it has – ascending,
                    int methodC1 = c1.getValue ().size ();
                    int methodC2 = c2.getValue ().size ();

                    int methodAmountCompare = methodC1 - methodC2;
                    if (methodAmountCompare != 0) {
                        return methodAmountCompare;
                    }
                    // and then alphabetically.
                    return c1.getKey ().compareTo (c2.getKey ());
                })
                .forEach (cla -> {
                    output.append (String.format ("%s:", cla.getKey ())).append (System.lineSeparator ());

                    cla.getValue ().entrySet ().stream ()
                            .sorted ((m1, m2) -> {
                                // 2. The methods should be ordered by the amount of unit tests they have - descending,
                                int unitAmountM1 = m1.getValue ().size ();
                                int unitAmountM2 = m2.getValue ().size ();

                                int unitAmountCompare = unitAmountM2 - unitAmountM1;
                                if (unitAmountCompare != 0) {
                                    return unitAmountCompare;
                                }

                                // and then alphabetically
                                return m1.getKey ().compareTo (m2.getKey ());
                            })
                            .forEach (method -> {
                                output.append (String.format ("##%s", method.getKey ())).append (System.lineSeparator ());

                                method.getValue ().stream ()
                                        .sorted ((ul1, ul2) -> {
                                            // 3. The unit tests should be ordered by the length of their names – ascending
                                            int unitLengthUL1 = ul1.length ();
                                            int unitLengthUL2 = ul2.length ();

                                            int unitLengthCompare = unitLengthUL1 - unitLengthUL2;
                                            if (unitLengthCompare != 0) {
                                                return unitLengthCompare;
                                            }
                                            // and then by alphabetically.
                                            return ul1.compareTo (ul2);
                                        })
                                        .forEach (unit -> {
                                            output.append (String.format ("####%s", unit)).append (System.lineSeparator ());
                                        });
                            });
                });

        System.out.print (output);
    }

    private static boolean validator(String className, String methodName, String unitName) {
        boolean correct = true;
        // The valid class names, method names and unit test names can only contain English alphabet letters and digits,
        // and must always start with a capital letter. All parameters must be at least 2 symbols long.
        if (!Character.isUpperCase (className.charAt (0)) || !Character.isUpperCase (unitName.charAt (0)) || !Character.isUpperCase (methodName.charAt (0))) {
            correct = false;
        }

        List<String> parameters = new ArrayList<> ();
        parameters.add (className);
        parameters.add (unitName);
        parameters.add (methodName);

        Pattern pattern = Pattern.compile ("([A-Z])[A-Za-z0-9]+");
        for (String parameter : parameters) {
            Matcher matcher = pattern.matcher (parameter);
            if (!matcher.find ()) {
                correct = false;
                break;
            }
        }

        return correct;
    }
}
