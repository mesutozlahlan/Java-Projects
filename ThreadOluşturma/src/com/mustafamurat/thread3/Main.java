
package com.mustafamurat.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) {
        
        /*Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Calisiyor...");
                
                for(int i = 1 ; i <= 10 ; i++){
                    try {
                        System.out.println("Yaziyor : " +i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }

            }
        });*/

        //printer1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Calisiyor...");
                
                for(int i = 1 ; i <= 10 ; i++){
                    try {
                        System.out.println("Yaziyor : " +i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }

            }
        }).start();
        
        
        
        System.out.println("Main Thread Calisiyor...");
    }
}
