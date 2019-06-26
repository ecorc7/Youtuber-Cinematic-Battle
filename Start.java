import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            ((CharacterSelect)getWorld()).setBackground("Controls.png");
            setImage("a.png");
            Greenfoot.delay(200);
            ((CharacterSelect)getWorld()).setBackground("SelectionBackground.jpg");
            ((CharacterSelect)getWorld()).removeObject(this);
        }
    }    
}
