// Lớp SinhVienTechMaster
abstract class SinhVienTechMaster {
    protected String hoTen;
    protected String nganh;

    public SinhVienTechMaster(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng để lấy điểm
    public abstract double getDiem();

    // Phương thức để xếp loại học lực
    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }

    // Phương thức để xuất thông tin ra màn hình
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}

// Lớp SinhVienIT kế thừa từ SinhVienTechMaster
class SinhVienIT extends SinhVienTechMaster {
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    // Ghi đè phương thức getDiem để tính điểm cho sinh viên IT
    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}

// Lớp SinhVienBiz kế thừa từ SinhVienTechMaster
class SinhVienBiz extends SinhVienTechMaster {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    // Ghi đè phương thức getDiem để tính điểm cho sinh viên Biz
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}

// Lớp chứa phương thức main để thực thi chương trình
public class TechStudent {
    public static void main(String[] args) {
        // Tạo một sinh viên IT
        SinhVienIT svIT = new SinhVienIT("Nguyễn Văn An", "CNTT", 8.5, 7.5, 9.0);

        // Tạo một sinh viên Biz
        SinhVienBiz svBiz = new SinhVienBiz("Nguyễn Thị Bình", "Kinh doanh", 7.0, 8.5);

        // Xuất thông tin sinh viên IT
        System.out.println("Thông tin sinh viên IT:");
        svIT.xuat();
        System.out.println();

        // Xuất thông tin sinh viên Biz
        System.out.println("Thông tin sinh viên Biz:");
        svBiz.xuat();
    }
}
