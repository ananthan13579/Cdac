/*
public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
} 
s10.java:15: error: incompatible types: int cannot be converted to boolean
 while (num = 10) 
	 assignment operator cannot be used in while loop conditions.only relational operator can be used.
correct code is given below
*/
public class s10 {
 public static void main(String[] args) {
 int num = 10;
 while (num >= 10) {
 System.out.println(num);
 num--;
 }
 }
} 
