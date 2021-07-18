package com.raveendran.runningapp.ui.fragments;

import dagger.MembersInjector;
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
public final class TrackingFragment_MembersInjector implements MembersInjector<TrackingFragment> {
  private final Provider<Float> p0Provider;

  public TrackingFragment_MembersInjector(Provider<Float> p0Provider) {
    this.p0Provider = p0Provider;
  }

  public static MembersInjector<TrackingFragment> create(Provider<Float> p0Provider) {
    return new TrackingFragment_MembersInjector(p0Provider);
  }

  @Override
  public void injectMembers(TrackingFragment instance) {
    injectSetWeight(instance, p0Provider.get());
  }

  public static void injectSetWeight(TrackingFragment instance, float p0) {
    instance.setWeight(p0);
  }
}
