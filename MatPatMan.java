import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MatPatMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatPatMan extends Player1
{
    public boolean bFaceLeft;
    public boolean bFaceRight;
    public Laser laser;
    public void act() 
    {
        checkKeys();
        checkFall();
        spriteChange();
        attackF();
        attackG();
        damage();
    }
    
    public void spriteChange()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setImage("MatPatManReversePixel.png");
            bFaceRight = false;
            bFaceLeft = true;
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setImage("MatPatManPixel.png");
            bFaceRight = true;
            bFaceLeft = false;
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            if(bFaceLeft == false)
            {
                setImage("MatPatManDuckPixel.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("MatPatManDuckReversePixel.png");
            }
        }
    }
    
    public void attackF()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            if(bFaceLeft == false)
            {
                setImage("MatPatManPunchPixel.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("MatPatManPunchReversePixel.png");
            }
        }
    }
    
    public void attackG()
    {
        if("g".equals(Greenfoot.getKey()))
        {
            if(bFaceLeft == false)
            {
                setImage("MatPatManLaserPixel.png");
                getWorld().addObject(new Laser(), getX(), getY()-35);
            }
            
            if(bFaceRight == false)
            {
                setImage("MatPatManLaserReversePixel.png");
                laser = new Laser();
                getWorld().addObject(laser, getX(), getY()-35);
            }
        }
    }
    
    public void damage()
    {
        if(isTouching(KingPewds.class) && Greenfoot.isKeyDown("/") || isTouching(KingPewds.class) && Greenfoot.isKeyDown(".") || isTouching(Antisepticeye.class) && Greenfoot.isKeyDown("/") || isTouching(Antisepticeye.class) && Greenfoot.isKeyDown(".") || isTouching(OddFather.class) && Greenfoot.isKeyDown("/") || isTouching(OddFather.class) && Greenfoot.isKeyDown(".") )
        {
            ((CharacterSelect)getWorld()).iMatPHealth--;
        }
    }
}