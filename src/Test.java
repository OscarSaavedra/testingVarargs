class Test {

    private static void testMethod(int...argument){
        System.out.println("You are using int version of the method");
        System.out.println("You have introduced ["+argument.length+"] arguments");
        System.out.print("Those arguments are:");
        for (int list:argument) {
            System.out.print(list+", ");
        }
        System.out.println();
    }

    private static void testMethod(String...argument){
        System.out.println("You are using String version of the method");
        System.out.println("You have introduced ["+argument.length+"] arguments");
        System.out.print("Those arguments are:");
        for (String list:argument) {
            System.out.print(list+", ");
        }
        System.out.println();
    }

    private static void testMethod(Boolean...argument){
        System.out.println("You are using Boolean version of the method");
        System.out.println("You have introduced ["+argument.length+"] arguments");
        System.out.print("Those arguments are:");
        for (Boolean list:argument) {
            System.out.print(list+", ");
        }
        System.out.println();
    }


    //----This method is not valid because it's ambiguous; you can  pass a String to it but the
    //compiler doesn't know if it has to do the "String text,int...argument" version or the
    //"String...argument" version.

    /*static void testMethod(String text,int...argument){
        System.out.println("You are mixing String and variable lenght arguments" +
                "of int in the method");
        System.out.println("You have introduced ["+argument.length+"] arguments");
        System.out.println("Those arguments are:");
        for (int list:argument) {
            System.out.print(list+" ");
            System.out.println();
        }
    }*/

    public static void main(String[] args) {
        System.out.println("Testing varargMethod");
        testMethod(4);
        System.out.println("--------------------");

        System.out.println("Testing varargMethod");
        testMethod(4,5,6,2,1,6,99);
        System.out.println("--------------------");

        System.out.println("Testing varargMethod");
        testMethod("Testing");
        System.out.println("--------------------");

        System.out.println("Testing varargMethod");
        testMethod(false,false,true,true,false);
        System.out.println("--------------------");

        System.out.println("Testing varargMethod");
        testMethod("Argument 1 in String","Argument 2 in String");
        System.out.println("--------------------");
    }
}
