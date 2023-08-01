package com.lamdt.shoppingapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lamdt.shoppingapp.data.entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query(value = "SELECT * FROM shopping_item")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}