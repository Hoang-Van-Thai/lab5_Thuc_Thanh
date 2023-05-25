/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5thuchanh;

/**
 *
 * @author ADMIN
 */
public class PHONGMAYTINH extends PHONGHOC {
    private int soMayTinh;

    public PHONGMAYTINH() {
    }

    public PHONGMAYTINH(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public PHONGMAYTINH(int soMayTinh, String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }
    public boolean KTMayTinh(){
        if((getDienTich()/1.5)>=soMayTinh){
            return true;
        }
        return false;
    }
    public void xuatMT(){
                System.out.println("Ma Phong: "+getMaPhong()+" Day Nha: "+getDayNha()+" Dien Tich: "+getDienTich()+" So bong den: "+getSoBongDen()+" so may tinh: "+soMayTinh+"\n");

    }
    
    
}
