package DemoEmployee;
import java.util.*;
public class Employee {
Scanner sc=new Scanner(System.in);
private String name;
private boolean isShareholder;
private int empId;
private String department;
private float salary;
public void getData() {
System.out.println("Name: ");
name=sc.nextLine();
System.out.println("Department: ");
department= sc.nextLine();
System.out.println("Employee ID: ");
empId = sc.nextInt();
System.out.println("Salary:");
salary= sc.nextFloat();
System.out.println("is the employee a shareholder in the company? ");
isShareholder = sc.nextBoolean();
	}
public void showData() {
System.out.println("Name: "+name);
System.out.println("Department: "+department);
System.out.println("Employee ID: "+empId);
System.out.println("Salary: "+salary);
if(isShareholder==true) System.out.println("Employee is a shareholder");
else System.out.println("Employee is not a shareholder");
	}
public static void main(String[] args) {
Employee e1=new Employee();
e1.getData();
e1.showData();
	}

}
