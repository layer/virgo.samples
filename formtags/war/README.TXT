================================================================================
==                    Virgo Server - Form Tags - Standard WAR                 ==
================================================================================

@author Colin Yates
@author Sam Brannen
@author Christopher Frost

--------------------------------------------------------------------------------

This is a copy of the original Spring Form Tags showcase application which has
been converted into a project format that is consistent with the adjacent
Form Tags samples. It does not utilize any server-specific features and is a
standard Java EE WAR which can be deployed to any standard Servlet container.

--------------------------------------------------------------------------------

BUILD AND DEPLOYMENT

1) $> cd formtags-war

2) $> ant jar

3) Copy target/artifacts/formtags-war.war to the SERVER_HOME/pickup directory.

--------------------------------------------------------------------------------

URL: http://localhost:8080/formtags-war

Note: the context path under which the web application is deployed is determined
      by the file name of the WAR. Thus, if you deploy a distribution JAR named
      'formtags-war-2.0.1.RELEASE.war', you will need to use the following URL:

      http://localhost:8080/formtags-war-1.0.0.RELEASE

--------------------------------------------------------------------------------
