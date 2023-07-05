import java.util.ArrayList;

public class BankService {
    QueuePerson currentCustomer;
    int bankReserve;
    int employees;//How many customers they can attend to in a queue
    ArrayList accounts=new ArrayList<QueuePerson>(); //next feature


    public BankService(int e,int res){
        employees=e;
        employees=res;
    }




    //Setters
    public void customerDeposit(QueuePerson p){
        bankReserve+=p.getCash();
        currentCustomer=p;
        System.out.println("customer "+p.personName()+" successfully deposited");
    }

    public void customerWithdraw(QueuePerson p){
        bankReserve=bankReserve-p.getCash();//customers with no accounts will go into debt in future
        currentCustomer=p;

        System.out.println("customer "+p.personName()+" successfully withdrew");

    }

}
