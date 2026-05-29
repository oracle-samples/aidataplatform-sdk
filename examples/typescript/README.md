# TypeScript Notebook Workflow Example

This example requires AIDP TypeScript/Node.js SDK version `1.0.0`.

## Setup

Install the SDK from the GitHub release artifact. Run this command from this
example directory, using the tarball path from your release artifact directory:

```bash
cd examples/typescript
npm install --no-save <path-to-artifacts>/aidp-typescript-client-1.0.0.tgz oci-common@2.126.3 typescript@^5.8.3 ts-node@^10.9.2 @types/node@^22.15.30
```

If AIDP packages are available from your configured npm registry, you can use
the versioned dependency in `package.json` instead:

```bash
npm install
```

Set the environment variables from `../README.md`, then run:

```bash
npm run workflow:notebook
```

The sample prints progress logs and a final JSON summary. By default it cleans
up the resources it creates. Set `AIDP_KEEP_RESOURCES=true` to inspect them
after the run.
