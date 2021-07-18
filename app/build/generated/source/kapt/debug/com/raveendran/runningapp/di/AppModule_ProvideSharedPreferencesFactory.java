package com.raveendran.runningapp.di;

import android.content.Context;
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
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideSharedPreferencesFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(appProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(appProvider);
  }

  public static SharedPreferences provideSharedPreferences(Context app) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSharedPreferences(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
