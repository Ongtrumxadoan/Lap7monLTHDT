/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btso7;

/**
 *
 * @author Admin
 */
class Moveablepoint implements Moveable{
    public int x;
    public int y;
    public int xspeed;
    public int yspeed;

    public Moveablepoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    
    
    @Override
    public void moveUp() {
     }

    @Override
    public void moveDown() {
     }

    @Override
    public void moveLeft() {
     }

    @Override
    public void moveRight() {
     }
    @Override
    public String toString() {
        return "Moveablepoint{" + "x=" + x + ", y=" + y + ", xspeed=" + xspeed + ", yspeed=" + yspeed + '}';
    }
}
