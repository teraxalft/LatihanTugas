public class Product {
    String name;
    double price;
    
    public Product(String name, double price) {
    this.name = name;
    this.price = price;
    }

      // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}