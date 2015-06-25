package org.cloudcog.kani.services;

public interface ModuleServiceListener {

	public void moduleRegistered(ModuleService source, Module module);

	public void moduleUnregistered(ModuleService source, Module module);

}
