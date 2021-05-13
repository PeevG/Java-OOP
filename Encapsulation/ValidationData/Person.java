import java.io.IOException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.salary = salary;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.trim().length() < 3) {
            throw new IllegalStateException("lastName name cannot be less than 3 symbols.");
        }
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.trim().length() < 3) {
            throw new IllegalStateException("First name cannot be less than 3 symbols.");
        }
        this.firstName = firstName;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalStateException("Age cannot be a zero or a negative number");
        }
        this.age = age;
    }
    private void setSalary(double salary) {
        if(salary < 460) {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void increaseSalary(double percentage) {
        if(this.getAge() < 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * (1.00 * (percentage / 200))));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * (1.00 * percentage / 100)));
        }
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", getFirstName(), getLastName(), getSalary());
    }
}
