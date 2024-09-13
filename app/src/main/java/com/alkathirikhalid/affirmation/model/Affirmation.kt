package com.alkathirikhalid.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 *
 * @author alkathirikhalid
 * @project Compose Affirmation
 * @date 13/09/2024
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
