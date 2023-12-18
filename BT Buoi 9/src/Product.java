public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private int productQuantity;
    private double productPrice;

    private Product() {
    }

    public Product(int productId, String productName, String productDescription, int productQuantity, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public static Product newProduct() {
        return new Product();
    }

    public int getProductId() {
        return productId;
    }

    public Product setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Product setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public Product setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
        return this;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Product setProductPrice(double productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    public Product createProduct() {
        return new Product(productId, productName, productDescription, productQuantity, productPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                '}';
    }
}