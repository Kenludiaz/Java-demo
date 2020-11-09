class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private double velocity;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Engine has been started.");
    }

    public void accelerate(double milesPerHour) {
        this.velocity += milesPerHour;
    }

    public void brake() {
        System.out.println("The car has stopped.");
        this.velocity = 0;
    }

}
class Porsche extends Car {
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void brake() {
        System.out.println("Grrrrr");
    }
}

class Hummer extends Car {
    public Hummer(int cylinders, String name) {
        super(cylinders, name);
    }


}
