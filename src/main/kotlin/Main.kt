package ru.cifrium

fun main () {
    var itemLikes: Int = 1301
    var itemPeople = "Людям"
    var itemLast: Int = itemLikes%10
    var itemLast2: Int = itemLikes%100

    if (itemLast == 1 && itemLast2 != 11)  {
        itemPeople = "Человеку"
    }

    println("Понравилось $itemLikes $itemPeople")
}