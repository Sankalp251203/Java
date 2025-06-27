class Vehicle {
    protected int speed;
    protected double fuel;

    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void move() {
        System.out.println("Moving at speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private boolean hasAirConditioner;

    public Car(int speed, double fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    public void turnOnAC() {
        if (hasAirConditioner) {
            System.out.println("Air Conditioner is ON.");
        } else {
            System.out.println("No Air Conditioner available.");
        }
    }
}

class Bike extends Vehicle {
    private boolean hasKickStart;

    public Bike(int speed, double fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    public void startBike() {
        if (hasKickStart) {
            System.out.println("Bike has a kick-start.");
        } else {
            System.out.println("Bike has a self-start.");
        }
    }
}

class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(int speed, double fuel, int cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo() {
        System.out.println("Cargo capacity: " + cargoCapacity + " kg");
    }
}

public class T5Q2 {
    public static void main(String[] args) {
        Car car = new Car(120, 50.0, true);
        Bike bike = new Bike(80, 15.0, false);
        Truck truck = new Truck(60, 200.0, 5000);

        car.move();
        car.turnOnAC();

        bike.move();
        bike.startBike();

        truck.move();
        truck.loadCargo();
    }
}
