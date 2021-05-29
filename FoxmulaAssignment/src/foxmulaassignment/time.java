
/*
  Class to add time 
*/

package foxmulaassignment.time;


public class time{
    private int hour;
    private int min;
    private int sec;

    public time(){
            hour=0;
            min=0;
            sec=0;
    }
   
    public void setTime(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }

    public void add(time t){
        time temp=new time();
        temp.hour=this.hour+t.hour;
        temp.min=this.min+t.min;
        temp.sec=this.sec+t.sec;

        if(temp.sec>60){
            temp.sec-=60;
            temp.min++;
        }
        if(temp.min>60){
            temp.min-=60;
            temp.hour++;
        }
        if(temp.hour>24)
        {
            temp.hour-=24;
        }

        System.out.printf("HOUR :%d \n",(temp.hour));
        System.out.printf("MINUTE :%d \n",(temp.min));
        System.out.printf("SECOND :%d \n",(temp.sec));
    }
}