package AnimalEatWalterMelon;

public class WaterMelon {

	public boolean broken(int power){
		if (power>5)
		{
			System.out.print("This is water melon is broken");
			return true;
		}
		else
		{
			System.out.print("This can't be broken");
			return false;
		}
	}
}
