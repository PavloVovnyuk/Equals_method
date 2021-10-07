public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("car", "Audi");
        Product product2 = new Product("car", "Audi");
        Product product3 = new Product("car", "BMW");

        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));


    }


}
