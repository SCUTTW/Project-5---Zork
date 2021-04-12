/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
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
public class Weapon
{
	int damageBoost;
	
	//TODO:DOCUMENT
	public Weapon()
	{
		damageBoost = 0;
	}
	
	//TODO:DOCUMENT
	public Weapon(int damageBoost)
	{
		this.damageBoost = damageBoost;
	}
	
	//TODO:DOCUMENT
	public int getDamageBoost()
	{
		return damageBoost;
	}
	
	public void setDamageBoost(int damageBoost)
	{
		this.damageBoost = damageBoost;
	}
}
