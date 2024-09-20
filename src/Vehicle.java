public class Vehicle implements IProductable{
    private Fruit fruit;
    private double capacity;
    private String name;

    public Vehicle( double capacity, String name) {

        this.capacity = capacity;
        this.name = name;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void production() {
        System.out.println(" Araç Fabrikada üretilir");
    }

    public void load(Fruit fruit) {
        System.out.println("meyve taşıma işlemi");

    }
}
