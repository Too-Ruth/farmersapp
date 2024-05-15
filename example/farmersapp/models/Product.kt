package com.example.farmersapp.models

class Product {

    var name: String = ""
    var brand: String = ""
    var quantity: String = ""
    var price: String = ""
    var imageUrl: String = ""
    var id: String = ""

    constructor(name: String, brand: String,quantity: String, price: String,  id: String) {

        this.name = name
        this.brand = brand
        this.quantity = quantity
        this.price = price
        this.imageUrl = imageUrl
        this.id = id

    }

    constructor(name: String, brand: String, quantity: String, price: String)
}


