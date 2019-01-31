import greenfoot.*;

/**
 * Write a description of class negi2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class negi2 extends gu
{
    /**
     * Act - do whatever the negi2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        scrole();
        delete();
        // Add your action code here.
    }    
    public void scrole(){
        move(-10);
    }
    public void delete(){
    if(getX() < 1) {
        getWorld().removeObject( this );
      
        
        
   
    }
}
}
