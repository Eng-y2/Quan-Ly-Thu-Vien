public class Main {
    public static void main(String[] args) {

        Book[] dsSach = {
            new Book("S01", "Java", "Nguyen Van A"),
            new Book("S02", "Python", "Tran Van B"),
            new Book("S03", "C++", "Le Van C")
        };

        String maCanTim = "S02";
        boolean timThay = false;

        for (Book sach : dsSach) {
            if (sach.getMaSach().equals(maCanTim)) {
                sach.hienThi();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }
    }
}