import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Players
{
    int iHealth = 100;
    public void act() 
    {
        
    }
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-10, getY());
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+10, getY());
        }
        
        if(Greenfoot.isKeyDown("up") && onGround())
        {
            jump();
        }
    }
    
    public void damage()
    {
        if(isTouching(Laser.class))
        {
            iHealth = iHealth-1;
        }
    }
}
