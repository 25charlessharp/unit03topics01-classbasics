public class TimeV2 {
    private int secondsSinceMidnight;

    public TimeV2(int theHour, int theMinute, int theSecond){
        secondsSinceMidnight = (3600 * theHour) + (60 * theMinute) + theSecond;
    }
    public int getHours(){
        return secondsSinceMidnight / 3600;
    }

    public int getMinutes(){
        return (secondsSinceMidnight % 3600) / 60;
    }

    public int getSeconds(){
        return (secondsSinceMidnight % 3600) % 60;
    }

    public String toString(){
        String result = "";
        if (getHours() < 10){
            result += "0";
        }
        result += getHours();
        result += ":";
        if (getMinutes() < 10){
            result += "0";
        }
        result += getMinutes();
        result += ":";
        if (getSeconds() < 10){
            result += "0";
        }
        result += getSeconds();
        return result;
    }
    public static void main(String[] args) {
        TimeV2 t1 = new TimeV2(6,20,33);
        TimeV2 t2 = new TimeV2(19,2,0);
        TimeV2 t3 = new TimeV2(0,46,15);
        
        TimeV2[] allTime = new TimeV2[] {t1,t2,t3};

        for(TimeV2 time : allTime){
            System.out.println(time);
        }
        
    }
}
