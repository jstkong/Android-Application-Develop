package com.example.rally

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink

interface RallyDestination {
    val icon: ImageVector
    val route:String
}

object Overview : RallyDestination {
    override val icon = Icons.Filled.Create
    override val route = "overview"
}

object Accounts : RallyDestination{
    override val icon = Icons.Filled.AccountBox
    override val route = "accounts"
}

object Bills : RallyDestination {
    override val icon = Icons.Filled.Call
    override val route = "bills"
}

object SingleAccount : RallyDestination {
    override val icon = Icons.Filled.AddCircle
    override val route = "Single_account"
    const val accountTypeArg = "account_type"
    val routeWithargs = "$route/{$accountTypeArg}"
    val argument = listOf(
        navArgument(accountTypeArg){ type = NavType.StringType}
    )
    val deepLink = listOf(
        navDeepLink { uriPattern = "rally://$route/{$accountTypeArg}" }
    )
}
val rallyTabRowScreens = listOf(Overview, Accounts, Bills)