import java.util.ArrayList;
public abstract class Cereal {
	protected String name;
	protected double price;
	
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("preparing the" + name);
	}
	
	public void boxCereal() {
		System.out.println("putting fun pictures of stuff on a box");
	}
	
	public void priceCereal() {
		System.out.println("putting price tags of $" + price + "on the" + name + "box");
	}
}
