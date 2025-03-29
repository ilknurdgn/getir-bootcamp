package tr.com.ilknurdogan.model;

public class House {

    private long id;
    private int price;
    private int squareMeter;
    private int roomCount;
    private int livingRoomCount;

    public House(long id, int price, int squareMeter, int roomCount, int livingRoomCount){
        this.id = id;
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;

    }

    public long getId() {
        return id;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getPrice() {
        return price;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomCount=" + roomCount +
                ", livingRoomCount=" + livingRoomCount +
                '}';
    }
}
