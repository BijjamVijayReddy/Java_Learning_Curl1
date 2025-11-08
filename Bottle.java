

class Demo {

    //  method 
  public  void m2(){
        System.out.println("Object ");
    }


}


 class Bottle {
    // Method 
   public void m1(){
        System.out.println("Checking");
    }

    //  Main Methods
    public static void main (String[] args){
        Bottle check  = new Bottle() ;  // object 
     
     Demo poly = new Demo();
         poly.m2();
        check.m1(); 
    }
 }


