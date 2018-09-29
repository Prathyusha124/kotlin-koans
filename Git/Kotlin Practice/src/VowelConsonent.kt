fun main(args: Array<String>) {
    var ch = 'v'
    var res = (if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant")
    println(res)

    var c = 'i'
    when (c){
        'a','e','i','o','u' -> println("Vowel")
         else -> print("Consonant")
    }
}