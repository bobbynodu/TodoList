package com.example.todo_app.model

import retrofit2.http.GET
import java.util.concurrent.CountedCompleter

data class Todo(
    var userId: Int,
    var id: Int,
    var title: String,
    var completed: Boolean
)
