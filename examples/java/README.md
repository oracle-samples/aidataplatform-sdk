# Java Notebook Workflow Example

This example requires AIDP Java SDK version `1.0.0`.

## Setup

Make `aidp-java-client-1.0.0.jar` available in your Maven repository before
running this example:

```bash
mvn install:install-file \
  -Dfile=<path-to-artifacts>/aidp-java-client-1.0.0.jar \
  -DgroupId=com.oracle.aidataplatform \
  -DartifactId=aidp-java-client \
  -Dversion=1.0.0 \
  -Dpackaging=jar
```

Set the environment variables from `../README.md`, then run:

```bash
cd examples/java
mvn exec:java
```

The sample prints progress logs and a final JSON summary. By default it cleans
up the resources it creates. Set `AIDP_KEEP_RESOURCES=true` to inspect them
after the run.
