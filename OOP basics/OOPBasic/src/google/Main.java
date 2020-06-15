package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, Person> people = new HashMap<> ();

        String input = scan.readLine ();
        while (!"End".equals (input)) {
            String[] raw = input.split ("\\s+");

            String name = raw[0];
            String classType = raw[1];

            Person person = new Person (name);
            if (people.containsKey (name)) {
                person = people.get (name);
            } else {
                people.put (name, person);
            }
            /* formats
            •	“<Name> company <companyName> <department> <salary>”
            •	“<Name> pokemon <pokemonName> <pokemonType>”
            •	“<Name> children <childName> <childBirthday>”
            •	“<Name> parents <parentName> <parentBirthday>”
            •	“<Name> car <carModel> <carSpeed>”
            */


            switch (classType) {
                case "company":
                    String companyName = raw[2];
                    String companyDepartment = raw[3];
                    double salary = Double.parseDouble (raw[4]);

                    Company company = new Company (companyName, companyDepartment, salary);
                    person.setCompany (company);
                    break;

                case "pokemon":
                    String pokemonName = raw[2];
                    String pokemonType = raw[3];

                    Pokemon pokemon = new Pokemon (pokemonName, pokemonType);
                    person.setPokemons (pokemon);
                    break;

                case "parents":
                    String parentName = raw[2];
                    String parentBirthday = raw[3];

                    Parent parent = new Parent (parentName, parentBirthday);
                    person.setParents (parent);
                    break;

                case "children":
                    String childName = raw[2];
                    String childBirthday = raw[3];

                    Child child = new Child (childName, childBirthday);
                    person.setChildren (child);
                    break;

                case "car":
                    String carModel = raw[2];
                    int carSpeed = Integer.parseInt (raw[3]);

                    Car car = new Car (carModel, carSpeed);
                    person.setCar (car);
                    break;
            }


            people.get (name).equals (person);
            input = scan.readLine ();
        }

        String name = scan.readLine ();

        people.entrySet ().stream ()
                .filter (x -> x.getKey ().equals (name))
                .forEach (p -> {
                    StringBuilder personalInformation = new StringBuilder ();
                    Person person = p.getValue ();
                    personalInformation.append (person.getName ()).append (System.lineSeparator ());
                    personalInformation.append ("Company:").append (System.lineSeparator ());
                    if (!"".equals (person.getCompany ().getCompanyName ())) {
                        personalInformation.append (person.getCompany ().toString ()).append (System.lineSeparator ());
                    }

                    personalInformation.append ("Car:").append (System.lineSeparator ());
                    if (!"".equals (person.getCar ().getCarModel ())) {
                        personalInformation.append (person.getCar ().toString ()).append (System.lineSeparator ());
                    }

                    personalInformation.append ("Pokemon:").append (System.lineSeparator ());
                    if (!person.getPokemons ().isEmpty ()) {
                        for (Pokemon pokemon : person.getPokemons ()) {
                            personalInformation.append (pokemon.toString ()).append (System.lineSeparator ());

                        }
                    }
                    personalInformation.append ("Parents:").append (System.lineSeparator ());
                    if (!person.getParents ().isEmpty ()) {
                        for (Parent parent : person.getParents ()) {
                            personalInformation.append (parent.toString ()).append (System.lineSeparator ());

                        }
                    }
                    personalInformation.append ("Children:").append (System.lineSeparator ());
                    if (!person.getChildren ().isEmpty ()) {
                        for (Child child : person.getChildren ()) {
                            personalInformation.append (child.toString ()).append (System.lineSeparator ());

                        }
                    }

                    System.out.print (personalInformation.toString ());

    /* format:
    {personName}
	Company:
	{companyName} {companyDepartment} {salary}
	Car
	Pokemon
	Parents
	...
	Children:
	{childName} {childBirthday}
	{childName} {childBirthday}

    */

                });
    }
}
