package br.com.rpg.campaign.user.model;

/**
 * 
 * The Class Dungeon Master extends the class User and represents a dungeon
 * master. The dungeon master contains a name and is associated with a campaign.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public class DungeonMaster extends User {

	public DungeonMaster() {}
	
	public DungeonMaster(String username, String email, String password) {
		super(username, email, password);
	}

}
