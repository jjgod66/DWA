package test;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class CommonsEmailTest {
	
	public static void main(String[] args) {
		SimpleEmail em = new SimpleEmail();
		em.setCharset("UTF-8");
		em.setHostName("mail.naver.com");
//		em.setAuthentication("madvirus", "password");
		try {
			em.addTo("jjgod66@naver.com", "receiver");
			em.setFrom("jjgod66@naver.com", "sender");
		} catch (EmailException e) {
			e.printStackTrace();
		}
		em.setSubject("subject");
		em.setContent("abcd", "text/plain; charset=UTF-8");
		try {
			em.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

}
