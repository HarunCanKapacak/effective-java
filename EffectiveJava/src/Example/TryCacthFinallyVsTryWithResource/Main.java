package Example.TryCacthFinallyVsTryWithResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        try{
            int data =25 /0 ;
            System.out.println(data);
        }
        catch (NullPointerException e){
            System.out.println("Java");
        }
        finally {
            int data=25/0;
            System.out.println("ben hep çalýþýrým");
        }
        //Exception in thread "main" java.lang.ArithmeticException: / by zero //catch e girmiyor
 */
        try{
            int data =25 /0 ;
            System.out.println(data);
        }
        catch (ArithmeticException e){
            System.out.println("Java");
        }
        finally {
            //int data=25/0;
            System.out.println("ben hep çalýþýrým");
        }
      //  Java
      // ben hep çalýþýrým


    }

	}














