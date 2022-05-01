import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","X5");
        car.start();
        car.gearUp();
        car.accelerate(20);
        car.applyBreak(30);
        car.printState();
        Truck truck = new Truck("Tata","thor",250);
        truck.printState();
        truck.start();
        truck.accelerate(10);
        truck.gearUp();
        truck.stop();
        truck.accelerate(30);
        MotorCycleWithGear bike = new MotorCycleWithGear("Yamaha","FZ",300);
        bike.start();
        bike.gearUp();
        bike.accelerate(40);
        bike.applyBreak();
        bike.stop();
        bike.printState();
        Scooter scooty = new Scooter("honda","activa",130);
        scooty.start();
        scooty.accelerate(40);
        scooty.applyBreak();
        scooty.stop();
        scooty.printState();
    }
}
