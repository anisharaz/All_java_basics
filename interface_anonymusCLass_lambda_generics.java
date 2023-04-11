public class interface_anonymusCLass_lambda_generics {
    public static void main(String[] args) {
        // anonymus class in java

        for_anonymus_class FAC = new for_anonymus_class() {
            public void F() {
                System.out.println("in anonymus class function F()");
            }

            public void G() {
                System.out.println("in anonymus class function G()");

            }

            public void H() {
                System.out.println("in anonymus class function H()");

            }
        };
        FAC.F();
        FAC.G();
        FAC.H();

        // Lambda expression

        // this is multi line lambda expression
        functional f = () -> {
            System.out.println("In lambda expression of interface");
            return 0;
        };
        f.functional_method();

        // this is single line lamba expression
        functional f_2 = () -> 22;
        f_2.functional_method();

        // Generics
        gen g = new gen<Integer>(66);
    }
}

interface demon {
    int age = 12000; // This is static public and final by default

    void breath(); // methods are by default public

    // Below comented method is private method in interface which can be accessed-
    // only using by calling in default method

    // private void pri_method() {
    // // This is private method of interface which can
    // // be acced using default method
    // System.out.println("am in interface private method");
    // };

    default void fly() {
        System.out.println("fly up the hills");
        // pri_method();
    }

}

class diver implements demon {
    public void breath() {
        System.out.println("this is diver implementing demon interface");
        // fly();
    };

    // we can over ride the default method , its on our own
    // public void fly(){
    // System.out.println("this demon cannot fly");
    // }
}

interface for_anonymus_class {
    void F();

    void G();

    void H();

}

// The interface which contain only one method is called as functional Interface
@FunctionalInterface
interface functional {
    int functional_method();
}

class gen<T> {
    gen(T a) {
        System.out.println("Generic constructor of generic class is called using using argument " + a);
    }
}