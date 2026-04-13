package bai1;

public class Main {
    public static void main(String[] args) {
        System.out.println("From 12 AM - 8 AM");
        DanOng danOng1 = new DanOng();
        danOng1.setName("Thanh nien nghiem tuc");
        danOng1.setVaiTro(new NguoiChong());
        System.out.println(danOng1);

        System.out.println("From 9 AM - 5 PM");
        danOng1.setVaiTro(new NguoiNhanVien());
        System.out.println(danOng1);

        System.out.println("FROM 6 PM - 8 PM");
        danOng1.setVaiTro(new NguoiBan());
        System.out.println(danOng1);

    }
}
