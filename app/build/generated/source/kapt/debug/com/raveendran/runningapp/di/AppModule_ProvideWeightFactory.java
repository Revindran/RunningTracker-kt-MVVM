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
public final class AppModule_ProvideWeightFactory implements Factory<Float> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public AppModule_ProvideWeightFactory(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public Float get() {
    return provideWeight(sharedPrefProvider.get());
  }

  public static AppModule_ProvideWeightFactory create(
      Provider<SharedPreferences> sharedPrefProvider) {
    return new AppModule_ProvideWeightFactory(sharedPrefProvider);
  }

  public static float provideWeight(SharedPreferences sharedPref) {
    return AppModule.INSTANCE.provideWeight(sharedPref);
  }
}
