fun main(args: Array<String>) {

    var neverNull: String = "This can't be null"
    println(neverNull)

    var nullable: String? = "You can keep a null here"

    //nullable = null
    println(nullable)

    if(nullable!=null)
        println(nullable.toUpperCase())
    else
        println("Hello, world!")

//    //nullable =null
//    println(nullable?.toUpperCase())

    var inferredNonNull = "The compiler assumes non-null"
    println(inferredNonNull)

    var nullVar:String?=null
    println(nullVar?.toUpperCase())
    println(nullVar?.length)
}