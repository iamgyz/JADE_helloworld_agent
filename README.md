# JADE_helloworld_agent
Java JADE framework, a simple project template for Eclipse Luna

###Install

`git clone https://github.com/iamgyz/JADE_helloworld_agent.git`

###Settings in Eclipse

1. Import the project first

2. Run As -> Run Configurations -> New Java Application



> Projects1 : HelloWorldAgent

> Main class : jade.Boot

> Arguments : -gui Alice:example.HelloWorldAgent;Bob:example.HelloWorldAgent


> Projects2 : SendMessageAgent + ReceiveMessageAgent  

> Main class : jade.Boot

> Aeguments : -gui Alice:example.SendMsgAgent;Bob:example.ReceiveMsgAgent

###Misc  

####Behaviour types  
SimpleBehaviour  
OneShotBehaviour  
CyclicBehaviour  

CompositeBehaviour  
equentialBehaviour  
ParallelBehaviour  
FSMBehaviour  
WakerBehaviour  
TickerBehaviour  

