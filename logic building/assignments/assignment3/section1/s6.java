/*
snippet6
public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }
} 
the code is missing the { so only the first statement of loop is executed.
to print done 5 times the following change is made in the code
*/
public class s6 {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++){//{ added here
 System.out.println(i);
 System.out.println("Done");
 }
} 
