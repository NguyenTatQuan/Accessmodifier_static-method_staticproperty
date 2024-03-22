public class Circle {
    public static void main(String[] args) {
        Circle mycircle = new Circle(2,"Blue");
        System.out.println(mycircle.getColor());
        System.out.println(mycircle.getRadius());

    }
private double radius=1.0;
private String color ="red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

