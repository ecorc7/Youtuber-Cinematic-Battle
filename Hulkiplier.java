import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hulkiplier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hulkiplier extends Player1
{
    boolean bFaceRight;
    boolean bFaceLeft;
    public void act() 
    {
        checkFall();
        checkKeys();
        spriteChange();
        attacks();
        damage();
    }    
    
    public void spriteChange()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setImage("HulkiplierReverse.png");
            bFaceRight = false;
            bFaceLeft = true;
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setImage("Hulkiplier.png");
            bFaceRight = true;
            bFaceLeft = false;
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            if(bFaceLeft == false)
            {
                setImage("HulkiplierDuck.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("HulkiplierDuckReverse.png");
            }
        }
    }
    
    public void attacks()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            if(bFaceLeft == false)
            {
                setImage("HulkiplierPunch.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("HulkiplierPunchReverse.png");
            }
        }
        
        if(Greenfoot.isKeyDown("g"))
        {
            if(bFaceLeft == false)
            {
                setImage("HulkiplierKick.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("HulkiplierKickReverse.png");
            }
        }
    }
    
    public void damage()
    {
        if(isTouching(KingPewds.class) && Greenfoot.isKeyDown("/") || isTouching(KingPewds.class) && Greenfoot.isKeyDown(".") || isTouching(Antisepticeye.class) && Greenfoot.isKeyDown("/") || isTouching(Antisepticeye.class) && Greenfoot.isKeyDown(".") || isTouching(OddFather.class) && Greenfoot.isKeyDown("/") || isTouching(OddFather.class) && Greenfoot.isKeyDown(".") )
        {
            ((CharacterSelect)getWorld()).iHulkHealth--;
        }
    }
}
