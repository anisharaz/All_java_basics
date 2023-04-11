public class polymorphism {
    public static void main(String[] args) {

        international_students i_s = new international_students();
        i_s.b_tech();
        i_s.m_tech();
        i_s.parent_functions();

        static_poly s_p = new static_poly();
        s_p.fun(55);
        s_p.fun("test");
    }
}

/////////////////////////////////////////////// Dynamic Polymorphism

class student {
    void b_tech() {
        System.out.println("222 Students in B_tech");
    }

    void m_tech() {
        System.out.println("112 Students in M_tech");
    }
}

// This international_students class extends to class students which can
// override functions of class students

class international_students extends student {
    // over_ridden b_tech()
    void b_tech() {
        System.out.println("21 Students in International_B_tech");
    }

    // over_ridden m_tech()
    void m_tech() {
        System.out.println("51 Students in International_M_tech");
    }

    void parent_functions() {
        super.b_tech();
        super.m_tech();
    }
}

//////////////////////////////////////// Static Polymorphism

class static_poly {
    void fun(int a) {
        System.out.println("Fun is called with argument " + a);
    }

    void fun(String s) {
        System.out.println("Fun is called with argument " + s);
    }
}
