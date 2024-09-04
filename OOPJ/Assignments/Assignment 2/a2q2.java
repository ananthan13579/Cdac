import java.util.*;
import java.lang.*;
public class a2q2s{
	public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("enter height in m: ");
double ht= sc.nextDouble();
System.out.print("enter weight in kg: ");
double wt=sc.nextDouble();
double bmi=wt/Math.pow(ht,2);
System.out.println("bmi is: "+String.format("%.3f",bmi));
if(bmi<18){
	System.out.println("underweight");
}
else if(bmi>=18 && bmi<=25){
	System.out.println("normal weight");
}
else {System.out.println("overweight");}
	}
}