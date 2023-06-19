package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//2～100まで、素数であるかを判定する配列（便宜上101）
		boolean[] primeFlg=new boolean[101];
		
		
		for(int i=2;i<=100;i++) {
			//2～100まで全てを素数であると仮定
			primeFlg[i]=true;
			for (int j=2;j<i;j++) {
				//2～100までの数についてi/ （2～i）までの数の剰余が0となった場合は、falseにする。
				if (i%j==0 ) {
					primeFlg[i]=false;
				} 	
			}
			if (primeFlg[i]==true) {
				System.out.println(i);
			}
		}
	}
}
