import kotlin.random.Random

fun main () {
    // Через boolean - клиент постоянный или нет, sumCount - потраченные деньги
    val client: Boolean = Random.nextBoolean()
    val sumCount = Random.nextInt(1, 20_000)
    if (client == true && sumCount > 1000 && sumCount < 10_000) {
        // скидка -100 р
        var discount = sumCount - 100
        // скидка 1%
        val regular = discount / 100 * 1
        val result = discount - regular
        val sumDiscount = 100 + regular
        println("Вы постоянный клиент $client вы купили на сумму $sumCount сумма вашей скидки $sumDiscount и ваша конечная цена составила $result")
    } else if (client == false && sumCount > 1000 && sumCount < 10_000) {
        val result = sumCount - 100
        println("Вы постоянный клиент $client вы купили на сумму $sumCount и ваша конечная цена составила $result")
    } else if (client == true && sumCount > 0 && sumCount < 1000) {
        val regular = sumCount / 100 * 1
        val result = sumCount - regular
        println("Вы постоянный клиент $client вы купили на сумму $sumCount сумма вашей скидки $regular и ваша конечная цена составила $result")
    } else if (client == false && sumCount > 0 && sumCount < 1000) {
        val result = sumCount
        println("Вы постоянный клиент $client вы купили на сумму $sumCount и ваша конечная цена составила $result")
    } else if (client == true && sumCount > 10_000) {
        val superDiscount = sumCount / 100 * 5
        var discount = sumCount - superDiscount
        val regular = discount / 100 * 1
        val result = discount - regular
        val sumDiscount = superDiscount + regular
        println("Вы постоянный клиент $client вы купили на сумму $sumCount сумма вашей скидки $sumDiscount и ваша конечная цена составила $result")
    } else if (client == false && sumCount > 10_000) {
        // скидка от 5%
        val superDiscount = sumCount / 100 * 5
        var discount = sumCount - superDiscount
        val result = discount
        println("Вы постоянный клиент $client вы купили на сумму $sumCount сумма вашей скидки $superDiscount и ваша конечная цена составила $result")
    }
}
