package lambdas;

import java.util.List;
import java.util.ArrayList;

public class Lambda01 { 

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();
    
        names.add("cassiano");
        names.add("joaquim");
        names.add("quim");
        names.add("amanda");
        names.add("clicia");
        names.add("morgam");
        names.add("larissa");

        names.forEach(
            //função / expressão Lambda
            (name) -> System.out.println(name)
        );

        names.forEach(
            (name) -> {
                if(name.length() > 5){
                    System.out.println(name);
                }
            }
        );

 
    }
    
}
