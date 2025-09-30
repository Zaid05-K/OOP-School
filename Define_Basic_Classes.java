
package Project_Java;

public class Define_Basic_Classes {
    abstract class TransportVehicle {
    private String vehicleID;
    private int capacity;

    public TransportVehicle(String vehicleID, int capacity) {
        this.vehicleID = vehicleID;
        this.capacity = capacity;
    }

    public abstract double calculateFare();

    // Getters and setters
    public String getVehicleID() { return vehicleID; }
    public int getCapacity() { return capacity; }
}

class Bus extends TransportVehicle {
    private static final double FARE_PER_KM = 0.50;

    public Bus(String vehicleID, int capacity) {
        super(vehicleID, capacity);
    }

    @Override
    public double calculateFare() {
        // Implementation for fare calculation specific to bus
        return FARE_PER_KM * 10; // example calculation
    }
}

class Train extends TransportVehicle {
    private static final double FARE_PER_KM = 1.50;

    public Train(String vehicleID, int capacity) {
        super(vehicleID, capacity);
    }

    @Override
    public double calculateFare() {
        // Implementation for fare calculation specific to train
        return FARE_PER_KM * 10; // example calculation
    }
}

}
