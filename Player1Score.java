import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1Score extends Actor
{
    /**
     * Act - do whatever the Player1Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1Score()
    {
        GreenfootImage newImage1 = new GreenfootImage(100,50);
        setImage(newImage1);
    }
    
    public void setHealth1(int health1)
    {
        GreenfootImage img1 = getImage();
        
        Font f = new Font("Comic Sans MS", false, false, 32);
        img1.setFont(f);
        
        img1.clear();
        img1.setColor(Color.BLUE);
        img1.drawString(String.valueOf(health1), 30, 50);
        setImage(img1);
    }
}
