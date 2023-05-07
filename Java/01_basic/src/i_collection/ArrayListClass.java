package i_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 *  boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공 여부를 반환한다.
		 *  void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.(한 칸씩 뒤로 민다.)
		 *  Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.(덮어 쓴 후 반환)
		 *  Object get(int index) : 지정된 위치의 객체를 반환한다.
		 *  int size() : 리스트의 길이, 즉 저장된 객체의 수를 반환한다.
		 *  boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		// 제네릭(<>안에 들어가는 타입)을 지정하지 않으면 넣을 때는 편하나 꺼낼 때는 타입을 예측하기 힘들다.
		// 따라서 제네릭타입의 사용이 권장된다.
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
//		list.add("abc");
		list.add(20);
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1, 40);
		System.out.println(list);

//		list.add(7, 50); 	// 순서대로만 저장할 수 있다.
		Integer before = list.set(2, 50);	// 2번 인덱스에 값을 저장하고 기존 값을 반환한다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.get(i));
//			list.remove(0);
//		}
		
		// list의 객체들을 모두 삭제해주세요.
//		System.out.println(list);
//		
//		int n = list.size();
//		for (int i = 0; i < n; i++) {
//			list.remove(0);
//		}
//		System.out.println(list);
//	
//		for (int i = list.size() - 1; i > 0; i--) {
//			list.remove(i);
//		}
//		System.out.println(list);
//		
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
			i--;
		}
		System.out.println(list);
		
		// list에 1부터 100까지 랜덤값을 10개 저장해주세요.
		Integer random = 0;
		for (int i = 0; i < 10; i++) {
			random = (int)(Math.random() * 100) + 1;
			list.add(random);
		}
		System.out.println(list);
		
		// list에 저장된 값의 합과 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		// list에서 최소값과 최대값을 구해주세요.
		int max = list.get(0);
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println(list);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println();
		
		// 오름차순
		int temp = 0; 
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) >= list.get(j)) {
					temp = list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("오름차순 : \n" + list);
		
		// 내림차순
		temp = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) <= list.get(j)) {
					temp = list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("내림차순 : \n" + list);
		
		// list를 오름차순으로 정렬해주세요
		for (int i = 1; i < list.size(); i++) {
			temp = list.get(i);
			int j = 0;
			for (j = i - 1; j >= 0; j--) {
				if (temp < list.get(j)) {
					list.set(j + 1, list.get(j));
				} else {
					break;
				}
			}
			list.set(j + 1, temp);
		}
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
