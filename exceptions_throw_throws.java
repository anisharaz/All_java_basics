public class exceptions_throw_throws {

    public static void main(String[] args) throws Exception{
        // Creating arry
        int[] arr = new int[5];

        try {
            int y = 5/0; //Arithemetic exception eg.
        } catch (Exception e) {
            System.out.println("cannot devide byz zero");
        }

        try {
            int x = arr[6]; // ArrayIndexOutOfBoundException eg.
        } catch (Exception e) {
            System.out.println("your are trying to access beyond the index allowed");
        }

        // Calling the exceprion thtrowing method -> either use try_catch or throws in main method

        // exception_throwing_method(); // -> using throws in main method  #UNCOMMENT TO USE THIS
        
        try {
            exception_throwing_method(); // -> using throws in main method
        } catch (Exception e) {
            System.out.println("the method is throwing a exceptiom");
        }
        
        try {
            // (arguments 1 -> throws exception ,, 0 -> doesnt throws exception)
            using_myException(1);
            // using_myException(0);
        } catch (Exception e) {
            System.out.println("myException is throws and handled");
        }

    }

    // myException throwing mwthod
    static void using_myException(int a) throws myException{
        if(a == 1){
            throw new myException();
        }
    }

    //exception throwing method
    static void exception_throwing_method() throws Exception{
        int a = 5/0; //Arithemetic exception eg.
    }
}

class myException extends Exception{
    myException(){
        super("This is message for myException");
    }
}