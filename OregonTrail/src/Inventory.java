
public class Inventory {
	private int qtyOxen;
	private int qtyFood;
	private int qtyClothes;
	private int qtyWagonAxel;
	private int qtyWagonWheel;
	private int qtyWagonTongue;
	private int totalWeight;
	
	public Inventory(int oxen, int food, int clothes, int axel, int wheel, int tongue){
		qtyOxen = oxen;
		qtyFood = food;
		qtyClothes = clothes;
		qtyWagonAxel = axel;
		qtyWagonWheel = wheel;
		qtyWagonTongue = tongue;
	}
	
	public int calculateWeight(){
		return 0;
	}

	public void changeQtyOxen(int qtyOxen) {
		this.qtyOxen = qtyOxen;
	}

	public int getQtyOxen() {
		return qtyOxen;
	}

	public void changeQtyFood(int qtyFood) {
		this.qtyFood = qtyFood;
	}

	public int getQtyFood() {
		return qtyFood;
	}

	public void changeQtyClothes(int qtyClothes) {
		this.qtyClothes = qtyClothes;
	}

	public int getQtyClothes() {
		return qtyClothes;
	}

	public void changeQtyWagonAxel(int qtyWagonAxel) {
		this.qtyWagonAxel = qtyWagonAxel;
	}

	public int getQtyWagonAxel() {
		return qtyWagonAxel;
	}

	public void changeQtyWagonWheel(int qtyWagonWheel) {
		this.qtyWagonWheel = qtyWagonWheel;
	}

	public int getQtyWagonWheel() {
		return qtyWagonWheel;
	}

	public void changeQtyWagonTongue(int qtyWagonTongue) {
		this.qtyWagonTongue = qtyWagonTongue;
	}

	public int getQtyWagonTongue() {
		return qtyWagonTongue;
	}

	public void changeTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public int getTotalWeight() {
		return totalWeight;
	}
		
}
