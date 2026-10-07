//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-1 : 직원 관리 시스템

public class Employee {
    //property
    private String name;
    private String department;

    //Constructor
    public Employee(String n, String d){
        this.name = n;
        this.department = d;
    }

    public double calculatePay(){
        return 0.0;
    }

    @Override   //Object라는 자바클래스에 대한 오버라이드
    public String toString() {
        return "이름: " + this.name + ", 부서: " + this.department;
    }
}


class FullTimeEmployee extends Employee{
    //property
    private double monthlySalary;


    //constructor
    public FullTimeEmployee(String n, String d, double m){
        super(n, d);
        this.monthlySalary = m;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + this.monthlySalary;
    }

    @Override
    public String toString() {
        return "[정규직] " + super.toString() + ", 월급: " +  this.monthlySalary + "원";
    }
}

class PartTimeEmployee extends Employee{
    //property
    private double hourlyRate;
    private int workHours;

    //constructor
    public PartTimeEmployee(String n, String d, double hR, int wH){
        super(n, d);
        this.hourlyRate = hR;
        this.workHours = wH;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + (this.hourlyRate * this.workHours);
    }

    @Override
    public String toString() {
        return "[계약직] " + super.toString() + ", 시급: " + this.hourlyRate + "원, " + "근무시간: " + this.workHours + "시간";
    }
}
