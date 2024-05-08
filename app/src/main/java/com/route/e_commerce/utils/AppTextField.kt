package com.route.e_commerce.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.route.e_commerce.R
import com.route.e_commerce.signin.LoginViewModel
import com.route.e_commerce.ui.theme.Poppins
import com.route.e_commerce.ui.theme.grey

@Composable
fun AppTextField(
    vm: LoginViewModel,
    modifier: Modifier = Modifier,
    state: MutableState<String>,
    placeholder: Int,
    isPassword: Boolean = false,
) {

    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        trailingIcon = {
            if (isPassword && state.value.isNotEmpty())
                ToggleVisibility(vm, vm.isVisible)
        },
        visualTransformation = if (isPassword) vm.transformation.value else VisualTransformation.None,
        keyboardOptions =
        if (isPassword) KeyboardOptions(keyboardType = KeyboardType.Password) else KeyboardOptions(),
        placeholder = {
            Text(
                text = stringResource(placeholder),
                color = grey,
                fontFamily = Poppins,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(14.dp),
        singleLine = true,
        maxLines = 1,
        modifier = modifier
    )

}

@Composable
fun ToggleVisibility(viewModel: LoginViewModel, isVisible: MutableState<Boolean>) {
    viewModel.transformation.value =
        if (isVisible.value) VisualTransformation.None else PasswordVisualTransformation()

    val onClick: () -> Unit = { isVisible.value = !isVisible.value }

    val imageRes = if (isVisible.value) R.drawable.ic_visible else R.drawable.ic_not_visible

    val contentDesc =
        if (isVisible.value) stringResource(R.string.visible) else stringResource(R.string.not_visible)

    Image(
        painterResource(imageRes),
        contentDesc,
        Modifier.clickable { onClick() }.size(24.dp)
    )
}

