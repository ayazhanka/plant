
import java.util.ArrayList;
import java.util.List;

public class GreenHouse extends Plant {
    public GreenHouse(int id, int temperature, String name, String type, String country) {
        super(id, temperature, name, type, country);
    }

    public static void main(String[] args) {
        Bush appleTree = new Bush(0, 33,"Apple Tree", "Bush", "Kyrgyzstan");
        System.out.println(appleTree.getId()+". Растение в оранжерее: при температуре"  + " " + appleTree.getTemperature()+", " + appleTree.getName() + ", " + appleTree.getType() + ", " + appleTree.getCountry() );
        appleTree.newPlants(true);
        appleTree.toWaterPlants(false);
        appleTree.setLights(false);

        Bush Lilac = new Bush(1, 28,"Lilac", "Bush", "Russia");
        System.out.println(Lilac.getId()+". Растение в оранжерее: при температуре"  + " " + Lilac.getTemperature()+", " + Lilac.getName() + ", " + Lilac.getType() + ", " + Lilac.getCountry() );
        Lilac.newPlants(false);
        Lilac.toWaterPlants(false);
        Lilac.setLights(false);

        RoomFlower Orchid = new RoomFlower(2, 24,"Orchid", "Room Plant", "Amazon river");
        System.out.println(Orchid.getId()+". Растение в оранжерее: при температуре"  + " " + Orchid.getTemperature()+", " + Orchid.getName() + ", " + Orchid.getType() + ", " + Orchid.getCountry() );
        Orchid.newPlants(true);
        Orchid.toWaterPlants(true);
        Orchid.setLights(true);

        Flower Roze = new Flower(3, 15, "Roze", "Flower", "Holland");
        System.out.println(Roze.getId()+". Растение в оранжерее: при температуре"  + " " + Roze.getTemperature()+", " + Roze.getName() + ", " + Roze.getType() + ", " + Roze.getCountry() );
        Roze.newPlants(true);
        Roze.toWaterPlants(true);
        Roze.setLights(true);
    }
}

