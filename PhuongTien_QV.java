package HoQuocVuong_ITC;

import java.util.Scanner;

import javax.xml.transform.Source;

public class PhuongTien_QV {
    String MaSo, HangSX, Mau;
    int Nam;
    double GiaBan;
    Scanner kb = new Scanner (System.in);

    public PhuongTien_QV()
    {

    }
    public PhuongTien_QV(String MaSo, String HangSX, String Mau, int Nam, double GiaBan)
    {
        this.MaSo = MaSo;
        this.HangSX =  HangSX;
        this.Mau = Mau;
        this.Nam = Nam;
        this.GiaBan =GiaBan;
    }

    void Nhap()
    {
      System.out.println("--Nhap Thong Tin Phuong Tien--");
      System.out.print("Ma So Xe: ");
      MaSo =kb.nextLine();
      System.out.print("Hang Xe: ");
      HangSX = kb.nextLine();
      System.out.print("Mau Sac: ");
      Mau = kb.nextLine();
      System.out.print("Nam San Xuat: ");
      Nam = kb.nextInt();
      System.out.print("Gia Ban Cua Xe: ");
      GiaBan = kb.nextDouble();
    }

    void Xuat()
    {
        System.out.println("\n--Xuat Thong Cua Phuong Tien--");
        System.out.print(this.MaSo+"--"+this.HangSX+"--"+this.Mau+"--"+this.Nam+"--"+this.GiaBan+"--");
    }
}
