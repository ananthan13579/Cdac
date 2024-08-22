/*
section 2 snippet1
public class NestedLoopOutput {
 public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
 for (int j = 1; j <= 2; j++) {
 System.out.print(i + " " + j + " ");
 }
 System.out.println();
 }
 }
}
output is
1 1 1 2
2 1 2 2
3 1 3 2
iteration i j 
1         1 1
2         1 2
sop();
3         2 1
4         2 2
sop();
5         3 1
6         3 2
sop();
*/
public class section2s1 {
 public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
 for (int j = 1; j <= 2; j++) {
 System.out.print(i + " " + j + " ");
 }
 System.out.println();
 }
 }
}