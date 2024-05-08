package com.route.e_commerce.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.route.e_commerce.R
import com.route.e_commerce.ui.theme.blue
import com.route.e_commerce.utils.AppButton
import com.route.e_commerce.utils.AppText
import com.route.e_commerce.utils.AppTextButton
import com.route.e_commerce.utils.AppTextField

@Composable
fun LoginScreen(viewModel: LoginViewModel = viewModel()) {

    Column(
        modifier = Modifier
            .fillMaxSize().background(color = blue)
            .padding(horizontal = 12.dp)
    ) {

        Spacer(Modifier.height(36.dp))

        Image(
            painter = painterResource(R.drawable.signature),
            contentDescription = stringResource(R.string.route),
            modifier = Modifier
                .fillMaxWidth().align(Alignment.CenterHorizontally)
                .padding(vertical = 36.dp)
                .size(50.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        AppText(
            title = R.string.welcome_back_to_route,
            fontColor = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
        )
        AppText(
            title = R.string.please_sign_in_with_your_mail,
            fontColor = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Light,
        )

        Spacer(Modifier.height(24.dp))

        AppText(
            modifier = Modifier.padding(vertical = 4.dp),
            title = R.string.user_name,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontColor = Color.White
        )

        AppTextField(
            viewModel(),
            modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth(),
            state = viewModel.userName,
            placeholder = R.string.enter_your_name,
        )

        AppText(
            modifier = Modifier.padding(vertical = 4.dp),
            title = R.string.password,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontColor = Color.White
        )

        AppTextField(
            viewModel(),
            modifier = Modifier.padding(top = 8.dp).fillMaxWidth(),
            placeholder = R.string.enter_your_password,
            state = viewModel.password,
            isPassword = true,
        )
        AppTextButton(
            modifier = Modifier.fillMaxWidth(),
            title = R.string.forgot_password,
            arrangement = Arrangement.End,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        ) {}

        Spacer(Modifier.height(16.dp))

        AppButton(
            modifier = Modifier.fillMaxWidth(),
            title = R.string.login,
            fontWeight = FontWeight.SemiBold,
            containerColor = Color.White,
            contentColor = blue,
            contentPadding = PaddingValues(12.dp),
            shape = RoundedCornerShape(14.dp)
        ) {}

        AppTextButton(
            modifier = Modifier.padding(vertical = 16.dp),
            title = R.string.don_t_have_an_account_create_account,
            arrangement = Arrangement.Center,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
        ) {}
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SigninScreenPreview() {
    LoginScreen()
}