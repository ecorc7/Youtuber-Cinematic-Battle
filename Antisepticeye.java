import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antisepticeye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Antisepticeye extends Player2
{
    boolean bFaceRight;
    boolean bFaceLeft;
    public void act() 
    {
        checkKeys();
        checkFall();
        spriteChange();
        attacks();
        damage();
    }   
    
    public void spriteChange()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("AntisepticeyeReverse.png");
            bFaceRight = true;
            bFaceLeft = false;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("Antisepticeye.png");
            bFaceRight = false;
            bFaceLeft = true;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            if(bFaceRight == false)
            {
                setImage("AntisepticeyeDuck.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("AntisepticeyeDuckReverse.png");
            }
        }
    }
    public void attacks()
    {
        if(Greenfoot.isKeyDown("/"))
        {
            if(bFaceRight == false)
            {
                setImage("AntisepticeyePunch.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("AntisepticeyePunchReverse.png");
            }
        }
        
        if(Greenfoot.isKeyDown("."))
        {
            if(bFaceRight == false)
            {
                setLocation(getX()-50, getY());
            }
            
            if(bFaceLeft == false)
            {
                setLocation(getX()+50, getY());
            }
        }
    }
    
    public void damage()
    {
        if(isTouching(MatPatMan.class) && Greenfoot.isKeyDown("f") || isTouching(Hulkiplier.class) && Greenfoot.isKeyDown("f") || isTouching(Hulkiplier.class) && Greenfoot.isKeyDown("g") || isTouching(IronJaiden.class) && Greenfoot.isKeyDown("f"))
        {
            ((CharacterSelect)getWorld()).iAntiHealth--;
        }
    }
}
