public class MotorCycleWithGear extends MotoCycle implements Gear {
    int gearCount;
    int totalGears;
    boolean isNeutral;

    MotorCycleWithGear(String brand, String model, int maxSpeed) {
        this(brand, model, maxSpeed,4);
    }
    MotorCycleWithGear(String brand, String model, int maxSpeed,int totalGears) {
        super(brand, model, maxSpeed);
        this.totalGears = totalGears;
    }


    public void gearUp() {
        if(gearCount==totalGears){
            System.out.println("You are on top gear");
            return ;
        }
        else if(gearCount == 1){
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
    public void accelerate(int incSpeed) {
        if(!start){
            System.out.println("MotorCycle is not started");
            return ;
        }
        if(isNeutral){
            System.out.println("Change your gear from neutral to accelerate");
            return ;
        }
        super.accelerate(incSpeed);
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
        System.out.format("Engine is %s with a speed %d",state,speed);
        if(start) {
            String s = null;
            if(gearCount == 1) s = "1st";
            else if(gearCount == 2) s = "2nd";
            else if(gearCount == 3) s = "3rd";
            else s = String.format("%dth",gearCount);
            System.out.format("and in %s gear",s);
        }
    }
}
