import java.util.ArrayList;
import java.util.List;

public class PoisonousPlants {
    public static int poisonousPlants(List<Integer> p) {
        // Write your code here
        return countDays(p,0);
    }

    public static int countDays(List<Integer> p ,int days){
        boolean plant = false;
        List<Integer> plants2=new ArrayList<>();
        plants2.add(p.get(0));

        for(int i=1;i<p.size();i++){
            if(p.get(i)>p.get(i-1)){
                plant=true;
            }
            else
                plants2.add(p.get(i));
        }

        if(plant){
            return countDays(plants2,days+1);
        }
        else return days;
    }
}
