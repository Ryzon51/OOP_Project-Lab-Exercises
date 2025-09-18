public class TransportationTester {
    public static void main(String[] args) {
       
        Airplane airplane = new Airplane("Boeing", "747", 35000, 400);
        airplane.startEngine();
        airplane.fly();
        airplane.boardPassengers();
        airplane.stopEngine();

        Helicopter helicopter = new Helicopter("Bell", "407", 15000, 50);
        helicopter.startEngine();
        helicopter.fly();
        helicopter.hover();
        helicopter.stopEngine();

      
        Truck truck = new Truck("Ford", "F-150", 4, 5);
        truck.startEngine();
        truck.drive();
        truck.loadCargo();
        truck.stopEngine();

        SUV suv = new SUV("Toyota", "Land Cruiser", 4, 7);
        suv.startEngine();
        suv.drive();
        suv.offroad();
        suv.stopEngine();

      
        Boat boat = new Boat("Yamaha", "242X", 45, 12);
        boat.startEngine();
        boat.sail();
        boat.boardPassengers();
        boat.stopEngine();

        Submarine submarine = new Submarine("Nautilus", "DSV", 25, 600);
        submarine.startEngine();
        submarine.sail();
        submarine.dive();
        submarine.stopEngine();
    }
}
