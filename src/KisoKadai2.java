import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		i = (int) (Math.random() * 100) + 1;
		System.out.println("数値を入力");
		String str = null;
		boolean flg;
		flg = true;
		while (flg)
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				if (isNumber(str)) {
					int n = Integer.parseInt(str);
					if (n <= 100 && n >= 1) {
						// 入力した値が正しい場合
						if (n < i) {
							System.out.println("入力した数より上です");
						} else if (n > i) {
							System.out.println("入力した数より下です");
						} else {
							break;
						}
					} else {
						// 1～100以外の数値を入力した場合
						System.out.println("1～100までの値を入力");
						continue;
					}
				} else {
					// 数値以外を入力した場合
					System.out.println("数値を入力");
					continue;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("正解");
	}

	// 数値型チェック
	public static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}
