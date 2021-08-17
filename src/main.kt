import java.util.*

fun main() {
    val obj=Scanner(System.`in`)
    var str=obj.next()
    for (i in str.length - 1 downTo 0) {
        print(str[i])
    }
}