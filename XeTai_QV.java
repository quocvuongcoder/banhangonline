package HoQuocVuong_ITC;

public class XeTai_QV extends PhuongTien_QV {
    double TrongTai;

    public XeTai_QV()
    {
        
    }
    public XeTai_QV(double TrongTai)
    {
      this.TrongTai = TrongTai;
    }

    void Nhap()
    {
        super.Nhap();
        System.out.print ("Trong Tai Cua Xe: ");
        TrongTai = kb.nextInt();
    }

    void Xuat()
    {
        super.Xuat();
        System.out.print (this.TrongTai);

    }
}
