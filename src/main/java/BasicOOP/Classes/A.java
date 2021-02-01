package BasicOOP.Classes;

public class A {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    A(int newAge, String newName) {
        age = newAge;
        name = newName;
    }

    A() {
    }
}
