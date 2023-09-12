
package com.mustafamurat.thread1;


public class Printer implements Runnable{
    
    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + " calisiyor...");
        
        for(int i = 1 ; i <= 10 ; i++){
            try {
                System.out.println(isim + " Yaziyor : " + i);
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye ugradi...");
            }
            
            
        }
        System.out.println(isim + " isini bitirdi...");
    }
        private String isim;
 
}
