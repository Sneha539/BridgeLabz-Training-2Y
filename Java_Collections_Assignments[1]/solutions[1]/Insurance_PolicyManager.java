
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Insurance_PolicyManager {
    private Set<Insurance_Policy> hashSet = new HashSet<>();
    private Set<Insurance_Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Insurance_Policy> treeSet = new TreeSet<>(Comparator.comparing(p->p.expiryDate));
    public void add(Insurance_Policy p){
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }
    public List<Insurance_Policy> expiringWithinDays(int days){
        LocalDate now = LocalDate.now();
        List<Insurance_Policy> res=new ArrayList<>();
        for (Insurance_Policy p: treeSet){
            long diff = ChronoUnit.DAYS.between(now, p.expiryDate);
            if (diff>=0 && diff<=days) res.add(p);
        }
        return res;
    }
    public List<Insurance_Policy> byCoverage(String coverage){
        List<Insurance_Policy> res=new ArrayList<>();
        for (Insurance_Policy p: hashSet) if (p.coverageType.equalsIgnoreCase(coverage)) res.add(p);
        return res;
    }
    public Set<String> duplicatePolicyNumbers(){
        Map<String,Integer> cnt = new HashMap<>();
        for (Insurance_Policy p: hashSet) cnt.put(p.policyNumber, cnt.getOrDefault(p.policyNumber,0)+1);
        Set<String> dup = new HashSet<>();
        for (var e : cnt.entrySet()) if (e.getValue()>1) dup.add(e.getKey());
        return dup;
    }
    public static void main(String[] args){
        Insurance_PolicyManager m = new Insurance_PolicyManager();
        m.add(new Insurance_Policy("P1","Alice", LocalDate.now().plusDays(10),"Health",1000));
        m.add(new Insurance_Policy("P2","Bob", LocalDate.now().plusDays(40),"Auto",500));
        m.add(new Insurance_Policy("P1","Alice Dup", LocalDate.now().plusDays(5),"Home",800));
        System.out.println("Expiring within 30 days: " + m.expiringWithinDays(30));
        System.out.println("By coverage Health: " + m.byCoverage("Health"));
        System.out.println("Duplicate policy numbers: " + m.duplicatePolicyNumbers());
    }
}
