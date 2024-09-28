public class HotelApp{
    public static void main(String[] args) {
        HotelService hotelService = new Valet();
        HotelService houseKeeping = new HouseKeeping();
        HotelService cart = new Cart();
        
        FrontDesk frontDesk = new FrontDesk(hotelService, houseKeeping, cart);

        frontDesk.perform();
    }
}