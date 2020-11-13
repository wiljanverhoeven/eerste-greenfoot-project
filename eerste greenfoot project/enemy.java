import greenfoot.*;  

public class enemy extends Actor
{
   
    public enemy() {
    GreenfootImage image = getImage();
        image.scale(image.getWidth() /5, image.getHeight() /5);
        setImage(image);
    }
    public void act() 
    {
        setLocation(getX()-1, getY() );
    }        
}

