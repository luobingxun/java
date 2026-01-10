package day2;

public class Constructor {

    public static void main(String[] args) {
        PersonClass p = new PersonClass();
    }

}


class PersonClass {

    private String name;
    private int age;
    private String address;

    public PersonClass() {}

    public PersonClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}