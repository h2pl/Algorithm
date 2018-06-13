package 过去笔试记录.In2018.Written.腾讯.前端;

import java.util.Scanner;

public class Tencent6 {
	public static void main(String[] args) {
		/**
		 * ��Ѷǰ�˱���  day���count���ɿ������ڶ���Բ����ڵ�һ��һ����ɿ������������ơ���֤���һ�컹���ɿ����ԡ���һ�����Զ����ɿ�����
		 */
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int count = sc.nextInt();
		int res = 0;
		for (int i = count; i >0; i--) {
			int j = 1;
			int sum = i;
			int temp=i;
			while (j < day && sum <= count) {
				temp=temp%2==1?temp/2+1:temp/2;
				sum += temp;
				j++;
			}
			if (j == day && sum <= count) {
				res = i;
				break;
			}
		}

		System.out.println(res);
	}
}
