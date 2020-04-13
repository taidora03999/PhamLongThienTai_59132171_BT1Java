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

import PhamLongThienTai_59132171_BT1.IQLDS;
import java.util.ArrayList;

public class LopHoc {
    public GiaoVien gvCN;
    public ArrayList<CaNhan> dsHS;
    public ArrayList<CaNhan> dsGVGD;
    public IQLDS qlDSHS;
    public IQLDS qlDSGVGD;
    //constructor
    public LopHoc(GiaoVien a)
    {
        this.gvCN = a;
        this.dsHS = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDSHS = new QLDS(dsHS);
        this.qlDSGVGD = new QLDS(dsGVGD);
    }
    //Cac ham setter and getter
    public void setGVCN(GiaoVien b)
    {
        this.gvCN = b;
    }
    public GiaoVien getGVCN()
    {
        return this.gvCN;
    }
    //Cac phuong thuc
    public int themHocSinh(HocSinh c)
    {
        if(qlDSHS.them(c) == 1)
            return 1;
        else
            return 0;
    }
    public int themGVHD(GiaoVien d)
    {
        if(qlDSGVGD.them(d) == 1)
            return 1;
        else
            return 0;
    }
    public int inDSHS()
    {
        System.out.println("Danh sach hoc sinh:\n");
        qlDSHS.inDS();
        return 1;
    }
    public int inDSGVGD()
    {
        System.out.println("Danh sach cac giao vien giang day: \n");
        qlDSGVGD.inDS();
        return 1;
    }
}
