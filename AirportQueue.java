public class AirportQueue {
    public static void main(String[] args) {
        AirQueue one=new AirQueue();
        one.enqueue(new QueuePerson("Daniel"));
        one.enqueue(new QueuePerson("David"));
        one.enqueue(new QueuePerson("Damila"));
        System.out.println(one);
        one.dequeue();
        //new queue
        System.out.println(one);
        one.enqueue(new QueuePerson("James"));
        System.out.println(one.size());
    }

    public static class AirQueue{
        QueuePerson head;
        QueuePerson tail;

        public AirQueue(){
            head=null;
            tail=null;
        }

        public AirQueue(QueuePerson p){
            head=p;
            tail=p;
        }

        public String toString(){
            if (head==null) {
                return "None";
            }
            else{
                QueuePerson curr=head;
                String result="<<";

                while (curr!=null) {
                   result+=curr.personName()+" ";
                   curr=curr.getNext();
                }
                return result+">>";
            }
        }

        public void enqueue(QueuePerson p){
            if (head==null) {
                head=p;
                tail=p;
            }
            else{
                QueuePerson curr=head;
                QueuePerson next=head.next;

                while (next!=null) {
                    curr=next;
                    next=curr.next;
                }
                tail=p;
                curr.setNext(p);
            }
        }

        public void dequeue(){
            if (head==tail) {
                head=null;
                tail=null;
            }
            else{
                head=head.next;
            }
        }

        public QueuePerson peek(){
            return head;
        }
        public boolean isEmpty(){
            if (head==null) {
                return true;
            }
            return false;
        }

        public int size(){
            if (head==null) {
                return 0;
            }
            else{
                QueuePerson curr=head;
                int count=0;

                while (curr!=null) {
                    curr=curr.next;
                    count++;
                }
                return count;
            }
        }
    }

    public static class QueuePerson{
        String name;
        QueuePerson next=null;
        public QueuePerson(String n,QueuePerson nxt){
            name=n;
            next=nxt;
        }
        public QueuePerson(String n){
            name=n;
        }

        public QueuePerson getNext(){
            return this.next;
        }

        public String personName(){
            return name;
        }

        public void setNext(QueuePerson p){
            this.next=p;
        }
    }
}
