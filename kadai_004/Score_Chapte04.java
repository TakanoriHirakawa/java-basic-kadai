package kadai_004;

public class Score_Chapte04 {

	public static void main(String[] args) {
		char[] suffix = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		int[] score = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] total = new int[1];
		for (int i = 0; i < score.length; i++) {
			System.out.println(suffix[i] + "さん　" + score[i] + "点");
			total[0] += score[i];
		}
		System.out.println("平均点は、" + total[0] / score.length + "点");

	}

}
