
public class TryCatch {

    public static void main(String[] args){

        Runtime.getRuntime().addShutdownHook(new Thread(() ->
                System.out.println("shutdown hook executed")));
        try{
            System.out.println("inside try block");
            System.exit(0);
        }
        finally {
            System.out.println("inside finally block");
        }


    }
}
