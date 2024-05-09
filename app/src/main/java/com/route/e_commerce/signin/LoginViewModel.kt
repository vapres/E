package com.route.e_commerce.signin

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel(){
    var userNameState  = mutableStateOf("")
    var passwordState = mutableStateOf("")
    var isVisibleState = mutableStateOf(false)
    var transformationState =  mutableStateOf(VisualTransformation.None)

}