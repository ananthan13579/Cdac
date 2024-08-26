//section 2 snippet 1
import java.util.*;
public class s2s1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=90) System.out.println("Grade: A");
if(n>=80&& n<90) System.out.println("Grade: B");
if(n>=70&& n<80) System.out.println("Grade: C");
if(n>=60&& n<70) System.out.println("Grade: D");
if(n<60) System.out.println("Grade: F");
}
}