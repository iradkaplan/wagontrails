/**
 * The Class WorldState which holds all of the information about the current state of the game.
 */
public class WorldState {
	private TravelGroup travelGroup;
	private int month, dayOfMonth;

	/**
	 * @param month
	 *            the current month
	 * @param dayOfMonth
	 *            the current day
	 * @param travelGroup
	 *            the travelGroup
	 */
	public WorldState(int month, int dayOfMonth, TravelGroup travelGroup) {
		this.month = month;
		this.dayOfMonth = dayOfMonth;
		this.travelGroup = travelGroup;
	}

	/**
	 * @return the TravelGroup
	 */
	public TravelGroup getTravelGroup() {
		return travelGroup;
	}

	/**
	 * @param travelGroup
	 *            the TravelGroup
	 */
	public void setTravelGroup(TravelGroup travelGroup) {
		this.travelGroup = travelGroup;
	}

	/**
	 * @return the current month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            the new month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the current day
	 */
	public int getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * @param dayOfMonth
	 *            the new day
	 */
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

}
