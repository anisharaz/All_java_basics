import pack.pk;

public class access_modifier_and_constructors {
    public static void main(String[] args) {

        // Access Modifiers

        access_mod obj_access = new access_mod();
        // System.out.println(obj_access.var_pri);
        System.out.println(obj_access.var_pub + " is public");
        System.out.println(obj_access.var_pro + " is proteced");

        oop obj_oop = new oop();
        // System.out.println(obj_oop.pack_var_pri);
        System.out.println(obj_oop.pack_var_pro + " is proteced");
        System.out.println(obj_oop.pack_var_pub + " is public");

        pk obj_pk = new pk();
        // System.out.println(obj_pk.pack_1_var_pri);
        // System.out.println(obj_pk.pack_1_var_pro);
        System.out.println(obj_pk.pack_1_var_pub + " is public");

        // static
        access_mod.fun();

        // constructors & getter() , setter()

        for_constructor for_cst = new for_constructor(5);
        for_cst.set_ter(21, "Ram");
        for_cst.get_ter();

    }
}

// Class for Access Modifier

class access_mod {
    private int var_pri = 1;
    protected int var_pro = 2;
    public int var_pub = 3;

    static void fun() {
        System.out.println("Static method is called");
    }
}

// Class for showing constructor behaviour

class for_constructor {
    for_constructor() {
        System.out.println("parameter-less constructor is called");
    }

    for_constructor(int a) {
        System.out.println("parameter constructor is called with inout " + a);
    }

    private int age;
    private String name;

    public void set_ter(int ag, String na) {
        this.age = ag;
        this.name = na;
    }

    public void get_ter() {
        System.out.println(this.name + " is (this.name) " + this.age + " is (this.age)");
    }
}