================================================================================
==                           Virgo Server - Form Tags                         ==
================================================================================

@author Sam Brannen
@author Christopher Frost

--------------------------------------------------------------------------------

OVERVIEW

The Virgo Server - Form Tags distribution provides a set of web application 
projects which collectively demonstrate the supported packaging and deployment 
options available when migrating from a standard Java EE WAR to a PAR with a 
web bundle.

For Web Application Archives (WAR), the Virgo Server provides support for the 
following three formats.

  1. Standard Java EE WAR
  2. Shared Libraries WAR
  3. Shared Services WAR

Above and beyond WAR-based deployment formats, the Virgo Server introduces a 
deployment and packaging option for OSGi-compliant web applications, the web 
bundle format. Web modules have a structure similar to a Shared Services WAR 
and therefore build on the support for all three WAR deployment formats. In 
addition, web modules benefit from reduced configuration for Spring MVC based 
applications. 

If you want to take full advantage of all that the Virgo Server and OSGi have 
to offer, packaging and deploying your applications as a PAR or Plan is the 
recommend choice. A PAR is a standard JAR which contains all of the modules of 
your application (e.g., service, domain, and infrastructure bundles as well as 
a WAR or web bundle for web applications) in a single deployment unit. The last 
step in the migration therefore demonstrates how to package and deploy the Form 
Tags application as a service bundle and a web bundle within a PAR.

For further details, please consult the Virgo Server's Programmer Guide. You will 
find links to the most current documentation here:

http://www.eclipse.org/virgo

--------------------------------------------------------------------------------

CONTENTS

The root of the distribution contains the following folders:

 - dist:     pre-built and pre-packaged artifacts which can be deployed directly
             on the server.
 - projects: the source code and build scripts for building and packaging each 
             of the sample projects from the command line.

--------------------------------------------------------------------------------

PRE-PACKAGED DISTRIBUTABLES

If you would simply like to see the web applications in action, you can hot
deploy each of them from the command line or via drag-and-drop semantics in your
operating system's file system explorer (e.g., Windows Explorer or Mac Finder)
by copying each file to the server's 'pickup' directory as outlined below.
Alternatively, you can deploy the applications via the web-based admin console
(e.g., http://localhost:8080/admin).

Standard WAR
 - Copy dist/formtags-war-3.0.0.RELEASE.war to the SERVER_HOME/pickup
   directory.
 - Open http://localhost:8080/formtags-war-1.0.0.RELEASE

Shared Libraries WAR
 - Copy dist/formtags-shared-libs-3.0.0.RELEASE.war to the SERVER_HOME/pickup
   directory.
 - Open http://localhost:8080/formtags-shared-libs-3.0.0.RELEASE

Shared Services WAR
 - Note that the 'service' bundle must be deployed prior to the WAR.
 - Copy dist/formtags-shared-services-service-3.0.0.RELEASE.jar to the
   SERVER_HOME/pickup directory.
 - Copy dist/formtags-shared-services-war-3.0.0.RELEASE.war to the
   SERVER_HOME/pickup directory.
 - Open http://localhost:8080/formtags-shared-services-war-3.0.0.RELEASE

PAR with a Web Bundle
 - Copy dist/formtags-par-3.0.0.RELEASE.par to the SERVER_HOME/pickup
   directory.
 - Open http://localhost:8080/formtags-par

--------------------------------------------------------------------------------

MANUALLY BUILDING PROJECTS

If you would like to manually build and package any of the sample projects,
please consult the corresponding instructions at the following locations.

- war/README.TXT
- shared-libs/README.TXT
- shared-services/README.TXT
- par/README.TXT

--------------------------------------------------------------------------------
