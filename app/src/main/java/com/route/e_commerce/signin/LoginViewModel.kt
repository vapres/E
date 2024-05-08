package com.route.e_commerce.signin

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel(){
    var userName  = mutableStateOf("")
    var password = mutableStateOf("")
    var isVisible = mutableStateOf(false)
    val transformation =  mutableStateOf(VisualTransformation.None)

}