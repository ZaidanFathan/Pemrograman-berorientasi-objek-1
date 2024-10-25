public class OperatorLogika {
    public static void main(String[] args) {
        boolean a,b,c;

        // OR
        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b  + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b  + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b  + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b  + " = " + c);

        // AND
        System.out.println("==== OAND(&&) ====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b  + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b  + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b  + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b  + " = " + c);


        
        // XOR / exclusive or (^)
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b  + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b  + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b  + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b  + " = " + c);


        // NOT / negasi --> flipping (!)
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) " + " = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) " + " = " + c);
    }
}
