import java.util.Scanner;
fun main(args: Array<String>) {
    println("Enter a Number:")
    var sc = readLine()!!
    var n1 = sc.toInt()
    println("Enter another Number:")
    var sc1= readLine()!!
    var n2 = sc1.toInt()

    println("Enter another Number:")
    var sc2= readLine()!!
    var n3 = Integer.valueOf(sc2)
    //println("Value of sc=${Integer.valueOf(sc2)}")
    var sum = n1 + n2 + n3
    println("Sum=" + sum)
    print("Addition=${sum}")

}