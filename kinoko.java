import greenfoot.*;

/**
 * Write a description of class kinoko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kinoko extends Actor
{
    /**
     * Act - do whatever the kinoko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "down" ))
        {
            setRotation(90);
            move(4);
        }// Add your action code here.
        if(Greenfoot.isKeyDown("left"))// Add your action code here.
        {
            setRotation(180);
            move(4);       
        }
        if( Greenfoot.isKeyDown( "up" ))
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("right"))// Add your action code here.
        {
            setRotation(360);
            move(4);       
        }
    }    
}
