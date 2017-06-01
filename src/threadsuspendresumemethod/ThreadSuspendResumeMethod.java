/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsuspendresumemethod;

/**
 *
 * @author tiago.lucas
 */
public class ThreadSuspendResumeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewThread ob1 = new NewThread("ONE");
        NewThread ob2 = new NewThread("TWO");
        try {
            Thread.sleep(500);
            ob1.t.suspend();
            System.out.println("Thread ONE is Suspended");
            Thread.sleep(500);
            ob1.t.resume();
            System.out.println("Thread ONE is Resumed");
            Thread.sleep(500);
            ob2.t.suspend();
            System.out.println("Thread TWO is Suspended");
            Thread.sleep(500);
            ob2.t.resume();
            System.out.println("Thread TWO is Resumed");
            
            System.out.println("Waiting for thread to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Finishing Main Thread");
    }
    
}
