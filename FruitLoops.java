
public class FruitLoops extends Cereal {
	public FruitLoops() {
		name = "fruit loops";
		price = 500.0;
	}
	
	@Override
	public void prepare() {
		System.out.println("gather the grain"
				+ "shape into cirlces"
				+ "randomly color cirles"
				+ "let circles dry");
	}
}
