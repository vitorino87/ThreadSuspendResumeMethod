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
public class NewThread implements Runnable{

    String tn;
    Thread t;
    
    NewThread(String tname){
        tn=tname;
        t=new Thread(this,tn);
        System.out.println("New Thread ::: "+t);
        t.start();
    }
        
    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
                System.out.println(tn+" ::: "+i);
                Thread.sleep(200);
            }
        } catch (Exception e) {
        }
        System.out.println(tn+" Finishing ...");
    }    
}
