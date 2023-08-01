package com.lamdt.shoppingapp.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.lamdt.shoppingapp.R
import com.lamdt.shoppingapp.data.db.ShoppingDatabase
import com.lamdt.shoppingapp.data.repository.ShoppingRepository

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        val database = ShoppingDatabase(this);
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)
        val viewModel = ViewModelProviders.of(this).get(ShoppingViewModel::class.java)

    }
}