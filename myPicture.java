
/**
 * Write a description of class myPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myPicture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square wall2;
    private Square window2;
    private Triangle roof2;
    private boolean drawn;

    /**
     * Constructor for objects of class myPicture
     */
    public myPicture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        wall2 = new Square();
        window2 = new Square();
        roof2 = new Triangle();
      
        drawn = false;
        
    }

    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-180);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-170);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(-20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            wall2.moveHorizontal(20);
            wall2.moveVertical(20);
            wall2.changeSize(120);
            wall2.changeColor("black");
            wall2.makeVisible();
            
            window2.changeColor("red");
            window2.moveHorizontal(100);
            window2.moveVertical(40);
            window2.changeSize(40);
            window2.makeVisible();
    
            
            roof2.changeSize(60, 180);
            roof2.moveHorizontal(120);
            roof2.moveVertical(-60);
            roof2.makeVisible();
            roof2.changeColor("yellow");
            
            sun.changeColor("yellow");
            sun.moveHorizontal(-200);
            sun.moveVertical(-70);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }
}
