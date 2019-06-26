import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Score extends Actor
{
    public Player2Score()
    {
        GreenfootImage newImage2 = new GreenfootImage(100,50);
        setImage(newImage2);
    }
    
    public void setHealth2(int health2)
    {
        GreenfootImage img2 = getImage();
        
        Font f = new Font("Comic Sans MS", false, false, 32);
        img2.setFont(f);
        
        img2.clear();
        img2.setColor(Color.RED);
        img2.drawString(String.valueOf(health2), 30, 50);
        setImage(img2);
    }
}
