import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    boolean male;
    private GreenfootImage map;
    public void act() 
    {
        
        move(10);
        if (atWorldsEnd()) {
            setRotation(Greenfoot.getRandomNumber(360));
        } else if (atWall(this.getX(), this.getY())) {
            
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
        map = new GreenfootImage("grondplan.PNG");
        setRotation(Greenfoot.getRandomNumber(360));
        
        // determine gender
        if (male) {
            setImage("maleFly25.png");
        } else {
            setImage("femaleFly35.png");
        }
    }
    
    boolean atWall(int x, int y) {
        Color color = map.getColorAt(x, y);
        System.out.println(color.getBlue() + ", ");
        System.out.print(color.getGreen() + ", ");
        System.out.print(color.getRed() + ", ");
        
        
        // FIXME: zoek grijs
        return ((100 < color.getBlue()) && (100 < color.getRed()) && (100 < color.getGreen()));
        
    }
}
