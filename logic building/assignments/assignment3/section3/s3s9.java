//section 3 snippet 9
public class s3s9{
public static void main(String[] args){
int n=4825;
int maxdigit=0;
int n1=n;
while(n1>0){
	int ld=n1%10;
	maxdigit=Math.max(maxdigit,ld);
	n1=n1/10;
}
System.out.print(maxdigit);
}
}