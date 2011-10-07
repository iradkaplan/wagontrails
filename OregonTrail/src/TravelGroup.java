/**
 * The Class TravelGroup which represents the travelling party.
 */
public class TravelGroup {

	/** The party. */
	private Pioneer[] party;
	
	/** The money. */
	private double money;
	
	/** The pack. */
	private Inventory pack;
	
	/** The distance traveled. */
	private int distanceTraveled;
	
	/** The ration level. */
	private RationLevel rl;
	
	/** The travel pace. */
	private TravelPace tp;

	/**
	 * Instantiates a new travel group.
	 *
	 * @param party the party
	 * @param rl the ration level
	 * @param tp the travel pace
	 * @param money the money
	 * @param pack the pack
	 */
	public TravelGroup(Pioneer[] party, RationLevel rl, TravelPace tp,
			double money, Inventory pack) {
		this.party = party;
		this.rl = rl;
		this.tp = tp;
		this.money = money;
		this.pack = pack;
	}

	/**
	 * Calculate rations.
	 */
	public void calculateRations() {

	}

	/**
	 * Calculate travel pace.
	 *
	 * @return the int
	 */
	public int calculateTravelPace() {
		return 0;
	}

	/**
	 * Sets the party.
	 *
	 * @param party the new party
	 */
	public void setParty(Pioneer[] party) {
		this.party = party;
	}

	/**
	 * Gets the party.
	 *
	 * @return the party
	 */
	public Pioneer[] getParty() {
		return party;
	}

	/**
	 * Sets the money.
	 *
	 * @param money the new money
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * Gets the money.
	 *
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * Sets the pack.
	 *
	 * @param pack the new pack
	 */
	public void setPack(Inventory pack) {
		this.pack = pack;
	}

	/**
	 * Gets the pack.
	 *
	 * @return the pack
	 */
	public Inventory getPack() {
		return pack;
	}

	/**
	 * Sets the distance traveled.
	 *
	 * @param distanceTraveled the new distance traveled
	 */
	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	/**
	 * Gets the distance traveled.
	 *
	 * @return the distance traveled
	 */
	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	/**
	 * Sets the ration level.
	 *
	 * @param rl the new ration level
	 */
	public void setRationLevel(RationLevel rl) {
		this.rl = rl;
	}

	/**
	 * Gets the ration level.
	 *
	 * @return the ration level
	 */
	public RationLevel getRationLevel() {
		return rl;
	}

	/**
	 * Sets the travel pace.
	 *
	 * @param tp the new travel pace
	 */
	public void setTravelPace(TravelPace tp) {
		this.tp = tp;
	}

	/**
	 * Gets the travel pace.
	 *
	 * @return the travel pace
	 */
	public TravelPace getTravelPace() {
		return tp;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String s = "\nYour travel group is:\n";
		s+= "Player: "+party[0].getName()+"\n";
		s+= "Person 1: "+party[1].getName()+"\n";
		s+= "Person 2: "+party[2].getName()+"\n";
		s+= "Person 3: "+party[3].getName()+"\n";
		s+= "Person 4: "+party[4].getName()+"\n\n";
		s+="Ration Level = "+rl+"\n";
		s+="Travel Pace = "+tp+"\n\n";
		s+="As a "+party[0].getProfession()+", you'll have $"+money+"0 to start off with.";
		return s;
	}
}
