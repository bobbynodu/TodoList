package com.example.todo_app.viewmodel

import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {
    val todos = mutableListOf<String>()

    init {
        todos.add("Item 1")
        todos.add("Item 2")
        todos.add("Item 3")
    }
}