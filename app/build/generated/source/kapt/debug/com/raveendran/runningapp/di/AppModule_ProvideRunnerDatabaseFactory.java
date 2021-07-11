package com.raveendran.runningapp.di;

import android.content.Context;
import com.raveendran.runningapp.db.RunnerDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRunnerDatabaseFactory implements Factory<RunnerDatabase> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideRunnerDatabaseFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public RunnerDatabase get() {
    return provideRunnerDatabase(appProvider.get());
  }

  public static AppModule_ProvideRunnerDatabaseFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideRunnerDatabaseFactory(appProvider);
  }

  public static RunnerDatabase provideRunnerDatabase(Context app) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRunnerDatabase(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
