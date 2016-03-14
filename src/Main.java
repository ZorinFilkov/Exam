import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[][] = new int[N][N];
		int b[] = new int[N * N];
		for (int i = 0; i < b.length; ++i) {
			b[i] = in.nextInt();
		}
		for (int i = 0, k = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j, ++k) {
				a[i][j] = b[k];
			}
		}
		for (int j = 0; j < N; ++j) {
			for (int i = 0; i < N; ++i) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
