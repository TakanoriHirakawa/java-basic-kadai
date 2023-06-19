package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] prime=new boolean[101];
		
		for(int i=2;i<=100;i++) {
			prime[i]=true;
			for (int j=2;j<i;j++) {
				if (i%j==0 ) {
					prime[i]=false;
				} 	
			}
			if (prime[i]==true) {
				System.out.println(i);
			}
		}
	}
}
