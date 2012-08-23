================================================================================
==                        Virgo Server - Form Tags - PAR                      ==
================================================================================

@author Sam Brannen
@author Colin Yates
@author Christopher Frost

--------------------------------------------------------------------------------

This is a version of the Spring Form Tags showcase application which has been
converted into a PAR with domain and service bundles as well as a Web Module.

--------------------------------------------------------------------------------

PROJECTS

 - org.springframework.showcase.formtags:         the build directory for the PAR
 - org.springframework.showcase.formtags.domain:  the domain classes
 - org.springframework.showcase.formtags.service: the service API and implementation
 - org.springframework.showcase.formtags.web:     the web module

--------------------------------------------------------------------------------

BUILD AND DEPLOYMENT

1) $> cd org.springframework.showcase.formtags

2) $> ant jar

3) Copy target/artifacts/formtags-par.par to the $SERVER_HOME/pickup directory.

--------------------------------------------------------------------------------

URL: http://localhost:8080/formtags-par

--------------------------------------------------------------------------------
