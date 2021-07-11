package com.raveendran.runningapp.repositories;

import com.raveendran.runningapp.db.RunDAO;
import dagger.internal.Factory;
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
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<RunDAO> runDaoProvider;

  public MainRepository_Factory(Provider<RunDAO> runDaoProvider) {
    this.runDaoProvider = runDaoProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(runDaoProvider.get());
  }

  public static MainRepository_Factory create(Provider<RunDAO> runDaoProvider) {
    return new MainRepository_Factory(runDaoProvider);
  }

  public static MainRepository newInstance(RunDAO runDao) {
    return new MainRepository(runDao);
  }
}
