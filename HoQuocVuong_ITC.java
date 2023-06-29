package HoQuocVuong_ITC;

import java.util.ArrayList;
import java.util.Scanner;

public class HoQuocVuong_ITC {
    ArrayList <PhuongTien_QV> arr_qv = new ArrayList <>();
    ArrayList <Oto_QV> arr_Oto = new ArrayList<>();
    Scanner kb = new Scanner (System.in);

    void ThemOto()
    {
        Oto_QV Oto = new Oto_QV();
        Oto.Nhap();
        arr_Oto.add(Oto);
    }
    void XuatOto ()
    {
        for (int i = 0; i < arr_Oto.size(); i++) {
            arr_Oto.get(i).Xuat();
        }
    }

    void TimKiem()
    {
        boolean flag = false;
        System.out.println("Nhap Hang Xe Ban Can Tim: ");
        String TimKiem =  kb.nextLine();
        for (int i = 0; i < arr_qv.size(); i++) {
            if (arr_qv.get(i).HangSX.equalsIgnoreCase(TimKiem))
            {
                arr_qv.get(i).Xuat();
            }
        }
        if (flag ==false)
        {
            System.out.println("Khong Tim Thay Hang Xe Nay!!!");
        }
    }

    void TBGiaBan()
    {
      double S =0;
      for (int i = 0; i < arr_Oto.size(); i++) {
        S+= arr_Oto.get(i).GiaBan;

      }
      System.out.println("Tong Trung Binh Gia Ban "+ (S/arr_Oto.size()));
    }
}
