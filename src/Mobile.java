public class Mobile extends Product { //Derived class, Sub class, Child class

    float  processor;
    float ramSize;
    String operatingTechnology;

    public Mobile(){
        super(); //super call -> invokes super class constructor
        System.out.println("Price: " + price);
        System.out.println("Mobile constructor is invoked..");
    }

    public Mobile(int id, String name, String brand, float price, float discountPercentage, float rating, float processor, float ramSize, String operatingTechnology) {
        super(id, name, brand, price, discountPercentage, rating);
        this.processor = processor;
        this.ramSize = ramSize;
        this.operatingTechnology = operatingTechnology;
    }

    void displayMobileDetails(){
        /*System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);*/

        super.displayProductDetails(); //super keyword is used to invoke base class properties
        System.out.println("Price : " + super.price);
        System.out.println("Processor : "+ processor);
        System.out.println("Ram Size : " + ramSize);
        System.out.println("Operating Technology : " + operatingTechnology);
    }

}
