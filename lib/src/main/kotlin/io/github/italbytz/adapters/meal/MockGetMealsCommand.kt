package io.github.italbytz.adapters.meal

import io.github.italbytz.ports.meal.Category
import io.github.italbytz.ports.meal.GetMealsCommand
import io.github.italbytz.ports.meal.MealCollection
import io.github.italbytz.ports.meal.MealQuery

class MockGetMealsCommand : GetMealsCommand {
    override suspend fun execute(inDTO: MealQuery) : List<MealCollection> {
        return listOf(MockMealCollection(Category.DISH,dishes),
            MockMealCollection(Category.DESSERT, desserts))
    }
}