package edu.skku.cs.pa1

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(val wordList: List<Word>) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    inner class WordViewHolder(wordView: View) : RecyclerView.ViewHolder(wordView) {
        val wordViewList: List<TextView> = listOf(
            wordView.findViewById(R.id.firstLetterTextView),
            wordView.findViewById(R.id.secondLetterTextView),
            wordView.findViewById(R.id.thirdLetterTextView),
            wordView.findViewById(R.id.fourthLetterTextView),
            wordView.findViewById(R.id.fifthLetterTextView)
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val wordView = LayoutInflater.from(parent.context).inflate(R.layout.word_layout, parent, false)
        return WordViewHolder(wordView)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val currentWord = wordList[position]
        Log.i("position", position.toString())
        Log.i("word", currentWord.toString())
        for (i in 0..4) {
            holder.wordViewList[i].text = currentWord.letters[i].alphabet.toString()
            holder.wordViewList[i].setBackgroundColor(currentWord.letters[i].backgroundColor)
            holder.wordViewList[i].setTextColor(currentWord.letters[i].textColor)
        }
    }

    override fun getItemCount(): Int {
        return wordList.size
    }
}