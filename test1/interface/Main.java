import java.util.*;

public class Main{
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("jj", 20000));
        employees.add(new Employee("ja", 25000));
        employees.add(new Employee("poon", 300000));

        Collections.sort(employees);
        for(Employee e: employees){
            System.out.println(e);
        }

        Collections.sort(employees,new SalaryComparator());
        for(Employee e: employees){
            System.out.println(e);
        }

    }
}