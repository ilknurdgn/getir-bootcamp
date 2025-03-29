package tr.com.ilknurdogan.repository;

import tr.com.ilknurdogan.model.House;
import tr.com.ilknurdogan.model.SummerHouse;
import tr.com.ilknurdogan.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class PropertyRepository {
    // Static lists to hold different types of properties
    private static final List<House> houseList = new ArrayList<>();
    private static final List<Villa> villaList= new ArrayList<>();
    private static final List<SummerHouse> summerHouseList = new ArrayList<>();

    // Static block to initialize example data for each property type
    static{
        houseList.add(new House(1, 1000000, 120, 3, 1));
        houseList.add(new House(2, 900000, 110, 2, 1));
        houseList.add(new House(3, 1200000, 130, 4, 1));

        villaList.add(new Villa(4, 2500000, 250, 5, 2));
        villaList.add(new Villa(5, 2300000, 240, 4, 2));
        villaList.add(new Villa(6, 2700000, 270, 6, 2));

        summerHouseList.add(new SummerHouse(7, 1800000, 150, 3, 1));
        summerHouseList.add(new SummerHouse(8, 2000000, 160, 4, 1));
        summerHouseList.add(new SummerHouse(9, 1700000, 140, 2, 1));
    }

    // Returns the list of houses
    public static List<House> getHouseList(){
        return houseList;
    }

    // Returns the list of villas
    public static List<Villa> getVillaList(){
        return villaList;
    }

    // Returns the list of summer houses
    public static List<SummerHouse> getSummerHouseList(){
        return summerHouseList;
    }

    // Returns a combined list of all property types
    public static List<House> getAll(){
        List<House> all = new ArrayList<>();

        all.addAll(houseList);
        all.addAll(villaList);
        all.addAll(summerHouseList);

        return all;
    }

}
