package edu.skku.cs.pa1

class Letter(alphabet: Char, val backgroundColor: Int, val textColor: Int): Comparable<Letter> {
    val alphabet: Char

    init {
        this.alphabet = alphabet.uppercaseChar()
    }

    override fun compareTo(other: Letter): Int {
        return this.alphabet.compareTo(other.alphabet)
    }

    override fun equals(other: Any?): Boolean {
        if (other is Letter) {
            return this.alphabet == other.alphabet
        }
        return false
    }
}