/*
snippet5 
public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }
}
i++ means i increases from 10 to inf, so it never reaches termination condition
correct code is below
*/
public class s5 {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i--) {
 System.out.println(i);
 }
 }
}