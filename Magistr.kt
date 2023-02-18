import KB.Student

class Magistr(_name: String, _patromymic: String, _surname: String,
              _gender: String, _group: String, _dateOfBirth:String,
              _height: Int, _weight: Int, _sport: String, _specialization: String, _salary: Int ):
    Student(_name, _patromymic, _surname, _gender, _group,
        _dateOfBirth, _height, _weight, _sport  ) {

        var specialization: String = _specialization
        var salary: Int = _salary

    fun printNumberYear(){
        when (specialization){
            "юрист" -> println ("Учиться 4 года")
            "прокурор" -> println ("учиться 5 лет")
            "дизайнер" -> println ("Учиться 2 года")
            else -> {"Такой специальности нет"}
        }
    }

    fun printSalary(){
        when (salary){
            40000 -> println ("Ваша зарплата средняя")
            15000 -> println ("ваша зарплата маленькая по россии")
            80000 -> println ("ваша зарлата высокая по россии")
            else -> {"Такой специальности нет"}
        }
    }

    fun printInfo(){
        print("Магистратура хороший выбор")
    }
    }
