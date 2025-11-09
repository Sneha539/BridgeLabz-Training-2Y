
import java.time.LocalDate;
import java.util.*;
public class Insurance_Policy {
    public String policyNumber;
    public String policyholderName;
    public LocalDate expiryDate;
    public String coverageType;
    public double premium;
    public Insurance_Policy(String policyNumber, String name, LocalDate expiry, String coverage, double premium){
        this.policyNumber = policyNumber;
        this.policyholderName = name;
        this.expiryDate = expiry;
        this.coverageType = coverage;
        this.premium = premium;
    }
    public String toString(){
        return policyNumber + " | " + policyholderName + " | " + expiryDate + " | " + coverageType + " | " + premium;
    }
}
