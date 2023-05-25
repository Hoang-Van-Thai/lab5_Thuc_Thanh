/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5thuchanh;

/**
 *
 * @author ADMIN
 */
public class LAB5THUCHANH {

    public static void main(String[] args) {
        DANHSACHPHONGTN ds=new DANHSACHPHONGTN();
        PHONGLYTHUYET plt1=new PHONGLYTHUYET(0, "lt1", "d", 50, 10);
        PHONGMAYTINH pmt1=new PHONGMAYTINH(10, "mt1", "b", 40, 9);
        PHONGMAYTINH pmt2=new PHONGMAYTINH(70, "mt2", "b", 100, 19);
        PHONGTHINGHIEM ptn1=new PHONGTHINGHIEM("lap trinh", 10, 1, "tN1", "c", 70, 12);
        ds.Them(plt1);
        ds.Them(pmt1);
        ds.Them(ptn1);
        ds.Them(pmt2);
        ds.Xuat();
        ds.timKiem("mt1");
        ds.xuatPhongChuan();
        ds.XuatTheoDay();
        ds.XuatTheoS();
        ds.XuatTheoBD();
        ds.CapNhatSoMayTinh("mt1", 50);
        ds.Xuat();
        ds.XoaPhongTheoMa("mt1");
        ds.Xuat();
        ds.InTongSoPhong(); 
        ds.InPhongCoSoMayLonHonHoacBang60();
    }
}
