public class Book {
    private String maSach;
    private String tenSach; // Phien ban Main
    private String tacGia;

    public Book(String maSach, String tenSach, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void hienThi() {
        System.out.println(maSach + " - " + tenSach + " - " + tacGia);
    }
}