package hw0427_Tue_ch7;

import java.util.ArrayList;

public class k33_ch7_08_ArrayList1 {		//��1

	public static void main(String[] args) {
		ArrayList k33_iAL = new ArrayList();
		
		k33_iAL.add("abc");
		k33_iAL.add("abcd");
		k33_iAL.add("efga");
		k33_iAL.add("������0");
		k33_iAL.add("1234");
		k33_iAL.add("12��34");
		
		System.out.printf("*******************************************\n");
		System.out.printf("  ���� ArrayList %d \n", k33_iAL.size());
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf("  ArrayList %d = %s\n", k33_i, k33_iAL.get(k33_i));
		}
		
		k33_iAL.set(3,  "������");
		System.out.printf("*******************************************\n");
		System.out.printf("  ���뺯�� ArrayList %d \n", k33_iAL.size());
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf("  ArrayList %d = %s\n", k33_i, k33_iAL.get(k33_i));
		}
		
		k33_iAL.remove(4);
		System.out.printf("*******************************************\n");
		System.out.printf("  ���뺯�� ArrayList %d \n", k33_iAL.size());
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf("  ArrayList %d = %s\n", k33_i, k33_iAL.get(k33_i));
		}
		
		k33_iAL.sort(null);
		System.out.printf("*******************************************\n");
		System.out.printf("  ����Ʈsort ArrayList %d \n", k33_iAL.size());
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf("  ArrayList %d = %s\n", k33_i, k33_iAL.get(k33_i));
		}
		
		k33_iAL.clear();
		System.out.printf("*******************************************\n");
		System.out.printf("  ���λ��� ArrayList %d \n", k33_iAL.size());
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf("  ArrayList %d = %s\n", k33_i, k33_iAL.get(k33_i));
		}
	}

}
