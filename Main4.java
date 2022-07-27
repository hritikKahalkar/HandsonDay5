/*Bank Management System*/
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICIBank i = new ICICIBank();
		KotMBank k = new KotMBank();
		GeneralBank g = new KotMBank();
		GeneralBank h = new ICICIBank();
		
		i.getFixedDepositInterestRate();
		i.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		k.getSavingsInterestRate();
		g.getFixedDepositInterestRate();
		g.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		k.getSavingsInterestRate();


	}

}
