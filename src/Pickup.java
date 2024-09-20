public class Pickup extends Vehicle{
    public Pickup( double capacity, String name) {
        super( capacity, name);
    }

    @Override
    public void load(Fruit fruit) {
        if (!fruit.getFruitSensitivity().equals(Sensitivity.LOW))
            System.out.println("Hassas meyveler için truck kullanın");
        else if(fruit.getAmount() > super.getCapacity())
            System.out.println("Araç kapasitesi üstünde overload");
        else{
            super.setFruit(fruit);
            System.out.println(fruit.getFruitType()+""+super.getName()+"isimli pickup a yüklendi");
        }

    }

}
