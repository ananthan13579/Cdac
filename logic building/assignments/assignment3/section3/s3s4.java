//section 3 snippet 4
public class s3s4{
public static void main(String[] args){
	int n=1234;
	int m=3528;
	int m1=m;
	int n1=n;
	int revNum1=0;
	int revNum2=0;
	while(n1>0&&m1>0){
		int ld1=n1%10;
	revNum1=(revNum1*10)+ld1;
	n1=n1/10;
	int ld2=m1%10;
	revNum2=(revNum2*10)+ld2;
	m1=m1/10;
	}
	System.out.println(revNum1);
	System.out.println(revNum2);
}
}