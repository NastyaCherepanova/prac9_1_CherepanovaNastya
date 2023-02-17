package Films
fun main() {
    println( "1- Информация о фильме Чебурашка, 2 - Информация о фильме Брат" )
    var  x = readLine()!!.toInt()
    if (x == 1){
        var Cheburashka = Film ("Чебурашка", "3", "18.00")
        println("Введите количество зрителей")
        var spectators1 = readLine()!!.toDouble()
        Cheburashka.SetSpectrators(spectators1)
        println("Введите стоимость билета")
        var tickets1 = readLine()!!.toDouble()
        Cheburashka.SetTickets(tickets1)
        Cheburashka.Getinfo()
        Cheburashka.seans()
    }
    if (x == 2) {
        var Brat = Film("Брат", "10", "12.00")
        println("Введите количество зрителей")
        var spectators2 = readLine()!!.toDouble()
        Brat.SetSpectrators(spectators2)
        println("Введите стоимость билета")
        var tickets2 = readLine()!!.toDouble()
        Brat.SetTickets(tickets2)
        Brat.Getinfo()
        Brat.seans()
    }
}
