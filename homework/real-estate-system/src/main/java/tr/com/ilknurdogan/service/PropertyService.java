package tr.com.ilknurdogan.service;

import tr.com.ilknurdogan.model.House;
import tr.com.ilknurdogan.model.SummerHouse;
import tr.com.ilknurdogan.model.Villa;
import tr.com.ilknurdogan.repository.PropertyRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PropertyService {

    public int getTotalPriceOfHouses(){
        return PropertyRepository.getHouseList()
                .stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    public int getTotalPriceOfVilla(){
        return PropertyRepository.getVillaList()
                .stream()
                .mapToInt(Villa::getPrice)
                .sum();
    }

    public int getTotalPriceOfSummerHouse(){
        return PropertyRepository.getSummerHouseList()
                .stream()
                .mapToInt(SummerHouse::getPrice)
                .sum();
    }

    public int getTotalPriceOfAll(){
        return PropertyRepository.getAll()
                .stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    public double getAverageSquareMeterOfHouses(){
//        int totalSquareMeter = PropertyRepository.getHouseList()
//                .stream()
//                .mapToInt(House::getSquareMeter)
//                .sum();
//
//        int houseCount = PropertyRepository.getHouseList().size();
//
//        return totalSquareMeter / houseCount;


        return PropertyRepository.getHouseList()
                .stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMeterOfVilla(){
        return PropertyRepository.getVillaList()
                .stream()
                .mapToInt(Villa::getSquareMeter)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMeterOfSummerHouse(){
        return PropertyRepository.getSummerHouseList()
                .stream()
                .mapToInt(SummerHouse::getSquareMeter)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMeterOfAll(){
        return PropertyRepository.getAll()
                .stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }

    public List<House> filterByRoomAndLivingRoom(int roomCount, int livingRoomCount){
        return PropertyRepository.getAll()
                .stream()
                .filter(house-> house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount )
                .collect(Collectors.toList());
    }




}
