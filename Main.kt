import KB.Student
fun main() {
    var mark = Student("Марк", "Добрыныч", "Эльфович",
        "Мужской", "ДЗ-23", "28.11.2003", 170, 66, "фитнес");

    var john = Magistr("Джон", "Мирашниченко", "Котлова", "Женский",
        "Кр-34", "22.04.2003", 178, 56, "турник", "юрист",
        40000)

    mark.printStudentName()
    mark.printPhizicInfo()

    john.printStudentName()
    john.printSport()

    mark.printStudentName()
}