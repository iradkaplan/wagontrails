
public class TravelGroup {
	
	private Pioneer[] party;
	private double money;
	private Inventory pack;
	private int distanceTraveled;
	private RationLevel rl;
	private TravelPace tp;
	
	private enum RationLevel{
		High, Medium, Low, Starving;
	}
	private enum TravelPace{
		Stopped, Slow, Medium, Fast;
	}
	
	public TravelGroup(Pioneer[] party, RationLevel rl, TravelPace tp, double money, Inventory pack){
		this.party = party;
		this.rl = rl;
		this.tp = tp;
		this.money = money;
		this.pack = pack;
	}

	public void calculateRations(){
		
	}
	public int calculateTravelPace(){
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
}
