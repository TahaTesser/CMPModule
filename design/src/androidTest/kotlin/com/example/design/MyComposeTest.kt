package com.example.design

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

// https://developer.android.com/develop/ui/compose/testing
class MyComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun myTest() {
        // Start the app
        composeTestRule.setContent {
            MaterialTheme {
                SliderMinimalExample()
            }
        }

        composeTestRule.onNodeWithText("0.0").assertIsDisplayed()
    }
}
