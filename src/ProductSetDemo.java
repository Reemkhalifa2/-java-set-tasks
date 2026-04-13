import java.util.*;
public class ProductSetDemo {
    public static void main(String[] args) {
        Set <String> prodCode = new HashSet<>();
        prodCode.add("abc123");
        prodCode.add("abc124");
        prodCode.add("abc125");
        prodCode.add("abc126");
        prodCode.add("abc127");
        for(String code : prodCode){
            System.out.println(code);
        }
        System.out.println("-------------------------");
        prodCode.add("abc128");
        for(String code : prodCode){
            System.out.println(code);
        }

    }
}
