/*
 * Copyright (c) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.sports.data

import com.example.android.sports.R
import com.example.android.sports.model.Sport

/**
 * Sports data
 */
object SportsData{
    fun getSportsData(): ArrayList<Sport> {
        return arrayListOf(
            Sport(
                id = 1,
                titleResourceId = R.string.kimnamjoon,
                subTitleResourceId = R.string.kimnamjoon_subtitle,
                imageResourceId = R.drawable.icon_kimnamjoon,
                sportsImageBanner = R.drawable.img_kimnamjoon
            ),
            Sport(
                id = 2, titleResourceId = R.string.kimseokjin,
                subTitleResourceId = R.string.kimseokjin_subtitle,
                imageResourceId = R.drawable.icon_kimseokjin,
                sportsImageBanner = R.drawable.img_kimseokjin
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.minyoongi,
                subTitleResourceId = R.string.minyoongi_subtitle,
                imageResourceId = R.drawable.icon_minyoongi,
                sportsImageBanner = R.drawable.img_minyoongi
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.junghoseok,
                subTitleResourceId = R.string.junghoseok_subtitle,
                imageResourceId = R.drawable.icon_junghoseok,
                sportsImageBanner = R.drawable.img_junghoseok
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.parkjimin,
                subTitleResourceId = R.string.parkjimin_subtitle,
                imageResourceId = R.drawable.icon_parkjimin,
                sportsImageBanner = R.drawable.img_parkjimin
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.kimtaehyung,
                subTitleResourceId = R.string.kimtaehyung_subtitle,
                imageResourceId = R.drawable.icon_kimtaehyung,
                sportsImageBanner = R.drawable.img_kimtaehyung
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.jeonjeongguk,
                subTitleResourceId = R.string.jeonjeongguk_subtitle,
                imageResourceId = R.drawable.icon_jeonjongguk,
                sportsImageBanner = R.drawable.img_jeonjeongguk
            ),
        )
    }
}
