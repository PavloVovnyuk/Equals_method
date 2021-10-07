import java.util.Objects;

public class Product {
    String name;
    String company;

    public Product(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(company, product.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
