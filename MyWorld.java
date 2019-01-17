import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int show = 150;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
                
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
  

    

    }
}
