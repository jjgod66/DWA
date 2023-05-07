package myFirstAdventure;

public class Item {
	String[] eles = {"none", "fire", "wind", "earth", "ice"};
	
	String name;
	int type;
	int spec;
	String ele;
	int price;
	
	Item (String name, int type, int spec, int ele, int price) {
		this.name = name;
		this.type = type;
		this.spec = spec;
		this.ele = eles[ele];
		this.price = price;
	}
	
}
