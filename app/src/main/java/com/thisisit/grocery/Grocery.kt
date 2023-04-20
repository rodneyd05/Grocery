package com.thisisit.grocery

data class Grocery(val name: String, val price: Double,  val image: Int)

data class PairData(val name: String, val category: List<Grocery>)

val categories = listOf(
    "Fruits",
    "Veggies",
    "Dairy",
    "Meat",
    "Beverages"
)

val fruitList = listOf(
    Grocery("Apple", 20.0, R.raw.red_apple),
    Grocery("Banana", 20.0, R.raw.banana),
    Grocery("Banana", 20.0, R.raw.banana),
    Grocery("Banana", 20.0, R.raw.banana)
)

val veggiesList = listOf(
    Grocery("Potato", 20.0, R.raw.potato),
    Grocery("Cabbage", 20.0, R.raw.cabbage)
)

val dairiesList = listOf(
    Grocery("Dairy1", 20.0, R.raw.potato),
    Grocery("Dairy2", 20.0, R.raw.cabbage)
)

val meatList = listOf(
    Grocery("Meat1", 20.0, R.raw.potato),
    Grocery("Meat2", 20.0, R.raw.cabbage)
)

val beverageList = listOf(
    Grocery("Beverage1", 20.0, R.raw.potato),
    Grocery("Beverage2", 20.0, R.raw.cabbage)
)

val pairList = listOf(
    PairData("Fruits", fruitList),
    PairData("Veggies", veggiesList),
    PairData("Dairy", dairiesList),
    PairData("Meat", meatList),
    PairData("Beverages", beverageList)
)

val cartList = mutableListOf<Grocery>()