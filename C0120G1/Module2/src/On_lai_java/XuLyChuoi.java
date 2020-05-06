package On_lai_java;

public class XuLyChuoi {
    public static String toiUu(String s){
        String sToiUu=s;
        sToiUu=sToiUu.trim(); //xóa khoảng trắng bên trái và phải
        String []arrWord=sToiUu.split(" ");
        sToiUu="";
        for(String work:arrWord){
            String newWord=work.toLowerCase();
            if(newWord.length()>0){
                newWord=newWord.replaceFirst(newWord.charAt(0)+"",(newWord.charAt(0)+"").toUpperCase());
               sToiUu+=newWord+ " ";
            }
        }
        return sToiUu.trim() ;
    }
    public static void main(String[] args) {
           String s="     TrAn     dUy          HunG";
        System.out.println(s);
           String sToiUuu=toiUu(s);
        System.out.println(sToiUuu);
    }
}
