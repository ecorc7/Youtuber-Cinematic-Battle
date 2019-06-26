import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChoosePlayers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoosePlayers extends Actor
{
    public void act() 
    {
        if(((CharacterSelect)getWorld()).bChosen1 == false || ((CharacterSelect)getWorld()).bChosen2 == false)
        {
            if(Greenfoot.isKeyDown("w"))
            {
                ((CharacterSelect)getWorld()).bChosen1 = true;
                ((CharacterSelect)getWorld()).iPlayer1 = 1;
            }
            
            if(Greenfoot.isKeyDown("s"))
            {
                ((CharacterSelect)getWorld()).bChosen1 = true;
                ((CharacterSelect)getWorld()).iPlayer1 = 2;
            }
            
            if(Greenfoot.isKeyDown("a"))
            {
                ((CharacterSelect)getWorld()).bChosen1 = true;
                ((CharacterSelect)getWorld()).iPlayer1 = 3;
            }
            
            if(Greenfoot.isKeyDown("q"))
            {
                ((CharacterSelect)getWorld()).bChosen1 = true;
                ((CharacterSelect)getWorld()).iPlayer1 = 4;
            }
            
            if(Greenfoot.isKeyDown("up"))
            {
                ((CharacterSelect)getWorld()).bChosen2 = true;
                ((CharacterSelect)getWorld()).iPlayer2 = 1;
            }
            
            if(Greenfoot.isKeyDown("down"))
            {
                ((CharacterSelect)getWorld()).bChosen2 = true;
                ((CharacterSelect)getWorld()).iPlayer2 = 2;
            }
            
            if(Greenfoot.isKeyDown("right"))
            {
                ((CharacterSelect)getWorld()).bChosen2 = true;
                ((CharacterSelect)getWorld()).iPlayer2 = 3;
            }
            
            if(Greenfoot.isKeyDown("'"))
            {
                ((CharacterSelect)getWorld()).bChosen2 = true;
                ((CharacterSelect)getWorld()).iPlayer2 = 4;
            }
        }
        if(((CharacterSelect)getWorld()).bChosen1 == true && ((CharacterSelect)getWorld()).bChosen2 == true && ((CharacterSelect)getWorld()).bAddObjects == false)
        {
            ((CharacterSelect)getWorld()).bAddObjects = true;
            getWorld().removeObject(((CharacterSelect)getWorld()).cs);
        }
    }
}
