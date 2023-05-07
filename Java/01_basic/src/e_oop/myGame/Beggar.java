package e_oop.myGame;

import java.util.Scanner;

public class Beggar {

	String name;			// 이름
	double money;			// 돈
	double levelUpMoney;	// 레벨업에 필요한 돈
	int level;				// 레벨
	Skill sk = new Skill();
	String[] a = sk.skills;
	double[] levelUpMoney2 = {5000, 50000, 100000, 300000, 500000};
	
	
	Beggar(String name, double money, int level) {
		this.name = name;
		this.money = money;
		this.level = level;
		this.levelUpMoney = this.levelUpMoney2[0];
				
	}

	public void showInfo() {
		System.out.println("┌─────────────상태─────────────┐");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("자산 : " + money + "원");
		System.out.println("└─────────────────────────────┘");
		
		
	}

	public void getMoneyManagerList() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("0. 뒤로가기  ");
			System.out.println(sk.skillInfoList(this.level));
			
			int input = Integer.parseInt(sc.nextLine());
			
			if (input > 0 && input <= this.level) {
				money += sk.skillUtil(input - 1);
				this.level = levelUp();
				System.out.println("\n자산 : " + money + "원");
				System.out.println("레벨업 자산 : " + levelUpMoney + "원");
				
			} else if (input > this.level) {
				System.out.println("현재 레벨에서 할 수 없습니다!");
				
			} else if (input == 0) {
				break;
			}
		}


	}

	int levelUp() {
		
		for (int i = 0; i < levelUpMoney2.length; i++) {
			if (this.level == i+1 && money >= levelUpMoney) {
				this.level++;
				this.money = this.money - this.levelUpMoney;
				this.levelUpMoney = this.levelUpMoney2[i+1];
				System.out.println();
				System.out.println("<<" + this.level + "레벨이 되셨습니다. >>");
			}
		}
		return this.level;
	}
	
	
}
