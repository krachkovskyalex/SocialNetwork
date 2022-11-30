package com.krachkovsky.socialnetwork.presentation.main_feed

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.krachkovsky.socialnetwork.presentation.components.Post

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    Post(
        post = com.krachkovsky.socialnetwork.domain.models.Post(
            username = "Alex Krachkovsky",
            imageUrl = "",
            profilePictureUrl = "",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting " +
                    "industry. Lorem Ipsum has been the industry's standard dummy text ever" +
                    " since the 1500s, when an unknown printer took a galley of type and " +
                    "scrambled it to make a type specimen book. It has survived not only" +
                    " five centuries, but also the leap into electronic typesetting," +
                    " remaining essentially unchanged. It was popularised in the 1960s" +
                    " with the release of Letraset sheets containing Lorem Ipsum passages," +
                    " and more recently with desktop publishing software like Aldus PageMaker" +
                    " including versions of Lorem Ipsum.",
            likeCount = 17,
            commentCount = 7
        )
    )
}