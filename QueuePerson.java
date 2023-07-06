

#will implement a patience system in the future
#Bank will try to serve customers in the more efficient way possible
public class QueuePerson {
        private String name;
        QueuePerson next=null; //will optimize to private
        private int cashInstance;//cash they have plans for
        public QueuePerson(String n,QueuePerson nxt){
            name=n;
            next=nxt;
        }
        public QueuePerson(String n,int c){
            name=n;
            cashInstance=c;
        }

        //Getters
        public QueuePerson getNext(){
            return this.next;
        }

        public String personName(){
            return name;
        }
        public int getCash(){
            return cashInstance;
        }

        //Setters
        public void setCash(int c){
            cashInstance=c;
        }
        public void setNext(QueuePerson p){
            this.next=p;
        }

        public void depositCash(BankService b ){
            b.customerDeposit(this);
        }

        public void withdrawCash(BankService b ){
            b.customerDeposit(this);
        }
}
