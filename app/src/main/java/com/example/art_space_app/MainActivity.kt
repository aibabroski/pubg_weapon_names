package com.example.art_space_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.art_space_app.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
                    ArtSpaceDisplay()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceDisplay(modifier: Modifier = Modifier) {
    val firstWeapon = R.drawable.pubg_akm
    val secondWeapon = R.drawable.pubg_ace32
    val thirdWeapon = R.drawable.pubg_g36c
    val fourthWeapon = R.drawable.pubg_qbz95
    val fifthWeapon = R.drawable.pubg_m416
    val sixthWeapon = R.drawable.pubg_aug_a3
    val seventhWeapon = R.drawable.pubg_beryl_m762
    val eighthWeapon = R.drawable.pubg_m16a4
    val ninthWeapon = R.drawable.pubg_scar_l

    var title by remember {
        mutableIntStateOf(R.string.ak47)
    }

    var year by remember {
        mutableIntStateOf(R.string.ak47_year)
    }

    var currentWeapon by remember {
        mutableIntStateOf(firstWeapon)
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ArtWorkDisplay(currentWeapon = currentWeapon)
        Spacer(modifier = modifier.size(16.dp))
        ArtWorkTitle(title = title, year = year)
        Spacer(modifier = modifier.size(25.dp))
        Row (
            modifier = modifier.padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ){
            // Previous Button
            Button(
                onClick = {
                    when(currentWeapon){
                        firstWeapon -> {
                            currentWeapon = ninthWeapon
                            title = R.string.scar_l
                            year = R.string.scar_l_year
                        }
                        secondWeapon -> {
                            currentWeapon = firstWeapon
                            title = R.string.ak47
                            year = R.string.ak47_year
                        }
                        thirdWeapon -> {
                            currentWeapon = secondWeapon
                            title = R.string.ace32
                            year = R.string.ace32_year
                        }
                        fourthWeapon -> {
                            currentWeapon = thirdWeapon
                            title = R.string.g36c
                            year = R.string.g36c_year
                        }
                        fifthWeapon -> {
                            currentWeapon = fourthWeapon
                            title = R.string.qbz95
                            year = R.string.qbz95_year
                        }
                        sixthWeapon -> {
                            currentWeapon = fifthWeapon
                            title = R.string.m416
                            year = R.string.m416_year
                        }
                        seventhWeapon -> {
                            currentWeapon = sixthWeapon
                            title = R.string.aug_a3
                            year = R.string.aug_a3_year
                        }
                        eighthWeapon -> {
                            currentWeapon = seventhWeapon
                            title = R.string.m762
                            year = R.string.m762_year
                        }
                        else -> {
                            currentWeapon = eighthWeapon
                            title = R.string.m16a4
                            year = R.string.m16a4_year
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.purple_700)
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                )
            ){
                Text(
                    text = "Previous",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.teal_200)
                )
            }

            // Next Button
            Button(
                onClick = {
                    when(currentWeapon){
                        firstWeapon -> {
                            currentWeapon = secondWeapon
                            title = R.string.ace32
                            year = R.string.ace32_year
                        }
                        secondWeapon ->{
                            currentWeapon = thirdWeapon
                            title = R.string.g36c
                            year = R.string.g36c_year
                        }
                        thirdWeapon -> {
                            currentWeapon = fourthWeapon
                            title = R.string.qbz95
                            year = R.string.qbz95_year
                        }
                        fourthWeapon -> {
                            currentWeapon = fifthWeapon
                            title = R.string.m416
                            year = R.string.m416_year
                        }
                        fifthWeapon -> {
                            currentWeapon = sixthWeapon
                            title = R.string.aug_a3
                            year = R.string.aug_a3_year
                        }
                        sixthWeapon -> {
                            currentWeapon = seventhWeapon
                            title = R.string.m762
                            year = R.string.m762_year
                        }
                        seventhWeapon -> {
                            currentWeapon = eighthWeapon
                            title = R.string.m16a4
                            year = R.string.m16a4_year
                        }
                        eighthWeapon -> {
                            currentWeapon = ninthWeapon
                            title = R.string.scar_l
                            year = R.string.scar_l_year
                        }
                        else -> {
                            currentWeapon = firstWeapon
                            title = R.string.ak47
                            year = R.string.ak47_year
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.purple_700)
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                )
            )
            {
                Text(
                    text = "Next",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(id = R.color.teal_200)
                )
            }
        }
    }
}


@Composable
fun ArtWorkDisplay(
    modifier: Modifier = Modifier,
    @DrawableRes currentWeapon: Int
){
    Image(
        painter = painterResource(currentWeapon),
        contentDescription = stringResource(R.string.ace32),
        modifier = modifier.fillMaxWidth(),
        contentScale = ContentScale.Fit
    )
}

@Composable
fun ArtWorkTitle(
    @StringRes title: Int,
    @StringRes year: Int
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Artwork title
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.teal_700),
            fontSize = 32.sp
        )

        // Artwork year
        Text(
            text = "— ${stringResource(id = year)} —",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.purple_500)
        )
    }
}

@Preview
@Composable
fun ArtSpaceDisplayPreview() {
    ArtSpaceAppTheme {
        ArtSpaceDisplay()
    }
}