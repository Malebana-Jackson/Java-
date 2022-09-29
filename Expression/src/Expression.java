
import com.mecer.Formula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TRAIN 23
 */
public class Expression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        new Expression().runTest();
//        
//    }
//     
//    private void runTest(){
//     //Formula fx = new Formula();
//     double ans = Formula.formula_3x(5);
//     System.out.println(" Expected 15"+ans);
//    
//    
//    
//    

        Map<Integer, String> m = new TreeMap<Integer, String>();

        m.put(11, "Audi");
        m.put(null, null);
        m.put(11, "BMW");
        m.put(null, "Mecedes");
        System.out.println(m.size());
        System.out.println(m);
    }
}
