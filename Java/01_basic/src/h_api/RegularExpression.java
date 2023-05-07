package h_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	: 뒷 문자로 시작
		 * $	: 앞 문자로 종료
		 * .	: 임의의 문자(줄바꿈 제외)
		 * *	: 앞 문자가 0개 이상
		 * +	: 앞 문자가 1개 이상
		 * ? 	: 앞 문자가 없거나 1개
		 * []	: 문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 * {}	: 앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	: 그룹화(1개의 문자처럼 인식)
		 * |	: OR 연산
		 * \s	: 공백, 탭, 줄바꿈
		 * \S	: 공백, 탭, 줄바꿈이 아닌 문자
		 * \w	: 알파벳이나 숫자
		 * \W	: 알파벳이나 숫자가 아닌 문자
		 * \d	: 숫자
		 * \D	: 숫자가 아닌 문자
		 * (?!)	: 뒷 문자의 대소문자 구분 안함
		 * \	: 정규표현식에서 사용되는 특수문자 표현
		 */
//		String str = "abdEF123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-zA-Z0-9]+";
//		String regex = "\\w*";
//		String regex = ".*";
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		// 아이디, 전화번호, 이메일주소, 비밀번호의 유효성을 검사하는 정규표현식을 만들어주세요.
		String id = "jjgod66-gi66";
		String pwd = "!Rldtkdwo12345";
		String phone = "010-6886-6510";
		String email = "jjgod66-gi66@hs_com.co.kr";
		
		String regexId = "[a-z0-9\\_\\-]{5,20}";
		String regexPwd = "(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&])[a-zA-Z\\d!@#$%^&]{8,}";	// ?= 전방 탐색 기호
		String regexPhone = "0\\d{1,3}-\\d{3,4}-\\d{4}";
		String regexEmail = ".+@[\\w-]+\\.{1}(com|net|co.kr)"; 
		
		
		Pattern pId = Pattern.compile(regexId);
		Matcher mId = pId.matcher(id);
		System.out.println(mId.matches());
		
		Pattern pPwd = Pattern.compile(regexPwd);
		Matcher mPwd = pPwd.matcher(pwd);
		System.out.println(mPwd.matches());
		
		Pattern pPhone = Pattern.compile(regexPhone);
		Matcher mPhone = pPhone.matcher(phone);
		System.out.println(mPhone.matches());
		
		Pattern pEmail = Pattern.compile(regexEmail);
		Matcher mEmail = pEmail.matcher(email);
		System.out.println(mEmail.matches());
	}

	
	
	
}
