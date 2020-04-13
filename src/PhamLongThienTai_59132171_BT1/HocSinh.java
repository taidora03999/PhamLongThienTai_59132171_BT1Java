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
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;
    //COnstructor cac thuoc tinh cua hs
    public HocSinh(String a, int b, String c, String d, String e, String f) {
        super(a, b, c, d);
        this.lop = e;
        this.nangKhieu = f;
    }

    //Cac ham setter and getter hs
    public void setThongTinHS(String g, String h)
    {
        this.lop = g;
        this.nangKhieu = h;
    }
    public String getLop()
    {
        return this.lop;
    }
    public String getNangKhieu()
    {
        return this.nangKhieu;
    }
    //Ham hien thi thong tin hs ghi de ham httt ben ca nhan
    @Override
    public void HienThiTT() {
        System.out.println("HO va ten: " + this.hoTen
        + "\nTuoi: " + this.tuoi + "\nDia chi: " + this.diaChi
        + "\nSo dien thoai: " + this.sdt + "\nLop : "
        + this.lop + "\nNang khieu: " + this.nangKhieu);
    }
}
