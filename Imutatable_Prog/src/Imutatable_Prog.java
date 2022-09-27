/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRAIN 23
 */
public class Imutatable_Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new Imutatable_Prog().testing();
        
        
    }

    private void testing() {
       Person p = new Person("Jojo");
       StringBuilder sb = new StringBuilder("Bizzare Adventure");
       AttackAndDelay aad = new AttackAndDelay(sb, p, 9,6);
        System.out.println(""+p.getName());
        sb.append("Is a disatster");
         System.out.println(""+p.getName());
        System.out.println(""+aad.getStringbuilder());
    }
    
}
