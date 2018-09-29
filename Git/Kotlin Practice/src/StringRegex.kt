fun main(args: Array<String>) {
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
   var str=("""(\d{2})\ ${month}""").toRegex()
    print(str)
}