package example;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import jade.lang.acl.*;

public class SendMsgAgent extends Agent{

    /**
     * 
     */
    private static final long serialVersionUID = 162726460895968078L;
    
    @SuppressWarnings("serial") 
    protected void setup() {
        System.out.println("I'm an Agent to Send the Message to Bob!");
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
                doWait(2000);//wait for Bob to be ready
                System.out.println("I am sending the first msg");
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                AID receiver = new AID("Bob",false);
                msg.addReceiver(receiver);
                msg.setContent("This is First msg");
                send(msg);
                System.out.println("First msg is sent! Wait for 5 sec....");
                doWait(5000);
                System.out.println("I am sending the second msg");
                msg.setContent("This is Second msg");
                send(msg);
                System.out.println("Second msg is sent!");
                isDone = true;
            }
        });
    }
    
   
    
}
