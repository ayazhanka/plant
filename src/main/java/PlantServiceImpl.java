public class PlantServiceImpl implements PlantService {
    public boolean addPlants;
    public boolean toWaterPlant;
    public boolean theLight;

    @Override
    public void newPlants(boolean set) {
        this.addPlants=set;
        System.out.println("Цветы добавлены");
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

}
