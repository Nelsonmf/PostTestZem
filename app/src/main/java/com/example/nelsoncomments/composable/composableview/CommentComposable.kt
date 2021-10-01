package com.example.nelsoncomments.composable.composableview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nelsoncomments.composable.common.DividerColor
import com.example.nelsoncomments.composable.common.TextDarkDescription
import com.example.nelsoncomments.composable.common.TextDescription

@Composable
fun CommentList(commentsList: List<String>) {
    Column (modifier = Modifier.background(White)
        .fillMaxWidth()){
        Text(
            text = "COMMENTS",
            style = TextDarkDescription,
            modifier = Modifier.padding(vertical = 14.dp)
                .fillMaxWidth()
                .background(LightGray)
        )
        commentsList.forEach {
            Text(
                text = it,
                style = TextDescription,
                modifier = Modifier.padding(vertical = 12.dp)
            )

            Divider(color = DividerColor)
        }
    }
}

@Preview
@Composable
fun CommentListPreview() {
    CommentList(comments)
}

private val comments = listOf(
    "Comment 1",
    "Comment 2",
    "Comment 3"
)