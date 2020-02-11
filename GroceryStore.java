public class GroceryStore {
	 private Cereal createCereal(String type) {
	Cereal cereal2 = createCereal(type);
		
		cereal2.prepare();
		cereal2.boxCereal();
		cereal2.priceCereal();
		
		return cereal2;
	}
	
	public Cereal orderCereal(String type) {
		Cereal cereal1 = null;
		if(type == "frosted flakes") {
			
			 cereal1 = new FrostedFlakes();		
		}
		else if(type == "lucky charms") {
			 cereal1 = new LuckyCharms();
		}
		else if(type == "fruit loops") {
			
			cereal1 = new FruitLoops();
		}
		
		
		cereal1.prepare();
		cereal1.boxCereal();
		cereal1.priceCereal();
		
		return cereal1;
	}
}
