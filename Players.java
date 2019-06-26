import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    int iSpeed = 0;
    int iAcceleration = 1;
    public void act() 
    {
        // Add your action code here.
    }
    
    public void checkFall()
    {
        if (onGround()) {
            iSpeed = 0;
        }
        else {
            fall();
        }
    }
    
    public void jump()
    {
        iSpeed = -15;
        fall();
    }
    
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 2, Platform.class);
        return under != null;
    }
    
    public void fall()
    {
        setLocation (getX(), getY() + iSpeed);
        iSpeed += iAcceleration;
    }
}
