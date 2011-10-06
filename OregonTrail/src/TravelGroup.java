public class TravelGroup {

	private Pioneer[] party;
	private double money;
	private Inventory pack;
	private int distanceTraveled;
	private RationLevel rl;
	private TravelPace tp;

	public TravelGroup(Pioneer[] party, RationLevel rl, TravelPace tp,
			double money, Inventory pack) {
		this.party = party;
		this.rl = rl;
		this.tp = tp;
		this.money = money;
		this.pack = pack;
	}

	public void calculateRations() {

	}

	public int calculateTravelPace() {
		return 0;
	}

	public void setParty(Pioneer[] party) {
		this.party = party;
	}

	public Pioneer[] getParty() {
		return party;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setPack(Inventory pack) {
		this.pack = pack;
	}

	public Inventory getPack() {
		return pack;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setRationLevel(RationLevel rl) {
		this.rl = rl;
	}

	public RationLevel getRationLevel() {
		return rl;
	}

	public void setTravelPace(TravelPace tp) {
		this.tp = tp;
	}

	public TravelPace getTravelPace() {
		return tp;
	}
	
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
