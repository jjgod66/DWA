package i_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Board_p {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> num = new ArrayList<>();
	ArrayList<HashMap<String, String>> table = new ArrayList<>();
	HashMap<String, String> Writting = new HashMap<>();
	int count = 0;
	
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd a hh:mm");
	String day = sdf.format(today);
	
	 void boardStart () {
		while (true) {
			showBoard ();
			chooseAction ();
		}
	}
	

	private void showBoard() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		for (int i = 0; i < table.size(); i++) {
//			if (table.get(i) != null) {
				System.out.print(table.get(i).get("글번호") + "\t");
				System.out.print(table.get(i).get("제목") + "\t");
				System.out.print(table.get(i).get("작성자") + "\t");
				System.out.println(table.get(i).get("작성일"));
//			}
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		
	}

	
	 private void chooseAction() {
		System.out.println("1. 조회\t2. 글작성\t 3. 종료");
		int input = Integer.parseInt(sc.nextLine());
		switch (input) {
		case 1:
			readPost();
			break;
		case 2:
			WritePost();
			break;
		case 3:
			exit();
			break;
		default:
			break;
		}
	}


	private void readPost() {
		System.out.println("조회하고 싶은 글의 번호를 입력하세요.");
		int input = Integer.parseInt(sc.nextLine());
		int temp = -1;
		if (input > num.size()) {
			System.out.println("조회할 수 없습니다.");
		} else {
			for (int i = 0; i < table.size(); i++) {
				if (Integer.parseInt(table.get(i).get("글번호")) == num.get(input-1)) {
					System.out.println("조회내용 :\n" + table.get(i).get("내용"));
					temp = i;
					break;
				}
			}
			
			if (temp >= 0) {
				managePost(temp);
			} else {
				System.out.println("조회할 수 없습니다.");
			}
		}
	}
	

	private void managePost(int tableIndex) {
		System.out.println("1. 수정\t2. 삭제\t3. 뒤로가기");
		int inputMangePost = Integer.parseInt(sc.nextLine());
		
		switch (inputMangePost) {
		case 1:
			modifyPost(tableIndex);
			break;
		case 2:
			deletePost(tableIndex);
			break;	
		case 3:
			
			break;
		default:
			break;
		}
	}

	
	private void modifyPost(int tableIndex) {
		System.out.println("수정 전 내용 : " + table.get(tableIndex).get("내용"));
		System.out.println("수정할 내용을 입력하세요>");
		String modify = sc.nextLine();
		
		Writting.put("제목", table.get(tableIndex).get("제목"));
		Writting.put("내용", modify);
		Writting.put("작성자", table.get(tableIndex).get("작성자"));
		Writting.put("작성일", day);
		Writting.put("글번호", table.get(tableIndex).get("글번호"));
//		String.valueOf(tableIndex + 1)
		table.set(tableIndex, Writting);
		System.out.println("수정이 완료되었습니다.");
		Writting = new HashMap<>();
	}

	
	private void deletePost(int tableIndex) {
		System.out.println("현재 글을 삭제하시겠습니까? 1. 예\t2. 아니오");
		int input = Integer.parseInt(sc.nextLine());
		
		switch (input) {
		case 1:
			table.remove(tableIndex);
			System.out.println("삭제하였습니다.");
//			System.out.println(table.toString());
			break;
		case 2:
			
			break;
		default:
			break;
		}
	}

	
	private void WritePost() {
		System.out.println("제목을 입력하세요>");
		String inputString = sc.nextLine();
		Writting.put("제목", inputString);
		
		System.out.println("내용을 입력하세요>");
		inputString = sc.nextLine();
		Writting.put("내용", inputString);
		
		System.out.println("작성자를 입력하세요>");
		inputString = sc.nextLine();
		Writting.put("작성자", inputString);
		
		Writting.put("작성일", day);
		
		count++;
		Writting.put("글번호", String.valueOf(count));
		
		table.add(Writting);
		
		num.add(count);
		
		System.out.println("글 작성을 완료했습니다.");
//		System.out.println(Writting.toString());
		Writting = new HashMap<>();
//		Writting.clear();
//		System.out.println(Writting.toString());
		
	}

	
	private void exit() {
		System.out.println("게시판을 종료합니다.");
		System.exit(0);
	}


	public static void main(String[] args) {
		Board_p bp = new Board_p();
		bp.boardStart();
	}

}
