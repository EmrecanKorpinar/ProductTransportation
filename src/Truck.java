public class Truck extends Vehicle{
    public Truck(double capacity, String name) {
        super( capacity, name);
    }

//    @Override
//    public void load(Fruit fruit) {
//        super.load(fruit);
//    }


    @Override
    public void load(Fruit fruit) {
        if (! fruit.getFruitSensitivity().equals(Sensitivity.HIGH))
        System.out.println("Dayanaklı meyveler için pickup kullanın"  );
    else if (fruit.getAmount()>super.getCapacity())
            System.out.println("OVERLOAD taşınamaz");
        else{
            super.setFruit(fruit);
            System.out.println(fruit.getFruitType()+"" + super.getName()+"isimli trucka yuklendu");
        }



    }





}
