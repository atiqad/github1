package Hospital;


import Admin.AdminBeans;
import Admin.Admin;
import Doctor.Doctor;
import Doctor.DoctorBeans;
import Patient.Patient;
import Patient.PatientBeans;
import java.util.Scanner;


public class Hospital {

    public static void menu(){
        System.out.println("Press 1 if you are a Doctor");
        System.out.println("Press 2 if you are a Patient");
        System.out.println("Press 3 if you are admin");
        System.out.println("Press 4 if you are a new Doctor");
        System.out.println("Press 5 if you are a new Patient");
        System.out.println("Press 0 to exit");
    }
    public static void submenu(){
        System.out.println("Press 1 to register yourself");
        System.out.println("Press 0 to go back");
    }

    public void login(String pa,String dr){
    Scanner sc = new Scanner(System.in);
    DoctorBeans db1= new DoctorBeans();
    Doctor d= new Doctor();
        Patient p= new Patient();
        System.out.println("Type username");
    db1.setDoctorUser(sc.nextLine());
        System.out.println("Type Password");
    db1.setDoctorPass(sc.nextLine());
        System.out.println("Type Doctor ID");
    db1.setDoctorId(sc.nextInt());
    if(db1.getDoctorUser().equals(db1.getDoctorInfo1()[1])&&db1.getDoctorPass().equals(db1.getPassword()[0])&&db1.getDoctorId()==db1.getD_Id()[0]||db1.getDoctorUser().equals(db1.getDoctorInfo2()[1])&&db1.getDoctorPass().equals(db1.getPassword()[1])&&db1.getDoctorId()==db1.getD_Id()[1]||db1.getDoctorUser().equals(db1.getDoctorInfo3()[1])&&db1.getDoctorPass().equals(db1.getPassword()[2])&&db1.getDoctorId()==db1.getD_Id()[2])
    {
        System.out.println("Login Successful");
        System.out.println();
        d.dispaly();
        System.out.println();
        System.out.println("List of Patients");
        System.out.println();
        p.dispaly();
    }
    }

    public void login(String pa){
        Doctor d= new Doctor();
        Scanner sc = new Scanner(System.in);
        PatientBeans pb1= new PatientBeans();
        Patient p= new Patient();
        System.out.println("Type username");
        pb1.setPatientUser(sc.nextLine());
        System.out.println("Type Password");
        pb1.setPatientPass(sc.nextLine());
        System.out.println("Type Patient ID");
        pb1.setPatientId(sc.nextInt());
        if(pb1.getPatientUser().equals(pb1.getPatientInfo1()[1])&&pb1.getPatientPass().equals(pb1.getPassword()[0])&&pb1.getPatientId()==pb1.getP_Id()[0]||pb1.getPatientUser().equals(pb1.getPatientInfo2()[1])&&pb1.getPatientPass().equals(pb1.getPassword()[1])&&pb1.getPatientId()==pb1.getP_Id()[1]||pb1.getPatientUser().equals(pb1.getPatientInfo3()[1])&&pb1.getPatientPass().equals(pb1.getPassword()[2])&&pb1.getPatientId()==pb1.getP_Id()[2])
        {
            System.out.println("Login Successful");
            System.out.println();
            p.dispaly();
            System.out.println();
            System.out.println("List of Doctors");
            System.out.println();
            d.patientDispaly();


        }


    }

    public void login(String pa,String dr,String ad){
        Scanner sc = new Scanner(System.in);
        AdminBeans ab1= new AdminBeans();
        Admin a= new Admin();
        System.out.println("Type username");
        ab1.setAdminUser(sc.nextLine());
        System.out.println("Type Password");
        ab1.setAdminPass(sc.nextLine());
        if(ab1.getAdminUser().equals(ab1.getAdminInfo1()[0])&&ab1.getAdminPass().equals(ab1.getPassword()[0])||ab1.getAdminUser().equals(ab1.getUsername()[0])&&ab1.getAdminPass().equals(ab1.getPassword()[0]))
        {
            System.out.println("Login Successful");
            a.dispaly();
        }


    }

    public void runProgram(){
        menu();
        int select;
        Scanner sc= new Scanner(System.in);
        select = sc.nextInt();
        do{
        if(select==1){
            login("Patient","Doctor");
            menu();
            select = sc.nextInt();
        }
        else if(select==2){
            login("Doctor");
            menu();
            select = sc.nextInt();
        }
        else if(select==3){
            login("patient","Doctor","Admin");
            menu();
            select = sc.nextInt();
        }
        else if(select==4) {
            submenu();
            int subselect;
            subselect = sc.nextInt();
            if(subselect==1){
            Doctor d =new Doctor();
            d.register();
                menu();
                select = sc.nextInt();
            }
            else {
                menu();
                select = sc.nextInt();
            }

        }
        else if (select==5){
            submenu();
            int subselect;
            subselect = sc.nextInt();
            if(subselect==1){
                Patient p =new Patient();
                p.register();
                menu();
                select = sc.nextInt();
            }
            else {
                menu();
                select = sc.nextInt();
            }
        }

        }while(select!=0);

    }

    public static void main(String[] args) {
    Hospital hs = new Hospital();
        Patient p1 = new Patient();
        p1.register();
    hs.runProgram();
    }


}
