public interface Vehichle {
    void start();
    void stop();
    void accelerate(int incSpeed);
    void applyBreak(int decSpeed);
    void applyBreak();
    void printState();
}
