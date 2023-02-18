package KB

open class Student (_name: String, _patromymic: String, _surname: String,
               _gender: String, _group: String, _dateOfBirth:String,
               _height: Int, _weight: Int, _sport: String){
    var name: String = _name
    var patronymic: String = _patromymic
    var surname: String = _surname
    var gender: String = _gender
    var group: String = _group
    var dateOfBirth: String = _dateOfBirth
    var height: Int= _height
    var weight: Int = _weight
    var sport: String = _sport

    open fun printStudentName() {
        println("Имя ${name}, Отчество${patronymic},Фамилия ${surname}");
    }

    open fun printPhizicInfo(){
        println("рост ${height}, вес ${weight}")
    }

    open fun printSport(){
        println("Его любимый спорт: ${sport}")
    }
}
