package kr.or.dw.basic;

import javax.swing.JOptionPane;

public class ThreadTest07 {
	
	/*
	 * 	컴퓨터와 가위 바위 보를 진행하는 프로그램을 작성하시오.
	 * 
	 * 	컴퓨터의 가위바위보는 난수를 이용해서 구하고
	 * 	사용자의 가위바위보는 showInputDialog()를 이용해서 입력받는다.
	 * 	
	 * 	입력시간은 5초로 제한하고, 카운트다운을 진행한다.
	 * 	5초 안에 입력이 없으면 게임에 진 것으로 처리한다.
	 * 	5초 안에 입력이 완료되면 승패를 구해서 출력한다.
	 * 	결과 예시)
	 * 	-- 결	과 --
	 * 	컴퓨터 : 가위
	 * 	사용자 : 바위
	 * 	   <승!!>
	 */
	static int c = (int)(Math.random() * 3);
	static DataInputThread2 dit = new DataInputThread2();
	
	public static void main(String[] args) {
		CountDownThread2 cdt = new CountDownThread2();
		dit.start();
		cdt.start();
	}
	
	
	
}

class DataInputThread2 extends Thread {
	
	public static boolean inputCheck;

	@Override
	public void run() {
		// 사용자로부터 데이터 입력 받기
		String uText = JOptionPane.showInputDialog("가위, 바위, 보 중 하나를 입력하세요.");
		
		if (uText == null) {
			System.exit(1);
		}
		
		inputCheck = true;
		
		int u = 0;
		String cText = "";
		
		switch (uText) {
		case "가위":
			u = 0;
			break;
		case "바위":
			u = 1;
			break;
		case "보":	
			u = 2;
			break;
			
		default:
			System.out.println("잘못입력하였습니다.");
			u = 100;
			break;
		}
		
		switch (ThreadTest07.c) {
		case 0:
			cText = "가위";
			break;
		case 1:
			cText = "바위";
			break;
		case 2:
			cText = "보";
			break;
		default:
			break;
		}
		
		System.out.println("나 : " + uText);
		System.out.println("컴퓨터 : " + cText);
		calculate(u);
		
		
		
	}

	private void calculate(int u) {
	
		switch (ThreadTest07.c - u) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case 1:
		case -2:
			System.out.println("졌습니다.");
			break;
		case -1:
		case 2:
			System.out.println("이겼습니다.");
			break;
		default:
			System.out.println("입력오류");
			break;
		}
		
	}
	
}

class CountDownThread2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
			
			if (DataInputThread2.inputCheck) {
				return;
			}		
				
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			ThreadTest07.dit.sleep(10);
			ThreadTest07.dit.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("5초가 지났습니다. 패배합니다.");
		
	}
	
}