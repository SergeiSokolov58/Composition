package com.sergeysokolov1958.composition.domain.usecases

import com.sergeysokolov1958.composition.domain.entity.GameSettings
import com.sergeysokolov1958.composition.domain.entity.Level
import com.sergeysokolov1958.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}