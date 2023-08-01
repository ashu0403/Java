import java.util.Map;
import java.util.TreeMap;

public class Demo
{
    public static void main(String[] args)
    {
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        treeMap.put(110,63);
        treeMap.put(101,100);
        treeMap.put(105,66);
        System.out.println(treeMap);
        for(Map.Entry<Integer,Integer> temp:treeMap.entrySet())
        {
            System.out.println(temp.getValue());
        }
    }
}