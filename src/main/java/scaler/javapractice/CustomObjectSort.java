package scaler.javapractice;


import java.util.Arrays;

class Employee implements Comparable<Employee>{
        private String name;
        private int age;
        private int salary;

        public Employee (String name, int age, int salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

    public Employee(String name) {
    }

    //Nested Comparison
        public int compareTo (Employee employee){
            if(age==employee.age) {
                return (salary - employee.salary);
            }
            return age - employee.age;
            }

        public String toString() { return String.format("(%s, %d, %s)", name, salary, age); }

        }

    public class CustomObjectSort{

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee ("Rohan, 45, 8000");
        employees[1] = new Employee ("Shyam, 56, 7500");
        employees[2] = new Employee ("Rohan, 45, 8000");
        employees[3] = new Employee ("Rohan, 45, 8000");
        Arrays.sort(employees);
        System.out.println("After sorting: " + Arrays.toString(employees)) ;

    }

}
