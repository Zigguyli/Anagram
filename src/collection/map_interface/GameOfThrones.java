package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GameOfThrones {
    public static void main(String[] args) {
        Map<String, House> houseMap  = new HashMap<>();
        addHouse(houseMap, "Vesteros", "houseVesteros","diamond", "fast");
        addHouse(houseMap, "Barateon", "houseBarateon", "round", "strong");
        addHouse(houseMap, "Stark", "houseStark", "oval", "clever");

        removeHouse(houseMap, "Vesteros");

        getInfo(houseMap, "Barateon");

        showInfoAll(houseMap);
    }

    public static void addHouse(Map<String, House> house, String houseName, String nameHouse, String form, String slogan) {
        house.put(houseName, new House(nameHouse, new Sigil(form, slogan)));
    }

    public static void removeHouse(Map<String, House> house, String key) {
        house.remove(key);
    }

    public static void getInfo(Map house, String key) {
        System.out.println(house.get(key));
    }

    public static void showInfoAll(Map<String, House> house) {
        for (Map.Entry<String, House> item : house.entrySet()) {
            System.out.println(item);
        }
    }
}

class House {
    private String name;
    private Sigil sigil;

    public House(String name, Sigil sigil) {
        this.name = name;
        this.sigil = sigil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(name, house.name) &&
                Objects.equals(sigil, house.sigil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sigil);
    }

    public String toString() {
        return "name(" + name +
                "), sigil(" + sigil.toString() + ")";
    }
}