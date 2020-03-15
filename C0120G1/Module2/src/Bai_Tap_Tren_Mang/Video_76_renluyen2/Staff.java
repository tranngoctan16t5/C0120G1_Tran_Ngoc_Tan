package Bai_Tap_Tren_Mang.Video_76_renluyen2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Staff {

    private ArrayList<StaffMember> list;

    public Staff() {
        list = new ArrayList<StaffMember>();
    }

    public ArrayList<StaffMember> getList() {
        return list;
    }

    public void setList(ArrayList<StaffMember> list) {
        this.list = list;
    }

    public void addStaffMember(StaffMember sm) {
        list.add(sm);
    }

    public void payDay() {
        for (StaffMember sm : list) {
            System.out.println(sm);
        }
    }
}
