/*
section 2 snippet4
iteration output
1         1
2         1 2 
3         1 2 3
4         1 2 3 4
i=5, do while loops is broken, sop 5 is printed
1 2 3 4 5 is the output
*/
public class section2s4 {
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.print(i + " ");
 i++;
 } while (i < 5);
 System.out.println(i);
 }
} 
