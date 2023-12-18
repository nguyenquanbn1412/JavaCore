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
////////////////////////////

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    static int checkNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen");
            scn.next();
        }
        return scn.nextInt();
    }

    List<Product> createLstProduct() {
        List<Product> lstProduct = new ArrayList<>();
        Product product1 = Product.newProduct().setProductId(1).setProductName("iPhone 13 Pro Max")
                .setProductDescription("Made in China").setProductQuantity(6).setProductPrice(45000).createProduct();
        Product product2 = Product.newProduct().setProductId(2).setProductName("Samsung S24 Ultra")
                .setProductDescription("Made in Viet Nam").setProductQuantity(3).setProductPrice(40000).createProduct();
        Product product3 = Product.newProduct().setProductId(3).setProductName("Lumia 12")
                .setProductDescription("Made in Finland").setProductQuantity(2).setProductPrice(150000).createProduct();
        Product product4 = Product.newProduct().setProductId(4).setProductName("Xiaomi 13T Pro")
                .setProductDescription("Made in China").setProductQuantity(5).setProductPrice(90000).createProduct();
        Product product5 = Product.newProduct().setProductId(5).setProductName("BlackBerry")
                .setProductDescription("Made in Germany").setProductQuantity(2).setProductPrice(70000).createProduct();
        lstProduct.add(product1);
        lstProduct.add(product2);
        lstProduct.add(product3);
        lstProduct.add(product4);
        lstProduct.add(product5);
        return lstProduct;
    }

    void printProductList(List<Product> lstProduct) {
        if (lstProduct != null) {
            for (Product product : lstProduct) {
                System.out.println(product.toString());
            }
        } else {
            System.out.println("Danh sach rong!");
        }
    }

    void findProductByName(List<Product> lstProduct, Scanner scn) {
        System.out.println("Nhap vao ten sp ban muon tim: ");
        String strProductName = scn.nextLine();
        for (Product product : lstProduct) {
            if (product.getProductName().contains(strProductName)) {
                System.out.println("San pham ban can tim la: ");
                System.out.println(product.toString());
            }
        }
    }

    void modifyProduct(List<Product> lstProducts, Scanner scn) {
        System.out.println("Nhap vao ID cua san pham:");
        int productId = checkNumber(scn);
        for (Product product : lstProducts) {
            if (product.getProductId() == productId) {
                System.out.println("Vui long chon:");
                System.out.println("1. Xoa san pham");
                System.out.println("2. Cap nhat so luong san pham");
                int optionNumber = checkNumber(scn);
                if (optionNumber == 1) {
                    lstProducts.remove(product);
                    System.out.println("Xoa thanh cong!");
                } else if (optionNumber == 2) {
                    System.out.println("Nhap vao so luong cua san pham: ");
                    int proDuctQuantity = checkNumber(scn);
                    product.setProductQuantity(proDuctQuantity);
                    System.out.println("Cap nhat thanh cong!");
                } else {
                    System.out.println("Ban can nhap dung theo goi y cua menu!");
                }
                break;
            }
        }
        System.out.println("Danh sach san pham sau khi cap nhat:");
        printProductList(lstProducts);
    }

    void findProductLessThan5(List<Product> lstProducts) {
        List<Product> lstLessThan5 = new ArrayList<>();
        for (Product product : lstProducts) {
            if (product.getProductQuantity() < 5) {
                lstLessThan5.add(product);
            }
        }
        System.out.println("Danh sach san pham co so luong nho hon 5:");
        printProductList(lstLessThan5);
    }

    void findProductByPrice(List<Product> lstProducts, Scanner scn) {
        System.out.println("Tim san pham theo gia, vui long chon:");
        System.out.println("1. Duoi 50,000");
        System.out.println("2. Tu 50,000 den duoi 100,000");
        System.out.println("3. Tu 100,000 tro len");
        int optionNumber = checkNumber(scn);
        System.out.println("Danh sach san pham can tim:");
        List<Product> lst = findLstProduct(lstProducts, optionNumber);
        printProductList(lst);
    }

    List<Product> findLstProduct(List<Product> lstProducts, int optionNumber) {
        List<Product> lst1 = new ArrayList<>();
        List<Product> lst2 = new ArrayList<>();
        List<Product> lst3 = new ArrayList<>();
        for (Product product : lstProducts) {
            if (product.getProductPrice() < 50000) {
                lst1.add(product);
            } else if (product.getProductPrice() >= 50000 && product.getProductPrice() < 100000) {
                lst2.add(product);
            } else {
                lst3.add(product);
            }
        }
        return switch (optionNumber) {
            case 1 -> lst1;
            case 2 -> lst2;
            case 3 -> lst3;
            default -> null;
        };
    }
}
/////////////////////////////////

import java.util.List;
import java.util.Scanner;

public class Product_Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        List<Product> lstProduct = productService.createLstProduct();
        productService.printProductList(lstProduct);
        productService.findProductByName(lstProduct, scanner);
        productService.modifyProduct(lstProduct, scanner);
        productService.findProductLessThan5(lstProduct);
        productService.findProductByPrice(lstProduct, scanner);
    }
}


