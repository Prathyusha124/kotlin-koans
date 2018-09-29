fun main(args: Array<String>) {
    val printHelloWorld=PrintHelloWorld()
    test(printHelloWorld)
    basicTest(printHelloWorld)
    Test1(printHelloWorld)
}

private fun test(printHelloWorld:PrintHelloWorld)
{
    printHelloWorld.basicTest()
}
private fun basicTest(printHelloWorld:PrintHelloWorld)
{
    printHelloWorld.basicEmpty()
}
private fun Test1(printHelloWorld:PrintHelloWorld)
{
    val name="Victor"
    printHelloWorld.empty(name)
}