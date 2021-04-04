class Retangulo(
    val altura: Int,
    val largula: Int
) {
    val isQuadrado: Boolean
        //    get() {
        //        return altura == largula
        //    }
        // OU
        get() = altura == largula
        // OU
        //    fun isQuadrado(): Boolean {
        //        return altura == largula
        //    }

}