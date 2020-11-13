import greenfoot.*; 


public class crystal extends Actor
{
    public crystal() {
    GreenfootImage image = getImage();
    image.scale(image.getWidth() /5, image.getHeight() /5);
    setImage(image);        
    }
    public void act() 
    {
        ifHit();
    }    
    public void ifHit() {
        if (isTouching(enemy.class)) {
            getWorld().addObject(new YouLose(), 650, 350);
            getWorld().removeObject(this);
            Greenfoot.stop();
    }
    }
}
