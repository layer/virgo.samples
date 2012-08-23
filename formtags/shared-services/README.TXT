================================================================================
==                 Virgo Server - Form Tags - Shared Services WAR             ==
================================================================================

@author Sam Brannen
@author Colin Yates
@author Christopher Frost

--------------------------------------------------------------------------------

This is a version of the Spring Form Tags showcase application which builds upon
the benefits of the Shared Libraries WAR. In addition to externalizing
third-party library dependencies, this example externalizes the service layer
by splitting the Shared Libraries WAR into a service bundle and a Shared
Services WAR.

--------------------------------------------------------------------------------

PROJECTS

 - formtags-shared-services-service: the service bundle
 - formtags-shared-services-war:     the WAR

--------------------------------------------------------------------------------

BUILD AND DEPLOYMENT

1) Build and deploy the service bundle:

  a) $> cd formtags-shared-services-service
  b) $> ant jar
  c) Copy target/artifacts/formtags-shared-services-service.jar to the
     SERVER_HOME_HOME/pickup directory.

2) Build and deploy the WAR:

  a) $> cd ../formtags-shared-services-war 
  b) $> ant jar
  c) Copy target/artifacts/formtags-shared-services-war.war to the 
     SERVER_HOME/pickup directory.

--------------------------------------------------------------------------------

URL: http://localhost:8080/formtags-shared-services-war

Note: the context path under which the web application is deployed is
      determined by the file name of the WAR. Thus, if you deploy a distribution
      JAR named 'formtags-shared-services-war-2.0.1.RELEASE.war', you will need
      to use the following URL:

      http://localhost:8080/formtags-shared-services-war-1.0.0.RELEASE

--------------------------------------------------------------------------------
