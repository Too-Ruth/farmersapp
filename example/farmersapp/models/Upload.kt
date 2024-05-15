package com.example.farmersapp.models
 class Upload{
    var name: String = ""
    var brand: String = ""
    var quantity: String = ""
    var price: String = ""
    var imageUrl: String = ""
    var id: String = ""

    constructor(name:String,brand:String, quantity:String, price:String, imageUrl:String, id:String) {

        this.name = name
        this.brand = name
        this.quantity = quantity
        this.price = price
        this.imageUrl = imageUrl
        this.id = id

    }
    constructor()
}