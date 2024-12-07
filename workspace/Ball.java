//  Aditya Patil
//  December 4, 2024
//  General description: This class defines the Ball object used in the Brick Breaker game.
import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int size;
    private int xVelocity;
    private int yVelocity;

    //  Constructor
    //  Pre-condition: x, y, and size are positive integers.
    //  Post-condition: Initializes the ball's position, size, and default velocity.
    public Ball(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xVelocity = 1; 
        this.yVelocity = -2; 
    }

    //  Pre-condition: None
    //  Post-condition: Returns the x-coordinate of the ball.
    public int getXpos() {
        return x;
    }

    //  Pre-condition: None
    //  Post-condition: Returns the y-coordinate of the ball.
    public int getYpos() {
        return y;
    }

    //  Pre-condition: None
    //  Post-condition: Returns the size of the ball.
    public int getSize() {
        return size;
    }

    //  Pre-condition: x is a valid integer.
    //  Post-condition: Sets the x-coordinate of the ball.
    public void setX(int x) {
        this.x = x;
    }

    //  Pre-condition: y is a valid integer.
    //  Post-condition: Sets the y-coordinate of the ball.
    public void setY(int y) {
        this.y = y;
    }

    //  Pre-condition: xVelocity is a valid integer.
    //  Post-condition: Sets the ball's velocity along the x-axis.
    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    //  Pre-condition: yVelocity is a valid integer.
    //  Post-condition: Sets the ball's velocity along the y-axis.
    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    //  Pre-condition: None
    //  Post-condition: Reverses the ball's x-direction.
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    //  Pre-condition: None
    //  Post-condition: Reverses the ball's y-direction.
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    //  Pre-condition: None
    //  Post-condition: Updates the ball's position based on its velocity.
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    //  Pre-condition: g is a non-null Graphics object.
    //  Post-condition: Draws the ball on the screen.
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, size, size);
    }
}
