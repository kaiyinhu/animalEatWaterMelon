package AnimalEatWalterMelon;

public class Pig implements Animal{

	@Override 
	public int cut(int power) {
		int pigPower = power;
		return pigPower;
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
