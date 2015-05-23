package AnimalEatWalterMelon;

public class Fish implements Animal {


	@Override
	public int cut(int power){
		WaterMelon melon = new WaterMelon();
		int fishPower = power;
		return fishPower;
	}
	
	@Override
	public void eat() {
		System.out.print("eat");
	}
	
	@Override 
	public void digest() {
		System.out.print("digest");
	}
    
}
