/**
 * The Class Pioneer which represents a player/person in the game.
 * 
 */
public class Pioneer {
	
	/** The name. */
	private String name;
	
	/** If the person is alive. */
	private boolean isAlive;
	
	/** The person's profession. */
	private Profession p;
	
	/** The person's health status. */
	private Health h;

	/**
	 * Instantiates a new pioneer.
	 *
	 * @param name their name
	 * @param p their profession
	 */
	public Pioneer(String name, Profession p) {
		this.setName(name);
		this.setProfession(p);
		this.h = Health.HEALTHY;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the alive.
	 *
	 * @param isAlive the new alive
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * Checks if is alive.
	 *
	 * @return true, if is alive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * Sets the profession.
	 *
	 * @param p the new profession
	 */
	public void setProfession(Profession p) {
		this.p = p;
	}

	/**
	 * Gets the profession.
	 *
	 * @return the profession
	 */
	public Profession getProfession() {
		return p;
	}

	/**
	 * Sets the health.
	 *
	 * @param h the new health
	 */
	public void setHealth(Health h) {
		this.h = h;
	}

	/**
	 * Gets the health.
	 *
	 * @return the health
	 */
	public Health getHealth() {
		return h;
	}
}
