import java.util.*;
import java.lang.*;
public class a2q1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter yr: ");
int yr=sc.nextInt();
/*if(((yr%4==0)&&(yr%100!=0))||(yr%400==0)){
	System.out.print("leap yr");
}	
else System.out.print("not a leap yr");*/
int r=((yr%400==0)||((yr%4==0)&&(yr%100!=0)))?1:0;
switch(r){
	case 1:
	System.out.print("leap yr");
	break;

case 0:
System.out.print("not a leap yr");
break;}

	}
}