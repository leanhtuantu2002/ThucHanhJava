package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru() {
        ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("chieuCao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = theTich * chieuCao;
    }


}
