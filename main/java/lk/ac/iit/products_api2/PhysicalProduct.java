package lk.ac.iit.products_api2;

public class PhysicalProduct extends Product implements Discountable{

    private double discountedPrice;

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        /*super()
          this.setId(id)
          this.setName(name);
          this.setPrice(price);
         */
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public String getDimensions(){
        return dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return getName() + " -$" + getPrice() + " | Weight: " + weightKg + " kg";
    }

    @Override
    public void applyDiscount(double rate){
        double capped = Math.min(rate, 0.2);
        discountedPrice = getPrice() * (1-capped);
    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }

}
