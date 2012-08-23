================================================================================
==                 Virgo Server - Form Tags - Shared Libraries WAR            ==
================================================================================

@author Colin Yates
@author Sam Brannen
@author Christopher Frost

--------------------------------------------------------------------------------

This is a version of the Spring Form Tags showcase application which has been
converted into a Shared Libraries WAR. It is a standard WAR except that all
third-party library dependencies are retrieved via the server's repository.
Consult formtags-shared-libs/src/main/webapp/META-INF/MANIFEST.MF to see how
these dependencies are declared.

--------------------------------------------------------------------------------

PROJECTS

 - formtags-shared-libs: the WAR

--------------------------------------------------------------------------------

BUILD AND DEPLOYMENT

1) $> cd formtags-shared-libs

2) $> ant jar

3) Copy target/artifacts/formtags-shared-libs.war to the SERVER_HOME/pickup
   directory.

--------------------------------------------------------------------------------

URL: http://localhost:8080/formtags-shared-libs

Note: the context path under which the web application is deployed is
      determined by the file name of the WAR. Thus, if you deploy a distribution
      JAR named 'formtags-shared-libs-2.0.1.RELEASE.war', you will need to use
      the following URL:

      http://localhost:8080/formtags-shared-libs-2.0.1.RELEASE

--------------------------------------------------------------------------------

