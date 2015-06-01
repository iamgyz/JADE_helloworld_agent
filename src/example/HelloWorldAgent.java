package example;
import java.util.Iterator;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class HelloWorldAgent extends Agent{

    /**
     * 
     */
    private static final long serialVersionUID = 162726460895968078L;
    
    @SuppressWarnings("serial") 
    protected void setup() {
        System.out.println("Hello World, I'm am Agent!");
        System.out.println("My local-name is "+getAID().getLocalName());
        System.out.println("My GUID is "+getAID().getName());
        System.out.println("My address are : ");
        Iterator it = getAID().getAllAddresses();
        while (it.hasNext())
        {
            System.out.println("- "+it.next());
        }
        //addBehavior
        addBehaviour(new SimpleBehaviour(this) {
            boolean isDone = false;
            @Override
            public boolean done() {
                // TODO 自動產生的方法 Stub
                return isDone;
            }
            
            @Override
            public void action() {
                System.out.println("I am doing behaviour 1");
                try {
                    Thread.sleep(1000);//sleep 1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//try~catch
                System.out.println("I am finishing my behaviour now");
                isDone = true;
            }
        });
    }
    
   
    
}
