//section 2 snippet 5
import java.util.*;
public class s2s5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int s3=sc.nextInt();
int s2=sc.nextInt();
int count=0;
if(s1>=40){count++;}
if(s2>=40){count++;}
if(s3>=40){count++;}

if(count==3) System.out.print("pass");
else System.out.print("fail in "+(3-count)+" subjects");
sc.close();
}}