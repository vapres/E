package com.route.e_commerce.signup

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SignupViewModel:ViewModel() {

    var fullNameState = mutableStateOf("")
    var mobileNumberState = mutableStateOf("")
    var emailAddressState = mutableStateOf("")
    var passwordState = mutableStateOf("")
}
