
public class FrostedFlakes extends Cereal {
	public FrostedFlakes() {
		name = "frosted flakes";
		price = 57.3;
	}
	
	@Override
	public void prepare() {
		System.out.println("gather the grain"
				+ "shape into flakes"
				+ "sprinkle with frosting");
	}
}
