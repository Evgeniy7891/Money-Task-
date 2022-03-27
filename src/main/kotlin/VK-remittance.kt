fun main() {
    print("Введите сумму для перевода:")
    val amount = readLine()!!.toInt() * 100
    // minCount - сумма через которую отслеживается какая будет комиссия
    val minCount : Int = 466_666
    val commission = if (minCount < amount) amount / 100 * 0.75 / 100 else 35
    println("Ваш процент по переводом $commission рублей")
}

