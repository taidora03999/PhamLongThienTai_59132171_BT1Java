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

public class QLDS implements IQLDS{
    public ArrayList<CaNhan> dsCN = new ArrayList<>();
    //Constructor dnah sach ca nhan
    QLDS(ArrayList<CaNhan> a) {
        this.dsCN = a;
    }
    //Cac ham ghi de en giao dien IQLDS
    @Override
    public int them(CaNhan p) 
    {
        dsCN.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) 
    {
        if(dsCN.removeIf(p -> p.hoTen.equals(ten)))
            return 1;
        else
            return 0;
    }

    @Override
    public void inDS() 
    {
        for(int i=0; i< dsCN.size(); i++)
            dsCN.get(i).HienThiTT();
    }
}
