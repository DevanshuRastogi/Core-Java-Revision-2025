
//  class A{
//  private int  a = 30;
// }


// public class AccessModifierEx01 {

//     public static void main(String[] args) {
//         A j = new A();
//         System.out.println(j.a); // becoz a is private ist scope is upto the class in which it is defined
//     }
// }

//  class A{
//  protected int  a = 30;
// }


// public class AccessModifierEx01 extends  A {

//     public static void main(String[] args) {
//         A j = new A();
//         System.out.println(j.a); // becoz a is protected its scope is upto the class and all packages inheriting the class  in which it is defined
//     }
// }


// public class A{
//      int  a = 30;
//    }
   
   
//     class AccessModifierEx01{
   
//        public static void main(String[] args) {
//            A j = new A();
//            System.out.println(j.a); // now class A is public its accessible in whole application 
//        }
//    }





 class A{
    
    

    private class B{
    }
    protected class C{
    }
    public class D{
    }
     class E{
    }
     // so firstly nesting one class in another is posssible in java , the nested class is called inner class
     //  for inner class all types of access modifiers are allowed ;
     // but why not for outer class 
     // actually when we nest the class , the inner class become the member of the the class and all access modifiers are allowed on class member
     // on the other hand the outer class is envelope so it can't have all access modifiers

  }
  
  
  public class AccessModifierEx01{
  
      public static void main(String[] args) {
          // now class A is public its accessible in whole application 
      }
  }