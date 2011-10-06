import java.util.*;

public class Menu {
	private WorldState worldstate;

	public Menu() {
		this.worldstate = null;
	}

	public void startUpMenu(String playerName, List<String> partyNames,
			Profession prof, TravelPace pace, RationLevel ration) {
		Pioneer[] pioneers = new Pioneer[5];
		pioneers[0] = new Pioneer(playerName, prof);
		double money;
		if (prof == Profession.CARPENTER)
			money = 300;
		else if (prof == Profession.BANKER)
			money = 500;
		else
			money = 200;
		for (int x = 1; x < 5; x++) {
			pioneers[x] = new Pioneer(partyNames.get(x - 1), Profession.NONE);
		}
		TravelGroup travelGroup = new TravelGroup(pioneers, ration, pace, money,
				new Inventory(0, 0, 0, 0, 0, 0));
		worldstate = new WorldState(4, 12, travelGroup);
	}

	public void updateDisplay() {
	
	}

	public void trailMenu() {

	}

	public void fortMenu() {

	}

	public void storeMenu() {

	}

	public void riverMenu() {

	}

	public void winGameMenu() {

	}

	public void loseGameMenu() {

	}

	public void gameSave() {

	}

	public void gameLoad() {

	}

	/**
	 * Tells world state to get the TravelGroup's toString.
	 * 
	 * @return the worldState's travel group's toString
	 */
	public String getTravelGroupString() {
		return "Welcome to the Oregon Trail!\n" +
				"Today is "+worldstate.getMonth()+"/"+worldstate.getDayOfMonth()+"!\n"+
				worldstate.getTravelGroup().toString();
	}

}
