package ru.cifrium

fun main () {
    var itemLikes: Int = 11
     var itemPeople = ""

    if (itemLikes == 1)  {
        itemPeople = "Человеку"}

    if (itemLikes !=1) {
        itemPeople = "Людям"}

    println("Понравилось $itemLikes $itemPeople")
}