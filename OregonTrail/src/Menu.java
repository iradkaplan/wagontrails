import java.util.*;
public class Menu {
	private WorldState worldstate;
	private String playerName;
	private List<String> partyNames;
	private Profession prof;
	private TravelPace pace;
	private RationLevel ration;
	
	public Menu(){
		this.worldstate=null;
		this.playerName=null;
		this.partyNames=null;
		this.prof=null;
		this.pace=null;
		this.ration=null;
	}
	
	public void startUpMenu(String playerName, List<String> partyNames, Profession prof, TravelPace pace, RationLevel ration) {
		this.playerName=playerName;
		this.partyNames=partyNames;
		this.prof=prof;
		this.pace=pace;
		this.ration=ration;
	}  

	public void updateDisplay(){
		
	}
        



	public void trailMenu(){
		
	}
	
	public void fortMenu(){
		
	}
	public void storeMenu(){
		
	}
	public void riverMenu(){
		
	}
	public void winGameMenu(){
		
	}
	public void loseGameMenu(){
		
	}

	public void gameSave(){
		
	}
	public void gameLoad(){
		
	}


	
}
