package io.github.italbytz.adapters.meal

import io.github.italbytz.ports.meal.Category
import io.github.italbytz.ports.meal.GetMealsCommand
import io.github.italbytz.ports.meal.MealCollection
import io.github.italbytz.ports.meal.MealQuery

class MockGetMealsCommand : GetMealsCommand {
    override fun execute(
        inDTO: MealQuery,
        successHandler: (success: List<MealCollection>) -> Unit,
        errorHandler: (error: Throwable) -> Unit
    ) {
        successHandler(listOf(MockMealCollection(Category.DISH,dishes),
            MockMealCollection(Category.DESSERT, desserts)))
    }
}