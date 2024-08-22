/*
snippet8
public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
}
if numbers from 1 to 5 have to be printed 
change num to 5 to print 5 to 1
for printing 1 to 5 check below code
*/
public class s8 {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num++;
 } while (num < 6);
 }
}