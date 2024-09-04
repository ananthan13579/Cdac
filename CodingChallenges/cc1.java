import java.lang.*;
public class cc1{
static void q7(){
/*
spaces- 97531
1         1
12       21
123     321
1234   4321
12345 54321
*/
int spaces=9;//2*5-1
for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
System.out.print(j);
		}
for(int j=1;j<=spaces;j++){
System.out.print(" ");
		}
for(int j=i;j>=1;j--){
System.out.print(j);
		}
System.out.println();
spaces-=2;
	}
}
static void q10(){
int trows=7;
for(int i=1;i<=trows;i++){
for(int j=1;j<=((i<=4)?(i):(trows-i+1));j++){
System.out.print(i*j+" " );
}
System.out.println();
	}
}
static void q6(){
int row=5;
for(int i=1;i<=row;i++){
for(int j=i;j<=row;j++) System.out.print(" ");
for(int j=1;j<=i;j++) System.out.print(j+" ");
for(int j=i-1;j>=1;j--) System.out.print(j+" ");
System.out.println();
         }
}
static void q4(){
int n = 5; 
 for(int i=1;i<=n;i++){
 for(int j=1;j<=i;j++){
 if(i==1||i==n||j==1||j==i) {
System.out.print(j+" ");
} 
else{
System.out.print("  ");
	}
		}
System.out.println(); 
        }
}
public static void main(String[] args){
//q7();q10();q6();
q4();

}
}