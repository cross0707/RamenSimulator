import greenfoot.*;

/**
 * Write a description of class Clear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clear extends World
{

    /**
     * Constructor for objects of class Clear.
     * 
     */
    public Clear()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(564, 564, 1); 
        
        showText("r:Retry",285,300);
        
        showText("おめでとう...君はもうラーメン職人だ...ｯ!!",285,190);
        
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "r" ) ){
       World title = new Title();
       Greenfoot.setWorld( title );
                                         }
    }
}
