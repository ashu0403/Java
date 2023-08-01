import java.util.Comparator;

public class EIDCoparator implements Comparator<Emp> {
    public int compare(Emp e1, Emp e2) {
        if (e1.EID < e2.EID) {
            return -1;
        } else if (e1.EID > e2.EID) {
            return 1;
        } else {
            return 0;
        }
    }
}
