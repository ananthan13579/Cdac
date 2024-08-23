//section 3 snippet 19
public class s3s19{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
				if(j<i){System.out.print("*");}
			}
			System.out.println();
		}
	}
}