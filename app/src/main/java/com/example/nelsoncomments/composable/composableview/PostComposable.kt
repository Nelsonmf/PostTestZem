package com.example.nelsoncomments.composable.composableview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nelsoncomments.composable.common.SectionTitle
import com.example.nelsoncomments.composable.common.TextDescription

@Composable
fun PostView(
    postItem: PostItem
) {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(all = 20.dp)
    ) {
        Text(
            text = "Description",
            style = SectionTitle,
            modifier = Modifier.padding(bottom = 14.dp)
        )
        Text(
            text = postItem.body,
            style = TextDescription,
            modifier = Modifier.padding(bottom = 14.dp)
        )
        Text(
            text = "User",
            style = SectionTitle,
            modifier = Modifier.padding(bottom = 14.dp)
        )
        Text(
            text = "Name: ${postItem.user.name}",
            style = TextDescription,
            modifier = Modifier.padding(bottom = 14.dp)
        )
        Text(
            text = "Email: ${postItem.user.email}",
            style = TextDescription,
            modifier = Modifier.padding(bottom = 14.dp)
        )
        Text(
            text = "Phone: ${postItem.user.phone}",
            style = TextDescription,
            modifier = Modifier.padding(bottom = 14.dp)
        )
        postItem.user.website?.let {
            Text(
                text = "Website: ${postItem.user.website}",
                style = TextDescription,
                modifier = Modifier.padding(bottom = 24.dp)
            )
        }
        CommentList(commentsList = post.comments)
    }
}

@Preview
@Composable
fun PostViewPreview() {
    PostView(post)
}

data class PostItem(
    val body: String,
    val id: Int,
    val user: User,
    val comments: List<String>
)

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val website: String? = null
)

val user = User(
    id = 17,
    name = "Nelson",
    email = "nelmof@gmail.com",
    phone = "+57 3005961928",
)

val post = PostItem(
    body = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the " +
            "industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and " +
            "scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
            "electronic typesetting, remaining essentially unchanged.",
    id = 3,
    user = user,
    comments = listOf(
        "Comment 1",
        "Comment 2",
        "Comment 3"
    )
)