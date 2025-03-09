package com.example.myrecipes_app

import androidx.compose.runtime.Composable
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.*
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items


@Composable
fun Main_recipes()
{
    Box(modifier = Modifier.fillMaxSize())
    {
        Column(
            modifier = Modifier
                .padding(top = 3.dp)
                .fillMaxSize()
                .background(color = Color(0xFFF5F5F5))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(
                        color = Color(0xFFFFFFFF),
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(
                            color = Color(0xFFF5F5F5),
                        )
                        .verticalScroll(rememberScrollState())
                ) {

                    OutlinedButton(
                        onClick = { println("Pressed!") },
                        border = BorderStroke(0.dp, Color.Transparent),
                        colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
                        contentPadding = PaddingValues(),
                        modifier = Modifier
                            .padding(bottom = 8.dp, start = 4.dp, end = 4.dp) // Добавляем отступ в 17 пикселей слева
                            .clip(shape = RoundedCornerShape(120.dp))
                            .fillMaxWidth()
                            .background(
                                color = Color(0xFFFFFFFF),
                                shape = RoundedCornerShape(120.dp)
                            )
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(vertical = 11.dp, horizontal = 17.dp) // П padding остается, чтобы сохранить отступы внутри
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start // Выровнять элементы по левому краю
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.search), //search
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(end = 18.dp)
                                    .width(24.dp)
                                    .height(24.dp)
                            )
                            Text(
                                "Найти рецепт...",
                                color = Color(0xFF4B4B4B),
                                fontSize = 16.sp,
                                textAlign = TextAlign.Left
                            )
                        }
                    }

                    Column(
                        modifier = Modifier
                            .padding(bottom = 8.dp, start = 4.dp, end = 4.dp,)
                            .clip(shape = RoundedCornerShape(18.dp))
                            .fillMaxWidth()
                            .background(
                                color = Color(0xFFFFFFFF),
                                shape = RoundedCornerShape(18.dp)
                            )
                            .padding(vertical = 16.dp,)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(bottom = 15.dp, start = 20.dp, end = 20.dp,)
                                .fillMaxWidth()
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.bread),//bread
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Завтрак",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.zerno),//zerno
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Каши",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.main_dish),//main_dish
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Основные",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.salade),//salade
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Салаты",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.soop),//soop
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Супы",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(horizontal = 26.dp,)
                                .fillMaxWidth()
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.chicken_sort),//chicken
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Птица",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.meet),//meet
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Мясо",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.burger),//burger
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 5.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Необычное",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ice),//ice
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Десерты",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pancake),//pancake
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(bottom = 6.dp,)
                                        .width(24.dp)
                                        .height(24.dp)
                                )
                                Text(
                                    "Выпечка",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                    }

                    Column(
                        modifier = Modifier
                            .padding(bottom = 8.dp, start = 8.dp, end = 8.dp)
                            .fillMaxWidth()
                    ) {
                        // Первый ряд: 2 бокса
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 4.dp) // отступ между боксами
                                    .clip(RoundedCornerShape(14.dp))

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pasta_with_chorizo),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(end = 0.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 160.dp, bottom = 18.dp, start = 40.dp, end = 40.dp)
                                ) {
                                    Text(
                                        text = "Паста с чоризо",
                                        color = Color(0xFFFFFFFF),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 4.dp)
                                    .clip(RoundedCornerShape(14.dp))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.brauni),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 160.dp, bottom = 18.dp, start = 18.dp, end = 18.dp)
                                ) {
                                    Text(
                                        text = "Брауни с шоколадом",
                                        color = Color(0xFFFFFFFF),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                        }
                        // Второй ряд: 2 бокса
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 4.dp)
                                    .clip(RoundedCornerShape(14.dp))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.yagodniy_pirog),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(end = 0.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 160.dp, bottom = 18.dp, start = 40.dp, end = 40.dp)
                                ) {
                                    Text(
                                        text = "Ягодный пирог",
                                        color = Color(0xFFFFFFFF),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 4.dp)
                                    .clip(RoundedCornerShape(14.dp))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pasta_carbonara),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 159.dp, bottom = 19.dp, start = 33.dp, end = 33.dp)
                                ) {
                                    Text(
                                        text = "Паста карбонара",
                                        color = Color(0xFFFFFFFF),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,

                                        )
                                }
                            }
                        }
                        // Третий ряд: 2 бокса
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 4.dp)
                                    .clip(RoundedCornerShape(14.dp))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.oladushki),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(end = 0.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 150.dp, bottom = 12.dp, start = 21.dp, end = 21.dp)
                                ) {
                                    Text(
                                        text = "Пышные оладушки на кефире",
                                        color = Color(0xFFFFFFFF),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.width(159.dp)
                                    )
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 4.dp)
                                    .clip(RoundedCornerShape(14.dp))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.chicken_carri),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 150.dp, bottom = 12.dp)
                                ) {
                                    Text(
                                        text = "Курица в кисло сладком соусе",
                                        color = Color(0xFFFFFFFF),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier.padding(start = 39.dp, end = 29.dp)
                                    )
                                }
                            }
                        }
                    }

                }

//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(Color(0xFFFFFFFF))
//                        .padding(vertical = 21.dp, horizontal = 23.dp)
//                ) {
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .padding(bottom = 10.dp)
//                                .clip(shape = RoundedCornerShape(44.dp))
//                                .background(
//                                    color = Color(0xFFD1D1D1),
//                                    shape = RoundedCornerShape(44.dp)
//                                )
//                                .padding(horizontal = 11.dp)
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.burger_podval), // burger_main
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .width(24.dp)
//                                    .height(24.dp)
//                            )
//                        }
//                        Text("Рецепты",
//                            color = Color(0xFF4B4B4B),
//                            fontSize = 12.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .padding(bottom = 10.dp)
//                                .clip(shape = RoundedCornerShape(44.dp))
//                                .background(
//                                    color = Color(0xFFFFFFFF),
//                                    shape = RoundedCornerShape(44.dp)
//                                )
//                                .padding(horizontal = 11.dp)
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.pokupki), // покупки
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .width(24.dp)
//                                    .height(24.dp)
//                            )
//                        }
//                        Text(
//                            "Покупки",
//                            color = Color(0xFF4B4B4B),
//                            fontSize = 12.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                    ) {
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier
//                                .padding(bottom = 9.dp, start = 8.dp, end = 8.dp)
//                                .clip(shape = RoundedCornerShape(44.dp))
//                                .background(
//                                    color = Color(0xFFFFFFFF),
//                                    shape = RoundedCornerShape(44.dp)
//                                )
//                                .padding(horizontal = 11.dp)
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.bookmark), // избранное
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .width(24.dp)
//                                    .height(24.dp)
//                            )
//                        }
//                        Text(
//                            "Избранное",
//                            color = Color(0xFF4B4B4B),
//                            fontSize = 12.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .padding(bottom = 10.dp)
//                                .clip(shape = RoundedCornerShape(44.dp))
//                                .background(
//                                    color = Color(0xFFFFFFFF),
//                                    shape = RoundedCornerShape(44.dp)
//                                )
//                                .padding(horizontal = 11.dp)
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.download), // Загрузить
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .width(24.dp)
//                                    .height(24.dp)
//                            )
//                        }
//                        Text(
//                            "Загрузить",
//                            color = Color(0xFF4B4B4B),
//                            fontSize = 12.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .background(
//                            color = Color(0xFFF5F5F5),
//                        )
//                        .padding(vertical = 10.dp,)
//                ) {
//                }
            }
        }

    }
}


