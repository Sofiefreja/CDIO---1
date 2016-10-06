package spil;

public class Cup {
	private Dice d1 = new Dice();
	private Dice d2 = new Dice();

	public void roll() {
		this.d1.roll();
		this.d2.roll();
	}
	public int getSum() {
		int sum = this.d1.getValue() + this.d2.getValue();
		return sum;
	}
	public int getEqual() {
		int num = 0;
		if (this.d1.getValue() == this.d2.getValue()) {
			switch (d1.getValue()) {
			case 1:
				num=1;
				break;
			case 2:
				num=2;
				break;
			case 3:
				num=3;
				break;
			case 4:
				num=4;
				break;
			case 5:
				num=5;
				break;
			case 6:
				num=6;
				break;
			}
		}
		return num;
	}
	public String toString(){
		String res;
		res="("+this.d1.getValue()+","+this.d2.getValue()+")";
		return res;
	}
}
