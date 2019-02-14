import greenfoot.*;

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends World
{

    /**
     * Constructor for objects of class Hard.
     * 
     */
    public Hard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1); 
        Greenfoot.playSound("roar_zombie.wav");
    }
    public void act()
    {
    if( Greenfoot.isKeyDown( "space" ) ){
       World game2 = new MyWorld2();
       Greenfoot.setWorld( game2 );
                                         }
    }
}
