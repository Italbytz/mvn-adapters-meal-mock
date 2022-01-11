package io.github.italbytz.adapters.meal

import io.github.italbytz.ports.meal.Meal

class MockMealDataSource : io.github.italbytz.ports.common.DataSource<Int,Meal> {
    override suspend fun retrieve(id: Int): Meal {
        throw NotImplementedError()
    }

    override suspend fun retrieveAll(): List<Meal> {
        return dishes + desserts
    }
}