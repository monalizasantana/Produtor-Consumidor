/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads2;

/**
 *
 * @author ads
 */
public class Producer extends Thread {
    
        Programa a;

        int contador;
        public Producer(Programa x) {

               a = x;
               contador =0;
        }

        public void run() {

               try {
                   while (true) {
                       while (a.itemCount == 10)
                           sleep(100);
                       contador ++;
                       a.mutex.down();
                       a.buffer.add(contador);  
                       a.items.up();
                       a.mutex.up();
                       a.itemCount++;
                       System.out.println("produtor: producing item "+contador);
                       for (int i =0;i<10000;i++);
                       
                       
                   }

               }

               catch(InterruptedException e) {

                       e.printStackTrace(); 

               }

        }
    
    
}
