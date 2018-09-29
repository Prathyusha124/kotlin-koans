fun main(args: Array<String>) {
    var nullName:String?=null
    nullName?.let{println(it.toUpperCase())} //Doesn't print values if its null
    nullName?.let{println(it.length)}

    var nullCompany:String?="124Apps"
    nullCompany?.let{println(it.toUpperCase())}
    nullCompany?.let{println(it.length)}
}