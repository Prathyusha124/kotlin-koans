import java.nio.charset.CharacterCodingException

fun main(args: Array<String>) {
    println("Enter an Alphabet:")
    var sc= readLine()!!
    var char=sc.toCharArray()
    println(char)
    var ch=char[0]

    if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
    {
        println("${ch} is an Alphabet")
    }
    else
        println("${ch} is not an Alphabet")

}