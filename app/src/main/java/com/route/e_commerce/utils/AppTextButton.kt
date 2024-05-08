package com.route.e_commerce.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.route.e_commerce.R
import com.route.e_commerce.ui.theme.Poppins

@Composable
fun AppTextButton(
    modifier: Modifier = Modifier,
    title: Int,
    fontWeight: FontWeight,
    fontSize: TextUnit,
    arrangement: Arrangement.Horizontal = Arrangement.Start,
    onClick: () -> Unit
) {
    TextButton(
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.White
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = modifier, horizontalArrangement = arrangement) {
            Text(
                text = stringResource(title),
                fontFamily = Poppins,
                fontSize = fontSize,
                fontWeight = fontWeight,
            )
        }


    }

}
