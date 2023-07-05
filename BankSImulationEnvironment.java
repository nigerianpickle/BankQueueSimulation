public class BankSImulationEnvironment {    public static void main(String[] args) {
    //Bank and bank service(Need to change it so that only banks can have a bank service)
    BankService zenith=new BankService(1, 300000000);
    BankQueue zenQueue=new BankQueue();
    zenQueue.enqueue(new QueuePerson("Daniel",1000));
    zenQueue.enqueue(new QueuePerson("David",7899));
    zenQueue.enqueue(new QueuePerson("Damila",100000));

    //Bank simulation
    //while the queue is not empty
    while (!zenQueue.isEmpty()) {
    }

}
}
