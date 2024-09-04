import java.lang.*;
public class cc1{
static void q1(){
int rows=5;
for(int i=1;i<=rows;i++){
for(int j=i;j<rows;j++){
System.out.print(" ");
	}
for(int j=1;j<=2*i-1;j++){
if(j==1||i==rows||j==2*i-1){
System.out.print("*");
	}
else{
System.out.print(" ");
		}
	}
System.out.println();
	}
}
static void q2(){
int n=5;
for(int i=n;i>=1;i--) {
for(int j=i; j<n; j++) {
System.out.print(" ");
	}
for (int k=1;k<=(2*i-1);k++){
if(k==1||i==n||k==(2*i-1)){
System.out.print("*");
          }
else{
System.out.print(" ");
	}
}
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
static void q5(){
int row=5;
for(int i=1;i<=row;i++){
for(int j=i;j<=row;j++)
System.out.print(" ");
for(int j=1;j<=i;j++)
System.out.print(j+"");
for(int j=i-1;j>=1;j--)
System.out.print(j+"");
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

static void q7(){

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
static void q8(){
int rows=6;
for(int i=0;i<rows;i++) {
for(int j=0;j<rows-i-1;j++) {
System.out.print("0");
}
for(int j=0;j<=i;j++) {
System.out.print((i+1)*10/9);
            }
for(int j=i-1;j>=0;j--) {
System.out.print((i+1)*10/9);
            }
System.out.println();
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

public static void main(String[] args){
//q7();q10();q6();q4();q1();q2();q5();
q8();
}
}