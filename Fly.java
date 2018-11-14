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
        // FIXME: zorg dat ze recht vliegen
        move(10);
        if (atWorldsEnd()) {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        
        
    }   
    
    
    public boolean atWorldsEnd() {
        if (getX() < 3 || getX() > getWorld().getWidth() - 3)
            return true;
        if (getY() < 3 || getY() > getWorld().getHeight() - 3)
            return true;
        else
            return false;
    }
    
    public Fly(boolean male) {
        
        setRotation(Greenfoot.getRandomNumber(360));
        
        if (male) {
            setImage("maleFly25.png");
        } else {
            setImage("femaleFly35.png");
        }
    }
}
