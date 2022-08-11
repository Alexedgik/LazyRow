package com.example.lazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazyrow.ui.theme.Grey100
import com.example.lazyrow.ui.theme.LazyRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           LazyColumn(
               modifier = Modifier
                   .fillMaxWidth()
                   .background(Grey100)
               ) {
               itemsIndexed(
                   listOf(
                       ItemRowModel(R.drawable.image_1, "Лиза", "test kjhiued kjguoiuewf mniuhliuhf " +
                               "lkj;lkjg ;kljh;klrg ;lkjgrae ;lkj;rgtae 'ojk'pjok'jotr ;lkj'kjtgrae'lkj ae'lk;jj;l" +
                               "j;lkj;aekrjga;elkrjgkl;alkjgkrl;aelkjrgkl;aelkrjgkl;lkjekrle;lkjgkl;ae;lkjgk;aekljg" +
                               "jkijvoekjmpojkfgj;aeljrkljgkl;aeiorgjjk;erkljglkjgoierjgioijgjoieoijgjioerijgioerijgg" +
                               "jjgjggogjrorjgorjgiejgflk;kjvoiujreajk;lkjga;lkjrgkl;aelrkjgkl;era;lkejrgkl;aelrkjg;;;"),
                       ItemRowModel(R.drawable.image_2, "Миша", "test"),
                       ItemRowModel(R.drawable.image_3, "Антон", "test"),
                       ItemRowModel(R.drawable.image_4, "Егор", "test"),
                       ItemRowModel(R.drawable.image_5, "Маша", "test"),
                       ItemRowModel(R.drawable.image_6, "Максим", "test"),
                   )
               ){ _, item ->
                   MyRow(item = item)
               }

           }
        }
    }
}
