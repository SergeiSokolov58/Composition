package com.sergeysokolov1958.composition.domain.repository

import com.sergeysokolov1958.composition.domain.entity.GameSettings
import com.sergeysokolov1958.composition.domain.entity.Level
import com.sergeysokolov1958.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}