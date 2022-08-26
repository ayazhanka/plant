public class GreenHouse implements Plant {
    String info;
    String type;
    String country;
    int temperature;


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public GreenHouse(String info, String type, String country, int temperature) {
        this.info = info;
        this.type = type;
        this.country = country;
        this.temperature = temperature;
    }

    public boolean addPlants;
    public boolean toWaterPlant;
    public boolean theLight;

    @Override
    public void newPlants(boolean set) {
        this.addPlants=set;
    }

    @Override
    public void toWaterPlants(boolean water) {
        this.toWaterPlant=water;
        System.out.println("Цветы политы");
    }

    @Override
    public void setLights(boolean light) {
        this.theLight=light;
        System.out.println("Свет включен");
    }

    public GreenHouse(){

    }
}
