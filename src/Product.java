public class Product { //Base class, Super class, Parent class

    int id;
    String name;
    String brand;
    float price;
    float discountPercentage;
    float rating;

    public Product(){
        System.out.println("Product constructor Invoked..");
    }

    public Product(int id, String name, String brand, float price, float discountPercentage, float rating) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
    }

    void displayProductDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);
    }

}
