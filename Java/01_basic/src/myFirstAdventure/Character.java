package myFirstAdventure;

import java.util.Scanner;

public class Character {
	Scanner sc = new Scanner(System.in);
	String[] locations = {"시작의 땅", "불의 땅", "바람의 땅", "대지의 땅", "물의 땅", "결전의 장"};
	String[] eles = {"none", "fire", "wind", "earth", "ice"};
	String[] classs = {"광전사", "성기사", "승부사", "명문기사"};

	String name;
	String clas;
	int pow;
	int def;
	int luck;
	int hpMax;
	int hp;
	int exp;
	int powI;
	int powT;
	int luckI;		// 장신구 착용했을 때 올라가는 민첩성
	int luckT;
	int defI;
	int defT;
	int cri = 10;	// 크리율 기본 보정값 1/10
	int criT;		// 크리율 10/1 확률로 2배 데미지
	int acc = 3;	// 명중률 기본 보정값 1/3
	int accT;		// 명중률 기본 1/3 확률로 미스남
	int eva;	// 회피할 확률 (20%)
	int run;	// 도망칠확률(50%)
	String locationCurrent;
	ItemBank t = new ItemBank();
	Item[] itemHave = new Item[3];

	Character(String inputName, int inputClass) {
		this.name = inputName;
		pow = 20;
		hpMax = 100;
		hp = 100;
		def = 0;
		exp = 0;
		luck = 0;
		if (inputClass == 1) {
			clas = classs[0];
			pow = 30;
			hpMax = 80;
			hp = 80;
		} else if (inputClass == 2) {
			clas = classs[1];
			pow = 15;
			hpMax = 140;
			hp = 140;
			def = 3;
		} else if(inputClass == 3) {
			clas = classs[2];
			luck = 2;
		} else if (inputClass == 4) {
			clas = classs[3];
			exp = 50;
		}
				
		
		locationCurrent = locations[0];
		itemHave[0] = t.item00;
		itemHave[1] = t.item00;
		itemHave[2] = t.item00;
		
		powI = itemHave[0].spec;
		defI = itemHave[1].spec;
		luckI = itemHave[2].spec;
		luckT = luck + luckI;
		accT = acc + luckT;
		criT = cri - luckT;
		powT = pow + powI;
		defT = def + defI;
	}

	void refreshStat() {
		powI = itemHave[0].spec;
		defI = itemHave[1].spec;
		luckI = itemHave[2].spec;
		luckT = luck + luckI;
		accT = acc + luckI;
		criT = cri - luckI;
		powT = pow + powI;
		defT = def + defI;
	}

	void showInfo() {
		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│--------------------< 능력치 >-------------------│");
		System.out.println("  이름 : " + name + "  | 클래스 : " + clas);
		System.out.println("  체력 : " + hp + " / " + hpMax + "  | 경험치 : " + exp);
		System.out.println("  공격력 : " + powT + "(" + pow + "+" + powI + ")" + "  | 방어력 : " + defT
				+ "(" + def + "+" + defI + ")  | 운 : " + luckT + "(" + luck + "+" + luckI + ")");
		System.out.println("  명중률 : " + (accT - 1) + " / " + accT +"  | 치명타 확률 : 1 / " + criT);
		System.out.println("  무기 : " + itemHave[0].name + " (공격력 : " + itemHave[0].spec + " | 속성 : "
				+ itemHave[0].ele + ")");
		System.out.println("  방어구 : " + itemHave[1].name + " (방어력 : " + itemHave[1].spec + " | 속성 : "
				+ itemHave[1].ele + ")");
		System.out.println("  장신구 : " + itemHave[2].name + " (운 : " + itemHave[2].spec + ")");
		System.out.println("│-----------------------------------------------│");
		System.out.println("└───────────────────────────────────────────────┘");
	}

	void moveLocation() {
		System.out.println("=================================================");
		System.out.println("    < 이동할 장소를 선택하세요 (현재위치 : " + locationCurrent + ") >");
		System.out.println("       0. 시작의 땅  | 1. 불의 땅  | 2. 바람의 땅 ");
		System.out.println("       3. 대지의 땅  | 4. 물의 땅  | 5. 결전의 장");
		System.out.println("=================================================");
		System.out.println();
		int input = Integer.parseInt(sc.nextLine());
		System.out.println();
		if (input < 0 || input > 5) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("                                  잘못 입력하였습니다.");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} else {
			this.locationCurrent = locations[input];
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("                             " + locationCurrent + "으로 이동했습니다.");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
	}
	
	void gettingItem() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("           \'" + locationCurrent + "\' 대장간에 입장했습니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println();
		shop: while (true) {
			System.out.println("==================<< 아이템 목록 >>==================");
			System.out.println("0. 나가기");
			for (int i = 0; i < locations.length; i++) {
				if (locationCurrent == locations[i]) {
					for (int j = 0; j < t.itemss[i].length; j++) {
						if (t.itemss[i][j].type == 0) {
							System.out
									.println((j + 1) + ". " + t.itemss[i][j].name + "\n   필요경험치 : " + t.itemss[i][j].price
											+ " , 공격력 : +" + t.itemss[i][j].spec + " , 속성 : " + t.itemss[i][j].ele);
						} else if (t.itemss[i][j].type == 1) {
							System.out
									.println((j + 1) + ". " + t.itemss[i][j].name + "\n   필요경험치 : " + t.itemss[i][j].price
											+ " , 방어력 : +" + t.itemss[i][j].spec + " , 속성 : " + t.itemss[i][j].ele);
						} else if (t.itemss[i][j].type == 2) {
							System.out
							.println((j + 1) + ". " + t.itemss[i][j].name + "\n   필요경험치 : " + t.itemss[i][j].price
									+ " , 운 : +" + t.itemss[i][j].spec);
						}
					}
					System.out.println("=================================================");
					System.out.println("-------------------------------------------------");
					System.out.println("  장착중인 무기    : " + itemHave[0].name + "(공격력:" + itemHave[0].spec + ",속성:" +itemHave[0].ele +")");
					System.out.println("  장착중인 방어구 : " + itemHave[1].name + "(방어력:" + itemHave[1].spec + ",속성:" +itemHave[1].ele +")");
					System.out.println("  장착중인 장신구 : " + itemHave[2].name + "(운:" + itemHave[2].spec + ")");
					System.out.println("                                 보유한 경험치 : " + exp);
					System.out.println("             제작할 아이템의 번호를 입력하세요.");
					System.out.println("         제작하면 장착되어 있던 같은 타입의 아이템은 버려집니다.");
					System.out.println("-------------------------------------------------");
					int input = Integer.parseInt(sc.nextLine());
					System.out.println();
					if (input == 0) {
						break shop;
					} else if (exp >= t.itemss[i][input - 1].price) {
						exp -= t.itemss[i][input - 1].price;

						if (t.itemss[i][input - 1].type == 0) {
							itemHave[0] = t.itemss[i][input - 1];
						} else if (t.itemss[i][input - 1].type == 1) {
							itemHave[1] = t.itemss[i][input - 1];
						} else if (t.itemss[i][input - 1].type == 2) {
							itemHave[2] = t.itemss[i][input - 1];
						}
						System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
						System.out.println("        \'" + t.itemss[i][input - 1].name + "\'을(를) 제작하였습니다.");
						System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
					} else {
						System.out.println("-------------------------------------------------");
						System.out.println("                                  경험치가 부족합니다!");
						System.out.println("-------------------------------------------------");
						System.out.println();
					}
					System.out.println();
					refreshStat();
				}
			}
		}
	}

	public void attack(Enemy en) {
		System.out.println("-------------------------------------------------");
		
		en.eva = (int)(Math.random() * accT);
		if (en.eva == 0) {
			System.out.println(en.name + "(이)가 \'" + name + "\'의 공격을 회피했습니다..!");
		} else {
			double correctValueForEle = 1;
			int correctValueForCri = 1;
			int dble = (int)(Math.random() * criT );
			if (dble == 0) {
				correctValueForCri = 2;
				System.out.println("!!!!!!!!!크리티컬!!!!!!!!!");
			}
			
			if (locationCurrent == "결전의 장") {
				correctValueForEle = 0.75;
			} else {
				correctValueForEle = eleCalculate(en);
			}
			int damage = (int) (Math.floor(powT * correctValueForEle * correctValueForCri));
			en.hp -= damage;
			en.hp = en.hp < 0 ? 0 : en.hp;
			System.out.println("\'" + name + "\'(이)가 " + en.name + "에게 " + damage + "만큼 데미지를 주었습니다.");
		}
		System.out.println("-------------------------------------------------");
	}

	public void getExp(int exp) {
		this.exp += exp;
		System.out.println("                    경험치 " + exp + "를 얻었습니다. 현재 경험치 : " + this.exp);
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
	}

	public double eleCalculate(Enemy en) {
		double num = 1;
		if (itemHave[0].ele == eles[0]) {
			if (en.ele != eles[0]) {
				num = 0.75;
			}
		} else if (itemHave[0].ele == eles[1]) {
			if (en.ele == eles[0] || en.ele == eles[2]) {
				num = 1.5;
			} else if (en.ele == eles[4]) {
				num = 0.75;
			}
		} else if (itemHave[0].ele == eles[2]) {
			if (en.ele == eles[0] || en.ele == eles[3]) {
				num = 1.5;
			} else if (en.ele == eles[1]) {
				num = 0.75;
			}
		} else if (itemHave[0].ele == eles[3]) {
			if (en.ele == eles[0] || en.ele == eles[4]) {
				num = 1.5;
			} else if (en.ele == eles[2]) {
				num = 0.75;
			}
		} else if (itemHave[0].ele == eles[4]) {
			if (en.ele == eles[0] || en.ele == eles[1]) {
				num = 1.5;
			} else if (en.ele == eles[3]) {
				num = 0.75;
			}
		}
		return num;
	}

}
