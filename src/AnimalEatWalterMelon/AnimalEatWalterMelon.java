package AnimalEatWalterMelon;

public class AnimalEatWalterMelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pig pig = new Pig();
        int pigPower = pig.cut(5);
        WaterMelon melon= new WaterMelon();
        boolean bool = melon.broken(pigPower);
        if (bool == true)
        {
        	pig.eat();
        	pig.digest();
        }
        else
        {
        	System.out.println("Please try to break the watermelon again!");
        }
	}

}
