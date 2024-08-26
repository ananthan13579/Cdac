//section 2 snippet 3
import java.util.*;
public class s2s3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();	
char op=sc.next().charAt(0);
int res=0;
switch(op){
	case '+':
	res=n1+n2;
	break;
	case '-':
	res=n1-n2;
	break;
	case '*':
	res=n1*n2;
	break;
	case '/':
	if(n2!=0){
		res=n1/n2;
	}
	else{
		System.out.print("invalid");
	}
	break;
}
System.out.print(res);
sc.close();
}}