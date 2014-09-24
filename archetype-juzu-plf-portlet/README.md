Maven Archetype Juzu Platform Portlet
=====================

An maven archetype which contains a sample Juzu Portlet compatible working with eXo Platform.

## Usage

Creating a project from this archetype by specifying archetypeGroupId, archetypeArtifactId and archetypeVersion information.
For example, we create a project:

```
mvn archetype:generate \
    -DarchetypeGroupId=org.exoplatform.maven.archetypes \
    -DarchetypeArtifactId=archetype-juzu-plf-portlet \
    -DarchetypeVersion=1.0.0-SNAPSHOT \
    -DgroupId=org.example \
    -DartifactId=myapp \
    -DpackageName=org.example.myapp \
    -Dversion=1.0.0-SNAPSHOT \
    -DinteractiveMode=false
```

You can also specify the injection container with -DjuzuInject option, for instance:

```
mvn archetype:generate \
    -DarchetypeGroupId=org.exoplatform.maven.archetypes \
    -DarchetypeArtifactId=archetype-juzu-plf-portlet \
    -DarchetypeVersion=1.0.0-SNAPSHOT \
    -DgroupId=org.example \
    -DartifactId=myapp \
    -DpackageName=org.example.myapp \
    -Dversion=1.0.0-SNAPSHOT \
    -DjuzuInject=spring
    -DinteractiveMode=false
```

Valid juzuInject values are guice, spring or cdi. If it's omitted, guice will be used by default.


## TODOs
- Rename archetype to archetype-juzu-exoplf-portlet ?
- Provide an option to use eXo Kernel Service Provider