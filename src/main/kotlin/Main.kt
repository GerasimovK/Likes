package ru.cifrium

fun main () {
    var itemLikes: Int = 118
    var itemPeople = "People"
    var itemLast: Int = itemLikes%10
    var itemLast2: Int = itemLikes%100

    if (itemLast == 1 && itemLast2 != 11)  {
        itemPeople = "Person"
    }

    println("Likes $itemLikes $itemPeople")
}