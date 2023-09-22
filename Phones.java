import java.util.*;

public class Phones {

    private Map<String, Integer> map = new HashMap<>();
    private Map<String, Integer> sorMap = new HashMap<>();
    private List<Integer> list = new ArrayList<>();


    void add(String Name, Integer phoneNum){
        StringBuilder sB = new StringBuilder();
        int count = 1;

        if (!sorMap.containsKey(Name)) {
            map.put(Name, phoneNum);
            sorMap.put(Name, count);

        } else {
            count = sorMap.get(Name) + 1;
            sorMap.put(Name, count);
            for (int i = 1; i < count; i++) {
                sB.append("-");
            }
            map.put(Name + sB, phoneNum);
        }
}
    String getByPhoneNum(Integer phoneNum){
        StringBuilder sB = new StringBuilder();
        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(phoneNum)){
                sB.append(entry.getKey())
                        .append(" : ")
                        .append(phoneNum)
                        .append("\n");
            }
        }
        return sB.toString().replaceAll("-","");
    }
    void getByName(String Name){
        for (Map.Entry entry: map.entrySet()) {
            String key = (String) entry.getKey();
            key = key.replaceAll("-","");
            if(key.equals(Name)){
                 System.out.println(key + " : " + entry.getValue());
            }
        }
    }

    Integer sort_max_size(){
        for (Map.Entry entry: sorMap.entrySet()) {
            list.add((Integer) entry.getValue());
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        return max;
    }

    String getAll(){
        return map.toString().replaceAll("-","");
    }
    String getSorMap(){
        return sorMap.toString();
    }

    String print(){

        StringBuilder sB = new StringBuilder();
        for (int i = sort_max_size(); i > 0; i--) {

            for (Map.Entry entry2: sorMap.entrySet()) {
                for (Map.Entry entry: map.entrySet()) {

                    String key = (String) entry.getKey();
                    key = key.replaceAll("-","");

                    if(key.equals(entry2.getKey()) && i ==(Integer) entry2.getValue()) {
                        sB.append(key).append(" : ")
                                .append(entry.getValue())
                                .append("\n");
                    }
                }
            }
        }
        return sB.toString();
    }
}
