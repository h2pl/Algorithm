package mianshi.kujiale;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by 周杰伦 on 2018/3/2.
 */
public class DateFomatter {
    static class Date
    {
        public int Year;
        public int Month;
        public int Day;
        public int Hour;
        public int Minute;
        public int Second;
    }

    private HashMap<String, String> map = new HashMap<>();
    private Date date;
    String format;
    {

    }

    public DateFomatter(String format, Date date){
        this.format = format;
        this.date = date;

        map.put("yyyy", String.valueOf(date.Year));
        map.put("yy", String.valueOf(date.Year).substring(2,3));
        map.put("MM", String.valueOf(date.Month));
        map.put("M", ((date.Month >= 10) ? String.valueOf(date.Month) :"0"+ String.valueOf(date.Month)));
        map.put("dd", String.valueOf(date.Day));
        map.put("d", ((date.Day >= 10) ? String.valueOf(date.Day) :"0"+ String.valueOf(date.Day)));
        map.put("HH", String.valueOf(date.Hour));
        map.put("H", ((date.Hour >= 10) ? String.valueOf(date.Hour) :"0"+ String.valueOf(date.Hour)));
        map.put("hh", String.valueOf(date.Hour - 12));
        map.put("h", ((date.Hour - 12 >= 10) ? String.valueOf(date.Hour - 12) :"0"+ String.valueOf(date.Hour - 12)));
        map.put("mm", String.valueOf(date.Minute));
        map.put("m", ((date.Minute >= 10) ? String.valueOf(date.Minute) :"0"+ String.valueOf(date.Minute)));
        map.put("ss", String.valueOf(date.Second));
        map.put("s", ((date.Second >= 10) ? String.valueOf(date.Second) :"0"+ String.valueOf(date.Second)));
    }

    public String output() {
        StringBuffer sb = new StringBuffer(format);
        int index = 0;

        for (Iterator<String> it = map.keySet().iterator(); it.hasNext(); ) {
            String child = it.next();
            while( ( index = format.indexOf(child, index) ) != -1 )
            {
                sb.replace(index,index + child.length()-1, String.valueOf(map.get(child)));
                index = index+child.length();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.Month = 10;
        date.Day = 25;
        date.Hour = 10;
        date.Minute = 30;
        date.Second = 59;
        date.Year = 2012;

        String format = "yyyy-MM-ddTHH:mm:ss";
        DateFomatter dateFomatter = new DateFomatter(format, date);
        System.out.println(dateFomatter.output());
    }
}
