public class Truck implements Vehichle,Gear{
    String brand;
    String model;
    boolean start;
    int gearCount;
    int speed;
    int maxSpeed;
    boolean isNeutral;
    int load;

    Truck(String brand,String model){
        this(brand,model,0);
    }
    Truck(String brand,String model,int maxSpeed){
        this(brand,model,0,maxSpeed);
    }
    Truck(String brand,String model,int load,int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.gearCount = 0;
        this.start = false;
        this.isNeutral = true;
        this.load = load;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        if(start){
            System.out.println("Engine is already running");
            return ;
        }
        start = true;
    }

    @Override
    public void stop() {
        if(!start){
            System.out.println("Engine is already stopped");
            return ;
        }
        speed = 0;
        start = false;
    }

    @Override
    public void gearUp() {
        if(gearCount==5){
            System.out.println("You are on top gear");
            return ;
        }
        else if(gearCount == 0){
            isNeutral = false;
        }
        gearCount+=1;
    }

    @Override
    public void gearDown() {
        if(gearCount==1){
            System.out.println("You are on first gear");
            return ;
        }
        gearCount-=1;
    }

    @Override
    public boolean isNeutral() {
        return isNeutral;
    }

    @Override
    public void putNeutral(){
        isNeutral = true;
    }

    @Override
    public void printState() {
        System.out.format("You are in %s %s\n",brand,model);
        String state = null;
        if(start) state = "running";
        else state = "stopped";
        System.out.format("Engine is %s with a speed %d kmph",state,speed);
        if(start) {
            String s = null;
            if(gearCount == 1) s = "1st";
            else if(gearCount == 2) s = "2nd";
            else if(gearCount == 3) s = "3rd";
            else s = String.format("%dth",gearCount);
            System.out.format(" and in %s gear",s);
        }
        if(load!=0) System.out.print(" with a load of "+load+"llb.");
        System.out.println();
    }
    @Override
    public void accelerate(int incSpeed) {
        if(!start){
            System.out.println("Truck is not started");
            return ;
        }
        if(isNeutral){
            System.out.println("Please change gear from neutral to accelerate");
            return ;
        }
        if(incSpeed+this.speed >= maxSpeed){
            System.out.println("You can accelerate upto "+maxSpeed);
            return ;
        }
        this.speed+=incSpeed;
        System.out.println("You are moving with a speed of "+this.speed);
    }

    @Override
    public void applyBreak(int decSpeed) {
        if(speed-decSpeed<0){
            System.out.println("Your car is halted");
            return ;
        }
        speed-=decSpeed;
        System.out.println("You are moving with "+speed+"kmph");
    }

    @Override
    public void applyBreak() {
        applyBreak(10);
    }
}
