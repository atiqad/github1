package Patient;
import Doctor.DoctorBeans;
import Hospital.Persons;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Patient extends Persons {
    private String problem;
    public void register() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name");
            String name = sc.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Shoaib6");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Shoaib6"));
            fileimput.write(name);
            String line = sc.nextLine();
            fileimput.close();


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sd = new Scanner(System.in);
            System.out.println("Enter your problem");
            String problem=sd.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Patient.txt");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Patient.txt"));
            fileimput.write(problem);
            fileimput.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sd = new Scanner(System.in);
            System.out.println("Enter Your available timings");
            String timing=sd.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Patient.txt");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Patient.txt"));
            fileimput.write(timing);
            fileimput.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sd = new Scanner(System.in);
            System.out.println("Enter Your available days");
            String days=sd.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Patient.txt");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Patient.txt"));
            fileimput.write(days);
            fileimput.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sd = new Scanner(System.in);
            System.out.println("Enter Your Mobile number");
            String phoneNo=sd.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Patient.txt");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Patient.txt"));
            fileimput.write(phoneNo);
            fileimput.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sd = new Scanner(System.in);
            System.out.println("Enter Your email Address");
            String emailAddress=sd.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Patient.txt");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Patient.txt"));
            fileimput.write(emailAddress);
            fileimput.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            Scanner sd = new Scanner(System.in);
            System.out.println("Enter Your address");
            String address=sd.nextLine();
            FileWriter file = new FileWriter("E:\\Documents\\Patient.txt");
            BufferedWriter fileimput = new BufferedWriter(file);
            Scanner input = new Scanner(new File("E:\\Documents\\Patient.txt"));
            fileimput.write(address);
            fileimput.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        PatientBeans pb1 = new PatientBeans();
        pb1.setPatientName(getName());
        pb1.setPatientProblem(problem);
        pb1.setPatientTiming(getTiming());
        pb1.setPateintDays(getDays());
        pb1.setPatientPhoneNo(getPhoneNo());
        pb1.setEmailAddress(getEmailAddress());
        pb1.setPatientAddress(getAddress());
        System.out.println("Name:  " + pb1.getPatientName() + " | problem:  " + pb1.getPatientProblem() + " | Timings:  " + pb1.getPatientTiming() + " | Days:  " + pb1.getPateintDays() + " | Phone Number:  " + pb1.getPatientPhoneNo() + " | E-mail Address:  " + pb1.getEmailAddress() + " | Address:  " + pb1.getPatientAddress());
        System.out.println("You are succesfully registered we will get back to you when our system will verify you Thank you");
    }

    public void adminDisplay(){

        PatientBeans pb1= new PatientBeans();
            System.out.println("Patient ID:  " + pb1.getPatientInfo1()[0] + " | Name:  " + pb1.getPatientInfo1()[1] + " | Problem:  " + pb1.getPatientInfo1()[2] + " | Timings:  " + pb1.getPatientInfo1()[3] + " | Days:  " + pb1.getPatientInfo1()[4] + " | Phone Number:  " + pb1.getPatientInfo1()[5] + " | E-mail Address:  " + pb1.getPatientInfo1()[6] + " | Address:  " + pb1.getPatientInfo1()[7]);
            System.out.println();
            System.out.println("Patient ID:  " + pb1.getPatientInfo2()[0] + " | Name:  " + pb1.getPatientInfo2()[1] + " | Problem:  " + pb1.getPatientInfo2()[2] + " | Timings:  " + pb1.getPatientInfo2()[3] + " | Days:  " + pb1.getPatientInfo2()[4] + " | Phone Number:  " + pb1.getPatientInfo2()[5] + " | E-mail Address:  " + pb1.getPatientInfo2()[6] + " | Address:  " + pb1.getPatientInfo2()[7]);
            System.out.println();
            System.out.println("Patient ID:  " + pb1.getPatientInfo3()[0] + " | Name:  " + pb1.getPatientInfo3()[1] + " | Problem:  " + pb1.getPatientInfo3()[2] + " | Timings:  " + pb1.getPatientInfo3()[3] + " | Days:  " + pb1.getPatientInfo3()[4] + " | Phone Number:  " + pb1.getPatientInfo3()[5] + " | E-mail Address:  " + pb1.getPatientInfo3()[6] + " | Address:  " + pb1.getPatientInfo3()[7]);

    }

    @Override
    public void dispaly() {
        PatientBeans pb1= new PatientBeans();
        if(pb1.getP_Id()[0]==01){
            System.out.println("Patient ID:  " + pb1.getPatientInfo1()[0] + " | Name:  " + pb1.getPatientInfo1()[1] + " | Problem:  " + pb1.getPatientInfo1()[2] + " | Timings:  " + pb1.getPatientInfo1()[3] + " | Days:  " + pb1.getPatientInfo1()[4] + " | Phone Number:  " + pb1.getPatientInfo1()[5] + " | E-mail Address:  " + pb1.getPatientInfo1()[6] + " | Address:  " + pb1.getPatientInfo1()[7]);
        }
        else if(pb1.getP_Id()[1]==02){
            System.out.println("Patient ID:  " + pb1.getPatientInfo2()[0] + " | Name:  " + pb1.getPatientInfo2()[1] + " | Problem:  " + pb1.getPatientInfo2()[2] + " | Timings:  " + pb1.getPatientInfo2()[3] + " | Days:  " + pb1.getPatientInfo2()[4] + " | Phone Number:  " + pb1.getPatientInfo2()[5] + " | E-mail Address:  " + pb1.getPatientInfo2()[6] + " | Address:  " + pb1.getPatientInfo2()[7]);
        }
        else if(pb1.getP_Id()[2]==03){
            System.out.println("Patient ID:  " + pb1.getPatientInfo3()[0] + " | Name:  " + pb1.getPatientInfo3()[1] + " | Problem:  " + pb1.getPatientInfo3()[2] + " | Timings:  " + pb1.getPatientInfo3()[3] + " | Days:  " + pb1.getPatientInfo3()[4] + " | Phone Number:  " + pb1.getPatientInfo3()[5] + " | E-mail Address:  " + pb1.getPatientInfo3()[6] + " | Address:  " + pb1.getPatientInfo3()[7]);
        }
        else{
            System.out.println("No patient is available with this patient id");
        }

    }
}

