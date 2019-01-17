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
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int show = 150;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
<<<<<<< HEAD
                
        addObject(new negi(),500,350);
        addObject(new negi(),500,200);
        addObject(new negi(),500,40);


        addObject(new hashi(),0,350);
        addObject(new hashi(),0,200);
        addObject(new hashi(),0,40);

        addObject(new kinoko() ,300,200);
        
 
        
    }
    
    
        public void act()
    {
        
       if(show != 0){
            showText("←↓↑→　and  'z' key ",300,100);
            show--;
        }else{
            showText("",300,100);
        }
  

    

=======
        addObject( new kinoko(), 75, 375 );
        
        int X1=150,X2=600,Y1=0,Y2=400; 
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
       int X1=500,X2=600,Y1=0,Y2=400; 

        int x,y; 
        
        rtime--;
        
     
            if(rtime<=0){
             for(int i=0;i<2;i++){ 
                 
                     x = X1 + (int)(Math.random()*((X2-X1)+1)); 

                     y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

                     addObject( new hashi(), x, y ); 
                    
            x = X1 + (int)(Math.random()*((X2-X1)+1)); 

            y = Y1 + (int)(Math.random()*((Y2-Y1)+1)); 

            addObject( new negi(), x, y ); 
        }
        rtime=30;
    }
>>>>>>> 61e8821eec8c9bb700cabaf73f1b901c2ddc520c
    }
}
     



