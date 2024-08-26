//section 2 snippet 4
import java.util.*;
public class s2s4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

double price=sc.nextDouble();
boolean b=sc.nextBoolean();
int disc=0;
if(b==true){
	price=0.8*price;
	if(price>=1000){System.out.println("disc= "+(price*0.2));}
	if(price>=500&&price<1000){System.out.println("disc= "+(price*0.1));}
	if(price<500){System.out.println("disc= "+(price*0.05));}
}
else{
	if(price>=1000){System.out.println("disc= "+(price*0.2));}
	if(price>=500&&price<1000){System.out.println("disc= "+(price*0.1));}
	if(price<500){System.out.println("disc= "+(price*0.05));}
}
sc.close();
}}