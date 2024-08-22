/*
snippet1
public class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i--) {
 System.out.println(i);
 }
 }
above code does not terminate because it does not meet the terminating condition. correct code is 
}*/
public class s1 {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.println(i);//changed i-- to i++ so terminating condition is met
 }
 }
}