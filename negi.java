import greenfoot.*;

/**
 * Write a description of class negi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class negi extends gu
{
    /**
     * Act - do whatever the negi wants to do. This method is called whenever
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
