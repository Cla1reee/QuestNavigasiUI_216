@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.navigasi.view

import androidx.compose.runtime.Composable

@Composable
fun TampilData(
    items: List<Pair<String, String>> = emptyList(),
    onBackBtnClick: () -> Unit = {}
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) {
    }
}