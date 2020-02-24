package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

public class HienThi20SNT {
    public static void main(String[] args) {
        int count=0;
        int number=2;
        while(count<20){
            if(isSNT(number)){
                System.out.println(number);
                count++;
            }
            number++;
            }

        }


    public static boolean isSNT(int so){
        if(so<2){
            return false;
        }else {
            for (int i=2;i<so;i++){
                if(so%i==0){
                    return false;
                }else {
                    return true;
                }
            }
            return true;
        }
    }
}
