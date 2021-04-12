/**
 * ---------------------------------------------------------------------------
 * File name: Participant.java
 * Project name: Project 5 - Zork
 * ---------------------------------------------------------------------------
 * Creator's name and email: Grant Scutt, SCUTTW@ETSU.EDU
 * Course:  CSCI 1260
 * Creation Date: Apr 10, 2021
 * ---------------------------------------------------------------------------
 */

package zorkGame;


/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 10, 2021
 * <hr>
 * @author Grant Scutt
 */
public class Participant
{
	private int healthPoints;
	private int damage;
	
	
	//TODO:DOCUMENT
	public Participant()
	{
		healthPoints = 0;
		damage = 0;
	}
	
	//TODO:DOCUMENT
	public Participant(int healthPoints, int damage)
	{
		this.healthPoints = healthPoints;
		this.damage = damage;
	}
	
	//TODO:DOCUMENT
	public int getHealthPoints()
	{
		return healthPoints;
	}
	
	//TODO:DOCUMENT
	public int getDamage()
	{
		return damage;
	}
	
	//TODO:DOCUMENT
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	
	//TODO:DOCUMENT
	public void setDamage(int damage)
	{
		this.damage = damage;
	}
}
