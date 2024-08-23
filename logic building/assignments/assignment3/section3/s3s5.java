// section 3 snippet 5
public class s3s5{
public static void main(String[] args){
int n1=0;
int n2=1;
int n3;
System.out.print(n1+" "+n2);
for(int i=2;i<21;i++){
n3=n1+n2;
n1=n2;
n2=n3;
System.out.print(" "+n3);
if(n3==21) break;
}
}
}