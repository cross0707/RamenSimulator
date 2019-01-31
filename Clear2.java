import greenfoot.*;

/**
 * Write a description of class Clear2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clear2 extends World
{

    /**
     * Constructor for objects of class Clear2.
     * 
     */
    public Clear2()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        showText("r:Retry",80,130);
        
        showText("お前が真の拉麺喰種だったんだな...",400,50);
         Greenfoot.playSound("clear.wav");
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "r" ) ){
       World title = new Title();
       Greenfoot.setWorld( title );
                                         }
    }
}