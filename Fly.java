import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    boolean male = true;
    public void act() 
    {
        
        move(10);
        setRotation(Greenfoot.getRandomNumber(360));
        
    }   
    
    
    public Fly(boolean male) {
        
        if (male) {
            setImage("maleFly.png");
        } else {
            setImage("femaleFly.png");
        }
    }
}

