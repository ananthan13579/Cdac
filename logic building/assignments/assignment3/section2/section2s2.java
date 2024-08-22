/*
section 2 snippet 2
iteration total value
1         4
2         7
3         10
4         11
5         11
total value 11
*/
public class section2s2 {
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 } 
}
