package HoQuocVuong_ITC;

public class Oto_QV extends PhuongTien_QV {
    int SoGhe;
    String DongCo;
    
    public Oto_QV()
    {

    }
    public Oto_QV (int SoGhe, String DongCo)
    {
        this.SoGhe = SoGhe;
        this.DongCo =  DongCo;
    }

    void Nhap()
    {
        super.Nhap();
        System.out.print("So Ghe Cua Xe: ");
        SoGhe = kb.nextInt();
        System.out.print("Kieu Dong Co: ");
        kb.nextLine();
        DongCo = kb.nextLine();
    }

    void Xuat()
    {
        super.Xuat();
        System.out.print(this.SoGhe+"--"+this.DongCo);
    }
}
