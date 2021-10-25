package day01;

public class Human {
    String name;
    int age;

    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void introduction(){
        System.out.println("Hello my name is "+name);
    }

    public void addPrefixToName(String prefix){
        name=prefix+" "+name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
