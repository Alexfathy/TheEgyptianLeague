public class Building {
    private String name;
    private int capacity;
    private int noOfFloors;

    public Building(String name, int capacity, int noOfFloors) {
        this.name = name;
        this.capacity = capacity;
        this.noOfFloors = noOfFloors;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

}
