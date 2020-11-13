import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public static int score = 0;
    public MyWorld()
    {    
        
        super(1300, 700, 1); 
        prepare();
        act();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
        crystal crystal = new crystal();
        addObject(crystal,69,50);
        crystal crystal2 = new crystal();
        addObject(crystal2,69,200);
        crystal crystal3 = new crystal();
        addObject(crystal3,69,350);
        wizard wizard = new wizard();
        addObject(wizard, 150, 350);
        crystal crystal4 = new crystal();
        addObject(crystal4,69,500);
        crystal crystal5 = new crystal();
        addObject(crystal5,69,650);
    }
    private int enemySpawnTimer = -1;
    public void act()
{
    showText("score: " +score, 650, 50);
    if (++enemySpawnTimer == 55*2)
    {
        enemySpawnTimer = 0;
        for (int i=0; i<2; i++) addObject(new enemy(), 1299, 50);
        
        for (int i=0; i<2; i++) addObject(new enemy(), 1299, 150);
        
        for (int i=0; i<2; i++) addObject(new enemy(), 1299, 250);
        
        for (int i=0; i<2; i++) addObject(new enemy(), 1299, 350);
        
        for (int i=0; i<2; i++) addObject(new enemy(), 1299, 450);
        
        for (int i=0; i<2; i++) addObject(new enemy(), 1299, 550);
   
        for (int e=0; e<2; e++) addObject(new enemy(), 1299, 650);
    
    }  
    if(score == 300) {
        addObject(new victory(), 650, 350);
        Greenfoot.stop();
    }
  }
}
