public class inheritance_abstract_class_subClass {
    public static void main(String[] args) {
        // Inheritance

        child c = new child();
        c.child_fun();
        c.use_super_fun();

        // abstract class

        // cat is class that extends to abstract class animal
        cat cat = new cat();
        cat.voice();

        // Inner Class

        head.inner_head inner_class_obj = new head.inner_head();
        inner_class_obj.inner_fun();

    }
}

class parent {
    parent() {
        System.out.println("parent constructor is called");
    }

    parent(int a) {
        System.out.println("parent constructor is called with argument " + a);
    }

    void parent_fun() {
        System.out.println("parent class function");
    }
}

class child extends parent {
    child() {
        // super();
        super(9);
        System.out.println("child constructor is called ");
    }

    void parent_fun() {
        System.out.println("over-ridden parent class function");
    }

    void child_fun() {
        System.out.println("child class function");
    }

    void use_super_fun() {
        parent_fun();
        super.parent_fun();
    }
}

abstract class animal { // we cannot create obj of abstract class
    String name;

    abstract void voice();
}

class cat extends animal {
    cat() {
        super.name = "cat";
    }

    void voice() {
        System.out.println("Mewooo...");
    }
}

// Inner class

class head {
    static class inner_head {
        inner_head() {
            System.out.println("inner static class object is made");
        }

        void inner_fun() {
            System.out.println("function in inner class");
        }
    }
}