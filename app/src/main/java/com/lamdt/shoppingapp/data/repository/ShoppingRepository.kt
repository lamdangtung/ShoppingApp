package com.lamdt.shoppingapp.data.repository

import com.lamdt.shoppingapp.data.db.ShoppingDatabase
import com.lamdt.shoppingapp.data.entities.ShoppingItem

class ShoppingRepository(private val db:ShoppingDatabase) {
    suspend fun insert(item: ShoppingItem){
        db.getShoppingDao().insert(item);
    }

    suspend fun delete(item: ShoppingItem){
        db.getShoppingDao().delete(item)
    }

    fun getAllShoppingItems() {
        db.getShoppingDao().getAllShoppingItems()
    }

}