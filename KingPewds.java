import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KingPewds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KingPewds extends Player2
{
    boolean bFaceLeft;
    boolean bFaceRight;
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
            setImage("KingPewdsReversePixel.png");
            bFaceRight = true;
            bFaceLeft = false;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("KingPewdsPixel.png");
            bFaceRight = false;
            bFaceLeft = true;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            if(bFaceRight == false)
            {
                setImage("KingPewdsDuckPixel.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("KingPewdsDuckReversePixel.png");
            }
        }
    }
    
    public void attacks()
    {
        if(Greenfoot.isKeyDown("/"))
        {
            if(bFaceRight == false)
            {
                setImage("KingPewdsPunchPixel.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("KingPewdsPunchReversePixel.png");
            }
        }
        
        if(Greenfoot.isKeyDown("."))
        {
            if(bFaceRight == false)
            {
                setImage("KingPewdsPugnadoPixel.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("KingPewdsPugnadoReversePixel.png");
            }
        }
    }
    
    public void damage()
    {
        if(isTouching(MatPatMan.class) && Greenfoot.isKeyDown("f") || isTouching(Hulkiplier.class) && Greenfoot.isKeyDown("f") || isTouching(Hulkiplier.class) && Greenfoot.isKeyDown("g") || isTouching(IronJaiden.class) && Greenfoot.isKeyDown("f"))
        {
            ((CharacterSelect)getWorld()).iKingHealth--;
        }
    }
}
