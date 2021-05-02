fun main() {
    val lastName: String? = "Falker"

    val length1: Int = if (lastName != null) lastName.length else 0

    val length2: Int = lastName?.length ?: 0
}