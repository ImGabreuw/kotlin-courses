fun main() {
    // Integer numbers
    val myByte: Byte = 8 // <=> 8-bit signed integer
    val myShort: Short = 16 // <=> 16-bit signed integer
    val myInt: Int = 32 // <=> 32-bit signed integer
    val myLong: Long = 64 // <=> 64-bit signed integer

    // Decimals numbers
    val myFloat: Float = 3.14F // <=> 32-bit floating point number
    val myDouble: Double = 3.1415 // <=> 64-bit float point number

    println(myByte.toDouble()) // transforma Byte para Double
    println(myByte.toLong()) // transforma Byte para Long

    val bigLong: Long = 1_000_000 // 1 milhão
    println(bigLong)

    // Com +
    val newInt = myInt + 12
    println(newInt)

    // Com .plus()
    val newInt2 = myInt.plus(12)
    println(newInt2)

    // Com .minus()
    val newInt3 = myInt.minus(12)
    println(newInt3)
}