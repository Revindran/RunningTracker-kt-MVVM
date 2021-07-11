package com.raveendran.runningapp.ui.viewmodels;

import com.raveendran.runningapp.repositories.MainRepository;
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
public final class StatisticsViewModel_AssistedFactory_Factory implements Factory<StatisticsViewModel_AssistedFactory> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public StatisticsViewModel_AssistedFactory_Factory(
      Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public StatisticsViewModel_AssistedFactory get() {
    return newInstance(mainRepositoryProvider);
  }

  public static StatisticsViewModel_AssistedFactory_Factory create(
      Provider<MainRepository> mainRepositoryProvider) {
    return new StatisticsViewModel_AssistedFactory_Factory(mainRepositoryProvider);
  }

  public static StatisticsViewModel_AssistedFactory newInstance(
      Provider<MainRepository> mainRepository) {
    return new StatisticsViewModel_AssistedFactory(mainRepository);
  }
}
