package edu.skku.cs.pa1

class Word(val letters: MutableList<Letter>) {
    override fun toString(): String {
        var str = ""
        for (letter in letters) {
            str += letter.alphabet
        }
        return str
    }
}