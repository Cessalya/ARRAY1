/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array1;

/**
 *
 * @author LENOVO
 */
public class ARRAY1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] bilangan = new int[15];
        int kuadrat;
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 != 0) {
                kuadrat = bilangan[i] * bilangan[i];
                System.out.println(bilangan[i] + " kuadrat = " + kuadrat);
            }
        }
    }
    
}

    
    

