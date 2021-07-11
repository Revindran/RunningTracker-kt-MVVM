package com.raveendran.runningapp.di;

import com.raveendran.runningapp.db.RunDAO;
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
public final class AppModule_ProvideRunDaoFactory implements Factory<RunDAO> {
  private final Provider<RunnerDatabase> dbProvider;

  public AppModule_ProvideRunDaoFactory(Provider<RunnerDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public RunDAO get() {
    return provideRunDao(dbProvider.get());
  }

  public static AppModule_ProvideRunDaoFactory create(Provider<RunnerDatabase> dbProvider) {
    return new AppModule_ProvideRunDaoFactory(dbProvider);
  }

  public static RunDAO provideRunDao(RunnerDatabase db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRunDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
