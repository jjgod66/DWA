package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {

		/*
		 * << for문 >>
		 * 	for (int i=1; i<=10; i++) {}
		 * 	for (1부터 10까지 1씩 증가하면서 반복) {}
		 */
		
		int i, j, k, l;
		
		int sum = 0;

		
//		for (int i = 1; i <= 10; i++) {
//			// for(초기화; 조건식; 증감식) {}
//			// 초기화 : 조건식과 증감식에 사용할 변수 초기화
//			// 조건식 : 연산결과가 true이면 블럭 안의 내용을 수행한다.
//			// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
//			System.out.println(i + "번째 반복");	// 초기화한 변수를 블럭 안에서 사용할 수 있다.
//		}
		
//		for (i = 0; i < 3; i++) {
//			System.out.print(i + " ");
//		}
//		for (i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
//		for (i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
//		for ( i = 0; i < 10; i += 2) {
//			System.out.println(i);
//		}
//		for ( i = 0; ; i++) {
//			System.out.println(i);
//		}
//		for (;;) {
//			System.out.println("무한루프");
//		}
//		for ( i = 0; ; i++) {
//			if ( i > 10 ) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("무한루프 탈출~~!");
		
		// 1부터 100까지 짝수의 합을 구해보세요.
//		int sum = 0;
//		for (i=0; i<=100; i+=2) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 구구단 출력하기
		// 구구단 2단을 출력해주세요.
//		for (i=1; i<=9; i++) {
//			sum = i*2;
//			System.out.println("2 X " + i + " = " + sum);
//			}
//		for (i=1; i<=9; i++) {
//			for (j=1; j<=9; j++) {
//				sum = i*j;
//				System.out.println(i + " X " + j + " = " + i*j);
//			}	
//			System.out.println("==========");
//		}
		
		/*
		 * 아래와 같은 삼각형을 출력해주세요
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * 	*****
		 */
		
//		for ( i = 1; i <= 5; i++ ) {
//			for ( j = 1; j <= i; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		/*
		 *     *
		 *	  **
		 *	 ***
		 *	****
		 * *****	
		 */
		
//		k = 5;
//		int l = k - 1;
//		
//		
//		for ( i = 1; i <= k; i++ ) {
//			for ( j = l; j >= i; j-- ) {
//				System.out.print(" ");
//			}
//			for ( j = 1; j <= i; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
//		for (i = 0; i < 5; i++) {
//			for (j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
//		for (i = 0; i < 5; i++) {
//			for (j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*
		 *      *
		 * 	   ***
		 *    *****
		 *   *******
		 *  ********* 
		 */
		
//		k = 6;
//		l = k - 1;
//		
//		for (i = 1; i <= k; i++) {
//			for (j = k; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (j = 1; j <= i * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (i = 2; i <= k; i++) {
//			for (j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (j = k * 2; j >= i * 2; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*
		 * << while >>
		 * 	while (조건식) {}
		 * 	조건식의 결과가 true인 동안 계속해서 반복
		 * 	반복횟수를 알 수 없을 때 사용한다.
		 */
		
//		int a = 0;
//		while (a < 10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//		for (i = 0; i < 10; i++) {
//			System.out.print(i + " ");
//		}
		
//		int b = 0;
//		while (true) {
//			if (b > 10) {
//				break;
//			}
//			System.out.print(b + " ");
//			b++;
//		}
		
		// 사용자가 입력한 단의 구구단을 출력하는 프로그램을 만들어주세요.
		// 특정 값을 입력했을 때 종료가 되게 만들어주세요.
		
//		Scanner s = new Scanner(System.in);
//		int num;
//
//		while (true) {
//			System.out.println("몇단을 출력할까요? 종료는 0");
//			num = Integer.parseInt(s.nextLine());
//			if (num == 0) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			for (i = 1; i <= 9; i++) {
//				System.out.println(num + " X " + i + " = " + num * i);
//			}
//		}
		
		
		// while문과 do-while문 비교
		
		int a = 0;
//		while (a < 0) {
//			System.out.print(a + " ");
//			a++;
//		}
//		
//		System.out.println();
//
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		} while (a < 0);
//		System.out.println();
		
//		a = 0;
//		while (a < 1) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//		
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		} while (a < 1);
//		System.out.println();
		
//		a = 0;
//		while (a < 10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//		
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		} while (a < 10);
//		System.out.println();
		
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			++a;
//		} while (a < 10);
		
		
		// 숫자 맞추기 게임을 만들어 봅시다.
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("원하는 범위의 최소값을 입력하세요");
//		int min = Integer.parseInt(s.nextLine());
//		System.out.println("원하는 범위의 최대값을 입력하세요");
//		int max = Integer.parseInt(s.nextLine());
//		int num = (int)(Math.random()*(max+1-min)+min);
//		int life = 5;
//		do {
//			
//			System.out.println(min + " ~ " + max + " 사이의 정수를 입력하세요. 남은 라이프는 " + life );
//			int input = Integer.parseInt(s.nextLine());
//			
//			if (input > max || input < min ) {
//				System.out.println("잘못된 범위입니다.");
//				continue;
//			} 
//			
//			if (input > num) {
//				System.out.println("그 수보다 작습니다.");
//				life--;
//			} else if (input < num) {
//				System.out.println("그 수보다 큽니다.");
//				life--;
//			} else {
//				System.out.println("정답입니다!");
//				break;
//			} 
//			
//			if (life == 0) {
//				System.out.println("게임오버. 정답은 " + num);
//			}
//			
//		} while (life > 0);
	}

}
