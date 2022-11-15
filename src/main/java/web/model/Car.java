package web.model;

public class Car {
    private String colour;
    private String name;
    private int yearOfTheVehicle;

    public Car(){
    }

    public Car (String colour, String name, int yearOfTheVehicle) {
        this.colour = colour;
        this.name = name;
        this.yearOfTheVehicle = yearOfTheVehicle;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfTheVehicle() {
        return yearOfTheVehicle;
    }

    public void setYearOfTheVehicle(int yearOfTheVehicle) {
        this.yearOfTheVehicle = yearOfTheVehicle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", yearOfTheVehicle=" + yearOfTheVehicle +
                '}';
    }
}
