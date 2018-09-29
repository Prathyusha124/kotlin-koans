fun main(args: Array<String>) {
    var c='!'
    when
    {
        ((c in 'a'..'z')||(c in 'A'..'Z')) -> println("${c} is an Alphabet")
        else -> println("${c} is not an Alphabet")
    }
}