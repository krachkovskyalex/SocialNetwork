package com.krachkovsky.socialnetwork.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.krachkovsky.socialnetwork.presentation.util.Screen

@Composable
fun StandardScaffold(
    modifier: Modifier = Modifier,
    navController: NavController,
    showBottomBar: Boolean = true,
    bottomNavItem: List<BottomNavItem> = listOf(
        BottomNavItem(
            route = Screen.MainFeedScreen.rout,
            icon = Icons.Outlined.Home,
            contentDescription = "Home"
        ),
        BottomNavItem(
            route = Screen.ChatScreen.rout,
            icon = Icons.Outlined.Message,
            contentDescription = "Message"
        ),
        BottomNavItem(route = ""),
        BottomNavItem(
            route = Screen.ActivityScreen.rout,
            icon = Icons.Outlined.Notifications,
            contentDescription = "Activity"
        ),
        BottomNavItem(
            route = Screen.ProfileScreen.rout,
            icon = Icons.Outlined.Person,
            contentDescription = "Profile"
        ),
    ),
    onFabClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    Scaffold(
        bottomBar = {
            if (showBottomBar) {
                BottomAppBar(
                    modifier = Modifier.fillMaxWidth(),
                    backgroundColor = MaterialTheme.colors.surface,
                    cutoutShape = CircleShape,
                    elevation = 5.dp
                ) {
                    BottomNavigation {
                        bottomNavItem.forEachIndexed { _, bottomNavItem ->
                            StandardBottomNavItem(
                                icon = bottomNavItem.icon,
                                contentDescription = bottomNavItem.contentDescription,
                                selected = bottomNavItem.route == navController.currentDestination?.route,
                                alertCount = bottomNavItem.alertCount,
                                enabled = bottomNavItem.icon != null
                            ) {
                                if (navController.currentDestination?.route != bottomNavItem.route) {
                                    navController.navigate(bottomNavItem.route)
                                }
                            }
                        }
                    }
                }
            }
        },
        floatingActionButton = {
            if (showBottomBar) {
                FloatingActionButton(
                    backgroundColor = MaterialTheme.colors.primary,
                    onClick = onFabClick,
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = stringResource(id = com.krachkovsky.socialnetwork.R.string.make_post)
                    )
                }
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        modifier = modifier
    ) {
        it.toString()
        content()
    }
}

