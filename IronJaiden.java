import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IronJaiden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IronJaiden extends Player1
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
            setImage("IronJaidenReverse.png");
            bFaceRight = false;
            bFaceLeft = true;
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setImage("IronJaiden.png");
            bFaceRight = true;
            bFaceLeft = false;
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            if(bFaceLeft == false)
            {
                setImage("IronJaidenDuck.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("IronJaidenDuckReverse.png");
            }
        }
    }
    
    public void attackF()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            if(bFaceLeft == false)
            {
                setImage("IronJaidenPeck.png");
            }
            
            if(bFaceRight == false)
            {
                setImage("IronJaidenPeckReverse.png");
            }
        }
    }
    
    public void attackG()
    {
        if("g".equals(Greenfoot.getKey()))
        {
            if(bFaceLeft == false)
            {
                setImage("IronJaidenShoot.png");
                laser = new Laser();
                getWorld().addObject(laser, getX() + 35, getY());
            }
            
            if(bFaceRight == false)
            {
                setImage("IronJaidenShootReverse.png");
                laser = new Laser();
                getWorld().addObject(laser, getX() - 35, getY());
            }
        }
    }
    
    public void damage()
    {
        if(isTouching(KingPewds.class) && Greenfoot.isKeyDown("/") || isTouching(KingPewds.class) && Greenfoot.isKeyDown(".") || isTouching(Antisepticeye.class) && Greenfoot.isKeyDown("/") || isTouching(Antisepticeye.class) && Greenfoot.isKeyDown(".") || isTouching(OddFather.class) && Greenfoot.isKeyDown("/") || isTouching(OddFather.class) && Greenfoot.isKeyDown(".") )
        {
            ((CharacterSelect)getWorld()).iIronHealth--;
        }
    }
}
