import java.util.*;
public class a2q3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter age: ");
int age=sc.nextInt();
if(age>=18){
	System.out.print("eligible");
}
else if(age<0){
System.out.print("enter valid age");
}
else{System.out.print("not eligible");}
	}
}