
class Time{
    private int hour;
    private int min;
    private int sec;

    Time(int hour,int min,int sec){
            this.hour=hour;
            this.min=min;
            this.sec=sec;
    }

    public void add(Time t){
        System.out.printf("HOUR :%d \n",(this.hour+t.hour));
        System.out.printf("MINUTE :%d \n",(this.min+t.min));
        System.out.printf("SECOND :%d \n",(this.sec+t.sec));
    }
}

public class q1time{
    public static void main(String []args) {
        
        Time t1=new Time(1,30,25);
        Time t2=new Time(2,20,1);

        t1.add(t2);
    }
}