package mailTest;

import javax.mail.Authenticator;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class MailTest01 {
	public static void main(String[] args) {
//		SimpleEmail email = new SimpleEmail();
//		email.setCharset("UTF-8");
//		email.setHostName("smtp.gmail.com");
//		email.setSmtpPort(465);
//		email.setAuthenticator(new DefaultAuthenticator("jjgod66gi66", "uwxjutcvuatdsvhq"));
//		email.setSSL(true);
//		try {
//			email.addTo("jjgod66gi66@gmail.com", "수신자");
//		} catch (EmailException e) {
//			e.printStackTrace();
//			System.out.println("수신자x");
//		}
//		try {
//			email.setFrom("jjgod66gi66@gmail.com", "발신자");
//		} catch (EmailException e) {
//			e.printStackTrace();
//			System.out.println("발신자x");
//		}
//		email.setSubject("텍스트 테스트 메일입니다.");
//		email.setContent("테스트 메일의 내용입니다.", "text/plain; charset=UTF-8");
//		try {
//			email.send();
//		} catch (EmailException e) {
//			e.printStackTrace();
//			System.out.println("전송x");
//		}
		
//		SimpleEmail email = new SimpleEmail();
//		email.setCharset("UTF-8");
//		email.setHostName("smtp.naver.com");
//		email.setSmtpPort(465);
//		email.setAuthenticator(new DefaultAuthenticator("jjgod66", "T2B7NNBQLGE9"));
//		email.setSSL(true);
//		try {
//			email.addTo("jjgod66@naver.com", "수신자");
//		} catch (EmailException e) {
//			e.printStackTrace();
//			System.out.println("수신자x");
//		}
//		try {
//			email.setFrom("jjgod66@naver.com", "발신자");
//		} catch (EmailException e) {
//			e.printStackTrace();
//			System.out.println("발신자x");
//		}
//		email.setSubject("텍스트 테스트 메일입니다.");
//		email.setContent("테스트 메일의 내용입니다.", "text/plain; charset=UTF-8");
//		try {
//			email.send();
//		} catch (EmailException e) {
//			e.printStackTrace();
//			System.out.println("전송x");
//		}
		
	   HtmlEmail email = new HtmlEmail();
	    email.setCharset("UTF-8");
	    email.setHostName("smtp.naver.com");
	    email.setSmtpPort(465);
	    email.setAuthenticator(new DefaultAuthenticator("jjgod66", "T2B7NNBQLGE9"));
	    email.setSSL(true);
//	    email.setTLS(true);
	    try {
			email.addTo("jjgod66@naver.com", "수신자");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	    try {
			email.setFrom("jjgod66@naver.com", "발신자");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	    email.setSubject("HTML 테스트 메일입니다.");
	    
	    try {
			email.setHtmlMsg("<html>아파치 로고 - <img src=\"http://www.apache.org/images/asf_logo_wide.gif\"><input type='text'></html>");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	    try {
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

}
