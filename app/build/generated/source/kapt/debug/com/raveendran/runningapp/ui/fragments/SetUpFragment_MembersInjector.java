package com.raveendran.runningapp.ui.fragments;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class SetUpFragment_MembersInjector implements MembersInjector<SetUpFragment> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  private final Provider<Boolean> p0Provider;

  public SetUpFragment_MembersInjector(Provider<SharedPreferences> sharedPrefProvider,
      Provider<Boolean> p0Provider) {
    this.sharedPrefProvider = sharedPrefProvider;
    this.p0Provider = p0Provider;
  }

  public static MembersInjector<SetUpFragment> create(
      Provider<SharedPreferences> sharedPrefProvider, Provider<Boolean> p0Provider) {
    return new SetUpFragment_MembersInjector(sharedPrefProvider, p0Provider);
  }

  @Override
  public void injectMembers(SetUpFragment instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
    injectSetFirstAppOpen(instance, p0Provider.get());
  }

  @InjectedFieldSignature("com.raveendran.runningapp.ui.fragments.SetUpFragment.sharedPref")
  public static void injectSharedPref(SetUpFragment instance, SharedPreferences sharedPref) {
    instance.sharedPref = sharedPref;
  }

  public static void injectSetFirstAppOpen(SetUpFragment instance, boolean p0) {
    instance.setFirstAppOpen(p0);
  }
}
