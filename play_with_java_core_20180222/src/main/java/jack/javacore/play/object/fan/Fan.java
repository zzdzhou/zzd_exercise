package jack.javacore.play.object.fan;

public class Fan {

    private double speed = 0D;

    private boolean on = false;

    private long radius;

    public Fan(long radius) {
        this.radius = radius;
    }

    public Fan(int speed, boolean on, long radius) {
        this(radius);
        this.speed = speed;
        this.on = on;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
