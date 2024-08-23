//section 3 snippet 21
public class s3s21{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print((2*j)-1);
				if(j<i){System.out.print("*");}
			}
			System.out.println();
		}
	}
}