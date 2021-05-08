

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadUsingExtend extends Thread{

    @Override
    public void run() {
        
            showCurrentTimeAndThreadName();
        
    }

    
    public void showCurrentTimeAndThreadName() 
    {
        
        for(int i = 0; i< 10 ; i++){
          
            System.out.println("Current Time:"+LocalDate.now() +" Thread name"+Thread.currentThread().getName());
    
        }
    }
    
    
}
