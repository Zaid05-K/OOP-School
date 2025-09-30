
package Project_Java;

import java.util.List;

/**
 *
 * @author Zaid.K
 */
public class Aggregation {
    class Station {
    private String name;
    private String location;

    public Station(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters
    public String getName() { return name; }
    public String getLocation() { return location; }
}

class Route {
    private List<Station> stations;

    public Route(List<Station> stations) {
        this.stations = stations;
    }

    public List<Station> getStations() { return stations; }
}

}
