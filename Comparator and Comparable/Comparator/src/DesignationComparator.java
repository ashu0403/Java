import java.util.Comparator;

public class DesignationComparator implements Comparator<Emp> {
    public int compare(Emp e1, Emp e2) {
        if (e1.Designation.compareTo(e2.Designation) < 0) {
            return -1;
        } else if (e1.Designation.compareTo(e2.Designation) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
