//  static class B {
                    // not allowed
// }



//  final class  B{
                 // allowed
// }



//  volatile class  B{
//                  not allowed
// }


//  native class  B{
//                  // not allowed
// }



//  transient class  B{
//                 // not allowed
// }


 abstract class  B{
                //  allowed
}



//  strictfp class  B{
//                 //  allowed
// }


//  synchronized class  B{
//                 //  not allowed
// }




public class AccessModifierEx02 {
    public static void main(String[] args) {
    
    }

}


// To define some extra nature to the Java programming Elements,
// static, final, abstract, volatile, native,
//final, abstract and  of the access modifiers are allowed strictfp,....
// From the above list of access modifiers, only 
// strictfp are allowed for classes and the rest
// not allowed for the classes.
// transient, synchronized,
// 



// In the case of Inner classes, the access modifiers like static, final,
// abstract and strictfp are allowed and the remaining access modifiers are
// not allowed.