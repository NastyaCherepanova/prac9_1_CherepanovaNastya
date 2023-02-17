package Films

import java.util.*

class Film (Name: String, Hall:String, Seans: String): Cinema(Name, Hall, Seans)
{
    private var tickets : Double = 250.0
    public fun GetTicket(): Double {
        return tickets
    }
    public fun SetTickets  (ticket: Double){
        if (ticket<0){
            println("Цена билета должна быть больше 0 рублей")
        }
        else{
            this.tickets = tickets
        }
    }

    private  var spectators: Double = 30.0
    public fun GetSpectators(): Double{
        return spectators
    }
    public fun SetSpectrators(spectators: Double) {
    if (spectators<0)
    {
       println("Зрителей не может быть меньше 0")
    }
        else{
            this.spectators=spectators
        }
    }
    override fun seans(){
        println("Начало фильма : ${seans}")
    }

    override fun Getinfo() {
        println("Информация о фильме")
        println("Название фильма : ${filmname}")
        println("Зал: : ${hall}")
        println("Количество зрителей : ${spectators}")
        println("Стоимость билета : ${tickets}")

    }
}

