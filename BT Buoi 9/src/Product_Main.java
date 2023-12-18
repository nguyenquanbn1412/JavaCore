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