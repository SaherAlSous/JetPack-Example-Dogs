package com.saheralsous.dogs.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity // we can set a different table name than the class name
data class DogBreed(

    @ColumnInfo(name = "breed id") //putting a different name for the column
    @SerializedName("id")
    val breedId: String?,

    @ColumnInfo(name ="dog_name")
    @SerializedName("name")
    val dogBreed: String?,

    @ColumnInfo(name = "life_span")
    @SerializedName("life_span")
    val LifeSpan: String?,

    @ColumnInfo(name = "breed_group")
    @SerializedName("breed_group")
    val breedGroup: String?,

    @ColumnInfo(name = "bred_for")
    @SerializedName("bred_for")
    val bredFor:String?,

    @SerializedName("temperament")
    val temperament : String?,

    @ColumnInfo(name = "dog_url")
    @SerializedName("url")
    val imageUrl : String?
){
    /**
     * creating a value for [PrimaryKey]
     */
    @PrimaryKey(autoGenerate = true)
    var uuid: Int = 0
}

/**
 * creating a class for palette
 */
data class DogPalette(var color : Int)
