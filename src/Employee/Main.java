package Employee;

import Employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee Employee = new Employee(1985,45,2000.0,"arda");
        System.out.println("Tax : " + Employee.tax());
        System.out.println("Bonus : " + Employee.bonus());
        System.out.println("IncreaseSalary : " + Employee.increase());
        double totalSalary = Employee.salary - Employee.tax() + Employee.bonus();
        System.out.println("TotalSalary : " + totalSalary);
        System.out.println("Total salary with the raise of salary : " + (Employee.salary+Employee.increase()));



    }



}
