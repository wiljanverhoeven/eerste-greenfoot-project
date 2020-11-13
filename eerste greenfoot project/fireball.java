import greenfoot.*;  

public class fireball extends Actor
{
    MyWorld thisGame;
    public fireball() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /5, image.getHeight() /5);
        setImage(image);
        
    
    }
    public void act() 
    {
        
        
        setLocation(getX() + speed, getY());
        destroyEnemies();
    }
    
    public void destroyEnemies() {
        Actor enemy = getOneIntersectingObject(enemy.class);
        if(enemy != null) {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
            thisGame.score++;
        }
    }
    private int speed = 10;
}
