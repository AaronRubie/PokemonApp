package com.aaron.pokemon.viewmodel


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Pokemon (
    @Expose @SerializedName("id") val id: Int,
    @Expose @SerializedName("Nombre") val name: String,
    @Expose @SerializedName("Felicidad") val base_Happiness: Int,
    @Expose @SerializedName("Ratio de captura") val capture_Ratio: Int,
    @Expose @SerializedName("Color") val Color: String,
    @Expose @SerializedName("Grupos de Huevo") val egg_Groups: String,
)

data class Sprites (
    @Expose @SerializedName("front_default") val frontDefault: String?,
    @Expose @SerializedName("front_shiny") val frontShiny: String?
)