/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5thuchanh;

/**
 *
 * @author ADMIN
 */
public class PHONGLYTHUYET extends PHONGHOC{
    private int soMayChieu;

    public PHONGLYTHUYET() {
    }

    public PHONGLYTHUYET(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    public PHONGLYTHUYET(int soMayChieu, String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayChieu = soMayChieu;
    }

    public int getSoMayChieu() {
        return soMayChieu;
    }

    public void setSoMayChieu(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }
    public boolean KTMayChieu(){
        if(soMayChieu>=1){
            return true;
        }
        return false;
    }
    public void XuatPLT(){
        System.out.println("Ma Phong: "+getMaPhong()+" Day Nha: "+getDayNha()+" Dien Tich: "+getDienTich()+" So bong den: "+getSoBongDen()+" so may chieu: "+soMayChieu+"\n");
    }
}
