fun main() {

    var amount = 15_000
    val tax = 5
    val typeClient = true

    if (amount > 1_000 && amount <= 10_000) {
        amount -= 100
    } else if (amount > 10_000) {
        amount = amount * (100 - tax) / 100
    }
    if (typeClient) {
        amount = amount * (100 - 1) / 100
    }
    println(amount)
}