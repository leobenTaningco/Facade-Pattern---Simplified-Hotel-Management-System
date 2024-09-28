public class Valet implements HotelService{

    public void pickUpVehicle(String plateNumber){
        System.out.println("Picking up vehicle " + plateNumber);
    }
    
    public void service(){
        pickUpVehicle("CBM-9881");
    }
}