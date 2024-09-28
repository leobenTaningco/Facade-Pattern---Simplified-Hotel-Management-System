public class Cart implements HotelService{
    public void requestCart(int numberOfCarts){
        System.out.println("Delivering " + numberOfCarts + " carts");
    }
    public void service(){
        requestCart(4);
    }
}
