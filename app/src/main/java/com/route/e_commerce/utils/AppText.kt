package com.route.e_commerce.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun AppText(
    modifier: Modifier = Modifier,
    title: Int,
    fontWeight: FontWeight,
    fontSize:TextUnit,
    fontColor: Color
) {
    Text(
        text = stringResource(title),
        color = fontColor,
        fontFamily = Poppins,
        fontWeight = fontWeight,
        fontSize = fontSize,
        modifier = modifier
    )

}