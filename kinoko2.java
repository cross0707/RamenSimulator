import greenfoot.*;

/**
 * Write a description of class kinoko2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kinoko2 extends Actor
{
    /**
     * Act - do whatever the kinoko2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */         
   private int ySpeed;
   private int apexTimer;
   private int get;
   private int out;
   private int frag =0;
    public kinoko2()
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
                Greenfoot.playSound("jump.wav");
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
                Greenfoot.playSound("jump.wav");
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
            move(-4);       
        }
        
        if(Greenfoot.isKeyDown("right"))// Add your action code here.
        {
            setRotation(360);
            move(14);       
        }
    }
    public void get(){
        for(int i=0;i<30;i++){
            for(int j=0;j<10;j++){
        Actor actor = getOneObjectAtOffset( i, j, negi2.class ); 
        if( actor != null ){ 

           get++;
           getWorld().removeObject( actor ); 
           Greenfoot.playSound("get.wav");
           if(get >= 100) { 


               World clear2 = new Clear2();
               Greenfoot.setWorld( clear2 );





            }else { 

                getWorld().showText("" +get, 550, 50); 

            } 
    }}}
}
    public void scrole(){
        
        
        move(-10);
    }
        public void out(){
        Actor actor = getOneObjectAtOffset( 0, 0, hashi2.class ); 
        if( actor != null ){ 

           out++;
           getWorld().removeObject( actor ); 
           Greenfoot.playSound("damege.wav");
           if(out >= 1) { 


               World last2 = new Last2();
               Greenfoot.setWorld( last2 );


          


   

            }
    }
}
    }
