package day2;

public class ExtendsClass {
    public static void main(String[] args) {
        Animal dog = new Dog("金毛","黄色");
        // 1. 成员方法：编译看左边
        dog.eat();
        // 2。成员变量：编译看左边运行看左边
        System.out.println(dog.color);
    }
}


class Animal {

    private String name;
    String color;

    public Animal (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eat() {}

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
}


class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "是" + this.getColor());;
    }
}