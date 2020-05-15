import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class StudentsJoinedToSpecialties {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader (System.in));

        Map<String, String> specialties = new HashMap<> ();
        Map<String, String> students = new LinkedHashMap<> ();

        String input = scan.readLine ();
        while (!"Students:".equals (input)) {
            String[] raw = input.split ("\\+");
            StringBuilder value = new StringBuilder ();
            value.append (raw[0]).append (" ").append (raw[1]);
            String key = raw[2];

            specialties.put (key, value.toString ());

            input = scan.readLine ();
        }
        input = scan.readLine ();
        while (!"END:".equals (input)) {
            String[] raw = input.split ("\\+");
            StringBuilder key = new StringBuilder ();
            key.append (raw[0]).append (" ").append (raw[1]);
            String value = raw[2];

            students.put (key.toString (), value);

        }
        scan.close ();


        BiPredicate<Map<String, String>, Map<String, String>> predicate = (spe, stu) ->
                spe.entrySet ().stream ().map (x -> x.getKey ()).equals (stu.entrySet ().stream ().map (x -> x.getKey ()));


      // List<Student> dataSet = students.entrySet ()
      //         .stream ()
      //         .sorted ((x, y) -> x.getValue ().compareTo (y.getValue ()))//sorting the list, as per therequirement
      //         .collect (stu -> { // this is where we are going to perform the comparison between thetwo lists and fill in Person
      //             specialties.entrySet ()
      //                     .stream ()
      //                     .filter (spec -> predicate.test (spec,stu)) //TODO fix this!! <- predicate seems not to be working
      //                     .forEach (s -> stu. ()); // TODO add the entry to the Class
      //         });

    }
}

class Student {
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getFacultyNum() {
        return facultyNum;
    }

    String name;
    String specialty;
    String facultyNum;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setFacultyNum(String facultyNum) {
        this.facultyNum = facultyNum;
    }

    public Student(String name, String specialty, String facultyNum) {
        this.name = name;
        this.specialty = specialty;
        this.facultyNum = facultyNum;
    }
}