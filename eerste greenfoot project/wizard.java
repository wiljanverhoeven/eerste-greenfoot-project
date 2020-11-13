import greenfoot.*; 

public class wizard extends Actor
{
    boolean isDown = false;
    public wizard () {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth,myNewHeight);
    }

    public void act() 
    {
        move();
        hitEnemy();
        checkFire();
        
    }
   
    public void move() {
        int x = getX();
        int y = getY();
        
        GreenfootImage img = getImage();
        
        if(Greenfoot.isKeyDown("w")) y -= 5;
        if(Greenfoot.isKeyDown("a") && isDown){
            x -= 5;
            img.mirrorHorizontally();
            isDown = false;
        }
        if(Greenfoot.isKeyDown("a") && !isDown){
            x -= 5;
        }
        if(Greenfoot.isKeyDown("s")) y += 5;
        if(Greenfoot.isKeyDown("d") && !isDown){
            x += 5;
            img.mirrorHorizontally();
            isDown = true;
        }
        if(Greenfoot.isKeyDown("d") && isDown){
            x += 5;
        }
   
        setImage(img);
        setLocation(x, y);
    }
    public void checkFire() {   
       
        if(Greenfoot.mousePressed(null)) {
            getWorld().addObject(new fireball(), getX() , getY());                
   }
}
   
    public void hitEnemy() {
        if (isTouching(enemy.class)) {
            getWorld().addObject(new YouLose(), 650, 350);
            getWorld().removeObject(this);
            Greenfoot.stop();
    }
}
}
