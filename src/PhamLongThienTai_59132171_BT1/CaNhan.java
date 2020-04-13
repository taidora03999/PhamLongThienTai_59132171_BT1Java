/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhamLongThienTai_59132171_BT1;

/**
 *
 * @author HS
 */
public abstract class CaNhan {
    public String hoTen;
    public int tuoi;
    public String diaChi;
    public String sdt;
    //Constructor Cac thuoc tinh ca nhan
    public CaNhan(String a, int b, String c, String d)
    {
        this.hoTen = a;
        this.tuoi = b;
        this.diaChi = c;
        this.sdt = d;
    }
    //Cac ham setter and getter ca nhan
    public void setThongTinCN(String e, int f, String g, String h) 
    {
        this.hoTen = e;
        this.tuoi = f;
        this.diaChi = g;
        this.sdt = h;
    }
    public String getHoTen()
    {
        return this.hoTen;
    }
    public int getTuoi()
    {
        return this.tuoi;
    }
    public String getDiaChi()
    {
        return this.diaChi;
    }
    public String getSdt()
    {
        return this.sdt;
    }
    //Ham hien thi thong tin truu tuong
    public abstract void HienThiTT();
}
