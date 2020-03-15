package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Xay_Dung_lop_StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start(){
        long millis=System.currentTimeMillis();
//        System.out.println(millis);
        Date date = new Date(millis);
        return millis;
    }
    public long stop() {
        long millis=System.currentTimeMillis();
        Date date = new Date(millis);
        return millis;
    }
    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }


}
