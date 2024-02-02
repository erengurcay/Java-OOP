package Employee;

public class Employee {
    private String  name;
    public double salary;
    private int workHours,hireYear;

    Employee(int hireYear, int workHours, double salary, String name){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(){
        if(this.salary >= 1000){
            return salary*0.03;

        }
        return 0.0;
    }
    public double bonus(){
        int extraHours = workHours -40;
        if (extraHours > 0){
            return 30*extraHours;
        }
        return 0.0;
    }
    public double increase(){
        int year = 2024 -this.hireYear;
        if (year < 10 )
        {
            return  salary*0.05;
        }
        else if (year >= 10 && year<20)
        {
            return salary * 0.10;
        }
        else
        {
           return salary*0.15;
        }

    }









}
