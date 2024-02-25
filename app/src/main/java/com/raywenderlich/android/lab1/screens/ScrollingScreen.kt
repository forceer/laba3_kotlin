package com.raywenderlich.android.lab1.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import java.lang.reflect.Modifier

@Composable
fun ScrollingScreen(){
    MyScrollingScreen()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }

}

@Composable
fun MyScrollingScreen(){
    Column() {


    }
}

@Composable
fun BookImage(@DrawableRes  imageResId: Int, @StringRes contentDescriptionResId: Int){
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(id = contentDescriptionResId),
        contentScale = ContentScale.FillBounds,
        modifier = androidx.compose.ui.Modifier.size(416.dp, 616.dp)
    )
}