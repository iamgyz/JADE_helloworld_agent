package example;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import jade.lang.acl.*;

public class ReceiveMsgAgent extends Agent{

    /**
     * 
     */
    private static final long serialVersionUID = 162726460895968078L;
    
    @SuppressWarnings("serial") 
    protected void setup() {
        System.out.println("I'm an Agent to Receive the Message from Alice!"); //addBehavior
        addBehaviour(new SimpleBehaviour(this) {
            boolean isDone = false;
            @Override
            public boolean done() {
                return isDone;
            }
            
            @Override
            public void action() {                
                
                ACLMessage msg = blockingReceive();
                if(msg != null){
                    System.out.println("Got First message => "+msg.toString());
                }
                msg = blockingReceive();
                if(msg != null){
                    System.out.println("Got Second message => "+msg.toString());
                }
                isDone = true;
            }
        });
    }
    
   
    
}
