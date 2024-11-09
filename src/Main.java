import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        /*Product product= new Product();
        System.out.println("Name : "+product.name);*/

        /*Mobile mobile = new Mobile();
        System.out.println("Processor : " + mobile.processor);
        System.out.println("Price : " + mobile.price);

        Laptop laptop = new Laptop();
        System.out.println("Operating System : " + laptop.operatingSystem );
        System.out.println("Price : " + laptop.price);

        Camera camera = new Camera();
        System.out.println("Is Mirrorless : " + camera.imageProcessor);
        System.out.println("Price : " + camera.price);*/

        Mobile mobile = new Mobile(111, "Iphone 14 Pro Max", "Apple", 850.5F, 8.5F, 4.5F, 2.3F, 16F, "56");
        /*System.out.println("Processor : " + mobile.processor);
        System.out.println("Price : " + mobile.price);*/

        Laptop laptop =  new Laptop(222, "MacBook Pro", "Apple", 1234.5F, 6.5F, 4.9F, 2.6F, 16F, "Mac");
        /*System.out.println("Operating System : " + laptop.operatingSystem );
        System.out.println("Price : " + laptop.price);*/

        Camera camera = new Camera(333, "Sony Alpha 4", "Sony", 2345F,4.5F,3.5F,"Digit8",34.4F,true);
        /*System.out.println("Is Mirrorless : " + camera.imageProcessor);
        System.out.println("Price : " + camera.price);*/

        mobile.displayMobileDetails();
        laptop.displayLaptopDetails();
        camera.displayCameraDetails();

    }

}