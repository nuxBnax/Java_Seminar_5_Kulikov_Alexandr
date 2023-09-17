import java.util.HashMap;
import java.util.Map;

public class Phones {
    private Map<String, String> map = new HashMap<>();

    void add(String phoneNum, String Name){
        map.put(phoneNum, Name);
    }

    String getByPhoneNum(String phoneNum){
        return phoneNum + " : " + map.get(phoneNum);
    }
    String getByName(String Name){
        StringBuilder sB = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
            if(entry.getValue().equals(Name)){
                sB.append(entry.getKey())
                        .append(" : ")
                        .append(Name)
                        .append("\n");
            }
        }
        return sB.toString();
    }

    String getAll(){
        return map.toString();
    }
}
