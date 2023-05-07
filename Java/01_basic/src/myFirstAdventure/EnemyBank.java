package myFirstAdventure;

public class EnemyBank {
//	(String name, int pow, int hp, int ele, int exp)
	
	
	
	Enemy[] ens_0 = {
		new Enemy("견습 무사", 40, 40, 0, 4),
		new Enemy("불의 견습 무사", 25, 25, 1, 7),
		new Enemy("바람의 견습 무사", 25, 25, 2, 7),
		new Enemy("대지의 견습 무사", 25, 25, 3, 7),
		new Enemy("물의 견습 무사", 25, 25, 4, 7),
	};
	
	Enemy[] ens_1 = {
		new Enemy("검객", 60, 60, 0, 10),
		new Enemy("불의 검객", 40, 40, 1, 13),
		new Enemy("바람의 검객", 40, 40, 2, 13),
		new Enemy("대지의 검객", 40, 40, 3, 13),
		new Enemy("혹한의 검객", 40, 40, 4, 13),
	};
	
	Enemy[] ens_2 = {
		new Enemy("뛰어난 검사", 80, 80, 0, 20),
		new Enemy("불의 기사 대장", 60, 60, 1, 25),
		new Enemy("바람의 기사 대장", 60, 60, 2, 25),
		new Enemy("대지의 기사 대장", 60, 60, 3, 25),
		new Enemy("혹한의 기사 대장", 60, 60, 4, 25),
	};
	
	Enemy[] ens_3 = {
		new Enemy("검술의 장인", 120, 120, 0, 45),
		new Enemy("화염 검술의 장인", 90, 90, 1, 60),
		new Enemy("바람 검술의 장인", 90, 90, 2, 60),
		new Enemy("대지 검술의 장인", 90, 90, 3, 60),
		new Enemy("혹한 검술의 장인", 90, 00, 4, 60),
	};
	
	Enemy[] ens_4 = {
		new Enemy("검을 깨우친 자", 250, 250, 0, 100),
		new Enemy("화염의 검귀", 200, 200, 1, 150),
		new Enemy("폭풍의 검귀", 200, 200, 2, 150),
		new Enemy("대지의 검귀", 200, 200, 3, 150),
		new Enemy("혹한의 검귀", 200, 200, 4, 150),
	};

	Enemy[] ens_5 = {new Enemy("검황", 250, 300, 0, 0)};
	
	Enemy[][] enss = {ens_0, ens_1, ens_2, ens_3, ens_4, ens_5};
	
}
