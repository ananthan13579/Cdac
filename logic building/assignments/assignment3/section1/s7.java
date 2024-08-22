/*
snippet7
public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
} 
s7.java:17: error: variable count might not have been initialized
 while (count < 10) {
for code to be executed, count should be initialized
int count=any number of choice;
*/
public class s7 {
 public static void main(String[] args) {
 int count=-5;
 while (count<10) {
 System.out.println(count);
 count++;
 }
 }
} 
