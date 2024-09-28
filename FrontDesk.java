public class FrontDesk{
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk(HotelService valet, HotelService houseKeeping, HotelService cart){
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void perform(){
        valet.service();
        houseKeeping.service();
        cart.service();
    }
}