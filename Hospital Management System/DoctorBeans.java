package Doctor;

public class DoctorBeans {

        private String doctorName;
        private String doctorSpeciality;
        private String doctorTiming;
        private String doctorDays;
        private String doctorPhoneNo;
        private String emailAddress;
        private String doctorAddress;
        private String doctorUser;
        private String doctorPass;

    private int doctorId;

    private String[] drSpeciality={"Heart","Kidney","General Physician"};
    private Object[] doctorInfo1={01,"Rida",drSpeciality[0], "5-8","Monday - Wednesday","0312-2564789","rida.mohsin@goodhealth.com","DHA phase 2 Street 3 house No.4"};
    private Object[] doctorInfo2={02,"Nida",drSpeciality[1], "5-8","Monday - Wednesday","0312-2564789","nida.shaadmaan@goodhealth.com","DHA phase 2 Street 3 house No.4"};
    private Object[] doctorInfo3={03,"Daniyal",drSpeciality[2], "5-8","Monday - Wednesday","0312-2564789","daniyal.samad@goodhealth.com","DHA phase 2 Street 3 house No.4"};
    private String[] Password={"123456","321654","987654"};
    private String[] username={(String)doctorInfo1[1],(String)doctorInfo2[1],(String)doctorInfo3[1]};
    private int[] d_Id={(int)doctorInfo1[0],(int)doctorInfo2[0],(int)doctorInfo3[0]};

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getDoctorTiming() {
        return doctorTiming;
    }

    public void setDoctorTiming(String doctorTiming) {
        this.doctorTiming = doctorTiming;
    }

    public String getDoctorDays() {
        return doctorDays;
    }

    public void setDoctorDays(String doctorDays) {
        this.doctorDays = doctorDays;
    }

    public String getDoctorPhoneNo() {
        return doctorPhoneNo;
    }

    public void setDoctorPhoneNo(String doctorPhoneNo) {
        this.doctorPhoneNo = doctorPhoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorUser() {
        return doctorUser;
    }

    public void setDoctorUser(String doctorUser) {
        this.doctorUser = doctorUser;
    }

    public String getDoctorPass() {
        return doctorPass;
    }

    public void setDoctorPass(String doctorPass) {
        this.doctorPass = doctorPass;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Object[] getDoctorInfo1() {
        return doctorInfo1;
    }

    public Object[] getDoctorInfo2() {
        return doctorInfo2;
    }

    public Object[] getDoctorInfo3() {
        return doctorInfo3;
    }

    public String[] getPassword() {
        return Password;
    }

    public String[] getUsername() {
        return username;
    }

    public int[] getD_Id() {
        return d_Id;
    }

    public String[] getDrSpeciality() {
        return drSpeciality;
    }
}
