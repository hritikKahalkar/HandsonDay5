/*Create an abstract class Instrument which is having the abstract function play.

Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message

“Piano is playing tan tan tan tan ” for Piano class

“Flute is playing toot toot toot toot” for Flute class

“Guitar is playing tin tin tin ” for Guitar class

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behavior of play method.

Use the instanceof operator to print which object is stored at which index of instrument array.*/

import java.util.Random;
abstract class Instrument{
	
	public abstract String play();
	
}

 class Piano extends Instrument{
	public String play() {
		return("Piano is playing tan tan tan tan");
	}
}

 class Flute extends Instrument{
	public  String play() {
		return("Flute is playing toot toot toot toot");
	}
}

 class Guitar extends Instrument{
	public String play() {
		return("Guitar is playing tin tin tin");
	}
}

public class PlayInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Instrument arr[] = new Instrument[10];
		for(int i=0;i<10;i++) {
			int y = random.nextInt(4);
			if(y+1==1) {
				Flute L1 = new Flute();
				arr[i]=L1;
			}
			else if(y+1==2) {
				Piano L = new Piano();
				arr[i]=L;
			}
			else if(y+1==3) {
				Guitar F= new Guitar();
				arr[i]=F;
			}
		}
		for(int i=0;i<10;i++) {
			if(arr[i] instanceof Flute) {
				System.out.println(i+1+" Flute");
				}
			if(arr[i] instanceof Piano) {
				System.out.println(i+1+" Piano");
				}
			if(arr[i] instanceof Guitar) {
				System.out.println(i+1+" Guitar");
				}
			
		}

	}

}
