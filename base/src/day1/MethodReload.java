package day1;

public class MethodReload {
    public static void main(String[] args) {
        print("'reload'");
        print(12, "上海");
    }

    public static void print(String name) {
        System.out.println(name);
    }

    public static void print(int age, String address) {
        System.out.println(age + address);
    }
}
