package com.lamdt.shoppingapp.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.lamdt.shoppingapp.data.entities.ShoppingItem
import com.lamdt.shoppingapp.data.repository.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository
): ViewModel() {

    fun insert(item: ShoppingItem){
        CoroutineScope(Dispatchers.Main).launch {
            repository.insert(item);
        }
    }

    fun delete(item: ShoppingItem){
        CoroutineScope(Dispatchers.Main).launch {
            repository.delete(item);
        }
    }

    fun getAllShoppingItems(){
        CoroutineScope(Dispatchers.Main).launch {
            repository.getAllShoppingItems();
        }
    }


}