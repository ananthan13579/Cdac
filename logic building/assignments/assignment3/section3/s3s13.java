//section 3 snippet 13
public class s3s13{
	public static void main(String[] args){
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i);
			if(j<i) {System.out.print("*");}
		}
		System.out.println();
	}
	for(int i=n;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(i);
			if(j<i) {System.out.print("*");}
		}
		System.out.println();
	}
	}
}