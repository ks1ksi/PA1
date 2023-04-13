package edu.skku.cs.pa1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LetterAdapter(val letterList: List<Letter>) :
    RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {
    inner class LetterViewHolder(letterView: View) : RecyclerView.ViewHolder(letterView) {
        val letterTextView: TextView = letterView.findViewById(R.id.letterTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val letterView =
            LayoutInflater.from(parent.context).inflate(R.layout.letter_layout, parent, false)
        return LetterViewHolder(letterView)
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val currentLetter = letterList[position]
        holder.letterTextView.text = currentLetter.alphabet.toString()
        holder.letterTextView.setBackgroundColor(currentLetter.backgroundColor)
        holder.letterTextView.setTextColor(currentLetter.textColor)
    }

    override fun getItemCount(): Int {
        return letterList.size
    }
}
