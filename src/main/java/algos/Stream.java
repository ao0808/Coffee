package algos;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            list.add("gfgvbhnjkml");
            list.add(null);
            list.add("rftgyhnujk");

            for (String s : list) {
                System.out.println(s);
                if(s == null){
                    System.out.println("NUUUULLL");
                }
                if(s.equals("knfkvgj")){
                    System.out.println(s);
                };
            }
        } catch (Exception exception){
            System.out.println("ошибка");
        }
    }
}
