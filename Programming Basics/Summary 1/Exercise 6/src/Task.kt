// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  val result = s.replace("\\s+".toRegex(), "")
  for(i in result.indices){
    if( (i + 1) % 5 == 0 ) {
      println(result[i])
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/