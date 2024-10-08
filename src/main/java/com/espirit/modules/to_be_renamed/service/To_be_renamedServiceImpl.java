package com.espirit.modules.to_be_renamed.service;

import com.espirit.moddev.components.annotations.ServiceComponent;
import de.espirit.firstspirit.module.ServerEnvironment;
import de.espirit.firstspirit.module.ServiceProxy;
import de.espirit.firstspirit.module.descriptor.ComponentDescriptor;
import org.jetbrains.annotations.Nullable;

@ServiceComponent(name = To_be_renamedServiceImpl.SERVICE_NAME, displayName = "To_be_renamed Service", configurable = To_be_renamedServiceConfig.class)
public class To_be_renamedServiceImpl implements To_be_renamedService {

  public static final String SERVICE_NAME = "To_be_renamedService";

  private boolean running = false;
  private boolean initWithoutError = false;

  @Override public void init(ComponentDescriptor componentDescriptor, ServerEnvironment serverEnvironment) {
    // Do something when the service is initialized

    initWithoutError = true;
  }

  @Override public void installed() {
    // Do something when installing the service
  }

  @Override public void uninstalling() {
    // Do something when uninstalling the service
  }

  @Override public void updated(String s) {
    // Do something when updating the service
  }

  @Override public void start() {
    // Do something when the service is started

    running = initWithoutError;
  }

  @Override public void stop() {
    // Do something when the service is stopped

    running = false;
  }

  @Override public boolean isRunning() {
    return running;
  }

  @Override public @Nullable Class<? extends To_be_renamedService> getServiceInterface() {
    return To_be_renamedService.class;
  }

  @Override public @Nullable Class<? extends ServiceProxy<To_be_renamedService>> getProxyClass() {
    return null;
  }

  @Override public void someCustomMethod() {
    // Do something when the custom method from the service interface is called
  }
}
