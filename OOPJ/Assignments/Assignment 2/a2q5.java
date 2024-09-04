import java.util.*;
import java.lang.*;
public class a2q5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[] a1={"Circle","circle"};
String[] a2={"Square" ,"square"};
String[] a3={"Rectangle","rectangle"};
String[] a4={"Triangle","triangle"};
  System.out.print("Enter a shape (Circle, Square, Rectangle, Triangle): ");
String s=sc.next().trim().toLowerCase();
switch(s){
case "circle":{
final double Pi=3.14159265;
System.out.print("enter radius: ");
double radius=sc.nextDouble();
double area=Pi*Math.pow(radius,2);
System.out.print("area of circle is= "+String.format("%.3f",area));
break;}
case "square":{
System.out.print("enter side length: ");
double side=sc.nextDouble();
double area=Math.pow(side,2);
System.out.print("area of square is= "+String.format("%.3f",area));
break;}
case "rectangle":{
System.out.print("enter length: ");
double l=sc.nextDouble();
System.out.print("enter width: ");
double b=sc.nextDouble();
double area=l*b;
System.out.print("area of rectangle is= "+String.format("%.3f",area));
break;}
case "triangle":{
System.out.print("enter b: ");
double b=sc.nextDouble();
System.out.print("enter h: ");
double h=sc.nextDouble();
double area=(0.5*b*h);
System.out.print("area of triangle is= "+String.format("%.3f",area));
break;}
}

	}
}