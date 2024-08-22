/*
public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}
x is defined only inside the loop but the sop statement is outside hence x cant be accessed

*/
public class s12 {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 System.out.println(x);
 }
// System.out.println(x); // Error: 'x' is not accessible here
 }
}