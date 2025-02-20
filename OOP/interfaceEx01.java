 interface I1 {
int x  = 20;
void  method1();
void  method2();
void  method3();
    
}


class I1Implementation implements I1{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
    public void method3(){
        System.out.println("Method 3");
    }
}
public class interfaceEx01 {
    public static void main(String[] args) {
       I1 i = new I1Implementation();
       i.method1();
       i.method2();
       i.method3();
      System.out.println( I1.x);
    
   }

}
