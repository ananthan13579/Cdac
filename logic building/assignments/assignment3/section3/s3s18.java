//section 3 snippet 18
public class s3s18{
public static void main(String[] args){
int n = 4; 
for(int i=1;i<= n;i++) {
    for(int j=i;j<n;j++) {
     System.out.print(" ");
            }
    for(int j=1;j<=(2*i-1);j++) {
     System.out.print("*");
            }
     System.out.println();
        }
    for (int i=n-1;i>= 1;i--) {
            
     for(int j =n;j>i;j--) {
     System.out.print(" ");
            }
    for (int j=1;j<=(2*i-1); j++) {
    System.out.print("*");
            }
    System.out.println();
        }

}
}