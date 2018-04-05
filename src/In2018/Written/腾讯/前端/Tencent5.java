package In2018.Written.腾讯.前端;

import java.util.Scanner;

public class Tencent5 {
	public static void main(String[] args) {
		/*��Ѷǰ�˱��� ��ͼ*/
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		char[][] chess = new char[m][n];
		for (int i = 0; i < m; i++) {
			String s = sc.nextLine();
			char[] temp = s.toCharArray();
			for (int j = 0; j < temp.length; j++) {
				chess[i][j] = temp[j];
			}
		}
		char[][] yellow = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (chess[i][j] == 'Y' || chess[i][j] == 'G')
					yellow[i][j] = 'Y';
				else if (chess[i][j] == 'X' || chess[i][j] == 'B')
					yellow[i][j] = 'X';
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(yellow[i][j]);
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (yellow[0][i] == 'Y')
				count++;
			else {
				int x = 0;
				int y = i;
				while (x < m && y < n) {
					if (yellow[x][y] == 'Y') {
						count++;
						break;
					}
					x++;
					y++;
				}
			}
		}
		for (int j = 1; j < m; j++) {
			if (yellow[j][0] == 'Y')
				count++;
			else {
				int x = j;
				int y = 0;
				while (x < m && y < n) {
					if (yellow[x][y] == 'Y') {
						count++;
						break;
					}
					x++;
					y++;
				}
			}
		}
		char[][] blue = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (chess[i][j] == 'B' || chess[i][j] == 'G')
					blue[i][j] = 'B';
				else if (chess[i][j] == 'X' || chess[i][j] == 'Y')
					blue[i][j] = 'X';
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(blue[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			if (blue[0][i] == 'B')
				count++;
			else {
				int x = 0;
				int y = i;
				while (x >= 0 && y >= 0) {
					if (blue[x][y] == 'B') {
						count++;
						break;
					}
					x--;
					y--;
				}
			}
		}
		for (int j = 1; j < m; j++) {
			if (blue[j][n - 1] == 'B')
				count++;
			else {
				int x = j;
				int y = n - 1;
				while (x < m && y < n) {
					if (blue[x][y] == 'B') {
						count++;
						break;
					}
					x++;
					y++;
				}
			}
		}
		System.out.println(count);
	}
}
