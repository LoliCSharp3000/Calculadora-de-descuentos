package calculadora;

public class Productos {
    private double finalCost;
    private double cost;
    private String name;

    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }
    public void calcularPrecio(double desc){
        finalCost = cost - cost * desc;
    }
    public double getFinalCost() {
        return finalCost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
