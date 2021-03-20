package Patient;

public class PatientBeans {

    private String patientName;
    private String patientProblem;
    private String patientTiming;
    private String pateintDays;
    private String patientPhoneNo;
    private String emailAddress;
    private String patientAddress;
    private String patientUser;
    private String patientPass;
    private int patientId;
    private Object[] patientInfo1={01,"Sana","Heart", "5:30","Monday - Wednesday","0312-2564789","sana@gmail.com","DHA phase 2 Street 3 house No.4"};
    private Object[] patientInfo2={02,"Nida","Kidney", "6:30","Monday - Wednesday","0312-2564789","nidain@goodhealth.com","DHA phase 2 Street 3 house No.4"};
    private Object[] patientInfo3={03,"Daniyal","Fever", "7:30","Monday - Wednesday","0312-2564789","daniyal@goodhealth.com","DHA phase 2 Street 3 house No.4"};
    private String[] Password={"123456","321654","987654"};
    private String[] username={(String)patientInfo1[1],(String)patientInfo2[1],(String)patientInfo3[1]};
    private int[] p_Id={(int)patientInfo1[0],(int)patientInfo2[0],(int)patientInfo3[0]};

    public String getPatientName()
    {
        return patientName;
    }

    public void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }

    public String getPatientProblem()
    {
        return patientProblem;
    }

    public void setPatientProblem(String patientProblem)
    {
        this.patientProblem = patientProblem;
    }

    public String getPatientTiming()
    {
        return patientTiming;
    }

    public void setPatientTiming(String patientTiming)
        {
        this.patientTiming = patientTiming;
    }

    public String getPateintDays()
    {
        return pateintDays;
    }

    public void setPateintDays(String pateintDays)
    {
        this.pateintDays = pateintDays;
    }

    public String getPatientPhoneNo()
    {
        return patientPhoneNo;
    }

    public void setPatientPhoneNo(String patientPhoneNo)
    {
        this.patientPhoneNo = patientPhoneNo;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getPatientAddress()
    {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress)
    {
        this.patientAddress = patientAddress;
    }

    public String getPatientUser()
    {
        return patientUser;
    }

    public void setPatientUser(String patientUser)
    {
        this.patientUser = patientUser;
    }

    public String getPatientPass()
    {
        return patientPass;
    }

    public void setPatientPass(String patientPass)
    {
        this.patientPass = patientPass;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public void setPatientId(int patientId)
    {
        this.patientId = patientId;
    }

    public Object[] getPatientInfo1()
    {
        return patientInfo1;
    }

    public Object[] getPatientInfo2()
    {
        return patientInfo2;
    }

    public Object[] getPatientInfo3()
    {
        return patientInfo3;
    }

    public String[] getPassword()
    {
        return Password;
    }

    public String[] getUsername()
    {
        return username;
    }

    public int[] getP_Id() {
        return p_Id;
    }
}
