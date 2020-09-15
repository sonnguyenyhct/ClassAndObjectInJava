public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        if (this.on){
            return "Speed : " + speed + "Color : " + color + "Radius : " + radius + " Fan is on";
        }else {
            return "Speed : " + speed + "Color : " + color + "Radius : " + radius + " Fan is off";
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = fan1.FAST;
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.speed = fan2.MEDIUM;
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
    }
}
