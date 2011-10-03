
public class Pioneer {
	private String name;
	private boolean isAlive;
	private profession p;
	private health h;
	
	public enum health{	//Getters and Setters
		Healthy, Dysentary, Dead;
	}
	public enum profession{  //Getters and Setters
		Farmer, Banker, Carpenter, None;
	}
	
	public Pioneer(String name, profession p){
		this.setName(name);
		this.setProfession(p);
		this.h = health.Healthy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setProfession(profession p) {
		this.p = p;
	}

	public profession getProfession() {
		return p;
	}

	public void setHealth(health h) {
		this.h = h;
	}

	public health getHealth() {
		return h;
	}
	
}
