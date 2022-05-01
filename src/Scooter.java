public class Scooter extends MotoCycle{

    Scooter(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed);
    }

    @Override
    public void accelerate(int incSpeed) {
        if(!start){
            System.out.println("MotorCycle is not started");
            return ;
        }
        super.accelerate(incSpeed);
    }

    @Override
    public void printState() {
        System.out.format("You are in %s %s\n",brand,model);
        String state = null;
        if(start) state = "running";
        else state = "stopped";
        System.out.format("Engine is %s with a speed %d",state,speed);
    }
}
