package kr.or.dw.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		/*
		 * Map ==> key값과 value값을 한 쌍으로 관리하는 객체
		 * 	- key값은 중복을 허용하지 않고, 순서(index)가 없다. (Set의 특징을 갖는다.)
		 * 	- value값은 중복을 허용한다.
		 */
		
		HashMap<String, String> map = new HashMap<>();
		
		// 자료 추가 : put(key값, value값);
		map.put("name", "홍길동");
		map.put("addr", "대전");
		map.put("tel", "010-6773-3469");
		
		System.out.println("map : " + map);
		
		// 자료 수정 : 데이터를 추가할 때 key값이 같으면 나중에 추가한 value값이 저장된다.
		map.put("addr", "부산");
		System.out.println("map : " + map);
		
		// 자료 삭제 : remove(key값) ==> 'key값'이 같은 자료를 찾아서 삭제한다.
		//							    그리고 삭제된 value값이 반환된다.
//		String removeData = map.remove("tel");
//		System.out.println("map : " + map);
//		System.out.println("삭제된 데이터 : " + removeData);
		
		// 자료 읽기 : get(key값) ==> key값과 같은 쌍인 value값을 반환한다.
		System.out.println("이름 : " + map.get("name"));
		System.out.println("전화 : " + map.get("tel"));
		
		// key값의 존재 여부를 나타내는 메서드 : containsKey(key값)
		// 							       해당 'key값'이 있으면 true, 없으면 false를 반환한다.
		System.out.println("tel키값의 존재 여부 : " + map.containsKey("tel"));
		System.out.println("age키값의 존재 여부 : " + map.containsKey("age"));
		
		// Map에 저장된 모든 key값들을 읽어와 전체 Map데이터를 처리하는 방법
		
		// 방법 1 : keySet() 메서드 이용하기
		//		   Map의 모든 key값들을 읽어와 Set형으로 반환한다.
		Set<String> keySet = map.keySet();
		System.out.println("map에 들어있는 key값 : " + keySet);
		
		Iterator<String> keyIt = keySet.iterator();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("[Iterator 이용하기]");
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 방법2 : keySet()의 결과를 향상된 for문으로 사용하기
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("[향상된 for문 이용하기]");
		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 방법3 : value값만 읽어와 처리하기 ==> values() 메서드 이용
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("[values() 이용하기]");
		for (String value : map.values()) {
			System.out.println("value : " + value);
		}
		
		// 방법4 : Map에는 Entry라는 내부 class가 만들어져 있다.
		//		    이 Entry클래스는 key와 values라는 멤버변수로 구성되어 있다.
		// 		  Map에서는 이 Entry클래스를 Set형식으로 저장하여 관리한다.
		//		  Map에 저장된 전체 Entry객체를 가져오기(가져온 Entry객체들은 Set형식으로 되어있다.)
		//		  ==> entrySet()메서드를 이용한다.
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("[entry 이용하기]");
		Set<Map.Entry<String, String>> mapSet = map.entrySet();
		System.out.println(mapSet);
		
		Iterator<Map.Entry<String, String>> entryIt = mapSet.iterator();
		while (entryIt.hasNext()) {
			Map.Entry<String, String> entry = entryIt.next();	// Entry 객체 하나씩 구해오기
			System.out.println("key값 : " + entry.getKey());
			System.out.println("value값 : " + entry.getValue());
		}
		
		
		
		
	}

}
