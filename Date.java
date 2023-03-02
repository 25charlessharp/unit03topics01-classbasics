public class Date {
    private int month;
    private int day;
    private int year;
    
    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public Date(int theMonth, int theDay, int theYear){
        month = theMonth;
        day = theDay;
        year = theYear;
    }
    public String toString(){
        String result = "";
        if(month % 10 == month){
            result += "0";
        }
        result += month;
        result += "/";
        if(day % 10 == day){
            result += "0";
        }
        result += day;
        result += "/";
        result += year;
        return result;
    }
    public static void main(String[] args) {
        Date d1 = new Date(8,15,2006);
        Date d2 = new Date(3,1,2023);
        Date d3 = new Date(11, 26, 2011);
        
        Date[] allDates = new Date[] {d1,d2,d3};

        for(Date date : allDates){
            System.out.println(date);
        }
    }
}