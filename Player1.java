import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Players
{
    public void act() 
    {
        
    }
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+10, getY());
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-10, getY());
        }
        
        if(Greenfoot.isKeyDown("w") && onGround())
        {
            jump();
        }
    }
}
