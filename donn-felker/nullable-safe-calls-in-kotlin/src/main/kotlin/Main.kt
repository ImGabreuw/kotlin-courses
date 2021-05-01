fun main() {
    val firstName: String = "Donn"
    val length1 = firstName.length

    val lastName: String? = "Felker"
    val length2 = lastName?.length // null, 6

    val length3 = if (lastName != null) lastName.length else 0 // 6, 0

    // Kotlin
    val length4 = lastName?.substring(0, 2)?.length

    // Java
    if (lastName != null && lastName.length > 1) {
        val length5 = lastName.length
    }

}