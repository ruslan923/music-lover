package ru.netology

fun main() {
    val costSong = 300
    val countSong = 5
    val buyPrevious = 10001
    val buyNext = costSong * countSong
    val regularCustomer = true

    val amount = when (buyPrevious) {
        in 0..1_000 -> buyNext
        in 1_001..10_000 -> buyNext - 100
        else -> buyNext * 0.95
    }

    val totalAmount = if (regularCustomer) {
        amount.toDouble() * 0.99
    } else {
        amount
    }
    println("Сумма вашей покупки составила - $totalAmount рублей")
}
