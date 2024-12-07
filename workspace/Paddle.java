//  Aditya Patil
//  December 5, 2024
//  General description: This class defines the Paddle object used in the Brick Breaker game.
import java.awt.*;
public class Paddle {
    private int x;
    private int y;
    private int width;
    private int height;
    private int velocity;

    //  Constructor
    //  Pre-condition: x, y, width, and height are positive integers.
    //  Post-condition: Initializes the paddle's position, size, and default velocity.
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0; 
    }

    //  Pre-condition: None
    //  Post-condition: Returns the x-coordinate of the paddle.
    public int getX() {
        return x;
    }

    //  Pre-condition: None
    //  Post-condition: Returns the y-coordinate of the paddle.
    public int getY() {
        return y;
    }

    //  Pre-condition: None
    //  Post-condition: Returns the width of the paddle.
    public int getWidth() {
        return width;
    }

    //  Pre-condition: None
    //  Post-condition: Returns the height of the paddle.
    public int getHeight() {
        return height;
    }

    //  Pre-condition: None
    //  Post-condition: Returns the velocity of the paddle.
    public int getVelocity() {
        return velocity;
    }

    //  Pre-condition: x is a valid integer.
    //  Post-condition: Sets the x-coordinate of the paddle.
    public void setX(int x) {
        this.x = x;
    }

    //  Pre-condition: velocity is a valid integer.
    //  Post-condition: Adds the given velocity to the paddle's current velocity and manges speed of the paddle. and resests if it gets to high.
    public void addVelocity(int velocity) {
        this.velocity += velocity;
        if(velocity > 3){
            velocity = 3;
        }
    if (velocity< -3){
        velocity=-3;
    }
    }

    

    //  Pre-condition: velocity is a valid integer.
    //  Post-condition: Sets the paddle's velocity.
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    //  Pre-condition: None
    //  Post-condition: Updates the paddle's position based on its velocity, ensuring it stays within bounds and  makes sure it doesnt exceed an high amount of speed..
    public void move() {
        x += velocity;
        if(velocity>0){
            velocity --;
        }
        if(velocity<0){
            velocity++;
        }
        // Prevent paddle from moving off-screen
        if (x < 0) {
            x = 0;
        }
        if (x + width > 682) { // Assuming the screen width is 682
        if (x + width > 682) { // screen width is 682
            x = 682 - width;
        }
    }
    }
    //  Pre-condition: g is a non-null Graphics object.
    //  Post-condition: Draws the paddle on the screen.
    public void draw(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(x, y, width, height);
    }
}