import greenfoot.*;

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        
        showText("space:Gameplay",450,300);
        showText(" h:Help",450,420);
        showText("RamenSimulator(らぁめんしみゅれーたー)",450,150);
         Greenfoot.playSound("op.wav");
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "space" ) ){
       World game = new MyWorld();
       Greenfoot.setWorld( game );
                                         }
                                         
    if( Greenfoot.isKeyDown( "h" ) ){
       World help = new Help();
       Greenfoot.setWorld( help );
                                         }
    }
}