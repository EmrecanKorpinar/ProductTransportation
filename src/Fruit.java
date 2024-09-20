public class Fruit implements IProductable{
    private double amount;
    private Sensitivity fruitSensitivity;
    private String fruitType;


    public Fruit(double amount, Sensitivity fruitSensitivity, String fruitType) {
        this.amount = amount;
        this.fruitSensitivity = fruitSensitivity;
        this.fruitType = fruitType;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Sensitivity getFruitSensitivity() {
        return fruitSensitivity;
    }

    public void setFruitSensitivity(Sensitivity fruitSensitivity) {
        this.fruitSensitivity = fruitSensitivity;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public void production() {
        System.out.println("Meyve ağaçta yetişir");
    }
}
