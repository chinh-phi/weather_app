package com.chinhph.weatherapp.navigation

import com.chinhph.weatherapp.utils.Constants.HOME_SCREEN

sealed class Screens(val route: String) {
    object HomeScreen : Screens(HOME_SCREEN)
}