package com.example.rally.data

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import java.time.temporal.TemporalAmount

@Immutable
data class Account(
    val name: String,
    val number: Int,
    val balance:Float,
    val color: Color
)

@Immutable
data class Bill(
    val name: String,
    val due:String,
    val amount: Float,
    val color: Color
)

object UserData {
    val accounts: List<Account> = listOf(
        Account(
            "Checking",
            1234,
            2215.13f,
            Color(0x00000099)
        ),
        Account(
            "Home Savings",
            5678,
            8676.88f,
            Color(0x00000099)
        )
    )
    val bills: List<Bill> = listOf(
        Bill(
            "江世堂",
            "Jan 29",
            45.36f,
            Color(0x00000099)
        ),
        Bill(
            "Rent",
            "Feb 9",
            1200f,
            Color(0x00000099)
        ),
    )

    fun getAccount(accountName: String?): Account {
        return accounts.first { it.name == accountName }
    }
}