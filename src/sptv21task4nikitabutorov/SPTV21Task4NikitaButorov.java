/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task4nikitabutorov;

import java.util.Arrays;


/**
 *
 * @author Nikita Butorov
 */
public class SPTV21Task4NikitaButorov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int summa = 0;
        
        for(int i = 0; i < numbers.length; i++){
            while(true){
                int random = (int)Math.round(Math.random() * 100);
                if(random%2 != 0){
                    numbers[i] = random;
                    summa += random;
                    break;
                }

            }
        }
        Arrays.sort(numbers);
        for (int c = 0; c < 10; c++){
            for (int g =0; g < 10; g++){
                System.out.print(numbers[c * 10 + g]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Среднее арифметическое: " + summa/100);
        // TODO code application logic here
    }

    private static int rnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
