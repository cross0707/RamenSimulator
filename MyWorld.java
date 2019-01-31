import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int rtime;
    
         
    private static final String bgImageName = "2443999i.jpeg";
    private static final double scrollSpeed = 2.0;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
 
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
     
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.


      

        super(620, 439, 1);
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);

        addObject( new kinoko(), 75, 410 );
        
        int X1=150,X2=620,Y1=0,Y2=439; 
        rtime =30;
        int x,y; 

        for(int i=0;i<20;i++){ 
            if(i%2==0){
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 

            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

            addObject( new hashi(), x, y ); 
        }
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 

            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

            addObject( new negi(), x, y ); 
        }
   
    
     }
     public void act(){
         
         scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
       int X1=520,X2=620,Y1=0,Y2=439; 

        int x,y; 
        
        rtime--;
        
     
            if(rtime<=0){
             for(int i=0;i<2;i++){ 
                 if(i%2==0){
                     x = X1 + (int)(Math.random()*((X2-X1)+1)); 

                     y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

                     addObject( new hashi(), x, y ); 
                    }
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 

            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

            addObject( new negi(), x, y ); 
        }
        rtime=30;
    }
    }
        static int scr ;
    static public int getscr(){ return scr;}
    
         private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
}
