/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5thuchanh;

/**
 *
 * @author ADMIN
 */
public class PHONGTHINGHIEM extends PHONGHOC {
    private String chuyenNganh;
    private int sucChua;
    private int bonRua;

    public PHONGTHINGHIEM() {
    }

    public PHONGTHINGHIEM(String chuyenNganh, int sucChua, int bonRua) {
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public PHONGTHINGHIEM(String chuyenNganh, int sucChua, int bonRua, String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public int getBonRua() {
        return bonRua;
    }

    public void setBonRua(int bonRua) {
        this.bonRua = bonRua;
    }
    public boolean KTThiNghiem(){
        if(bonRua>=1){
            return true;
        }
        return false;
    }
    public void xuatTN(){
                        System.out.println("Ma Phong: "+getMaPhong()+" Day Nha: "+getDayNha()+" Dien Tich: "+getDienTich()+" So bong den: "+getSoBongDen()+" Chuyen nganh: "+chuyenNganh+" Suc chua: "+sucChua+" So Bon rua: "+bonRua+"\n");

    }
    
}
