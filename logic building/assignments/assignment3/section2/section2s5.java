/*
section 2 snippet5
iteration numvalue
1    	  0
2		  2
3         -1
4         3

*/
public class section2s5 {
 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
}