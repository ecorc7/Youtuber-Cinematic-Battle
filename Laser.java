import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    int iSpeed = 15;
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveLife();

        if(getX() > getWorld().getWidth() - 10 || getX() < getWorld().getWidth() - 715 || isTouching(KingPewds.class) || isTouching(Antisepticeye.class) || isTouching(OddFather.class) || isTouching(DrV.class))
        {
            if(isTouching(KingPewds.class) || isTouching(Antisepticeye.class) || isTouching(OddFather.class) || isTouching(DrV.class))
            {
                ((CharacterSelect)getWorld()).iKingHealth--;
                ((CharacterSelect)getWorld()).iAntiHealth--;
                ((CharacterSelect)getWorld()).iOddyHealth--;
                ((CharacterSelect)getWorld()).iDocVHealth--;
            }
            getWorld().removeObject(this);
        }
    }
    
    public void moveLife()
    {
        if(((CharacterSelect)getWorld()).iPlayer1 == 1)
        {
            if(((CharacterSelect)getWorld()).mpm.bFaceLeft == false)
            {
                setLocation(getX()+ iSpeed, getY());
            }
            
            if(((CharacterSelect)getWorld()).mpm.bFaceRight == false)
            {
                setLocation(getX()- iSpeed, getY());
            }
        }
        
        if(((CharacterSelect)getWorld()).iPlayer1 == 3)
        {
            if(((CharacterSelect)getWorld()).ij.bFaceLeft == false)
            {
                setLocation(getX()+ iSpeed, getY());
            }
        
            if(((CharacterSelect)getWorld()).ij.bFaceRight == false)
            {
                setLocation(getX()- iSpeed, getY());
            }
        }
        
        if(((CharacterSelect)getWorld()).iPlayer1 == 4)
        {
            if(((CharacterSelect)getWorld()).jm.bFaceLeft == false)
            {
                setLocation(getX()+ iSpeed, getY());
            }
        
            if(((CharacterSelect)getWorld()).jm.bFaceRight == false)
            {
                setLocation(getX()- iSpeed, getY());
            }
        }
    }
}
