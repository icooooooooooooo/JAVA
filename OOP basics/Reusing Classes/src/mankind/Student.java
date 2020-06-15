package mankind;

public class Student extends Human {
    private final int MIN_FACULTY_NUMBER_LENGHT = 5;
    private final int MAX_FACULTY_NUMBER_LENGHT = 10;

    private String facultyNumber;

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public Student(String firstName, String lastName, String facultyNumber) {
        super (firstName, lastName);
        setFacultyNumber (facultyNumber);
    }

    public void setFacultyNumber(String facultyNumber) {
        int length = facultyNumber.length ();
        if (length >= MIN_FACULTY_NUMBER_LENGHT && length <= MAX_FACULTY_NUMBER_LENGHT) {
            this.facultyNumber = facultyNumber;
        } else {
            throw new IllegalArgumentException ("Invalid faculty number!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
            /*
            •	Print the student info in the following format:
            o	First Name: {student's first name}
            o	Last Name: {student's last name}
            o	Faculty number: {student's faculty number}
             */
        sb.append ("First Name: ").append (super.getFirstName ()).append (System.lineSeparator ());
        sb.append ("Last Name: ").append (super.getLastName ()).append (System.lineSeparator ());
        sb.append ("Faculty number: ").append (this.getFacultyNumber ()).append (System.lineSeparator ());


        return sb.toString ();
    }

}
