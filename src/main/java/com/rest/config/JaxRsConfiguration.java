package com.rest.config;

import org.eclipse.microprofile.auth.LoginConfig;

import javax.annotation.security.DeclareRoles;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Daniel Mezzavilla
 */
@ApplicationPath("/rest")
@LoginConfig(authMethod = "MP-JWT")
@DeclareRoles({"mysimplerole", "admin"})
public class JaxRsConfiguration extends Application {

}

