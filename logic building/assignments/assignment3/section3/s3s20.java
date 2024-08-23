//section 3 snippet 20
public class s3s20{
	public static void main(String[] args){
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=n;j>=i;j--){
				System.out.print(j);
				if(j>i){System.out.print("*");}
			}
			System.out.println();
		}
	}
}