import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main(args: Array<String>) {

    val date:ChronoLocalDate?=LocalDate.now()
    println(date)
    if(date!=null)
      println(date.isLeapYear)

    if (date != null && date.isLeapYear) {        // 3
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) {       // 4
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        val month = date.monthValue                 // 5
        println(month)
    }
}