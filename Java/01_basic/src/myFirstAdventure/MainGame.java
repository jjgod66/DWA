package myFirstAdventure;

import java.util.Scanner;

public class MainGame {
	
	Character c;
	
	Scanner sc = new Scanner(System.in);
	int time = 100; // 남은시간
	int step = 0;
	boolean evtTrigger = false;	// 이벤트를 하면 true가 되고 , 10일이 지날때마다 false가 됨
	EnemyBank ens = new EnemyBank();	
	Enemy en;
	String[] eles = {"none", "fire", "wind", "earth", "ice"};
	String[] locations = {"시작의 땅", "불의 땅", "바람의 땅", "대지의 땅", "물의 땅", "결전의 장"};
	
	
	MainGame() {
	}

	public static void main(String[] args) {
		MainGame mg = new MainGame();
		mg.start();
		mg.play();
	}
	// 게임시작, 이름 설정
	void start() {
		System.out.println("◆ 이름을 입력하세요");
		System.out.println();
		String inputName = sc.nextLine();
		System.out.println();
		System.out.println("◆ 시작 클래스를 선택하세요");
		System.out.println("=================================================");
		System.out.println("1. 광전사     : 기본체력이 낮고, 기본공격력이 높다.");
		System.out.println("2. 성기사     : 기본체력과 방어력이 높고, 기본공격력이 낮다.");
		System.out.println("3. 승부사     : 기본 운이 높다.");
		System.out.println("4. 명문 기사 : 많은 경험치를 가지고 시작한다.");
		System.out.println("=================================================");
		System.out.println();
		int inputClass;
		while (true) {
			inputClass = Integer.parseInt(sc.nextLine());
			if (1<= inputClass && inputClass <= 4) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		opening();
		c = new Character(inputName, inputClass);
		
		
	}
         
	// 게임 
	void play() {
		while (time > 0) {
			System.out.println();
			System.out.println("      << 현재 위치 : " + c.locationCurrent + ",  남은 날 : "+ time + " >>");
			System.out.println("┌───────────────────────────────────────────────┐");
			System.out.println("│1:능력치 확인, 2:전투, 3:이벤트, 4:수련의 방, 5:마을이동  │");
			System.out.println("└───────────────────────────────────────────────┘");
			System.out.println();
			int input = Integer.parseInt(sc.nextLine());
			System.out.println();
			switch (input) {
			case 1:
				c.showInfo();
				break;
			case 2:
				if (c.hp > 0) {
					combat();
					time();
				} else {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("                  체력이 바닥났습니다. 회복을 먼저 해주세요.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				}
				break;
			case 3:
				Event ev = new Event(c, time, step, evtTrigger);
				evtTrigger = ev.trigger;
				step = ev.step;
				time = ev.time;
				break;
			case 4:
				practice();
				break;
			case 5:
				String tempLocation = c.locationCurrent;
				c.moveLocation();
				if (c.locationCurrent == locations[5]) {
					combat();
					c.locationCurrent = tempLocation;
				}
				break;
			default:
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("                                  잘못입력하셨습니다.");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				break;
			}
			timeOutCheck();		//남은 시간 체크
		}
	}

	// 전투
	void combat() {
		int random;
		if (c.locationCurrent == locations[5]) {
			random = 0;
		} else {
			random = (int)(Math.random()*3);
		}
		for (int i = 0; i < ens.enss.length; i++) {
			if (c.locations[i] == c.locationCurrent) {
				Enemy en = ens.enss[i][random];
				int temp = en.hp;
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("          " + en.name + "을(를) 만났습니다. 전투를 시작합니다.");
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println();
				enemyImage();
				System.out.println();
				System.out.println();
				battle : while (true) {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("              < " + en.name + " >");
					System.out.println("                            체력    : " + en.hp + " / " + temp);
					System.out.println("                            공격력 : " + en.pow);
					System.out.println("                            속성    : " + en.ele);
					System.out.println("=================================================");
					System.out.println("              < " + c.name + " >");
					System.out.println("                            체력 : " + c.hp + " / " + c.hpMax);
					System.out.println("                            공격력 : " + c.powT + "(" + c.pow + "+" + c.powI + ")\'" + c.itemHave[0].ele + "\'");
					System.out.println("                            방어력 : " + c.defT + "(" + c.def + "+" + c.defI + ")\'" + c.itemHave[1].ele + "\'");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("-------------------------------------------------");
					System.out.println("              1 : 공격   ,  2 : 도망");
					System.out.println("-------------------------------------------------");
					System.out.println();
					int input = Integer.parseInt(sc.nextLine());
					System.out.println();
					switch (input) {
					case 1:
						c.attack(en);
						if (en.hp <= 0) {
							System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
							System.out.println("                     " + en.name + "을(를) 처치했습니다.");
							if (c.locationCurrent == locations[5]) {
								System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
								System.out.println("■                     the End                   ■");
								System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
								System.exit(0);
							}
							c.getExp(en.exp);
							break battle;
						}
						en.attack(c);
						if (c.hp <= 0) {
							System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
							System.out.println("                             전투에서 패배하였습니다.");
							System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
							break battle;
						}
						break;
					case 2:
						c.run = (int)(Math.random()*2);
						if (c.run == 0) {
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("                                        도망쳤다!");
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println();
							break battle;
						} else {
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("                                  도망치지 못했다..!");
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							en.attack(c);
							if (c.hp <= 0) {
								System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
								System.out.println("                             전투에서 패배하였습니다.");
								System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
								break battle;
							}
							break;
						}
						
						
					default :
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("                                  잘못 입력하였습니다.");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						break;
					}
				}
				en.hp = temp;
			}
		}
	}
	
	

	// 수련의 방
	void practice() {
		while (true) {
			System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println("                  << 수련의 방 >>");
			System.out.println("     0:돌아가기, 1:회복센터, 2:신체수련, 3:장비획득");
			System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println();
			int input = Integer.parseInt(sc.nextLine());
			System.out.println();

			if (input == 0) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("                              수련의 방에서 나갔습니다.");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				break;
			} else if (input == 1) {
				treating();
			} else if (input == 2) {
				training();
			} else if (input == 3) {
				c.gettingItem();
			} else {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("                                  잘못 입력하였습니다.");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			}
		}
	}

	// 치료
	private void treating() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("                              회복 센터에 입장했습니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("=================================================");
		System.out.println("    < 경험치 5, 또는 5일을 사용하면 전체회복이 됩니다. >");
		System.out.println("                           현재 체력 : " + c.hp + " / " + c.hpMax);
		System.out.println("               현재 남은 경험치 : " + c.exp + ",  남은 시간 : " + time + "일");
		System.out.println("-------------------------------------------------");
		System.out.println("     0: 돌아가기, 1: 경험치 지불하기, 2: 시간 지불하기");
		System.out.println("=================================================");
		System.out.println();
		int input = Integer.parseInt(sc.nextLine());
		System.out.println();
		if (input == 0) {
			
		} else {
			if (c.hp == c.hpMax) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("                            이미 모두 회복된 상태입니다.");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			} else {
				if (input == 1) {
					if (c.exp < 5) {
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("                                 경험치가 부족합니다!");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println();
					} else {
						c.exp -= 5;
						c.hp = c.hpMax;
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("           경험치 5를 사용하여 체력이 모두 회복되었습니다.");
						System.out.println("                             현재 남은 경험치 : " + c.exp);
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println();
					}
				} else if (input == 2) {
					for (int i = 0; i < 5; i++) {
						time();
					}
					c.hp = c.hpMax;
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("           5일동안 체력을 완전히 회복하였습니다.");
					System.out.println("                                현재 남은 시간 : " + time + "일");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					timeOutCheck();
				} else {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("                                  잘못 입력하였습니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				}
			}
		}
	}
	
	// 신체수련
	private void training( ) {
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("                            신체 수련장에 입장했습니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println();
		System.out.println("=================================================");
		System.out.println("                        훈련하고싶은 능력치를 선택하세요");
		System.out.println("             1일과 경험치 20이 소모됩니다.");
		System.out.println("=================================================");
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("                  - 현재 능력치 -");
			System.out.println("              공격력 : " + c.pow + ", 방어력 : " + c.def + ", 전체체력 : " + c.hpMax);
			System.out.println("                   보유 경험치 : " + c.exp + ", 남은 날 : " + time + "일");
			System.out.println("-------------------------------------------------");
			System.out.println("   0:취소 , 1:공격력 +10 , 2:방어력 +2 , 3:체력 +10");
			System.out.println("-------------------------------------------------");
			System.out.println();
			int input = Integer.parseInt(sc.nextLine());
			System.out.println();
			if (input == 0) {
				break;
			}
			if (c.exp >= 20) {
				c.exp -= 20;
				time();
				if (input == 1) {
					c.pow += 10;
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("                            공격력 10이 상승하였습니다!");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println();
				} else if (input == 2) {
					c.def += 2;
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("                             방어력 2가 상승하였습니다!");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println();
				} else if (input == 3) {
					c.hp += 10;
					c.hpMax += 10;
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("                             체력 10이 상승하였습니다!");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println();
				} else {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("                                  잘못 입력하였습니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				}
				c.refreshStat();
			} else {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("                         경험치가 부족합니다!");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			}
		}
		c.refreshStat();
	}
	
	// 게임오버 체크
	private void timeOutCheck() {
		if(time <= 0) {
			System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println("              시간이 끝났습니다.......... 게임오버");
			System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.exit(0);
		}
		
	}

	void time() {
		time--;
		for (int i = 90; i >=0; i = i - 10) {
			if (time == i) {
				evtTrigger = false;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void opening() {
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
		System.out.println("                     !   !         \r\n" + 
				"                    =#   #=        \r\n" + 
				"                    ##   ##        \r\n" + 
				"                    #~   ~#        \r\n" + 
				"                    #~   ~#        \r\n" + 
				"               #:   #;   ;#   :#   \r\n" + 
				"               ##   ##   ##   ##   \r\n" + 
				"               ## ;;;;;;;;;;; ##   \r\n" + 
				"               -! ####@#@#### !.   \r\n" + 
				"               -! ########### ;.   \r\n" + 
				"               ## ####@###### ##   \r\n" + 
				"               ## ##!##!##!#@ ##   \r\n" + 
				"             ##################### \r\n" + 
				"              ###################  \r\n" + 
				"              ###  ####-*###  #@#  \r\n" + 
				"              ######## # ####=###  \r\n" + 
				"              ##@##### @ #####=##  \r\n" + 
				"              #@###### # ######*#  \r\n" + 
				"              ######## # ########  \r\n" + 
				"              $#######@@@##=####$  ");
		
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
		System.out.println(); 
		System.out.println("      << Being Sword MASTER in 100 days >>");
		System.out.println();
		System.out.println("당신은 100일 안에 세계에서 제일 가는 검사인 검황을 쓰러트려야 합니다. \n적들과 싸워 이긴다면 경험치를 얻을수 있고, \n그 경험치로 새로운 장비를 제작하거나 신체를 강화합니다. \n전투, 회복, 신체강화와 같은 행동을 할 때마다 시간이 흐릅니다.\n또한 10일이 지날때 마다 새로운 이벤트를 수행할 수 있습니다.");
		System.out.println();
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
	}
	
	private void enemyImage() {
		System.out.println("          \r\n" + 
				"                       @$          \r\n" + 
				"                    .;;@;-         \r\n" + 
				"                  .@##@#$####:---- \r\n" + 
				"                   ,  @            \r\n" + 
				"                     #*-           \r\n" + 
				"                    #@@@#*         \r\n" + 
				"                  ;#$   ;#         \r\n" + 
				"                .$#-     -@        \r\n" + 
				"                #,       .@");
		
	}
}
