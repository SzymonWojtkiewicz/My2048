package My2048fx;

import java.util.HashMap;
import java.util.Map;

public class MapOfColor {
    Map<Integer, String> colorMap = new HashMap<Integer, String>();
    public MapOfColor(){
        colorMap.put(0,"#FFFFFF");
        colorMap.put(2,"#FF9A1F");
        colorMap.put(4,"#880D1E");
        colorMap.put(8,"#C95E18");
        colorMap.put(16,"#7EA091");
        colorMap.put(32,"#963D5A");
        colorMap.put(64,"#99C82D");
        colorMap.put(128,"#FFFF1F");
        colorMap.put(256,"#4C191B");
        colorMap.put(512,"#29335C");
        colorMap.put(1024,"#5716A2");
        colorMap.put(2048,"#F2027A");
        colorMap.put(4096,"#786B17");
        colorMap.put(8192,"#CB0101");

    }
}
