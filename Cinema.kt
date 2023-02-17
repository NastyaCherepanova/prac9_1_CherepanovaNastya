package Films
import sun.security.krb5.internal.Ticket
import java.util.*
open class Cinema (var filmname: String, var hall: String, var seans: String,){
    open fun seans(){
       println("Начало фильма: ${seans}")
    }
    open fun Getinfo(){
        println("Информация о фильме")
        println("Називание фильма: ${filmname}, Зал: ${hall}")
    }

}