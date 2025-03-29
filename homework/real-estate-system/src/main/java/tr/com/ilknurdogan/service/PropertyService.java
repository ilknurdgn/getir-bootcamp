package tr.com.ilknurdogan.service;

import tr.com.ilknurdogan.model.House;
import tr.com.ilknurdogan.model.SummerHouse;
import tr.com.ilknurdogan.model.Villa;
import tr.com.ilknurdogan.repository.PropertyRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PropertyService {

    // Calculates the total price of all houses
    public int getTotalPriceOfHouses(){
        return PropertyRepository.getHouseList()
                .stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    // Calculates the total price of all villas
    public int getTotalPriceOfVilla(){
        return PropertyRepository.getVillaList()
                .stream()
                .mapToInt(Villa::getPrice)
                .sum();
    }

    // Calculates the total price of all summer houses
    public int getTotalPriceOfSummerHouse(){
        return PropertyRepository.getSummerHouseList()
                .stream()
                .mapToInt(SummerHouse::getPrice)
                .sum();
    }

    // Calculates the total price of all property types
    public int getTotalPriceOfAll(){
        return PropertyRepository.getAll()
                .stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    // Calculates the average square meter of all houses
    public double getAverageSquareMeterOfHouses(){
        return PropertyRepository.getHouseList()
                .stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);


//        Alternative approach (manual calculation):
//        int totalSquareMeter = PropertyRepository.getHouseList()
//                .stream()
//                .mapToInt(House::getSquareMeter)
//                .sum();
//
//        int houseCount = PropertyRepository.getHouseList().size();
//
//        return totalSquareMeter / houseCount;
    }

    // Calculates the average square meter of all villas
    public double getAverageSquareMeterOfVilla(){
        return PropertyRepository.getVillaList()
                .stream()
                .mapToInt(Villa::getSquareMeter)
                .average()
                .orElse(0);
    }

    // Calculates the average square meter of all summer houses
    public double getAverageSquareMeterOfSummerHouse(){
        return PropertyRepository.getSummerHouseList()
                .stream()
                .mapToInt(SummerHouse::getSquareMeter)
                .average()
                .orElse(0);
    }

    // Calculates the average square meter of all property types
    public double getAverageSquareMeterOfAll(){
        return PropertyRepository.getAll()
                .stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }

    // Filters all properties by the given number of rooms and living rooms
    public List<House> filterByRoomAndLivingRoom(int roomCount, int livingRoomCount){
        return PropertyRepository.getAll()
                .stream()
                .filter(house-> house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount )
                .collect(Collectors.toList());
    }




}
