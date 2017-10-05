import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ewa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ewa extends Actor
{
    /**
     * Act - do whatever the Ewa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot. isKeyDown("right") ) move(5);
        
        if( Greenfoot. isKeyDown("left") ) move(-5);
        
        if( Greenfoot. isKeyDown("down") )
        {
        turn(90);
        move(5);
        turn(-90);
        }
       if( Greenfoot. isKeyDown("up") )
       
        {
        turn(90);
        move(-5);
        turn(-90);
        }
        if( Greenfoot. isKeyDown("space") )
        {
            int x, y;
            
            x = getX();
            y = getY();
            
            World world;
            world = getWorld(); 
            
            Apple apple;
            apple = new Apple();
            
            if ( !isTouching( Apple.class ) )  world.addObject (apple , x , y );
            
            
          
        }
    }    
}
