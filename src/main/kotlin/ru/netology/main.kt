package ru.netology

fun main() {
    val costSong = 250
    val countSong = 3
    var buyPrevious = 200
    val buyNext = costSong * countSong
    val buyWithDiscountMin = buyNext - 100
    val buyWithDiscountMax = buyNext - (buyNext * 0.05)
    val discountRegularCustomerMin = buyWithDiscountMin - (buyWithDiscountMin * 0.01)
    val discountRegularCustomerMax = buyWithDiscountMax - (buyWithDiscountMax * 0.01)
    val regularCustomer = true


    if (buyPrevious in 0..1000) {
        println("Сумма вашей покупки составила $buyNext руб.")
        print("На вашем счете $buyPrevious рублей")
    } else {
        if (buyPrevious in 1001..10_000 && regularCustomer) {
            print(
                "Сумма вашей покупки как постоянного покупателя $discountRegularCustomerMin руб.")
        } else {
            if (buyPrevious in 1001..10_000 && !regularCustomer) {
                print("Сумма вашей покупки с учетом скидки $buyWithDiscountMin руб.")
            } else {
                if (buyPrevious >= 10_001 && regularCustomer) {
                    print("Сумма вашей покупки как постоянного покупателя $discountRegularCustomerMax")
                } else {
                    if (buyPrevious >= 10_001 && !regularCustomer) {
                        print("Сумма вашей покупки с учетом скидки $buyWithDiscountMax руб.")
                    }
                }
            }
        }
    }
    buyPrevious += buyNext
    print("\nНа вашем счете $buyPrevious")
}