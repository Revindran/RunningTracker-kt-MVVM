package com.raveendran.runningapp;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.raveendran.runningapp.db.RunDAO;
import com.raveendran.runningapp.db.RunnerDatabase;
import com.raveendran.runningapp.di.AppModule;
import com.raveendran.runningapp.di.AppModule_ProvideRunDaoFactory;
import com.raveendran.runningapp.di.AppModule_ProvideRunnerDatabaseFactory;
import com.raveendran.runningapp.di.AppModule_ProvideSharedPreferencesFactory;
import com.raveendran.runningapp.di.ServiceModule_ProvideBaseNotificationBuilderFactory;
import com.raveendran.runningapp.di.ServiceModule_ProvideFusedLocationProviderClientFactory;
import com.raveendran.runningapp.di.ServiceModule_ProvideMainActivityPendingIntentFactory;
import com.raveendran.runningapp.repositories.MainRepository;
import com.raveendran.runningapp.services.TrackingService;
import com.raveendran.runningapp.services.TrackingService_MembersInjector;
import com.raveendran.runningapp.ui.MainActivity;
import com.raveendran.runningapp.ui.fragments.RunFragment;
import com.raveendran.runningapp.ui.fragments.SetUpFragment;
import com.raveendran.runningapp.ui.fragments.SetUpFragment_MembersInjector;
import com.raveendran.runningapp.ui.fragments.SettingsFragment;
import com.raveendran.runningapp.ui.fragments.SettingsFragment_MembersInjector;
import com.raveendran.runningapp.ui.fragments.StatisticsFragment;
import com.raveendran.runningapp.ui.fragments.TrackingFragment;
import com.raveendran.runningapp.ui.fragments.TrackingFragment_MembersInjector;
import com.raveendran.runningapp.ui.viewmodels.MainViewModel_AssistedFactory;
import com.raveendran.runningapp.ui.viewmodels.MainViewModel_AssistedFactory_Factory;
import com.raveendran.runningapp.ui.viewmodels.StatisticsViewModel_AssistedFactory;
import com.raveendran.runningapp.ui.viewmodels.StatisticsViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerBaseApplication_HiltComponents_ApplicationC extends BaseApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object runnerDatabase = new MemoizedSentinel();

  private volatile Object runDAO = new MemoizedSentinel();

  private volatile Object sharedPreferences = new MemoizedSentinel();

  private volatile Object b = new MemoizedSentinel();

  private volatile Object f = new MemoizedSentinel();

  private DaggerBaseApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private RunnerDatabase getRunnerDatabase() {
    Object local = runnerDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = runnerDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRunnerDatabaseFactory.provideRunnerDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          runnerDatabase = DoubleCheck.reentrantCheck(runnerDatabase, local);
        }
      }
    }
    return (RunnerDatabase) local;
  }

  private RunDAO getRunDAO() {
    Object local = runDAO;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = runDAO;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRunDaoFactory.provideRunDao(getRunnerDatabase());
          runDAO = DoubleCheck.reentrantCheck(runDAO, local);
        }
      }
    }
    return (RunDAO) local;
  }

  private SharedPreferences getSharedPreferences() {
    Object local = sharedPreferences;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = sharedPreferences;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideSharedPreferencesFactory.provideSharedPreferences(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          sharedPreferences = DoubleCheck.reentrantCheck(sharedPreferences, local);
        }
      }
    }
    return (SharedPreferences) local;
  }

  private boolean getB() {
    Object local = b;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = b;
        if (local instanceof MemoizedSentinel) {
          local = AppModule.INSTANCE.provideFirstTimeToggle(getSharedPreferences());
          b = DoubleCheck.reentrantCheck(b, local);
        }
      }
    }
    return (boolean) local;
  }

  private float getF() {
    Object local = f;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = f;
        if (local instanceof MemoizedSentinel) {
          local = AppModule.INSTANCE.provideWeight(getSharedPreferences());
          f = DoubleCheck.reentrantCheck(f, local);
        }
      }
    }
    return (float) local;
  }

  @Override
  public void injectBaseApplication(BaseApplication baseApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public BaseApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerBaseApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements BaseApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public BaseApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends BaseApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements BaseApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public BaseApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends BaseApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainRepository> mainRepositoryProvider;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<StatisticsViewModel_AssistedFactory> statisticsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainRepository getMainRepository() {
        return new MainRepository(DaggerBaseApplication_HiltComponents_ApplicationC.this.getRunDAO());
      }

      private Provider<MainRepository> getMainRepositoryProvider() {
        Object local = mainRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          mainRepositoryProvider = (Provider<MainRepository>) local;
        }
        return (Provider<MainRepository>) local;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(getMainRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private StatisticsViewModel_AssistedFactory getStatisticsViewModel_AssistedFactory() {
        return StatisticsViewModel_AssistedFactory_Factory.newInstance(getMainRepositoryProvider());
      }

      private Provider<StatisticsViewModel_AssistedFactory> getStatisticsViewModel_AssistedFactoryProvider(
          ) {
        Object local = statisticsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          statisticsViewModel_AssistedFactoryProvider = (Provider<StatisticsViewModel_AssistedFactory>) local;
        }
        return (Provider<StatisticsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.raveendran.runningapp.ui.viewmodels.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider()).put("com.raveendran.runningapp.ui.viewmodels.StatisticsViewModel", (Provider) getStatisticsViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements BaseApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public BaseApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends BaseApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectRunFragment(RunFragment runFragment) {
        }

        @Override
        public void injectSetUpFragment(SetUpFragment setUpFragment) {
          injectSetUpFragment2(setUpFragment);
        }

        @Override
        public void injectSettingsFragment(SettingsFragment settingsFragment) {
          injectSettingsFragment2(settingsFragment);
        }

        @Override
        public void injectStatisticsFragment(StatisticsFragment statisticsFragment) {
        }

        @Override
        public void injectTrackingFragment(TrackingFragment trackingFragment) {
          injectTrackingFragment2(trackingFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private SetUpFragment injectSetUpFragment2(SetUpFragment instance) {
          SetUpFragment_MembersInjector.injectSharedPref(instance, DaggerBaseApplication_HiltComponents_ApplicationC.this.getSharedPreferences());
          SetUpFragment_MembersInjector.injectSetFirstAppOpen(instance, DaggerBaseApplication_HiltComponents_ApplicationC.this.getB());
          return instance;
        }

        private SettingsFragment injectSettingsFragment2(SettingsFragment instance) {
          SettingsFragment_MembersInjector.injectSharedPreferences(instance, DaggerBaseApplication_HiltComponents_ApplicationC.this.getSharedPreferences());
          return instance;
        }

        private TrackingFragment injectTrackingFragment2(TrackingFragment instance) {
          TrackingFragment_MembersInjector.injectSetWeight(instance, DaggerBaseApplication_HiltComponents_ApplicationC.this.getF());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements BaseApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public BaseApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends BaseApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements BaseApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public BaseApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends BaseApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.raveendran.runningapp.ui.viewmodels.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 1: // com.raveendran.runningapp.repositories.MainRepository 
            return (T) ActivityCImpl.this.getMainRepository();

            case 2: // com.raveendran.runningapp.ui.viewmodels.StatisticsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getStatisticsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements BaseApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public BaseApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends BaseApplication_HiltComponents.ServiceC {
    private volatile Object fusedLocationProviderClient = new MemoizedSentinel();

    private volatile Object pendingIntent = new MemoizedSentinel();

    private volatile Object notificationCompatBuilder = new MemoizedSentinel();

    private ServiceCImpl(Service service) {

    }

    private FusedLocationProviderClient getFusedLocationProviderClient() {
      Object local = fusedLocationProviderClient;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = fusedLocationProviderClient;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideFusedLocationProviderClientFactory.provideFusedLocationProviderClient(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule));
            fusedLocationProviderClient = DoubleCheck.reentrantCheck(fusedLocationProviderClient, local);
          }
        }
      }
      return (FusedLocationProviderClient) local;
    }

    private PendingIntent getPendingIntent() {
      Object local = pendingIntent;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = pendingIntent;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideMainActivityPendingIntentFactory.provideMainActivityPendingIntent(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule));
            pendingIntent = DoubleCheck.reentrantCheck(pendingIntent, local);
          }
        }
      }
      return (PendingIntent) local;
    }

    private NotificationCompat.Builder getNotificationCompatBuilder() {
      Object local = notificationCompatBuilder;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = notificationCompatBuilder;
          if (local instanceof MemoizedSentinel) {
            local = ServiceModule_ProvideBaseNotificationBuilderFactory.provideBaseNotificationBuilder(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), getPendingIntent());
            notificationCompatBuilder = DoubleCheck.reentrantCheck(notificationCompatBuilder, local);
          }
        }
      }
      return (NotificationCompat.Builder) local;
    }

    @Override
    public void injectTrackingService(TrackingService trackingService) {
      injectTrackingService2(trackingService);
    }

    private TrackingService injectTrackingService2(TrackingService instance) {
      TrackingService_MembersInjector.injectFusedLocationProviderClient(instance, getFusedLocationProviderClient());
      TrackingService_MembersInjector.injectBaseNotificationBuilder(instance, getNotificationCompatBuilder());
      return instance;
    }
  }
}
