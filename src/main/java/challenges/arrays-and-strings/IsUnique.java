//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

//learned: StringIndexOutOfBoundsException thrown when index for charAt is negative, too high, or equal to string length

package challenges;

//without additional data structures:

public class IsUnique {

  public Boolean allUnique(String stringInput) {
    for (int i = 0; i < stringInput.length(); i++) {
      for (int j = i + 1; j < stringInput.length(); j++) {
        if (stringInput.charAt(i) == stringInput.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }
}

//using additional data structures:

// import java.util.ArrayList;
//
// public class IsUnique {
//
//     public Boolean allUnique(String stringInput) {
//       ArrayList charArray = new ArrayList();
//         for (int i=0; i<stringInput.length(); i++ ) {
//           System.out.println(stringInput.charAt(i));
//           if (charArray.contains(stringInput.charAt(i))) {
//             return false;
//           } else if (i == stringInput.length()-1) {
//             return true;
//           } else {
//             charArray.add(stringInput.charAt(i));
//           }
//         }
//         return true;
//     }
//
// }
