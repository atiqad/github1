package Doctor;
import Patient.PatientBeans;
import Hospital.Persons;

import java.util.Scanner;

public class Doctor extends Persons {

    private String speciality;



    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        setName(sc.nextLine());
        System.out.println("Enter your speciality");
        speciality = sc.nextLine();
        System.out.println("Enter Your available timings");
        setTiming(sc.nextLine()) ;
        System.out.println("Enter Your available days");
        setDays(sc.nextLine());
        System.out.println("Enter Your Mobile number");
        setPhoneNo(sc.nextLine());
        System.out.println("Enter Your email Address");
        setEmailAddress(sc.nextLine());
        System.out.println("Enter Your address");
        setAddress(sc.nextLine());

        DoctorBeans db1 = new DoctorBeans();
        db1.setDoctorName(getName());
        db1.setDoctorSpeciality(speciality);
        db1.setDoctorTiming(getTiming());
        db1.setDoctorDays(getDays());
        db1.setDoctorPhoneNo(getPhoneNo());
        db1.setEmailAddress(getEmailAddress());
        db1.setDoctorAddress(getAddress());
        System.out.println("Name:  " + db1.getDoctorName() + " | Speciality:  " + db1.getDoctorSpeciality() + " | Timings:  " + db1.getDoctorTiming() + " | Days:  " + db1.getDoctorDays() + " | Phone Number:  " + db1.getDoctorPhoneNo() + " | E-mail Address:  " + db1.getEmailAddress() + " | Address:  " + db1.getDoctorAddress());
        System.out.println("You are succesfully registered we will get back to you when our system will verify you Thank you");
    }

    public void adminDisplay(){
        DoctorBeans db1= new DoctorBeans();

            System.out.println("Doctor ID:  " + db1.getDoctorInfo1()[0] + " | Name:  " + db1.getDoctorInfo1()[1] + " | Speciality:  " + db1.getDoctorInfo1()[2] + " | Timings:  " + db1.getDoctorInfo1()[3] + " | Days:  " + db1.getDoctorInfo1()[4] + " | Phone Number:  " + db1.getDoctorInfo1()[5] + " | E-mail Address:  " + db1.getDoctorInfo1()[6] + " | Address:  " + db1.getDoctorInfo1()[7]);
            System.out.println();
            System.out.println("Doctor ID:  " + db1.getDoctorInfo2()[0] + " | Name:  " + db1.getDoctorInfo2()[1] + " | Speciality:  " + db1.getDoctorInfo2()[2] + " | Timings:  " + db1.getDoctorInfo2()[3] + " | Days:  " + db1.getDoctorInfo2()[4] + " | Phone Number:  " + db1.getDoctorInfo2()[5] + " | E-mail Address:  " + db1.getDoctorInfo2()[6] + " | Address:  " + db1.getDoctorInfo2()[7]);
            System.out.println();
            System.out.println("Doctor ID:  " + db1.getDoctorInfo3()[0] + " | Name:  " + db1.getDoctorInfo3()[1] + " | Speciality:  " + db1.getDoctorInfo3()[2] + " | Timings:  " + db1.getDoctorInfo3()[3] + " | Days:  " + db1.getDoctorInfo3()[4] + " | Phone Number:  " + db1.getDoctorInfo3()[5] + " | E-mail Address:  " + db1.getDoctorInfo3()[6] + " | Address:  " + db1.getDoctorInfo3()[7]);
    }

    @Override
    public void dispaly() {
        DoctorBeans db1= new DoctorBeans();
        if(db1.getD_Id()[0]==01){
            System.out.println("Doctor ID:  " + db1.getDoctorInfo1()[0] + " | Name:  " + db1.getDoctorInfo1()[1] + " | Speciality:  " + db1.getDoctorInfo1()[2] + " | Timings:  " + db1.getDoctorInfo1()[3] + " | Days:  " + db1.getDoctorInfo1()[4] + " | Phone Number:  " + db1.getDoctorInfo1()[5] + " | E-mail Address:  " + db1.getDoctorInfo1()[6] + " | Address:  " + db1.getDoctorInfo1()[7]);
        }
        else if(db1.getD_Id()[1]==02){
            System.out.println("Doctor ID:  " + db1.getDoctorInfo2()[0] + " | Name:  " + db1.getDoctorInfo2()[1] + " | Speciality:  " + db1.getDoctorInfo2()[2] + " | Timings:  " + db1.getDoctorInfo2()[3] + " | Days:  " + db1.getDoctorInfo2()[4] + " | Phone Number:  " + db1.getDoctorInfo2()[5] + " | E-mail Address:  " + db1.getDoctorInfo2()[6] + " | Address:  " + db1.getDoctorInfo2()[7]);
        }
        else if(db1.getD_Id()[2]==03){
            System.out.println("Doctor ID:  " + db1.getDoctorInfo3()[0] + " | Name:  " + db1.getDoctorInfo3()[1] + " | Speciality:  " + db1.getDoctorInfo3()[2] + " | Timings:  " + db1.getDoctorInfo3()[3] + " | Days:  " + db1.getDoctorInfo3()[4] + " | Phone Number:  " + db1.getDoctorInfo3()[5] + " | E-mail Address:  " + db1.getDoctorInfo3()[6] + " | Address:  " + db1.getDoctorInfo3()[7]);
        }
        else{
            System.out.println("No doctor is available with this doctor id");
        }
    }
    public void patientDispaly() {
        DoctorBeans db1= new DoctorBeans();
        if(db1.getD_Id()[0]==01){
            System.out.println("Doctor ID:  " + db1.getDoctorInfo1()[0] + " | Name:  " + db1.getDoctorInfo1()[1] + " | Speciality:  " + db1.getDoctorInfo1()[2] + " | Timings:  " + db1.getDoctorInfo1()[3] + " | Days:  " + db1.getDoctorInfo1()[4] + " | Phone Number:  " + db1.getDoctorInfo1()[5] + " | E-mail Address:  " + db1.getDoctorInfo1()[6] + " | Address:  " + db1.getDoctorInfo1()[7]);
        }
        else if(db1.getD_Id()[1]==02){
            System.out.println("Doctor ID:  " + db1.getDoctorInfo2()[0] + " | Name:  " + db1.getDoctorInfo2()[1] + " | Speciality:  " + db1.getDoctorInfo2()[2] + " | Timings:  " + db1.getDoctorInfo2()[3] + " | Days:  " + db1.getDoctorInfo2()[4] + " | Phone Number:  " + db1.getDoctorInfo2()[5] + " | E-mail Address:  " + db1.getDoctorInfo2()[6] + " | Address:  " + db1.getDoctorInfo2()[7]);
        }
        else if(db1.getD_Id()[2]==03){
            System.out.println("Doctor ID:  " + db1.getDoctorInfo3()[0] + " | Name:  " + db1.getDoctorInfo3()[1] + " | Speciality:  " + db1.getDoctorInfo3()[2] + " | Timings:  " + db1.getDoctorInfo3()[3] + " | Days:  " + db1.getDoctorInfo3()[4] + " | Phone Number:  " + db1.getDoctorInfo3()[5] + " | E-mail Address:  " + db1.getDoctorInfo3()[6] + " | Address:  " + db1.getDoctorInfo3()[7]);
        }
        else{
            System.out.println("No doctor is available with this doct3or id");
        }}    }

