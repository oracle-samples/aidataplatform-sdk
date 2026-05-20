#!/usr/bin/env node
// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import { main } from "../cli";

main().then((exitCode) => {
  process.exitCode = exitCode;
});
