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

import PhamLongThienTai_59132171_BT1.HocSinh;
import PhamLongThienTai_59132171_BT1.GiaoVien;
import PhamLongThienTai_59132171_BT1.LopHoc;

public class MainBT1 {
    public static void main(String[] args) {
        HocSinh sv1 = new HocSinh("Nguyen To",19,"10/7 TB","0705596275","G6-203","Hat");
        HocSinh sv2 = new HocSinh("Tran Tai",20,"30/3 Cu Chi","012356421","G3-202","Ngu");
        
        GiaoVien gv1 = new GiaoVien("Pham Hoa",44,"33/3 HH","0978356743","KTLT","CNTT");
        GiaoVien gv2 = new GiaoVien("Nguyen Thanh",43,"77/2 NDC","0879653421","LTW","CNTT");
        
        GiaoVien GVCN = new GiaoVien("Pham Huong",37,"30/4 2/4","0876589456","VL","DDT");
        //Them cac sinh vien va giao vien
        LopHoc l = new LopHoc(GVCN);
        l.themHocSinh(sv1);
        l.themHocSinh(sv2);
        l.themGVHD(gv1);
        l.themGVHD(gv2);    
        //In danh sach sinh vien va giao vien 
        System.out.println("Giao Vien chu nhiem: \n");
        GVCN.HienThiTT();
        l.inDSHS();
        l.inDSGVGD();
    }
    
}
