package com.route.e_commerce.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.route.e_commerce.utils.AppTextField

@Composable
fun SignupScreen(
    viewModel: SignupViewModel = viewModel(),
    onSignupClick: (() -> Unit)? = null
) {

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
            modifier = Modifier.padding(vertical = 4.dp),
            title = R.string.full_name,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontColor = Color.White
        )

        AppTextField(
            viewModel(),
            modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth(),
            state = viewModel.fullNameState,
            placeholder = R.string.enter_your_full_name,
        )

        AppText(
            modifier = Modifier.padding(vertical = 4.dp),
            title = R.string.mobile_number,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontColor = Color.White
        )

        AppTextField(
            viewModel(),
            modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth(),
            state = viewModel.mobileNumberState,
            placeholder = R.string.enter_your_mobile_no,
        )

        AppText(
            modifier = Modifier.padding(vertical = 4.dp),
            title = R.string.e_mail_address,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontColor = Color.White
        )

        AppTextField(
            viewModel(),
            modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth(),
            state = viewModel.emailAddressState,
            placeholder = R.string.enter_your_email_address,
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
            modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth(),
            state = viewModel.passwordState,
            placeholder = R.string.enter_your_password,
            isPassword = true
        )

        Spacer(Modifier.height(36.dp))

        AppButton(
            modifier = Modifier.fillMaxWidth(),
            title = R.string.sign_up,
            fontWeight = FontWeight.SemiBold,
            containerColor = Color.White,
            contentColor = blue,
            contentPadding = PaddingValues(12.dp),
            shape = RoundedCornerShape(14.dp)
        ) {}
    }

}

@Preview(showSystemUi = true)
@Composable
private fun SignupScreenPreview() {
    SignupScreen()
}