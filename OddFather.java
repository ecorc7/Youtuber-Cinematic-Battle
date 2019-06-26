import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OddFather here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OddFather extends Player2
{
    /**
     * Act - do whatever the OddFather wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
            setImage("OddFatherReverse.png");
            bFaceRight = true;
            bFaceLeft = false;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("OddFather.png");
            bFaceRight = false;
            bFaceLeft = true;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            if(bFaceRight == false)
            {
                setImage("OddFatherDuck.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("OddFatherDuckReverse.png");
            }
        }
    }
    
    public void attacks()
    {
        if(Greenfoot.isKeyDown("/"))
        {
            if(bFaceRight == false)
            {
                setImage("OddFatherPunch.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("OddFatherPunchReverse.png");
            }
        }
        
        if(Greenfoot.isKeyDown("."))
        {
            if(bFaceRight == false)
            {
                setImage("OddFatherDemon.png");
            }
            
            if(bFaceLeft == false)
            {
                setImage("OddFatherDemonReverse.png");
            }
        }
    }
    
    public void damage()
    {
        if(isTouching(MatPatMan.class) && Greenfoot.isKeyDown("f") || isTouching(Hulkiplier.class) && Greenfoot.isKeyDown("f") || isTouching(Hulkiplier.class) && Greenfoot.isKeyDown("g") || isTouching(IronJaiden.class) && Greenfoot.isKeyDown("f"))
        {
            ((CharacterSelect)getWorld()).iOddyHealth--;
        }
    }    
}
