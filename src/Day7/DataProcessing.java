package Day7;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    String ID;
    String name;
    String department;
    double salary;

    public Employee(String ID, String name, String department, double salary) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class DataProcessing {
    public static void print(List<Employee> list) {
        for(Employee e : list ){
            System.out.println(e.toString());;
        }

    }
    public static void main(String[] args) {
        List<Employee>list = new ArrayList<>();
        list.add(new Employee("1","Daya","Engineering",95000.0));
        list.add(new Employee("2","Mahatma","Technology",85000.0));
        list.add(new Employee("3","Unati","Aerospace",75000.0));
        list.add(new Employee("4","Rahul","IT",65000.0));
        list.add(new Employee("5","Sanya","Engineering",90000.0));

        System.out.println("\nFiltered Data : ");
        List<Employee> newList1 = list.stream().filter(a -> a.department.equals("Engineering")&&a.salary>80000).collect(Collectors.toList());
        print(newList1);

        System.out.println("\nSorted Data : ");
        List<Employee> newList = list.stream().sorted((a,b) -> Double.compare(b.salary,a.salary)).collect(Collectors.toList());
        print(newList);

        System.out.println("\nGrouping the result by their department : ");
        Map<String,List<Employee>>newList2= list.stream().collect(Collectors.groupingBy(a -> a.department));
        newList2.forEach((K,V) -> System.out.println("Key : "+ K +" Values : "+ V.toString()));

        System.out.println("\nAverage salary : ");
        DoubleSummaryStatistics e=list.stream().collect(Collectors.summarizingDouble(a -> a.salary));
        System.out.println("Average : "+e.getAverage());



    }
}