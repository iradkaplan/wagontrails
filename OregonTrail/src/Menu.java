import java.util.*;

/**
 * The Class Menu which determines what happens when a certain menu choice is selected
 */
public class Menu {
	
	/** The worldstate. */
	private WorldState worldstate;

	/**
	 * Instantiates a new menu.
	 */
	public Menu() {
		this.worldstate = null;
	}

	/**
	 * Start up menu.
	 *
	 * @param playerName the player name
	 * @param partyNames the party names
	 * @param prof the profession
	 * @param pace the travel pace
	 * @param ration the ration level
	 */
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

	/**
	 * Update display.
	 */
	public void updateDisplay() {
	
	}

	/**
	 * Trail menu.
	 */
	public void trailMenu() {

	}

	/**
	 * Fort menu.
	 */
	public void fortMenu() {

	}

	/**
	 * Store menu.
	 */
	public void storeMenu() {

	}

	/**
	 * River menu.
	 */
	public void riverMenu() {

	}

	/**
	 * Win game menu.
	 */
	public void winGameMenu() {

	}

	/**
	 * Lose game menu.
	 */
	public void loseGameMenu() {

	}

	/**
	 * Game save.
	 */
	public void gameSave() {

	}

	/**
	 * Game load.
	 */
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
