package myFirstAdventure;

import java.util.Scanner;

import e_oop.pack2.C;

public class Event {
	Scanner sc = new Scanner(System.in);
	int step;
	int time;
	boolean trigger;
	EnemyBank ens = new EnemyBank();
	String[] locations = {"시작의 마을", "불의 마을", "바람의 마을", "대지의 마을", "물의 마을", "결전의 장"};
	 
	Event(Character c, int time, int step, boolean trigger){
		this.trigger = trigger; 
		this.time = time;
		if (trigger) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("                      이벤트는 10일에 한번씩 일어납니다.");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} else {
//			int random = (int)(Math.random() * 3);
			int random = 2;
			eventPlay(step, random, c, time);
			step++;
			this.step = step;
			this.trigger = true;
		
		}
	}

			
	
	
	private void eventPlay(int step, int random, Character c, int time) {
		switch (random) {
			case 0:
				// 0번 이벤트
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("마을을 걷다가 꾀죄죄한 한 부랑자가 다가와 말을 겁니다. \n\'안녕하세요.. 당신이 가진 경험치를 조금만 기부해줄 수 있을까요..? \n 며칠동안 쉴 새 없이 걸어 정신을 잃기 직전입니다..\'");
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("=================================================");
				System.out.println(" 1: 수락한다(" + (step+1)*20 + "의 경험치를 기부). \n 2: 거절한다. \n 3: 거절하고 가진 것도 뺏는다.");
				System.out.println("=================================================");
				int input = Integer.parseInt(sc.nextLine());
				switch (input) {
					case 1:
						if (c.exp <(step+1)*20) {
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println(" 경험치가 부족합니다. 가진 것이 없어 도울 수도 없습니다.\n 그냥 가던 길을 갑니다..");
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						} else {
							c.exp -= (step+1)*20;
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("             " + (step+1)*20 + "의 경험치를 기부하였습니다.");
							System.out.println("=================================================");
							int lootRandom = (int)(Math.random()*10);
							if (lootRandom == 0 || lootRandom == 1) {
								System.out.println("부랑자가 뭘 줄 것같이 하더니 냅다 튀었습니다. 허탈하긴 하지만 다시 \n가던 길을 갑니다.");
							} else if (lootRandom == 2) {
								System.out.println("부랑자가 감사하다며 거듭 인사를 합니니다. 자신이 줄 수 있는 것은 집\n안 대대로 내려오는 이 책 밖에 없다며 책 한권을 건넵니다. 그 책은 이 세상 \n모든 검술의 기술이 담겨있는 엄청난 책이였습니다.");
								System.out.println("=================================================");
								System.out.println("                           공격력이 " + (step+1) * 5 + " 상승합니다!!!");
								c.pow += (step+1) * 5;
							} else if (lootRandom == 3){
								System.out.println("부랑자가 감사하다며 거듭 인사를 합니니다. 자신이 줄 수 있는 것은 집\n안 대대로 내려오는 이 책 밖에 없다며 책 한권을 건넵니다. 그 책은 이 세상 \n모든 무술의 기본기가 담겨있는 엄청난 책이였습니다.");
								c.def += (step+1) * 3;
								System.out.println("=================================================");
								System.out.println("                           방어력이 " + (step+1) * 3 + " 상승합니다!!!");
							} else {
								System.out.println("부랑자가 감사하다며 거듭 인사를 합니다. 가진 것은 없지만 하나 남은\n영양제를 주겠다며 건넵니다.");
								c.hp += (step+1) *15;
								c.hpMax += (step+1) *15;
								System.out.println("=================================================");
								System.out.println("                           체력이" + (step+1) *15 + "만큼 상승합니다!!");
							}
							
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						}
						break;
					case 2:
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("당신을 못들은 척 하고 그냥 가던 길을 갑니다. 뒤에서 욕하는 소리가 들\n립니다. 겁을 줄까 하다가 그냥 참습니다..");				
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						break;
					case 3:
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						c.exp += (step+1) * 20;
						c.luck -= 1;
						c.luck = c.luck <= 0 ? 0 : c.luck;
						System.out.println("당신은 부랑자를 돕기는 커녕 가지고 있던 물건들도 협박해서 뺏었습니다. \n " + (step+1) * 20 +"를 얻지만 운이 1 낮아집니다..");
						System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						break;
					default:
						break;
				}
				break;
				
			case 1:
				//1번 이벤트
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("한 행인이 큰 경험치를 벌 수 있다며 따라오라고 합니다. \n혹해서 따라가보니 도착한 곳은 지하도박장이였습니다. \n여기선 경험치를 베팅하고 도박에이기면 그만큼 벌고,지면 잃습니다. \n도박에 참여하시겠습니까?");
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("=================================================");
				System.out.println(" 1: 수락한다. 2:거절하고 나간다.");
				System.out.println("=================================================");
				int input2 = Integer.parseInt(sc.nextLine());
				if (input2 == 1) {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("당신은 흔쾌히 수락했습니다. \n자신의 운을 시험해 볼 좋은 기회라고 생각합니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("=================================================");
					System.out.println("도박에 앞서 베팅을 할 경험치를 입력하세요. 현재 경험치 : " + c.exp);
					System.out.println("=================================================");
					a : while (true) {
						int expBet = Integer.parseInt(sc.nextLine());
						if (expBet > c.exp) {
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("가지고 있는 경험치보다 많이 베팅할 수 없습니다.");
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						} else if (expBet <= 0){
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("0보다 작거나 같습니다. 다시 입력하세요.");
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						} else {
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("경험치 " + expBet + "을 베팅하였습니다.");
							System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
							System.out.println("=================================================");
							System.out.println("야바위꾼이 종이컵 3개 중 하나에 동전을 놓고 \n종이컵 3개를 미친듯이 뒤섞습니다. \n너무 빨라 눈이 섞는 속도를 못 쫒아갑니다...\n야바위꾼이 동전이 들은 종이컵을 찾으라고 하는데.. \n그냥 찍어야 할 것 같습니다. 몇번째 종이컵을 고르시겠습니까?");
							System.out.println("=================================================");
							int cup = (int)(Math.random() * 3 + 1);
							while (true) {
								int sellect = Integer.parseInt(sc.nextLine());
								if (sellect > 3 || sellect <= 0) {
									System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
									System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
									System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
								} else {
									if (sellect == cup) {
										System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
										System.out.println("맞췄습니다! 베팅한 돈을 벌어갑니다.");
										System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
										c.exp += expBet;
									} else if (sellect != cup) {
										System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
										System.out.println("틀렸습니다.. 동전은 " + cup +"번째 종이컵에 들어 있었습니다. \n베팅경험치를 잃습니다.");
										System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
										c.exp -= expBet;
									}
									break;
								}
							}
							break a;
						}
					}
				} else if (input2 == 2) {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("당신은 이런 짓은 검사의 명예를 더럽히는 일이라고 말하며 그냥 나갑니다. 조용히 가던 길을 갑니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				} else {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("잘못 입력하였습니다. 그냥 떠납니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				}
				break;
			case 2:
				//2번 이벤트
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("우연히 한 부자를 만났는데 그 역시 검황을 무찌르고 싶어 했습니다.\n하지만 그는 싸울 줄을 몰라 좌절하고 있는 터에 당신을 만났습니다. \n그가 말하길 본인이 직접 싸우지는 못해도 당신을 후원하겠다고 합니다.\n당신에게 지금 무엇을 후원해줬으면 좋겠는지 선택하라고 합니다.");
				System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
				System.out.println("=================================================");
				System.out.println("1: 체력 모두 회복");
				System.out.println("2: 전체체력 " + ((step+1) * 10) + " 증가");
				System.out.println("3: 경험치 " + ((step+1) * 10) + " 얻기" );
				System.out.println("=================================================");
				int input3 = Integer.parseInt(sc.nextLine());
				if (input3 == 1) {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("그는 이 지역 제일 유명한 의사에게 데려가 당신을 치료받게 했습니다.\n체력이 모두 회복되었습니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					c.hp = c.hpMax;
				} else if (input3 == 2) {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("그는 지역에서 유명한 한의원에 데려가 몸에 좋다는 한약을 처방받아줬습니다.\n전체체력이 " + ((step+1) * 10) + " 증가했습니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					c.hpMax += ((step+1) * 10);
				} else if (input3 == 3) {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("그는 본인이 후원하는 다른 검사들과 연습대련을 권했습니다.\n검사들과 싸우고 나니 경험이 올라가는 것을 느낍니다.\n경험치가 " + ((step+1) * 10) + "만큼 상승했습니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					c.exp +=((step+1) * 10);
				} else {
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("잘못 입력하였습니다. 그냥 무시하고 갑니다.");
					System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				}
				break;
			default:
				break;
		}
		c.refreshStat();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
