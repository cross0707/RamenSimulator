import greenfoot.*;

/**
 * Write a description of class hardhashi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hardhashi extends enemy
{
    /**
     * Act - do whatever the hardhashi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
         public void act() 
    {
        scrole();
        delete();
        // Add your action code here.
    }  
    public void scrole(){
        move(-2);
    }
       public void delete(){
    if(getX() < 1) {
        getWorld().removeObject( this );
    }
} 
}
