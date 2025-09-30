
package Project_Java;

import java.util.ArrayList;
import java.util.List;

class Station {public Station(String name, String location) {} // Getters and other methods }
    

/**
 *
 * @author Zaid.K
 */
class Route { private List<Station> Stations; public Route(List<Station> stations) { this.stations = stations; } // Methods to handle route logic }

}
class Route{
   private List<Station> Station;
   public Route(List<Station> Station){
       this.station=station;
   }
}
public class Putting_It_All_Together {

    private static class Ticket {

        public Ticket() {
        }

        private void printDetails() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    
    public class Main {
    public static void main(String[] args) {
        List<Station> stations = new ArrayList<>();
        stations.add(new Station("Central", "Downtown"));
        stations.add(new Station("Westside", "Suburb"));

        
        Route Route1 = new Route(Stations);
       TransportVehicle Bus = new Bus("B123", 30);
       TransportVehicle Train = new Train("T456", 100);

        System.out.println("Bus fare: " + bus.calculateFare());
        System.out.println("Train fare: " + train.calculateFare());

        Ticket ticket = new Ticket("T001", bus.calculateFare());
        ticket.printDetails();
    }
}
}
}
