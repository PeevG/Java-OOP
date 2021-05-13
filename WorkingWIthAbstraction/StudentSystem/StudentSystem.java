package StudentSystem;


import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentInfo;

    public StudentSystem() {
        this.studentInfo = new HashMap<>();
    }

    public Map<String, Student> studentsByName() {
        return this.studentInfo;
    }

    public void parseCommand(String[] input) {
//        Scanner scanner = new Scanner(System.in);
//        String[] input = scanner.nextLine().split(" ");

        if (input[0].equals("Create")) {
            createCommand(input);
        } else if (input[0].equals("Show")) {
            String name = input[1];
            showCommand(name);
        }
    }

    private void showCommand(String name) {
        if (studentInfo.containsKey(name)) {

            Student student = studentInfo.get(name);
            String view = String.format("%s is %s years old. ", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                view += "Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += "Average student.";
            } else {
                view += "Very nice person.";
            }
            System.out.println(view);
        }
    }

    private void createCommand(String[] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        if (!studentInfo.containsKey(name)) {
            Student student = new Student(name, age, grade);
            studentInfo.put(name, student);
        }
    }
}
