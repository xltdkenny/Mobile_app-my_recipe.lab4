package com.example.myrecipes_app

import androidx.compose.runtime.Composable
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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

@Composable
fun Purchases()
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
                            .padding(bottom = 8.dp, start = 4.dp, end = 4.dp,)
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
                                painter = painterResource(id = R.drawable.plus), //добавить
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(end = 18.dp,)
                                    .width(24.dp)
                                    .height(24.dp)
                            )
                            Text(
                                "Добавить ингредиент",
                                color = Color(0xFF4B4B4B),
                                fontSize = 16.sp,
                                textAlign = TextAlign.Left
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(bottom = 8.dp,)
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(bottom = 333.dp,)
                                .fillMaxWidth()
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 10.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Чоризо — 4 шт ",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Оливкое масло — 4 ст. л. ",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 29.dp,)
                            ) {
                                Text(
                                    "Красный лук — 4 шт.",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Чеснок — 4 зубчика",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 8.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Белое вино (сухое) — 400 мл",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Томатная паста — 8 ст. л.",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Орегано — 4 ст. л.",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Базилик — 2 пучка",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Сливки — 800 мл",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 29.dp,)
                            ) {
                                Text(
                                    "Вода от варки пасты — 8 половника",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 8.dp, horizontal = 29.dp,)
                            ) {
                                Text(
                                    "Паста (пенне) — 1600 г",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(bottom = 4.dp, start = 4.dp, end = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 8.dp, horizontal = 29.dp,)
                            ) {
                                Text(
                                    "Пармезан (тертый) — 120 г",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding(horizontal = 4.dp,)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(18.dp)
                                    )
                                    .padding(vertical = 9.dp, horizontal = 28.dp,)
                            ) {
                                Text(
                                    "Страчателла — 600 г",
                                    color = Color(0xFF4B4B4B),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .padding(3.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sell), //убрать из покупок
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(bottom = 5.dp,)
                                            .width(20.dp)
                                            .height(20.dp)
                                    )
                                }
                            }
                        }
                    }
                }
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.SpaceBetween,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .background(Color(0xFFFFFFFF))
//                            .padding(vertical = 21.dp, horizontal = 23.dp)
//                    ) {
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                        ) {
//                            Column(
//                                modifier = Modifier
//                                    .padding(bottom = 10.dp)
//                                    .clip(shape = RoundedCornerShape(44.dp))
//                                    .background(
//                                        color = Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(44.dp)
//                                    )
//                                    .padding(horizontal = 11.dp)
//                            ) {
//                                Image(
//                                    painter = painterResource(id = R.drawable.burger_podval), // burger_main
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .width(24.dp)
//                                        .height(24.dp)
//                                )
//                            }
//                            Text(
//                                "Рецепты",
//                                color = Color(0xFF4B4B4B),
//                                fontSize = 12.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                        ) {
//                            Column(
//                                modifier = Modifier
//                                    .padding(bottom = 10.dp)
//                                    .clip(shape = RoundedCornerShape(44.dp))
//                                    .background(
//                                        color = Color(0xFFD1D1D1),
//                                        shape = RoundedCornerShape(44.dp)
//                                    )
//                                    .padding(horizontal = 11.dp)
//                            ) {
//                                Image(
//                                    painter = painterResource(id = R.drawable.pokupki), // покупки
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .width(24.dp)
//                                        .height(24.dp)
//                                )
//                            }
//                            Text(
//                                "Покупки",
//                                color = Color(0xFF4B4B4B),
//                                fontSize = 12.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                        ) {
//                            Column(
//                                horizontalAlignment = Alignment.CenterHorizontally,
//                                modifier = Modifier
//                                    .padding(bottom = 9.dp, start = 8.dp, end = 8.dp)
//                                    .clip(shape = RoundedCornerShape(44.dp))
//                                    .background(
//                                        color = Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(44.dp)
//                                    )
//                                    .padding(horizontal = 11.dp)
//                            ) {
//                                Image(
//                                    painter = painterResource(id = R.drawable.bookmark), // избранное
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .width(24.dp)
//                                        .height(24.dp)
//                                )
//                            }
//                            Text(
//                                "Избранное",
//                                color = Color(0xFF4B4B4B),
//                                fontSize = 12.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier.weight(1f) // Применяем вес для равномерного распределения
//                        ) {
//                            Column(
//                                modifier = Modifier
//                                    .padding(bottom = 10.dp)
//                                    .clip(shape = RoundedCornerShape(44.dp))
//                                    .background(
//                                        color = Color(0xFFFFFFFF),
//                                        shape = RoundedCornerShape(44.dp)
//                                    )
//                                    .padding(horizontal = 11.dp)
//                            ) {
//                                Image(
//                                    painter = painterResource(id = R.drawable.download), // Загрузить
//                                    contentDescription = null,
//                                    modifier = Modifier
//                                        .width(24.dp)
//                                        .height(24.dp)
//                                )
//                            }
//                            Text(
//                                "Загрузить",
//                                color = Color(0xFF4B4B4B),
//                                fontSize = 12.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                    }
//
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .background(
//                                color = Color(0xFFF5F5F5),
//                            )
//                            .padding(vertical = 10.dp,)
//                    ) {
//
//                    }

            }
        }
    }
}
