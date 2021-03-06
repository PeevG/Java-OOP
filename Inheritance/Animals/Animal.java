package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String produceSound() {
        return "";
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        if (gender.equals("")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(String.format("%s %d %s", this.getName(), this.getAge(), this.getGender())).append(System.lineSeparator());
        sb.append(produceSound()).append(System.lineSeparator());
        return sb.toString().trim();
    }
}
