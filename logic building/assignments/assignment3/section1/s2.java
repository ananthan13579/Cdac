/*
snippet2
public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }
}
IncorrectWhileCondition.java:17: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
to correct this code, assignment operator is to be used. correct code is below
*/
public class s2 {
 public static void main(String[] args) {
 int count = 5;
 while (count != 0) {
 System.out.println(count);
 count--;
 }
 }
}