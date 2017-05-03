/**
 * Created by leenos on 03.05.2017.
 */
public class BerlinClock {
    public String getSecond(int i) {
        if (i % 2 == 0)
            return "Y";
        return "O";
    }
}
