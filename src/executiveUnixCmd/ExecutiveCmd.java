package executiveUnixCmd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecutiveCmd {	
    public static void main(String[] args){  
        InputStream in = null;  
        String res = "";
        String line = null;
        try {  
            Process pro = Runtime.getRuntime().exec(new String[]{"sh","-c","ls -l|grep ^d"});  
            pro.waitFor();  
            in = pro.getInputStream();  
            BufferedReader read = new BufferedReader(new InputStreamReader(in)); 
            while((line=read.readLine())!=null){
            	res += line+"\r\n";
            }
            System.out.println("INFO:"+res);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
