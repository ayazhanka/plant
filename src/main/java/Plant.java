
import java.util.Objects;

public class Plant extends PlantServiceImpl {
    private int id;
    private int temperature;
    private String name;
    private String type;
    private String country;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return id == plant.id && temperature == plant.temperature && name.equals(plant.name) && type.equals(plant.type) && country.equals(plant.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temperature, name, type, country);
    }

    public Plant(int id, int temperature, String name, String type, String country) {
        this.id = id;
        this.temperature = temperature;
        this.name = name;
        this.type = type;
        this.country = country;
    }


}