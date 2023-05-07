package kr.or.dw.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookTest {

	/*
	 * 이름, 주소, 나이, 전화번호를 멤버변수로 갖는 Phone 클래스를 만들고 Map을 이용하여 
	 * 전화번호 정보를 관리하는 프로그램을 작성해주세요.
	 * 
	 * 	- 이 프로그램에는 전화번호를 등록, 수정, 삭제, 검색, 전체 출력하는 기능이 있다.
	 * 	- 삭제와 검색기능은 '이름'을 입력받아 처리한다.
	 * 	- (Map의 구조는 key값으로 그 사람의 '이름'을 사용하고, value값으로는 'Phone클래스의 인스턴스'로 한다.)
	 * 	
	 * 	실행예시)
	 * 		다음 메뉴를 선택하세요.
	 * 		1. 전화번호 등록
	 * 		2. 전화번호 수정
	 * 		3. 전화번호 삭제
	 * 		4. 전화번호 검색
	 * 		5. 전화번호 전체 출력
	 * 		0. 프로그램 종료
	 * 		-----------------
	 * 		번호입력 >> 1
	 * 
	 * 		새롭게 등록할 전화번호 정보를 입력하세요.
	 * 		이름 >> 홍길동
	 * 		전화번호 >> 010-6773-3469
	 * 		나이 >> 20
	 * 		주소 >> 대전시 중구 선화동
	 * 
	 * 		'홍길동' 전화번호 등록 완료!!
	 * 		(단, 등록되어 있는 사람이면 '홍길동'은 이미 등록된 사람입니다. 라고 출력)
	 * 		------------------------------------------------------
	 * 		번호입력 >> 5
	 * 		
	 * 		======================================================
	 * 		번호		이름		전화번호			나이		주소
	 * 		======================================================
	 * 		 1		홍길동 	010-6773-3469	20		대전시 중구 선화동
	 * 		======================================================
	 */
	static Map<String, Phone> phoneBookList = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static int count = 0;
	public static void main(String[] args) {
			startPhoneBookList();
		
		}
	
	private static void startPhoneBookList() {
		while (true) {
			System.out.println("다음 메뉴를 선택하세요");
			System.out.println("1. 전화번호 등록");
			System.out.println("2. 전화번호 수정");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 검색");
			System.out.println("5. 전화번호 전체 출력");
			System.out.println("0. 프로그램 종료");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 0:
				System.exit(1);
				break;
			case 1:
				register();
				break;
			case 2:
				modify();
				break;
			case 3:
				delete();
				break;
			case 4:
				search();
				break;
			case 5:
				printAllPhoneNumber();
				break;
			default:
				break;
			}
		}
	}

	
	
	private static void printAllPhoneNumber() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("번호\t이름\t전화번호\t나이\t주소");
		System.out.println("----------------------------------------");
		int listNum = 1;
		for (String key : phoneBookList.keySet()) {
			Phone value = phoneBookList.get(key);
			System.out.println(listNum + "\t" + key + "\t" + value.getTel() + "\t" + value.getAge() + "\t" + value.getAddress());
			listNum++;
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}

	private static void search() {
		System.out.println("검색하고 싶은 전화번호의 사용자 이름을 입력하세요.");
		String input = sc.nextLine();
		boolean successFind = false;
		for (String key : phoneBookList.keySet()) {
			if(input.equals(key)) {
				Phone value = phoneBookList.get(key);
				System.out.println("이름 : " + key);
				System.out.println("전화번호 : " +  value.getTel());
				System.out.println("나이 : " +  value.getAge());
				System.out.println("주소 : " +  value.getAddress());
				successFind = true;
				break;
			}
		}
		if (!successFind) {
			System.out.println("사용자를 찾지 못했습니다.");
		}
	}

	private static void delete() {
		System.out.println("삭제할 전화번호의 사용자이름을 입력해주세요.");
		String input = sc.nextLine();
		boolean successFind = false;
		for (String key : phoneBookList.keySet()) {
			if(input.equals(key)) {
				phoneBookList.remove(input);
				successFind = !successFind;
				System.out.println("사용자 '" + key + "'의 정보가 삭제되었습니다.");
				break;
			}
		}
		if (!successFind) {
			System.out.println("사용자를 찾지 못했습니다.");
		}
	}

	private static void modify() {
		System.out.println("수정할 전화번호의 사용자이름을 입력해주세요.");
		String input = sc.nextLine();
		boolean successFind = false;
		for (String key : phoneBookList.keySet()) {
			if(input.equals(key)) {
				Phone user = new Phone();
				user.setAge(phoneBookList.get(input).getAge());
				user.setAddress(phoneBookList.get(input).getAddress());
				System.out.println("새로 수정할 전화번호를 입력하세요.");
				String input2 = sc.nextLine();
				user.setTel(input2);
				phoneBookList.put(input, user);
				successFind = !successFind;
			}
		}
		if (!successFind) {
			System.out.println("사용자를 찾지 못했습니다.");
		}
	}

	private static void register() {
		Phone newUser = new Phone();
		
		System.out.println("새롭게 등록할 전화번호 정보를 입력하세요.");
		System.out.print("이름 >> ");
		String inputName = sc.nextLine();
		System.out.print("전화번호 >> ");
		String inputTel = sc.nextLine();
		System.out.print("나이 >> ");
		int inputAge = Integer.parseInt(sc.nextLine());
		System.out.print("주소 >> ");
		String inputAddress = sc.nextLine();
		
		newUser.setTel(inputTel);
		newUser.setAge(inputAge);
		newUser.setAddress(inputAddress);
		phoneBookList.put(inputName, newUser);
		
	}
	

}

class Phone {
	
	private String address;
	private int age;
	private String tel;

	public Phone() {
		
	}
	public Phone(String tel, int age, String address) {
		this.tel = tel;
		this.age = age;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Phone [adress=" + address + ", age=" + age + ", tel=" + tel + "]";
	}
	
}