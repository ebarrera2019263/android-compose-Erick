package com.zezzi.eventzezziapp.ui.meals.view


import androidx.lifecycle.ViewModel
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse

import android.util.Log
import com.zezzi.eventzezziapp.data.repository.MealsRepository

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    suspend fun getMeals(): MealsCategoriesResponse? {
        return try {
            val response = repository.getMeals()

            Log.d("MealsCategoriesViewModel", "Response: $response")
            response
        } catch (e: Exception) {

            null
        }
    }
}