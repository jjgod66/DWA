package myFirstAdventure;

public class ItemBank {
	
//	Item (String name, int type, int spec, int ele, int price)
	
	Item item00 = new Item("없음", 0, 0, 0, 0);
	
	Item[] items_0 = {
		new Item("견습생의 검", 0, 12, 0, 5),
		new Item("화염 견습생의 검", 0, 8, 1, 10),
		new Item("바람 견습생의 검", 0, 8, 2, 10),
		new Item("대지 견습생의 검", 0, 8, 3, 10),
		new Item("얼음 견습생의 검", 0, 8, 4, 10),
		
		new Item("견습생의 일반갑옷", 1, 12, 0, 5),
		new Item("화염 견습생의 갑옷", 1, 8, 1, 10),
		new Item("바람 견습생의 갑옷", 1, 8, 2, 10),
		new Item("대지 견습생의 갑옷", 1, 8, 3, 10),
		new Item("얼음 견습생의 갑옷", 1, 8, 4, 10),
		
		new Item("네잎클로버", 2, 1, 0, 20)
	};
	
	Item[] items_1 = {
		new Item("수습기사의 검", 0, 25, 0, 25),
		new Item("화염 수습기사의 검", 0, 15, 1, 30),
		new Item("바람 수습기사의 검", 0, 15, 2, 30),
		new Item("대지 수습기사의 검", 0, 15, 3, 30),
		new Item("얼음 수습기사의 검", 0, 15, 4, 30),
		
		new Item("수습기사의 갑옷", 1, 25, 0, 25),
		new Item("화염 수습기사의 갑옷", 1, 15, 1, 30),
		new Item("바람 수습기사의 갑옷", 1, 15, 2, 30),
		new Item("대지 수습기사의 갑옷", 1, 15, 3, 30),
		new Item("얼음 수습기사의 갑옷", 1, 15, 4, 30),
		
		new Item("애착인형", 2, 2, 0, 50)
	};
	
	Item[] items_2 = {
	new Item("숙련기사의 검", 0, 60, 0, 50),
	new Item("화염 숙련기사의 검", 0, 35, 1, 70),
	new Item("바람 숙련기사의 검", 0, 35, 2, 70),
	new Item("대지 숙련기사의 검", 0, 35, 3, 70),
	new Item("얼음 숙련기사의 검", 0, 35, 4, 70),
	
	new Item("숙련기사의 갑옷", 1, 60, 0, 50),
	new Item("화염 숙련기사의 갑옷", 1, 35, 1, 70),
	new Item("숙련기사의 갑옷", 1, 35, 2, 70),
	new Item("대지 숙련기사의 갑옷", 1, 35, 3, 70),
	new Item("얼음 숙련기사의 갑옷", 1, 35, 4, 70),
	
	new Item("반짝거리는 목걸이", 2, 3, 0, 80)
	};
	Item[] items_3 = {
	new Item("장인의 검", 0, 90, 0, 100),
	new Item("화염 장인의 검", 0, 60, 1, 150),
	new Item("바람 장인의 검", 0, 60, 2, 150),
	new Item("대지 장인의 검", 0, 60, 3, 150),
	new Item("얼음 장인의 검", 0, 60, 4, 150),
	
	new Item("장인의 갑옷", 1, 90, 0, 100),
	new Item("화염 장인의 갑옷", 1, 60, 1, 150),
	new Item("바람 장인의 갑옷", 1, 60, 2, 150),
	new Item("대지 장인의 갑옷", 1, 60, 3, 150),
	new Item("얼음 장인의 갑옷", 1, 60, 4, 150),
	
	new Item("루비 반지", 2, 4, 0, 100)
	};
	
	Item[] items_4 = {
	new Item("전설의 명검", 0, 150, 0, 300),
	new Item("불의 명검", 0, 110, 1, 350),
	new Item("폭풍의 명검", 0, 110, 2, 350),
	new Item("다이아몬드 명검", 0, 110, 3, 350),
	new Item("혹한의 명검", 0, 110, 4, 350),
	
	new Item("전설의 갑주", 1, 150, 0, 300),
	new Item("화염 군주의 갑옷", 1, 110, 1, 350),
	new Item("초광속 경량 갑주", 1, 110, 2, 350),
	new Item("티타늄 갑옷", 1, 110, 3, 350),
	new Item("서리폭풍의 갑옷", 1, 110, 4, 350),
	
	new Item("마법이 깃든 수정구", 2, 5, 0, 150)
	};

	Item[][] itemss = {items_0, items_1, items_2, items_3, items_4};
	
}
