/*
section 2 snippet3
iteration output
1         0
2         0 1 
3         0 1 2
4         0 1 2 3 
*/
public class section2s3 {
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) break;
 }
 System.out.println(count);
 }
} 
