//Regular Exception

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo {
    public static void main(String[] args) {
//       // String str ="the quick9999999jdbc abc@gmail.com brown898989 foxx jummps jdbc";
//        String str ="b%#@abcdbb9087 &";
//        //Pattern p=Pattern.compile("[0-9a-zA-Z._]+@gmail.com");  //pattern provided here
//        //Pattern p=Pattern.compile("[b]?");
//        Pattern p=Pattern.compile("\\W");
//        //Pattern p1=Pattern.compile("",Pattern.CASE_INSENSITIVE);
//        int ctr=0;
//        Matcher m=p.matcher(str);
//        while (m.find())
//        {
//            System.out.println(m.start()+ "------------"+ m.end()+"-----"+m.group());
//            ctr++;
//        }
//        System.out.println("no of counts ="+ctr);
        String str="abhishek";
        System.out.println(str.matches("[a-z]{8}"));
    }
}
class Stu23
{
    String name;
    boolean result;
}
