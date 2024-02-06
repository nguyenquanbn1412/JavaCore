import java.util.*;

// Lớp Product đại diện cho một sản phẩm
class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private String unit;

    public Product(int id, String name, String description, int quantity, double price, String unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    // Getters và setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Mô tả: " + description);
        System.out.println("Số lượng: " + quantity + " " + unit);
        System.out.println("Giá bán: " + price + " đồng");
    }
}

// Lớp chứa chương trình quản lý sản phẩm
public class ProductManagement {
    private List<Product> productList;

    public ProductManagement() {
        productList = new ArrayList<>();
    }

    // Thêm sản phẩm mới
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Xem danh sách sản phẩm
    public void displayProductList() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        for (Product product : productList) {
            product.displayDetails();
            System.out.println();
        }
    }

    // Tìm sản phẩm theo tên
    public void searchProductByName(String name) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có tên là " + name);
        }
    }

    // Tìm sản phẩm theo id
    public void searchProductById(int id) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                product.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có ID là " + id);
        }
    }

    // Xóa sản phẩm
    public void removeProduct(int id) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                System.out.println("Sản phẩm " + product.getName() + " đã được xóa khỏi danh sách");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID là " + id);
    }

    // Cập nhật số lượng sản phẩm
    public void updateQuantity(int id, int newQuantity) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setQuantity(newQuantity);
                System.out.println("Số lượng sản phẩm " + product.getName() + " đã được cập nhật thành " + newQuantity);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID là " + id);
    }

    // Tìm các sản phẩm có số lượng dưới 5
    public void searchProductByLowQuantity() {
        boolean found = false;
        for (Product product : productList) {
            if (product.getQuantity() < 5) {
                product.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sản phẩm nào có số lượng dưới 5");
        }
    }

    // Tìm sản phẩm theo mức giá
    public void searchProductByPriceRange(double minPrice, double maxPrice) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getPrice() >= minPrice && product.getPrice() < maxPrice) {
                product.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sản phẩm nào trong khoảng giá từ " + minPrice + " đến " + maxPrice);
        }
    }

    public static void main(String[] args) {
        ProductManagement management = new ProductManagement();

        // Thêm một số sản phẩm vào danh sách
        management.addProduct(new Product(1, "Laptop", "Laptop Dell XPS", 10, 25000000, "chiếc"));
        management.addProduct(new Product(2, "Smartphone", "Smartphone iPhone 13", 15, 20000000, "chiếc"));
        management.addProduct(new Product(3, "Đồng hồ", "Đồng hồ đeo tay", 3, 5000000, "cái"));
        management.addProduct(new Product(4, "Tai nghe", "Tai nghe không dây", 8, 1500000, "cái"));

        System.out.println("Danh sách sản phẩm ban đầu:");
        management.displayProductList();
        System.out.println();

        // Tìm sản phẩm theo tên
        System.out.println("Tìm sản phẩm theo tên:");
        management.searchProductByName("Laptop");
        System.out.println();

        // Tìm sản phẩm theo id
        System.out.println("Tìm sản phẩm theo id:");
        management.searchProductById(2);
        System.out.println();

        // Xóa sản phẩm
        management.removeProduct(3);
        System.out.println();

        // Cập nhật số lượng sản phẩm
        management.updateQuantity(1, 15);
        System.out.println();

        // Tìm các sản phẩm có số lượng dưới 5
        System.out.println("Tìm các sản phẩm có số lượng dưới 5:");
        management.searchProductByLowQuantity();
        System.out.println();

        // Tìm sản phẩm theo mức giá
        System.out.println("Tìm các sản phẩm có giá từ 5.000.000 đến 20.000.000:");
        management.searchProductByPriceRange(5000000, 20000000);
    }
}
