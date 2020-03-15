package Bai_Tap_Tren_Mang.Video_80_doc_ghi_file;

import java.io.*;
import java.util.ArrayList;

public class FileFactory {
    public static boolean luuFile(ArrayList<String> list, String path) {

        try {
            FileOutputStream fos=new FileOutputStream(path);
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw=new BufferedWriter(osw);
            for(String data:list){
                bw.write(data);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<String>docFile(String path) {
        ArrayList<String> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                if (line.length() > 0)
                    list.add(line);
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}

