import kotlin.random.Random

fun main() {
    val likes = Random.nextInt(1, 100)
    var result = "человеку"
    if (likes === 1) {
        print("Понравилось $likes $result")
    } else if (likes >= 5 && likes <= 8) {
        print("Понравилось $likes человекам")
    } else if (likes === 21 || likes === 31 || likes === 41 || likes === 51 || likes === 61 || likes === 71 || likes === 81 || likes === 91) {
        print("Понравилось $likes человеку")
    } else {
            print("Понравилось $likes людям")
        }
    }