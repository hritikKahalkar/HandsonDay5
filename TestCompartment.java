/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.



public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.

Create a class TestCompartment.Write main function to do the following:

Declare an array of Compartment of size 10.

Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.

Check the polymorphic behavior of the notice method.

[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/

import java.util.Random;
abstract class Compartment{
	
	public abstract String notice();
	
}

 class FirstClass extends Compartment{
	public String notice() {
		return("First Class");
	}
}

 class Ladies extends Compartment{
	public  String notice() {
		return("Ladies");
	}
}

 class General extends Compartment{
	public String notice() {
		return("General");
	}
}

 class Luggage extends Compartment{
	public String notice() {
		return("Luggage");
	}
}


public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Compartment arr[] = new Compartment[10];
		for(int i=0;i<10;i++) {
			int y = random.nextInt(4);
			if(y+1==1) {
				Ladies L1 = new Ladies();
				arr[i]=L1;
			}
			else if(y+1==2) {
				Luggage L = new Luggage();
				arr[i]=L;
			}
			else if(y+1==3) {
				FirstClass F= new FirstClass();
				arr[i]=F;
			}
			else if(y+1==4) {
				General G = new General();
				arr[i]=G;
			}		
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i].notice());
			
		}

	}

}
