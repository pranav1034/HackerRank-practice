import java.util.*;

public class SortLogs {
    public static void main(String[] args) {
        List<List<String>> logs = new ArrayList<>();
        logs.add(Arrays.asList("01-01-2023", "14:00", "ERROR", "failed"));
        logs.add(Arrays.asList("01-01-2023", "15:00", "INFO", "established"));
        logs.add(Arrays.asList("01-01-2023", "01:30", "ERROR", "failed"));

        List<List<String>> errorLogs = extractLogs(logs);

        for (List<String> log : errorLogs) {
            System.out.println(log);
        }
    }
    public static List<List<String>> extractLogs(List<List<String>> logs) {
        List<List<String>> result = new ArrayList<>();

        Collections.sort(logs,new Comparator<List<String>>(){
            public int compare(List<String> a,List<String> b){
                String key1= sortFormat(a.get(0),a.get(1));
                String key2= sortFormat(b.get(0),b.get(1));
                return key1.compareTo(key2);
            }
        });

        for(List<String> log:logs){
            String status=log.get(2);
            if(status.equals("ERROR") || status.equals("CRITICAL")){
                result.add(log);
            }
        }
        return result;
    }

    public static String sortFormat(String a,String b){
        String[] date=a.split("-");
        String[] time=b.split(":");
        return date[2]+date[1]+date[0]+time[0]+time[1];
    }
}
