
import java.util.HashMap;

public class ResistorColorDuo1 {
    public static HashMap<String, Integer> map = new HashMap<>();

    int value(String[] colors) {

        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        int sum = map.get(colors[0]) * 10 + map.get(colors[1]);
        return sum;
    }

}
