package com.thisisit.grocery

data class Grocery(val name: String, val price: Double,  val image: Int)

data class PairData(val name: String, val category: List<Grocery>)

val fruitList = listOf(
    Grocery("Apple", 20.0, R.raw.red_apple),
    Grocery("Banana", 20.0, R.raw.banana),
    Grocery("Watermelon", 20.0, R.raw.watermelon),
    Grocery("Strawberry", 20.0, R.raw.strawberry)
)

val veggiesList = listOf(
    Grocery("Potato", 20.0, R.raw.potato),
    Grocery("Cabbage", 20.0, R.raw.cabbage),
    Grocery("Broccoli", 20.0, R.raw.broccoli),
    Grocery("Carrots", 20.0, R.raw.carrots)
)

val dairiesList = listOf(
    Grocery("Milk", 20.0, R.raw.milk),
    Grocery("Yogurt", 20.0, R.raw.yogurt),
    Grocery("Butter", 20.0, R.raw.butter)
)

val meatList = listOf(
    Grocery("Pork Meat", 20.0, R.raw.pork_meat),
    Grocery("Chicken Meat", 20.0, R.raw.chicken_meat),
    Grocery("Fish Meat", 20.0, R.raw.fish_meat)
)

val beverageList = listOf(
    Grocery("Tea", 20.0, R.raw.tea),
    Grocery("Coffee", 20.0, R.raw.coffee),
    Grocery("Healthiest of All!!!!!!!", 20.0, R.raw.beer)
)

val pairList = listOf(
    PairData("Fruits", fruitList),
    PairData("Veggies", veggiesList),
    PairData("Dairy", dairiesList),
    PairData("Meat", meatList),
    PairData("Beverages", beverageList)
)

val cartList = mutableListOf<Grocery>()