// Invoker
public class Karyawan {
    Command command;

    public  void ambilOrder(Command c){
        command = c;
        command.orderUp();
    }
}
