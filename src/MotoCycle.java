import javax.management.ObjectInstance;

public abstract class MotoCycle implements Vehichle {
    int speed;
    int maxSpeed;
    String brand;
    String model;
    boolean start;
    MotoCycle(String brand,String model,int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    MotoCycle(String brand,String model){
        this(brand,model,180);
    }
    public void start(){
        if(start){
            System.out.println("Bike is already started");
            return ;
        }
        start = true;
    }
    public void stop(){
        if(!start){
            System.out.println("Bike is already stopped");
            return ;
        }
        speed = 0;
        start = false;
    }
    @Override
    public void accelerate(int incSpeed) {
        if(incSpeed+this.speed >= maxSpeed){
            System.out.println("You can accelerate upto "+maxSpeed);
            return ;
        }
        this.speed+=incSpeed;
        System.out.println("You are moving with a speed of "+this.speed);
    }
    public void applyBreak(int decSpeed){
        if(speed-decSpeed<0){
            System.out.println("Your car is halted");
            return ;
        }
        speed-=decSpeed;
        System.out.println("You are moving with "+speed+"kmph");
    }
    public void applyBreak(){
        applyBreak(10);
    }
}
