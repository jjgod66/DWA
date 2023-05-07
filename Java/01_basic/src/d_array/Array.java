package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		/*
		 * << 배열 >>
		 * 	여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * 	참조형 타입이다.
		 * 	인덱스로 값을 구분한다.
		 * 	길이를 변경할 수 없다.
		 */
 
		int[] array;				// 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5];			// 배열이 생성되고 그 주소가 저장된다.
		
//		int[] array2 = new int[5];	
		
		array = new int[] {1, 2, 3, 4, 5};
//		array2 = {1, 2, 3, 4, 5};	// 이 방법은 변수의 선언과 초기화를 동시에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5};
		
//		System.out.println(array2[0]);
//		System.out.println(array2[1]);
//		System.out.println(array2[2]);
//		System.out.println(array2[3]);
//		System.out.println(array2[4]);
//		
//		int sum = 0;
//		for (int i = 0; i < array2.length; i++) {
//			sum += array2[i];
//		}
//		System.out.println("합계 : " + sum);
		
//		int[] arrayx;
//		arrayx = new int[10];
//		
//		for (int i = 0; i < arrayx.length; i++) {
//			arrayx[i] = (int)(Math.random() * 100 + 1);
//		}
//		System.out.println(Arrays.toString(arrayx));
//
//		// 위에서 만든 임의이 숫자 10개 배열에서 최대값과 최소값을 구해주세요.
//		int max = arrayx[0];
//		int min = arrayx[0];
//		for (int i = 0; i < arrayx.length; i++) {
//			if (arrayx[i] > max) {
//				max = arrayx[i];
//			} else if (arrayx[i] < min) {
//				min = arrayx[i];
//			}
//		}
//		
//		System.out.println(max);
//		System.out.println(min);

		// 1~10까지의 숫자를 배열x에 랜덤하게 배치하세요.
		int[] x = new int[10];
//		for (int i = 0; i < x.length; i++) {
//			x[i] = i+1;
//		}
//		System.out.println(Arrays.toString(x));
//		
//		int temp = 0;
//		int randomIndex = 0; 
//		
//		for (int i = 0; i < x.length; i++) {
//			randomIndex = (int)(Math.random() * x.length);
//			temp = x[i];
//			x[i] = x[randomIndex];
//			x[randomIndex] = temp;
//		}
//		System.out.println(Arrays.toString(x));
		
//		for (int i = 0; i < x.length; i++) {
//			x[i] = (int)(Math.random() * 10 + 1);
//			for (int j = 0; j < i; j++) {
//				if (x[i] == x[j]) {
//					i--;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(x));
		
		// 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 배열에 담아 출력해주세요.
//		int[] number = new int[500];
		int[] count = new int[10];
		
//		for (int i = 0; i < number.length; i++) {
//			number[i] = (int)(Math.random()*10+1);
//			for (int j = 0; j < count.length; j++) {
//				if (number[i] == j+1) {
//					count[j] += 1;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(number));
//		System.out.println(Arrays.toString(count));
		
//		for (int i = 0; i < 500; i++) {
//			int a = (int)(Math.random() * count.length);
//			count[a] += 1;
//		}
//		System.out.println(Arrays.toString(count));
//		
//		System.out.println(Arrays.toString(count));
		
		// 위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("범위의 최소값을 입력하세요");
//		int min = Integer.parseInt(s.nextLine());
//		System.out.println("범위의 최대값을 입력하세요");
//		int max = Integer.parseInt(s.nextLine());
//		System.out.println("반복횟수를 입력하세요");
//		int repeat = Integer.parseInt(s.nextLine());
//		
//		System.out.println("최소값 : " + min + " / 최대값 : " + max + " / 반복횟수 : " + repeat);
//		
//		int[] result = new int[max-min+1];
//		
//		for (int i = 0; i < repeat; i++) {
//			int a =  (int)(Math.random() * result.length + min);
//			result[a - min] += 1;
//			
//		}
//		System.out.println("<숫자별 반복횟수>");
//		for (int i = 0; i <result.length; i++) {
//			System.out.print((i+1) + " : " + result[i] + "번 / ");
//		}
		
		/*
		 * 	거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 	거스름돈 : 2860원
		 * 	500원 : 5개
		 * 	100원 : 3개
		 * 	50원 : 1개
		 * 	10원 : 1개
		 */
//		int inputMoney = (int) (Math.random() * 500 + 1) * 10;
//		System.out.println("거스름돈 : " + inputMoney);
//
//		int[] divide = { 500, 100, 50, 10 };
//		int[] money = new int[4];
//
//		for (int i = 0; i < divide.length; i++) {
//			money[i] = inputMoney / divide[i];
//			System.out.println(divide[i] + "원 : " + money[i] + "개");
//			inputMoney = inputMoney % divide[i];
//		}
		
		
	}

}
    