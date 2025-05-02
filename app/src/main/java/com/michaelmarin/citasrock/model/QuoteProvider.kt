package com.michaelmarin.citasrock.model

class QuoteProvider {
    companion object{

        fun random():QuoteModel{
            val position = (0..4).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                "Nunca a un ser extraño le llamé mi familia.",
                "Enrique Bunbury (Flor de loto)"
            ),
            QuoteModel(
                "This is the end, beautiful friend.",
                "The Doors (The end)"
            ),
            QuoteModel(
                "Falló mi corazón y desde que partió, su verbo vive en mi carne.",
                "Gustavo Cerati (Verbo carne)"
            ),
            QuoteModel(
                "Ángel que pasa besa y te abraza, Ángel para un final.",
                "Los Bunkers (Ángel para un final)"
            ),
            QuoteModel(
                "Yo no sé que hacer, con el pasado que nos desgató.",
                "Odisseo (Ingenuos)"
            )
        )
    }
}