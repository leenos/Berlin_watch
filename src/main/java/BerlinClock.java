/**
 * Created by leenos on 03.05.2017.
 */
public class BerlinClock {
    public String getSecond(int i) {
        if (i % 2 == 0)
            return "Y";
        return "O";
    }

    public String getHours(int i) {
        i=i/5;
        String light="";
        switch (i) {
            case 1:
                light= "YOOO";
                break;
            case 2:
                light= "YYOO";
            break;
            case 3:
                light= "YYYO";
            break;
            case 4:
                light= "YYYY";
            break;
            default:
                light= "OOOO";
        } ;
       return light;
    }
}
