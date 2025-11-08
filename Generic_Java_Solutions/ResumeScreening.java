import java.util.List;
import java.util.Arrays;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    private String candidate;
    public Resume(String candidate){ this.candidate = candidate; }
    public String toString(){ return candidate; }
}

public class ResumeScreening {
    public static void screen(List<? extends JobRole> roles){
        for(JobRole r: roles) System.out.println("Role: " + r.getClass().getSimpleName());
    }
    public static void main(String[] args){
        Resume<SoftwareEngineer> r = new Resume<>("Alice");
        System.out.println(r);
        screen(Arrays.asList(new SoftwareEngineer(), new DataScientist()));
    }
}
