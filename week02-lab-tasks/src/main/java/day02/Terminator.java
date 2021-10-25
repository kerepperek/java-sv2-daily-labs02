package day02;

public class Terminator {

    private String name;
    private int age;
    private String email;

    public Terminator(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String greetingSomebody(String name) {
        return "Hello" + name + "! My name is " + this.name + "!";

    }

    public void saySomething() {
        System.out.println("Something");
    }

    public int getAge() {
        return age;
    }
}
