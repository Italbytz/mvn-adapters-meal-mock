package io.github.italbytz.adapters.meal

import io.github.italbytz.ports.meal.Additives
import io.github.italbytz.ports.meal.Allergens
import io.github.italbytz.ports.meal.Category
import io.github.italbytz.ports.meal.Meal


val dishes : List<Meal> = listOf(
    MockMeal("Lorem Ipsum Dish with gluten and flavor enhancer",
    "https://images.unsplash.com/photo-1546069901-ba9599a7e63c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=100&q=80",
    MockPrice(1.0,2.0,3.0,4.0),
    java.util.EnumSet.of(Allergens.GLUTEN),
    java.util.EnumSet.of(Additives.FLAVORENHANCER),
    Category.DISH),
    MockMeal("Lorem Ipsum Dish with eggs and food coloring",
        "https://images.unsplash.com/photo-1569718212165-3a8278d5f624?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=100&q=80",
        MockPrice(5.0,6.0,7.0,8.0),
        java.util.EnumSet.of(Allergens.EGGS),
        java.util.EnumSet.of(Additives.FOODCOLORING),
        Category.DISH)
)

val desserts : List<Meal> = listOf(
    MockMeal("Lorem Ipsum Dessert with eggs and flavor enhancer",
        "https://images.unsplash.com/photo-1509482560494-4126f8225994?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=100&q=80",
        MockPrice(1.1,2.1,3.1,4.1),
        java.util.EnumSet.of(Allergens.EGGS),
        java.util.EnumSet.of(Additives.FLAVORENHANCER),
        Category.DESSERT)
)
