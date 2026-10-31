package lk.ac.iit.products_api2;

public class DigitalProduct extends Product implements Discountable{

    private double discountedPrice;

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){
    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB){
        super(id,name,price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    public void setDownloadUrl(String downloadUrl){
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary(){
        return getName() + " -$" + getPrice() + " | download: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate){
        discountedPrice = getPrice() * (1-rate);
    }

    @Override
    public double getDiscountedPrice(){
        return 0;
    }


}