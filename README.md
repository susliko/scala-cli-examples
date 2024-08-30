# Scala CLI Examples

Here are some scripting scenarios that I find joyful to solve with Scala CLI.

## Installation and Setup
Either standalone (https://scala-cli.virtuslab.org/install) or as Scala official distribution (https://www.scala-lang.org/download/).

IDE functionality will work for any editor either with LSP support (Metals plugin needs to be installed) or direct BSP support (Intellij Idea):
```
scala-cli setup-ide .

```

## Use cases

### Report an issue in some Scala project
Minimize problem to fit into a single file with all dependencies declared with `using` directives and attach it to a description of GitHub.

### Implement a Proof of Concept
Jump into a script, pick needed dependencies, prototype something and share with colleagues a few resulting files.

### Maintain some micro-library
See [lib](./lib)


### Build a CLI tool
For local usage or in CI.

Could be built as a binary via Scala Native or GraalVM Native Image

See [cli](./cli)

### Build a Docker app

See [app](./app)

### Make educational materials for Scala

See [edu](./edu)

### Calculate and plot something

See [plots](./plots)
