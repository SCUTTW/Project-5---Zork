/**
 * ---------------------------------------------------------------------------
 * File name: Room.java
 * Project name: Project 5 - Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Grant Scutt, SCUTTW@ETSU.EDU
 * Course:  CSCI 1260
 * Creation Date: Apr 10, 2021
 * ---------------------------------------------------------------------------
 */

package zorkGame;

import java.util.Random;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 10, 2021
 * <hr>
 * @author Grant Scutt
 */
public class Room
{
	private boolean hasWestDoor,
					hasEastDoor;
	private Player 	player;
	
	//TODO:DOCUMENT
	public Room()
	{
		hasWestDoor = true;
		hasEastDoor = true;
		player = null;
	}
	
	//TODO:DOCUMENT
	public boolean getHasWestDoor()
	{
		return hasWestDoor;
	}
	
	//TODO:DOCUMENT
	public boolean getHasEastDoor()
	{
		return hasEastDoor;
	}
	
	//TODO:DOCUMENT
	public void setHasWestDoor(boolean hasWestDoor)
	{
		this.hasWestDoor = hasWestDoor;
	}
	
	//TODO:DOCUMENT
	public void setHasEastDoor(boolean hasEastDoor)
	{
		this.hasEastDoor = hasEastDoor;
	}
	
	//TODO: FINISH AND DOCUMENT
	public void monsterCheck()
	{
		Random rand = new Random();
		if(rand.nextInt(10000) < 5000)
		{
			
		}
		
		
	}
}
