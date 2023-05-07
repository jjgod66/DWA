package e_oop;

public class OOP {

	public static void main(String[] args) {

		/*
		 * < 객체지향 프로그래밍(Object Oriented Programming) >
		 * 	프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		 * 	코드의 재사용성이 높고, 유지보수가 용이하다.
		 * 
		 */
		
//		SampleClass sc = new SampleClass();	// SampleClass타입의 변수를 만들어서 주소를 저장.
//											// new SampleClass(); 부분이 객체를 생성
//											// 이 생성된 객체의 위치를 변수에 저장한 것.
//		System.out.println(sc.field);
//		sc.method1();
//		String returnValue = sc.method2(10);
//		System.out.println(returnValue);
//		
//		sc.flowTest1();
//		
//		ClassMaker sc2 = new ClassMaker();
//		sc2.printNum();
//		System.out.println(sc2.printNum2());
//		sc2.printNum3(3);
//		System.out.println(sc2.printNum4(3, 4));
		
		Calculator cal = new Calculator();
		
		// 다음을 한줄씩 계산해서 결과값을 출력해주세요.
		// 1. 123456 + 654321
		cal.pl(123456, 654321);
		// 2. 1번의 결과값 * 123456
		cal.mu(cal.plRtn, 123456);
		// 3. 2번의 결과값 / 123456
		cal.di(cal.muRtn, 123456);
		// 4. 3번의 결과값 - 654321
		cal.mi(cal.diRtn, 654321);
		// 5. 4번의 결과값 % 123456
		cal.re(cal.miRtn, 123456);
		
		
		System.out.println(cal.reRtn);
		
		
	}

}
