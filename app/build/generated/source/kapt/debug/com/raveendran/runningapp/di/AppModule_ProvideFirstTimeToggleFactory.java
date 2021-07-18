package com.raveendran.runningapp.di;

import android.content.SharedPreferences;
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
public final class AppModule_ProvideFirstTimeToggleFactory implements Factory<Boolean> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public AppModule_ProvideFirstTimeToggleFactory(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public Boolean get() {
    return provideFirstTimeToggle(sharedPrefProvider.get());
  }

  public static AppModule_ProvideFirstTimeToggleFactory create(
      Provider<SharedPreferences> sharedPrefProvider) {
    return new AppModule_ProvideFirstTimeToggleFactory(sharedPrefProvider);
  }

  public static boolean provideFirstTimeToggle(SharedPreferences sharedPref) {
    return AppModule.INSTANCE.provideFirstTimeToggle(sharedPref);
  }
}
