import java.util.HashMap;
import java.util.HashSet;

public class ActiveUsers {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet> temp = new HashMap<>();

        for(int i=0; i<logs.length; i++){
            if(!temp.containsKey(logs[i][0])){
                temp.put(logs[i][0], new HashSet<Integer>());
            }
            temp.get(logs[i][0]).add(logs[i][1]);
        }
        int[] out = new int[k];

        for(int key : temp.keySet()){
            int size = temp.get(key).size();
            out[size-1]++;
        }
        return out;
    }
}
