package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] Prime=new boolean[101];
		System.out.println(1); //問題文で１は素数としているため
		
		for(int i=2;i<=100;i++) {
			Prime[i]=true;
			for (int j=2;j<i;j++) {
				if (i%j==0 ) {
					Prime[i]=false;
				} 	
			}
			if (Prime[i]==true) {
				System.out.println(i);
			}
		}
	}
}
