package Day6;

import java.util.ArrayList;
import java.util.List;

class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    String name;
    Integer age;
    double salary;

    public Person(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}

public class three {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Sachin",25,50000));
        list.add(new Person("Sara",22,60000));
        list.add(new Person("Maya",26,80000));
        list.add(new Person("Harsh",21,70000));

        list.stream().sorted((a,b) -> a.age.compareTo(b.age)).forEach(System.out::println);

    }
}
