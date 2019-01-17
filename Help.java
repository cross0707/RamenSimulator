import greenfoot.*;

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        
        showText("You must get many many negi !!",320,100);
        showText("In order to clear it, 100 negi are needed.",320,150);
        showText("But if you hit hashi it will be Game Over.",320,200);
        showText("move:←→",320,250);
        showText("jump:space",320,300);
        showText("n:Exit",320,400);
        
    }
    
    public void act()
    {
                                         
    if( Greenfoot.isKeyDown( "n" ) ){
       World title = new Title();
       Greenfoot.setWorld( title );
                                         }
    }
}