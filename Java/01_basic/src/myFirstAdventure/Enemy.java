package myFirstAdventure;

public class Enemy {
	
	String name;
	int pow;
	int hp;
	String ele;
	int eva;
	int exp;
	String[] eles = {"none", "fire", "wind", "earth", "ice"};
	
	
	Enemy (String name, int pow, int hp, int ele, int exp) {
		this.name = name;
		this.pow = pow;
		this.hp = hp;
		this.ele = eles[ele];
		this.exp = exp;
	}

	public void attack(Character c) {
		System.out.println("-------------------------------------------------");
		c.eva = (int)(Math.random()*4);		// 고정 1/4 확률 미스
		if (c.eva == 0) {
			System.out.println("\'" + c.name + "\'(이)가 " + name + "의 공격을 회피했습니다..!");
		} else {
			double correctValueForEle = 1;
			
			if (c.locationCurrent == "결전의 장") {
				correctValueForEle = 1.5;
			} else {
				correctValueForEle = eleCalculate(c);
			}
			
			int damage = (int)(Math.floor(pow* correctValueForEle)) - c.def;
			damage = damage <= 0 ? 0 : damage;
			c.hp -= damage;
			c.hp = c.hp < 0 ? 0 : c.hp;
			System.out.println(name + "(이)가 \'" + c.name + "\'에게 " + damage + "만큼 데미지를 주었습니다.");
		}
		System.out.println("-------------------------------------------------");
	}
	
	public double eleCalculate (Character c) {
		double num = 1;
		if (ele == eles[0]) {
			if (c.itemHave[1].ele != eles[0]) {
				num = 0.75;
			} 
		} else if (ele == eles[1]) {
			if (c.itemHave[1].ele == eles[0] || c.itemHave[1].ele == eles[2]) {
				num = 1.5;
			} else if (c.itemHave[1].ele == eles[4]) {
				num = 0.75;
			}
		} else if (ele == eles[2]) {
			if (c.itemHave[1].ele == eles[0] || c.itemHave[1].ele == eles[3]) {
				num = 1.5;
			} else if (c.itemHave[1].ele == eles[1]) {
				num = 0.75;
			}
		} else if (ele == eles[3]) {
			if (c.itemHave[1].ele == eles[0] || c.itemHave[1].ele == eles[4]) {
				num = 1.5;
			} else if (c.itemHave[1].ele == eles[2]) {
				num = 0.75;
			}
		} else if (ele == eles[4]) {
			if (c.itemHave[1].ele == eles[0] || c.itemHave[1].ele == eles[1]) {
				num = 1.5;
			} else if (c.itemHave[1].ele == eles[3]) {
				num = 0.75;
			}
		}
		return num;
	}
}
