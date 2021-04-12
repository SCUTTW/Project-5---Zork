/**
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: Project 5 - Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Grant Scutt, SCUTTW@ETSU.EDU
 * Course:  CSCI 1260
 * Creation Date: Apr 10, 2021
 * ---------------------------------------------------------------------------
 */

package zorkGame;

import java.util.ArrayList;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 10, 2021
 * <hr>
 * @author Grant Scutt
 */
public class Player extends Participant
{
	ArrayList<Weapon> inventory;
	
	//TODO: DOCUMENT
	public Player()
	{
		super(20, 5);
		inventory = new ArrayList<Weapon>();
	}
}
