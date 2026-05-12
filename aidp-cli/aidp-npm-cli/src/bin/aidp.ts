#!/usr/bin/env node
import { main } from "../cli";

main().then((exitCode) => {
  process.exitCode = exitCode;
});
