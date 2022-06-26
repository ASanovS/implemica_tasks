package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {

    private final String name;
    // array of roads(edges) between cities array
    private Road[] adjacency;

    // minimum stretch from this to the selected city
    private int minDistance = (int) Double.POSITIVE_INFINITY;

    // next city(Vertex)
    private City previous;

    // a map of cities(Vertex) and the length of roads to
    // this city(Vertex)
    private Map<Integer, Integer> citiesAndRoads = new HashMap<>();

    public City(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public void addToMapRoadToCity(int cityNumber, int weightOfRoadToCity) {
        this.citiesAndRoads.put(cityNumber, weightOfRoadToCity);
    }

    public int getWeightOfRoadToCity(int cityNumber) {
        return this.citiesAndRoads.get(cityNumber);
    }

    public int compareTo(City other) {
        return Double.compare(minDistance, other.minDistance);
    }

    public String getName() {
        return name;
    }

    public Road[] getAdjacency() {
        return adjacency;
    }

    public void setAdjacency(Road[] adjacency) {
        this.adjacency = adjacency;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public City getPrevious() {
        return previous;
    }

    public void setPrevious(City previous) {
        this.previous = previous;
    }

    public void fillingRoadsArray(int numberOfCities, Map<Integer, City> cities) {

        Integer cityNumber;
        List<Road> roads = new ArrayList<>();

        for (int i = 0; i < numberOfCities; i++) {

            cityNumber = this.citiesAndRoads.get(i + 1);
            if (cityNumber != null) {

                roads.add(new Road(cities.get(i + 1), citiesAndRoads.get(i + 1)));
            }
        }
        this.adjacency = roads.toArray(new Road[roads.size()]);
    }
}
