class VariablesDemo1 {
    int age = 25;
    String myName = "Vijay";
    double myHeight = 5.8;
    char myGrade = 'A';
    boolean isSingle = true;

    public static void main(String[] arg) {
        VariablesDemo1 myDetails = new VariablesDemo1();
        System.out.println("My age is " + myDetails.age);
        System.out.println("My Height is " + myDetails.myHeight);
        System.out.println("My Name is " + myDetails.myName);
        System.out.println("i am still Single is that " + myDetails.isSingle + "&& my Grade is" + myDetails.myGrade);
    }
}
