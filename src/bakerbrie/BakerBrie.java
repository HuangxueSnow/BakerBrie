/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakerbrie;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BakerBrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
        for(int a=0;a<10;a++){
            int f = reader.nextInt();
            int d = reader.nextInt();
            reader.nextLine();
            int[] daysum = new int[d];
            int[] eachsum = new int[f];
            for(int i =0;i <d;i++){
                for (int j=0;j<f;j++) {
                    int num = reader.nextInt();
                    daysum[i] += num;
                    eachsum[j] += num;
                }
            }
            int D=0;
            for (int i=0;i<d;i++) {
                if (daysum[i]%13 == 0) {
                    D+=daysum[i]/13;
                }
            }
            for (int i=0;i<f;i++) {
                if (eachsum[i]%13==0)
                    D+=eachsum[i]/13;
            }
            System.out.println(D);
        }
        
    }
    
}
