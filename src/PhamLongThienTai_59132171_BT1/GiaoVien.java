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
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;
    //Constuctor cac thuoc tinh giao vien
    public GiaoVien(String a, int b, String c, String d, String e, String f) {
        super(a, b, c, d);
        this.monDay = e;
        this.toBoMon = f;
    }
    //Cac ham setter and getter cua giao vien
    public void setThongTinGV(String g, String h)
    {
        this.monDay = g;
        this.toBoMon = h;
    }
    public String getMonDay()
    {
        return this.monDay;
    }
    public String getToBoMon()
    {
        return this.toBoMon;
    }
    //Ham hien thi thong tin giao vien ghi de len ham httt ben ca nhan
    @Override
    public void HienThiTT() {
        System.out.println("HO va ten: " + this.hoTen
        + "\nTuoi: " + this.tuoi + "\nDia chi: " + this.diaChi
        + "\nSo dien thoai: " + this.sdt + "\nMon day hoc: "
        + this.monDay + "\nTo bo mon: " + this.toBoMon);
    }
}
