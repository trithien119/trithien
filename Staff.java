package XayDungMoHinhLop;

import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<StaffMember>();
    }

    public void addMember(StaffMember member) {
        staffList.add(member);
    }

    public void payday() {
        for (StaffMember member : staffList) {
            System.out.println(member.toString());
            System.out.println("Payment: " + member.pay());
            System.out.println("---------------------------------");
        }
    }
}