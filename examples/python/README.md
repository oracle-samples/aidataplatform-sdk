# Python Notebook Workflow Example

This example requires AIDP Python SDK version `1.0.0`.

## Setup

Create and activate a Python environment:

```bash
cd examples/python
python3 -m venv .venv
. .venv/bin/activate
```

Install the SDK from the GitHub release artifact. Run this command from the
directory containing the wheel, or pass the full path to the wheel:

```bash
python3 -m pip install aidp_python_client-1.0.0-py3-none-any.whl
```

If AIDP packages are available from your configured Python package index, you
can use the versioned requirements file instead:

```bash
python3 -m pip install -r requirements.txt
```

Set the environment variables from `../README.md`, then run the sample from
this directory:

```bash
python3 workflow_notebook_job_sample.py
```

The sample prints progress logs and a final JSON summary. By default it cleans
up the resources it creates. Set `AIDP_KEEP_RESOURCES=true` to inspect them
after the run.
