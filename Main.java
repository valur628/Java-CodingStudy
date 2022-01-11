
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV189xUaI8UCFAZN
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();

			int a_sum = 0, b_sum = 0;

			if (R > W) {
				b_sum = Q;
			} else {
				int over = (W - R);
				b_sum = (Q + (over * S));
			}

			a_sum = (W * P);
			System.out.printf("i %d a_sum %d", test_case, a_sum);
			System.out.printf("i %d a_sum %d", test_case, b_sum);

			int result = (a_sum > b_sum ? b_sum : a_sum);

			System.out.printf("#%d %d\n", test_case, result);
		}
	}
}