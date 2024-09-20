public class Main {
    public static void main(String[] args) {

            Fruit fruit=new Fruit(20,Sensitivity.LOW,"Çilek");
            Fruit fruit2=new Fruit(40,Sensitivity.HIGH,"Armut");

            Vehicle pickup=new Pickup(20,"Navaro");
            Vehicle truck=new Truck(50,"MAN ");
        System.out.println("Uretim yer,:");
        fruit.production();
        System.out.println("&");
        truck.production();
        System.out.println();
        System.out.println("Meyve yükleme aşaması -1");
        pickup.load(fruit);
        pickup.load(fruit2);
        System.out.println("Meyve yukleme aşaması-2");
        truck.load(fruit);
        truck.load(fruit2);






















    }
}