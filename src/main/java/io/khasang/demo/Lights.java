package io.khasang.demo;

/**
 * Created by dinar on 15.05.2017.
 */
import java.util.TreeMap;

enum Point {GREEN, YELLOW, RED}

public class Lights {
    private int minutes;
    private int max_minutes;
    private TreeMap<Integer, Point> map;

    private void Init() {
        max_minutes += 2;
        map.put(max_minutes - 1, Point.GREEN);
        max_minutes += 3;
        map.put(max_minutes - 1, Point.YELLOW);
        max_minutes += 5;
        map.put(max_minutes - 1, Point.RED);
    }

    public Lights() {
        minutes = 0;
        max_minutes = 0;
        map = new TreeMap();
        Init();
    }

    public void start() {
        while (true) {
            int i = Observer.getMinutes();
            if (i <= 0) break;
            minutes = (minutes + i) % max_minutes;
            Observer.show(map.ceilingEntry(minutes).getValue());
        }
    }

}
