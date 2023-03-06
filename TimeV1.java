public class TimeV1 {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeV1(int theHour, int theMinute, int theSecond){
        hours = theHour;
        minutes = theMinute;
        seconds = theSecond;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public String toString(){
        String result = "";
        if (hours < 10){
            result += "0";
        }
        result += hours;
        result += ":";
        if (minutes < 10){
            result += "0";
        }
        result += minutes;
        result += ":";
        if (seconds < 10){
            result += "0";
        }
        result += seconds;
        return result;
    }


    public static void main(String[] args) {
        TimeV1 t1 = new TimeV1(6,20,33);
        TimeV1 t2 = new TimeV1(19,2,0);
        TimeV1 t3 = new TimeV1(0,46,15);
        
        TimeV1[] allTime = new TimeV1[] {t1,t2,t3};

        for(TimeV1 time : allTime){
            System.out.println(time);
        }
    }
}
// nice work