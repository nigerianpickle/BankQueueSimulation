public  class BankQueue{
        QueuePerson head;
        QueuePerson tail;

        public BankQueue(){
            head=null;
            tail=null;
        }

        public BankQueue(QueuePerson p){
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



