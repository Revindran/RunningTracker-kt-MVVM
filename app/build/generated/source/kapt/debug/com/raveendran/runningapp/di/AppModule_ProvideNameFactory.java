package com.raveendran.runningapp.di;

import android.content.SharedPreferences;
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
public final class AppModule_ProvideNameFactory implements Factory<String> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public AppModule_ProvideNameFactory(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public String get() {
    return provideName(sharedPrefProvider.get());
  }

  public static AppModule_ProvideNameFactory create(
      Provider<SharedPreferences> sharedPrefProvider) {
    return new AppModule_ProvideNameFactory(sharedPrefProvider);
  }

  public static String provideName(SharedPreferences sharedPref) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideName(sharedPref), "Cannot return null from a non-@Nullable @Provides method");
  }
}
