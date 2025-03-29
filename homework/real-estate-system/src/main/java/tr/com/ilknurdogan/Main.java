package tr.com.ilknurdogan;

import tr.com.ilknurdogan.service.PropertyService;

public class Main {
    public static void main(String[] args) {

        // Create a service instance
        PropertyService propertyService = new PropertyService();

        // Print total prices
        System.out.println("===========================================");
        System.out.println("TOTAL PRICE CALCULATIONS");
        System.out.println("===========================================");
        System.out.println("Total price of houses: " + propertyService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + propertyService.getTotalPriceOfVilla());
        System.out.println("Total price of summer houses: " + propertyService.getTotalPriceOfSummerHouse());
        System.out.println("Total price of all types of houses: " + propertyService.getTotalPriceOfAll() + "\n");

        // Print average square meters
        System.out.println("===========================================");
        System.out.println("AVERAGE SQUARE METER CALCULATIONS");
        System.out.println("===========================================");
        System.out.println("Average square meters of houses: " + propertyService.getAverageSquareMeterOfHouses());
        System.out.println("Average square meters of villas: " + propertyService.getAverageSquareMeterOfVilla());
        System.out.println("Average square meters of summer houses: " + propertyService.getAverageSquareMeterOfSummerHouse());
        System.out.println("Average square meters of all types of houses: " + propertyService.getTotalPriceOfAll() + "\n");

        // Print filtered results by room and living room count
        System.out.println("===========================================");
        System.out.println("FILTER BY ROOM AND LIVING ROOM COUNT");
        System.out.println("===========================================");
        System.out.println("All types of houses by number of rooms and living rooms" + propertyService.filterByRoomAndLivingRoom(3,1));
    }
}