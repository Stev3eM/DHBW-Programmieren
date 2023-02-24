package de.dhbwka.java.exercise.classes;

public class Point {

    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    public String toString (double x, double y){

        double distanceToOrigin = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Der Abstand zum Ursprung beträgt" +distanceToOrigin+ " LE.");

        double xMirroredAtX = x * (-1);
        double yMirroredAtX = y * (-1);
        System.out.println("");

        return "nope";
    }
}
