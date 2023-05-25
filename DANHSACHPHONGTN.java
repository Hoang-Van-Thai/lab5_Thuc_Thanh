/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DANHSACHPHONGTN {
    private List<Object> ds;
    public DANHSACHPHONGTN(){
        ds=new ArrayList<>();
    }

    public void Them(Object phongHoc){
        
        if(phongHoc instanceof PHONGLYTHUYET){
            ds.add((PHONGLYTHUYET)phongHoc);
        }
        else if(phongHoc instanceof PHONGMAYTINH){
            ds.add((PHONGMAYTINH)phongHoc);
        }
        else if(phongHoc instanceof PHONGTHINGHIEM){
            ds.add((PHONGTHINGHIEM)phongHoc);
        }
    }
    public void Xuat(){
        for(Object phongHoc : ds){
            if(phongHoc instanceof PHONGLYTHUYET){
                ((PHONGLYTHUYET) phongHoc).XuatPLT();
            }
            else if(phongHoc instanceof PHONGMAYTINH)
            {
                 ((PHONGMAYTINH) phongHoc).xuatMT();
            }
            else if(phongHoc instanceof PHONGTHINGHIEM)
            {
                 ((PHONGTHINGHIEM) phongHoc).xuatTN();
            }

        }
    }
    public void timKiem(String ma){
        System.out.println("thong tin phong co ma "+ma+"\n");
        for(Object phongHoc : ds){
            if(phongHoc instanceof PHONGLYTHUYET){
                if(((PHONGLYTHUYET) phongHoc).getMaPhong().equalsIgnoreCase(ma)){
                    ((PHONGLYTHUYET) phongHoc).XuatPLT();
                }
            }
            else if(phongHoc instanceof PHONGMAYTINH)
            {
                 if(((PHONGMAYTINH) phongHoc).getMaPhong().equalsIgnoreCase(ma)){
                    ((PHONGMAYTINH) phongHoc).xuatMT();
                }
            }
            else if(phongHoc instanceof PHONGTHINGHIEM)
            {
                  if(((PHONGTHINGHIEM) phongHoc).getMaPhong().equalsIgnoreCase(ma)){
                    ((PHONGTHINGHIEM) phongHoc).xuatTN();
                }
            }
        }
    }
    public void xuatPhongChuan(){
        System.out.println("Danh sach cac phong dat chuan \n");
        for(Object phongHoc : ds){
            if(phongHoc instanceof PHONGLYTHUYET){
                if(((PHONGLYTHUYET) phongHoc).KTMayChieu()==true){
                    ((PHONGLYTHUYET) phongHoc).XuatPLT();
                }
            }
            else if(phongHoc instanceof PHONGMAYTINH)
            {
                if( ((PHONGMAYTINH) phongHoc).KTMayTinh()==true){
                    ((PHONGMAYTINH) phongHoc).xuatMT();
                }
                 
            }
            else if(phongHoc instanceof PHONGTHINGHIEM)
            {
                if(((PHONGTHINGHIEM) phongHoc).KTThiNghiem()==true){
                 ((PHONGTHINGHIEM) phongHoc).xuatTN();
                }
            }

        }
    }


public void XuatTheoDay() {
    Collections.sort(ds, new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            String dayNha1 = "";
            String dayNha2 = "";

            if (o1 instanceof PHONGLYTHUYET) {
                dayNha1 = ((PHONGLYTHUYET) o1).getDayNha();
            } else if (o1 instanceof PHONGMAYTINH) {
                dayNha1 = ((PHONGMAYTINH) o1).getDayNha();
            } else if (o1 instanceof PHONGTHINGHIEM) {
                dayNha1 = ((PHONGTHINGHIEM) o1).getDayNha();
            }

            if (o2 instanceof PHONGLYTHUYET) {
                dayNha2 = ((PHONGLYTHUYET) o2).getDayNha();
            } else if (o2 instanceof PHONGMAYTINH) {
                dayNha2 = ((PHONGMAYTINH) o2).getDayNha();
            } else if (o2 instanceof PHONGTHINGHIEM) {
                dayNha2 = ((PHONGTHINGHIEM) o2).getDayNha();
            }

            return dayNha1.compareTo(dayNha2);
        }
    });

    System.out.println("Thong tin danh sach tang theo day nha");
    for (Object phongHoc : ds) {
        if (phongHoc instanceof PHONGLYTHUYET) {
            ((PHONGLYTHUYET) phongHoc).XuatPLT();
        } else if (phongHoc instanceof PHONGMAYTINH) {
            ((PHONGMAYTINH) phongHoc).xuatMT();
        } else if (phongHoc instanceof PHONGTHINGHIEM) {
            ((PHONGTHINGHIEM) phongHoc).xuatTN();
        }
    }
}

public void XuatTheoS() {

    Collections.sort(ds, new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            double dienTich1 = 0;
            double dienTich2 = 0;

            if (o1 instanceof PHONGLYTHUYET) {
                dienTich1 = ((PHONGLYTHUYET) o1).getDienTich();
            } else if (o1 instanceof PHONGMAYTINH) {
                dienTich1 = ((PHONGMAYTINH) o1).getDienTich();
            } else if (o1 instanceof PHONGTHINGHIEM) {
                dienTich1 = ((PHONGTHINGHIEM) o1).getDienTich();
            }

            if (o2 instanceof PHONGLYTHUYET) {
                dienTich2 = ((PHONGLYTHUYET) o2).getDienTich();
            } else if (o2 instanceof PHONGMAYTINH) {
                dienTich2 = ((PHONGMAYTINH) o2).getDienTich();
            } else if (o2 instanceof PHONGTHINGHIEM) {
                dienTich2 = ((PHONGTHINGHIEM) o2).getDienTich();
            }

            if (dienTich1 < dienTich2) {
                return 1;
            } else if (dienTich1 > dienTich2) {
                return -1;
            }
            return 0;
        }
    });

    System.out.println("Thong tin danh sach giam dan theo dien tich");
    for (Object phongHoc : ds) {
        if (phongHoc instanceof PHONGLYTHUYET) {
            ((PHONGLYTHUYET) phongHoc).XuatPLT();
        } else if (phongHoc instanceof PHONGMAYTINH) {
            ((PHONGMAYTINH) phongHoc).xuatMT();
        } else if (phongHoc instanceof PHONGTHINGHIEM) {
            ((PHONGTHINGHIEM) phongHoc).xuatTN();
        }
    }
}
public void XuatTheoBD() {
    Collections.sort(ds, new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            int soBongDen1 = 0;
            int soBongDen2 = 0;

            if (o1 instanceof PHONGLYTHUYET) {
                soBongDen1 = ((PHONGLYTHUYET) o1).getSoBongDen();
            } else if (o1 instanceof PHONGMAYTINH) {
                soBongDen1 = ((PHONGMAYTINH) o1).getSoBongDen();
            } else if (o1 instanceof PHONGTHINGHIEM) {
                soBongDen1 = ((PHONGTHINGHIEM) o1).getSoBongDen();
            }

            if (o2 instanceof PHONGLYTHUYET) {
                soBongDen2 = ((PHONGLYTHUYET) o2).getSoBongDen();
            } else if (o2 instanceof PHONGMAYTINH) {
                soBongDen2 = ((PHONGMAYTINH) o2).getSoBongDen();
            } else if (o2 instanceof PHONGTHINGHIEM) {
                soBongDen2 = ((PHONGTHINGHIEM) o2).getSoBongDen();
            }

            return Integer.compare(soBongDen1, soBongDen2);
        }
    });
System.out.println("Thong tin danh sach  tang theo so bong den");
    for (Object phongHoc : ds) {
        if (phongHoc instanceof PHONGLYTHUYET) {
            ((PHONGLYTHUYET) phongHoc).XuatPLT();
        } else if (phongHoc instanceof PHONGMAYTINH) {
            ((PHONGMAYTINH) phongHoc).xuatMT();
        } else if (phongHoc instanceof PHONGTHINGHIEM) {
            ((PHONGTHINGHIEM) phongHoc).xuatTN();
        }
    }
}
public void XoaPhongTheoMa(String maPhong) {
    for (Object phongHoc : ds) {
        if (phongHoc instanceof PHONGLYTHUYET && ((PHONGLYTHUYET) phongHoc).getMaPhong().equals(maPhong)) {
            ds.remove(phongHoc);
            System.out.println("Phong  co ma phong " + maPhong + " da duoc xoa.");
            return;
        } else if (phongHoc instanceof PHONGMAYTINH && ((PHONGMAYTINH) phongHoc).getMaPhong().equals(maPhong)) {
            ds.remove(phongHoc);
            System.out.println("Phong  co ma phong " + maPhong + " da duoc xoa.");
            return;
        } else if (phongHoc instanceof PHONGTHINGHIEM && ((PHONGTHINGHIEM) phongHoc).getMaPhong().equals(maPhong)) {
            ds.remove(phongHoc);
            System.out.println("Phong  co ma phong " + maPhong + " da duoc xoa.");
            return;
        }
    }

    System.out.println("khong tim thay ma phong " + maPhong + ".");
}
public void InTongSoPhong() {
    int tongSoPhong = ds.size();
    System.out.println("tong so phong co trong danh sach: " + tongSoPhong);
}

public void InPhongCoSoMayLonHonHoacBang60() {
    System.out.println("các phong co so may tinh tren 60\n");
    for (Object phongHoc : ds) {
        if (phongHoc instanceof PHONGMAYTINH && ((PHONGMAYTINH) phongHoc).getSoMayTinh()>= 60) {
            ((PHONGMAYTINH) phongHoc).xuatMT();
        } 
    }
}
public void CapNhatSoMayTinh(String maPhong, int soMayMoi) {
    for (Object phongHoc : ds) {
        if (phongHoc instanceof PHONGMAYTINH && ((PHONGMAYTINH) phongHoc).getMaPhong().equals(maPhong)) {
            ((PHONGMAYTINH) phongHoc).setSoMayTinh(soMayMoi);
            System.out.println("so may tinh cua phong " + maPhong + " da duoc cap nhat thanh " + soMayMoi + ".");
            return;
        } 
        
    }

    System.out.println("Khong tim duoc ma phong " + maPhong + ".");
}


 }
