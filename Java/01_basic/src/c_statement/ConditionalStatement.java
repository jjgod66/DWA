package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * << if 문 >> if : 조건식의 결과가 true이면 블럭 안의 문장을 수행한다. else if : 다수의 조건이 필요할 때 if 뒤에
		 * 추가한다. else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */

//		int a = 10;
//		if (a < 100) System.out.println("조건식의 연산 결과가 true이면 수행된다.");
//		
//
//		if (a < 10) {
//			System.out.println("조건식의 연산 결과가 false이면 수행되지 않는다.");
//		}
		
		// 주민등록번호 앞자리에 따른 성별확인 코드 (if문)
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("주민등록번호 뒷자리 첫번째 숫자를 입력하세요.");
////		int regNo = Integer.parseInt(s.nextLine());	//입력 받은 값 int타입으로 변환
//		float regNo = Float.parseFloat(s.nextLine());
//		String gender = null; 						//성별
//		System.out.println(regNo);
////		boolean result = input.matches("[0-9]+");	// 나중에 배울 정규식..
//		
//		if (regNo%1 != 0) {
//			System.out.println("정수를 입력하세요");
//			
//		} else {
//			if (1<=regNo && regNo<=4) {
//				if (regNo%2==0) {
//					gender = "여성";
//				} else {
//					gender = "남성";
//				}
//			} else {
//				gender = "확인불가";
//			}
//			System.out.println("당신의 성별은 \"" + gender + "\"입니다.");
//		}
		
		// 성적에 등급을 부여하는  프로그램을 작성하세요. (Scanner를 활용하여 숫자를 입력받아 해당하는 성적을 출력하세요.)
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("본인의 점수를 입력하세요");
//		int score = Integer.parseInt(s.nextLine());
//		
//		if (score<0 || score>100) {
//			System.out.println("잘못 입력하셨습니다.");
//		} else if (score>=90) {
//			System.out.println("A");
//		} else if (score>=80) {
//			System.out.println("B");
//		} else if (score>=70) {
//			System.out.println("C");
//		} else if (score>=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		// 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		System.out.println("숫자를 입력하세요.");
//		Scanner s = new Scanner(System.in);
//		int num = Integer.parseInt(s.nextLine()); //값이 String으로 들어오기 때문에 int타입으로 형변환 해줘야 한다.
//		switch (num) {
//			case 0:
//				System.out.println("입력한 숫자는 0입니다.");
//				break;
//			default:
//				System.out.println("입력한 숫자는 0이 아닙니다.");
//				break;
//		}
		
		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		System.out.println("숫자를 입력하세요.");
//		Scanner s2 = new Scanner(System.in);
//		int num2 = Integer.parseInt(s2.nextLine());
//		switch ( num2 % 2 ) {
//			case 0:
//				System.out.println("짝수입니다.");
//				break;
//			default:
//				System.out.println("홀수입니다.");
//				break;
//		}
		
		// 두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요.
//		System.out.println("숫자를 입력하세요.");
//		Scanner s = new Scanner(System.in);
//		int num = Integer.parseInt(s.nextLine());
//		System.out.println("두번째 숫자를 입력하세요.");
//		int num2 = Integer.parseInt(s.nextLine());
//		
//		if ( num > num2 ) {
//			System.out.println("더 큰 숫자는 " + num);
//		} else if ( num < num2 ) {
//			System.out.println("더 큰 숫자는 " + num2);
//		} else {
//			System.out.println("두 숫자는 같습니다.");
//		}
		
		// 세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
		System.out.println("숫자를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = Integer.parseInt(s.nextLine());
		System.out.println("세번째 숫자를 입력하세요.");
		int num3 = Integer.parseInt(s.nextLine());
		
		if (num>num2) {
			if (num>num3) {
				System.out.println("첫번째숫자 " + num);
			} else if (num < num3) {
				System.out.println("세번째숫자 " + num3);
			} else {
				System.out.println("첫번째숫자 " + num + " 그리고 세번째숫자 " + num3);
			}
		} else if (num<num2) {
			if (num2>num3) {
				System.out.println("두번째숫자 " + num2);
			} else if (num2<num3) {
				System.out.println("세번째숫자 " + num3);
			} else {
				System.out.println("두번째숫자 " + num2 + " 그리고 세번째숫자 " + num3);
			}
		} else {
			if (num>num3) {
				System.out.println("첫번째숫자 " + num + " 그리고 두번째숫자  " + num2);
			} else if (num<num3) {
				System.out.println("세번째숫자 " + num3);
			} else {
				System.out.println("세 숫자 모두 같습니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
