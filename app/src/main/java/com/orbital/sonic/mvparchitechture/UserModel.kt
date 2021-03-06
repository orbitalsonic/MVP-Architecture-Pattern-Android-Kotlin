package com.orbital.sonic.mvparchitechture

data class UserModel(var userName: String, var password: String){

    fun checkUserValidity(username: String, password: String): Boolean {
        return username.isNotEmpty() || password.isNotEmpty()
    }
}
