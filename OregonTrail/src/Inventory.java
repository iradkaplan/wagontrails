/**
 * The Class Inventory which can be either for a store or for a travel group
 */
public class Inventory {
	
	/** The quantity of oxen. */
	private int qtyOxen;
	
	/** The quantity of food. */
	private int qtyFood;
	
	/** The quantity of clothes. */
	private int qtyClothes;
	
	/** The quantity of wagon axels. */
	private int qtyWagonAxel;
	
	/** The quantity of wagon wheels. */
	private int qtyWagonWheel;
	
	/** The quantity of wagon tongues. */
	private int qtyWagonTongue;
	
	/** The total weight of the inventory. */
	private int totalWeight;

	/**
	 * Instantiates a new inventory.
	 *
	 * @param oxen the number of oxen
	 * @param food the amount of food
	 * @param clothes the amount of clothes
	 * @param axel the number of axels
	 * @param wheel the number of wheels
	 * @param tongue the number of tongues
	 */
	public Inventory(int oxen, int food, int clothes, int axel, int wheel,
			int tongue) {
		qtyOxen = oxen;
		qtyFood = food;
		qtyClothes = clothes;
		qtyWagonAxel = axel;
		qtyWagonWheel = wheel;
		qtyWagonTongue = tongue;
	}

	/**
	 * Calculates the weight.
	 *
	 * @return the int
	 */
	public int calculateWeight() {
		return 0;
	}

	/**
	 * Change qty oxen.
	 *
	 * @param qtyOxen the qty oxen
	 */
	public void changeQtyOxen(int qtyOxen) {
		this.qtyOxen = qtyOxen;
	}

	/**
	 * Gets the qty oxen.
	 *
	 * @return the qty oxen
	 */
	public int getQtyOxen() {
		return qtyOxen;
	}

	/**
	 * Change qty food.
	 *
	 * @param qtyFood the qty food
	 */
	public void changeQtyFood(int qtyFood) {
		this.qtyFood = qtyFood;
	}

	/**
	 * Gets the qty food.
	 *
	 * @return the qty food
	 */
	public int getQtyFood() {
		return qtyFood;
	}

	/**
	 * Change qty clothes.
	 *
	 * @param qtyClothes the qty clothes
	 */
	public void changeQtyClothes(int qtyClothes) {
		this.qtyClothes = qtyClothes;
	}

	/**
	 * Gets the qty clothes.
	 *
	 * @return the qty clothes
	 */
	public int getQtyClothes() {
		return qtyClothes;
	}

	/**
	 * Change qty wagon axel.
	 *
	 * @param qtyWagonAxel the qty wagon axel
	 */
	public void changeQtyWagonAxel(int qtyWagonAxel) {
		this.qtyWagonAxel = qtyWagonAxel;
	}

	/**
	 * Gets the qty wagon axel.
	 *
	 * @return the qty wagon axel
	 */
	public int getQtyWagonAxel() {
		return qtyWagonAxel;
	}

	/**
	 * Change qty wagon wheel.
	 *
	 * @param qtyWagonWheel the qty wagon wheel
	 */
	public void changeQtyWagonWheel(int qtyWagonWheel) {
		this.qtyWagonWheel = qtyWagonWheel;
	}

	/**
	 * Gets the qty wagon wheel.
	 *
	 * @return the qty wagon wheel
	 */
	public int getQtyWagonWheel() {
		return qtyWagonWheel;
	}

	/**
	 * Change qty wagon tongue.
	 *
	 * @param qtyWagonTongue the qty wagon tongue
	 */
	public void changeQtyWagonTongue(int qtyWagonTongue) {
		this.qtyWagonTongue = qtyWagonTongue;
	}

	/**
	 * Gets the qty wagon tongue.
	 *
	 * @return the qty wagon tongue
	 */
	public int getQtyWagonTongue() {
		return qtyWagonTongue;
	}

	/**
	 * Change total weight.
	 *
	 * @param totalWeight the total weight
	 */
	public void changeTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	/**
	 * Gets the total weight.
	 *
	 * @return the total weight
	 */
	public int getTotalWeight() {
		return totalWeight;
	}

}
