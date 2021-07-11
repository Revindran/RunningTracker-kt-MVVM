package com.raveendran.runningapp.di

import android.content.Context
import androidx.room.Room
import com.raveendran.runningapp.db.RunnerDatabase
import com.raveendran.runningapp.utils.Constants.RUNNER_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunnerDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunnerDatabase::class.java,
        RUNNER_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunnerDatabase) = db.getRunDao()
}