/*
sections 2 snippet 7
++a so a=11
++a*b= 55
b is decremented so b=4
--a so a=10, result is 45
b is added so result =49
*/
public class section2s7 {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
} 
