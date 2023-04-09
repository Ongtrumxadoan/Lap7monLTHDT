/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btso7;

/**
 *
 * @author Admin
 */
public class MoveableCircle implements Moveable{
    public int radius; 
    public Moveablepoint center;

     public MoveableCircle(int radius, Moveablepoint center) {
        this.radius = radius;
        this.center = center;
     }

    MoveableCircle() {
     }
    
    @Override
    public void moveUp() {
     }

    @Override
    public void moveDown() {
        System.out.println("xuong");
     }

    @Override
    public void moveLeft() {
     }

    @Override
    public void moveRight() {
     }

    @Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
}
