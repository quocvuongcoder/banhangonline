package HoQuocVuong_ITC;

public class XeMay_QV extends PhuongTien_QV {
    int CX;

    public XeMay_QV()
    {

    }
    public XeMay_QV(int CX)
    {
        this.CX = CX;
    }

    void Nhap()
    {
        super.Nhap();
        System.out.println("(Luu Y Cong Suat Quy Doi Qua Ma Luc. \n VD: 4 Ma Luc ==>4)");
        System.out.print("Cong Xuat Cua Xe: ");
        CX = kb.nextInt();
    }
    void Xuat()
    {
        super.Xuat();
        System.out.print(this.CX);
    }
}
