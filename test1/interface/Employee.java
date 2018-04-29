
public class Employee implements Comparable<Employee>{
    private double salary;
    private String name;
    public Employee(String name , double salary){
        this.salary = salary;
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString(){
        return name + " got " + salary + " a month ";
    }
    public int compareTo(Employee e){
        return name.compareTo(e.name);
    }
}