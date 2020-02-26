package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Xay_Dung_lop_StopWatch;

public class Main {
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;

    }
    public static void selectionSort(){
        int[] arr=new int[100000];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100000);
        }
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                swap(arr[min],arr[j]);
            }
        }
    }
    public static void main(String[] args) {
//          Main main=new Main();
          StopWatch st=new StopWatch();
          st.setStartTime(st.start());
          selectionSort();
        st.setStartTime(st.start());
        System.out.println("Thoi gian thuc hien la : " + st.getElapsedTime()+" mili giay");
    }
}
