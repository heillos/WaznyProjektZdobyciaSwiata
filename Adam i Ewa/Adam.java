import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adam extends Actor
{
    /**
     * Act - do whatever the Adam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot. isKeyDown("D") ) move(5);
        
        if( Greenfoot. isKeyDown("A") ) move(-5);
        
        if( Greenfoot. isKeyDown("S") )
        {
        turn(90);
        move(5);
        turn(-90);
        }
       if( Greenfoot. isKeyDown("W") )
       
        {
        turn(90);
        move(-5);
        turn(-90);
        }
    if( isTouching( Apple.class ) )
    {
        removeTouching( Apple.class );
    }  
    
}
}
