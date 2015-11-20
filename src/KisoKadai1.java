import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("xの値を入力");
		String strx = null;
		String stry = null;
		boolean flg;
		flg = true;
		while (flg)
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				strx = br.readLine();
				if (isNumber(strx)) {
					int n = Integer.parseInt(strx);
					if (n <= 100 && n >= 1) {
						// 入力した値が正しい場合
						break;
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
		System.out.println("yの値を入力");
		while (flg)
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				stry = br.readLine();
				if (isNumber(stry)) {
					int m = Integer.parseInt(stry);
					if (m <= 100 && m >= 1) {
						// 正しい値を入力した場合
						break;
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

		int x = Integer.parseInt(strx);
		int y = Integer.parseInt(stry);
		for (int j = 1; j <= x; j++) {
			for (int i = 1; i <= y; i++) {
				if (i * j < 10) {
					System.out.print("     ");
				} else if (i * j < 100) {
					System.out.print("    ");
				} else if (i * j < 1000) {
					System.out.print("   ");
				} else if (i * j < 10000) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
				System.out.print(i * j);
			}
			System.out.println();
		}
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