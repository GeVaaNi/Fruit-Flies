import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class Spray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spray extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    public int Timer = 0;
    public Spray()
    {
        image1 = new GreenfootImage("Spray_idle.png");
        image2 = new GreenfootImage("Spray_stage1.png");
        image3 = new GreenfootImage("Spray_stage2.png");
        image4 = new GreenfootImage("Spray_stage3.png");
        image5 = new GreenfootImage("Spray_stage4.png");
        setImage(image1);
    }
    /**
     * Act - do whatever the Spray wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Timer++;
        if (Timer==500)
        {
            sprayTime();
        }
        
    }   
    /**
     * Set images to generate a spraying motion which kills the flies.
     * 
     */
    public void sprayTime()
    {
        setImage(image2);
        TimeUnit.SECONDS.sleep(1);
        setImage(image3);
        TimeUnit.SECONDS.sleep(1);
        setImage(image4);
        TimeUnit.SECONDS.sleep(7);
        setImage(image5);
        TimeUnit.SECONDS.sleep(3);
}
}
