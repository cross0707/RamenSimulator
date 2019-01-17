import greenfoot.*;

/**
 * Write a description of class kinoko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kinoko extends Actor
{
    /**
     * Act - do whatever the kinoko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */         
   private int ySpeed;
   private int apexTimer;
   private int get;
   private int out;
   private int frag =0;
    public kinoko()
    {
    }
    
    public void act() 
    {
        move();
        get();
        scrole();
        out();
    }    
    public void move(){
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        
        if (!onGround) // in middle of jump
        {
           
            if (ySpeed == 0 && apexTimer > 0) apexTimer--; // run apex timer
            if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
           if(frag<4){
           if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -13; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                apexTimer = 4;  // set apex timer (adjust value to suit)
                frag++;
            }
        }
        }
        else // on ground
        {
             frag =0;
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -13; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                apexTimer = 4;  // set apex timer (adjust value to suit)
                frag++;
            }
        }
        
        /*if( Greenfoot.isKeyDown( "up" ))
        {
            setRotation(270);
            move(4);
        }
        if( Greenfoot.isKeyDown( "down" ))
        {
            setRotation(90);
            move(4);
        }// Add your action code here.*/
        if(Greenfoot.isKeyDown("left"))// Add your action code here.
        {
            setRotation(360);
            move(-2);       
        }
        
        if(Greenfoot.isKeyDown("right"))// Add your action code here.
        {
            setRotation(360);
            move(6);       
        }
    }
    public void get(){
        for(int i=0;i<30;i++){
            for(int j=0;j<10;j++){
        Actor actor = getOneObjectAtOffset( i, j, gu.class ); 
        if( actor != null ){ 

           get++;
           getWorld().removeObject( actor ); 
           if(get >= 100) { 

               World clear = new Clear();
               Greenfoot.setWorld( clear );




            }else { 

                getWorld().showText("" +get, 550, 50); 

            } 
    }}}
}
    public void scrole(){
        
        
        move(-2);
    }
        public void out(){
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class ); 
        if( actor != null ){ 

           out++;
           getWorld().removeObject( actor ); 
           if(out >= 1) { 

               World last = new Last();
               Greenfoot.setWorld( last );


          

            }
    }
}
    }
