import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{  
    private int[] naam = {1,2,3,4,5,6,7,8,9,10};
    
    public MyWorld()
    {    
        super(1159, 674, 1); 

        GreenfootImage grondplan = new GreenfootImage("grondplan.PNG");
        setBackground(grondplan);

        Spawn();
    }

    public void Spawn()
        {
                  
            int i = 0;
            while (i < 10)
            {
                Fruitvlieg fruitvlieg = new Fruitvlieg();
                addObject(fruitvlieg,0,74);            
                i++;
            } 
        }
}
