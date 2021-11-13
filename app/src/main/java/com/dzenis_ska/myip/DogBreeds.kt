package com.dzenis_ska.myip



data class DogBreeds(
    val weight: Weight,
    val height: Height,
    val id: Long,
    val name: String?,
    var isFavorite:Int = 0,
    var ind:Int = 0,
    var note: String?,
//    val photo:ByteArray?,
    val photo: String?,
    val bredFor: String?,
    val breedGroup: String?,
    val lifeSpan: String?,
    val temperament: String?,
    val origin: String?,
    val referenceImageId: String?,
    val image: Image,
    val countryCode: String?,
    val description: String?,
    val history: String?
)
data class Weight(
    val imperial: String?,
    val metric: String?
)
data class Height(
    val imperial: String?,
    val metric: String?
)
data class Image(
    val id: String?,
    val width: Long?,
    val height: Long?,
    val url: String?
)




