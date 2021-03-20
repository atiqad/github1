package Admin;

import Doctor.Doctor;
import Patient.Patient;
import Hospital.Persons;

public class Admin extends Persons {


    @Override
    public void dispaly() {
        AdminBeans ab1 = new AdminBeans();
        Doctor d1 = new Doctor();
        Patient p1 = new Patient();
        System.out.println("Name:  " + ab1.getAdminInfo1()[0] + " | Phone Number:  " + ab1.getAdminInfo1()[1] + " | E-mail Address:  " + ab1.getAdminInfo1()[2] + " | Address:  " + ab1.getAdminInfo1()[3]);
        System.out.println();
        d1.adminDisplay();
        System.out.println();
        p1.adminDisplay();

    }
}
