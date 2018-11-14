import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vliegenmepper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vliegenmepper extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    public int pauze = 0;
    public Vliegenmepper()
    {
        image1 = new GreenfootImage("vliegenmepper.png");
        image2 = new GreenfootImage("vliegenmepper2.png");
        setImage(image1);

    }

    /**
     * Act - do whatever the Vliegenmepper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( isTouching(Fly.class) ) 
        {
            removeTouching(Fly.class);
            Greenfoot.playSound("Clap.mp3");
            setImage(image2);   
            // pauze voor de tekening te laten staan
            if(pauze!=0)
            {
                pauze=0;
            }
            if(pauze<10000)
            {
                pauze++;
            }            
        }
        else 
        {
            setImage(image1);
        }
        
    }    
}
