/*
snippet3
public class DoWhileIncorrectCondition {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num > 0);
 }
} 
the loop does not execute once, it executes infinite times as the while condition is always true after first iteration.
if while(num>0) is changed to while(num<0) the loop will only execute once
*/
public class s3 {
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num <0);
 }
} 
