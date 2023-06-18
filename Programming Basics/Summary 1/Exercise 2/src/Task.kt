// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  TODO()
  val result = ""
  val size = s.length
  for(i in 1..size step 2){
    result += s[i-1]
  }
  println(result)
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/