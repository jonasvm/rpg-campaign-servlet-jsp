package br.com.rpg.campaign.user.model;

import java.util.Set;

import br.com.rpg.campaign.character.model.PlayableCharacter;

/**
 * 
 * The Class Player extends the class User and represents a player. The player
 * have a name and a character. The player is associated with a campaign.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public class Player extends User {

	//private PlayableCharacter character;
	
	private PlayableCharacter character;
	
	public Player() {};

	public Player(String username, String email, String password) {
		super(username, email, password);
	}
	
	public PlayableCharacter getCharacter() {
		return character;
	}
	
	public Player createCharacter(String characterName, int points, int strength, int dexterity, int endurance,
			int armor, int firepower, int level, int hitPoints, int magicPoints, Set<String> advantages,
			Set<String> disadvantages, Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		this.character = new PlayableCharacter(characterName, points, strength, dexterity, endurance, armor, firepower,
				level, hitPoints, magicPoints, advantages, disadvantages, damageTypes, knownSpells, moneyAndItems);

		return this;
	}

}