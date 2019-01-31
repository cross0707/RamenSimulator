import greenfoot.*;

/**
 * Write a description of class Last here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Last extends World
{

    /**
     * Constructor for objects of class Last.
     * 
     */
    public Last()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 438, 1); 
        
        showText("r:Retry",285,300);
        
        showText("Game Over",285,190);
        Greenfoot.playSound("end.wav");
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "r" ) ){
       World title = new Title();
       Greenfoot.setWorld( title );
                                         }
    }
}

