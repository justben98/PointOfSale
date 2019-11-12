/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTimer;

import pointOfSale.MainWindow;

/**
 *
 * @author root
 */
public class Timer {
     public void timeOut() throws InterruptedException{
        try{
            //Variable defination
            //int m = 5;
            int timet =  15;
            long delay = timet * 1000;
            
            do{
                /**
                 * int minutes = timet / 60;
                 * int seconds = timet % 60;
                 */ 
                Thread.sleep(1000);
                timet = timet -15;
                delay = delay - 1000;
        }while (delay != 0);
        
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception: ");
            e.printStackTrace();
            System.exit(-1);
        }
        
    }
    
}
