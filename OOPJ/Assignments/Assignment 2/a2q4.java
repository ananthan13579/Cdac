import java.util.*;
public class a2q4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter month: ");
int month=sc.nextInt();
switch(month){
case 1:{
	System.out.print("winter");
	break;
}
case 2:
case 3:System.out.print("spring");
	break;
case 4:
case 5:
case 6:
case 7:
case 8:
System.out.print("summer");
break;
case 9:
case 10:
System.out.print("autumn");
break;
case 11:
case 12:
System.out.print("winter");
	break;
}	
	}
}