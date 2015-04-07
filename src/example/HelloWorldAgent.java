package example;
import java.util.Iterator;

import jade.core.Agent;

public class HelloWorldAgent extends Agent{

    /**
     * 
     */
    private static final long serialVersionUID = 162726460895968078L;
    
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
    }
   
    
}
