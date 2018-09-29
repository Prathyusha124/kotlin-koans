fun main(args: Array<String>) {
    val c ='y'

    if ((c in 'a'..'z') || (c in 'A'..'Z')){
        println("${c} is an Alphabet")
    }
    else
        println("${c} is not an Alphabet")

}