import java.time.LocalTime;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        sortNumber(100000);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

    public static void sortNumber(int count){
        int[] listNumber = new int[count];
        int swap;
        int a = 0;
        for (int index = 0;index < listNumber.length; index++){
            int min = listNumber[index];
            for (int i = index; i < listNumber.length; i++) {
                if (min > listNumber[i]) {
                    min = listNumber[i];
                    a = i;
                }
            }
            swap = listNumber[index];
            listNumber[index] = listNumber[a];
            listNumber[a] = swap;
        }

    }

}
