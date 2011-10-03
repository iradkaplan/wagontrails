
public class Pioneer {
	private String name;
	private boolean isAlive;
	private Profession p;
	private Health h;
	
	public Pioneer(String name, Profession p){
		this.setName(name);
		this.setProfession(p);
		this.h = Health.HEALTHY;
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

	public void setProfession(Profession p) {
		this.p = p;
	}

	public Profession getProfession() {
		return p;
	}

	public void setHealth(Health h) {
		this.h = h;
	}

	public Health getHealth() {
		return h;
	}
}
