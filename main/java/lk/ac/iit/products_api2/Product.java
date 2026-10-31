package lk.ac.iit.products_api2;

public abstract class Product {

    private Long id;
    private String name;
    private double price;

    public Product(){ //no-arg constructor
    }

    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getSummary();

    /*
    Statement	         Compiles?                   	Which version runs / why?
1	a.getSummary()                       	Yes	            Product.getSummary()
2	b.getSummary()                       	Yes         	DigitalProduct.getSummary()
3	c.getSummary()	                        Yes	            DigitalProduct.getSummary()
4	b.getDownloadUrl()                   	No           	Product does not declare getDownloadUrl()
5	c.getDownloadUrl()	                    Yes	            DigitalProduct.getDownloadUrl()
6	a.getDownloadUrl()                  	No	            Product does not declare getDownloadUrl()
7	((DigitalProduct)b).getDownloadUrl()	Yes	            b actually refers to a DigitalProduct, so the cast succeeds
8	((DigitalProduct)a).getDownloadUrl()	Yes         	The cast compiles, but fails at runtime with ClassCastException because a refers to a plain Product
     */
}
