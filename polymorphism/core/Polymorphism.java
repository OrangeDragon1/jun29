package polymorphism.core;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting.";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " accelerating.";
    }

    public String brake() {
        return getClass().getSimpleName() + " braking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting.";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating.";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " braking.";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting.";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating.";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " braking.";
    }

}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting.";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating.";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " braking.";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Evolution IX");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }
}
