import greenfoot.*;

/**
 * Write a description of class Last2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Last2 extends World
{

    /**
     * Constructor for objects of class Last2.
     * 
     */
    public Last2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 438, 1); 
        
        showText("r:Retry",285,345);
        showText("t:Back to title",285,295);
        
        showText("Game Over",285,190);
        Greenfoot.playSound("end.wav");
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "r" ) ){
       World hard = new Hard();
       Greenfoot.setWorld( hard );
                                    }
    if( Greenfoot.isKeyDown( "t" ) ){
       World title = new Title();
       Greenfoot.setWorld( title );
                                    }
    }
}