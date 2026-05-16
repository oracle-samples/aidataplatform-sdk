# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelVersionDeploymentJobState(object):
    """
    ModelVersion tag.
    """

    #: A constant which can be used with the job_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED"
    JOB_STATE_DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED = "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED"

    #: A constant which can be used with the job_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "NOT_SET_UP"
    JOB_STATE_NOT_SET_UP = "NOT_SET_UP"

    #: A constant which can be used with the job_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "CONNECTED"
    JOB_STATE_CONNECTED = "CONNECTED"

    #: A constant which can be used with the job_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "NOT_FOUND"
    JOB_STATE_NOT_FOUND = "NOT_FOUND"

    #: A constant which can be used with the job_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "REQUIRED_PARAMETERS_CHANGED"
    JOB_STATE_REQUIRED_PARAMETERS_CHANGED = "REQUIRED_PARAMETERS_CHANGED"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED"
    RUN_STATE_DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED = "DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "NO_VALID_DEPLOYMENT_JOB_FOUND"
    RUN_STATE_NO_VALID_DEPLOYMENT_JOB_FOUND = "NO_VALID_DEPLOYMENT_JOB_FOUND"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "RUNNING"
    RUN_STATE_RUNNING = "RUNNING"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "SUCCEEDED"
    RUN_STATE_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "FAILED"
    RUN_STATE_FAILED = "FAILED"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "PENDING"
    RUN_STATE_PENDING = "PENDING"

    #: A constant which can be used with the run_state property of a ModelVersionDeploymentJobState.
    #: This constant has a value of "APPROVAL"
    RUN_STATE_APPROVAL = "APPROVAL"

    def __init__(self, **kwargs):
        """
        Initializes a new ModelVersionDeploymentJobState object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param job_id:
            The value to assign to the job_id property of this ModelVersionDeploymentJobState.
        :type job_id: str

        :param run_id:
            The value to assign to the run_id property of this ModelVersionDeploymentJobState.
        :type run_id: str

        :param job_state:
            The value to assign to the job_state property of this ModelVersionDeploymentJobState.
            Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type job_state: str

        :param run_state:
            The value to assign to the run_state property of this ModelVersionDeploymentJobState.
            Allowed values for this property are: "DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED", "NO_VALID_DEPLOYMENT_JOB_FOUND", "RUNNING", "SUCCEEDED", "FAILED", "PENDING", "APPROVAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type run_state: str

        :param current_task_name:
            The value to assign to the current_task_name property of this ModelVersionDeploymentJobState.
        :type current_task_name: str

        """
        self.swagger_types = {
            'job_id': 'str',
            'run_id': 'str',
            'job_state': 'str',
            'run_state': 'str',
            'current_task_name': 'str'
        }

        self.attribute_map = {
            'job_id': 'job_id',
            'run_id': 'run_id',
            'job_state': 'job_state',
            'run_state': 'run_state',
            'current_task_name': 'current_task_name'
        }

        self._job_id = None
        self._run_id = None
        self._job_state = None
        self._run_state = None
        self._current_task_name = None

    @property
    def job_id(self):
        """
        Gets the job_id of this ModelVersionDeploymentJobState.
        Job ID.


        :return: The job_id of this ModelVersionDeploymentJobState.
        :rtype: str
        """
        return self._job_id

    @job_id.setter
    def job_id(self, job_id):
        """
        Sets the job_id of this ModelVersionDeploymentJobState.
        Job ID.


        :param job_id: The job_id of this ModelVersionDeploymentJobState.
        :type: str
        """
        self._job_id = job_id

    @property
    def run_id(self):
        """
        Gets the run_id of this ModelVersionDeploymentJobState.
        Run ID.


        :return: The run_id of this ModelVersionDeploymentJobState.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this ModelVersionDeploymentJobState.
        Run ID.


        :param run_id: The run_id of this ModelVersionDeploymentJobState.
        :type: str
        """
        self._run_id = run_id

    @property
    def job_state(self):
        """
        Gets the job_state of this ModelVersionDeploymentJobState.
        Job state.

        Allowed values for this property are: "DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The job_state of this ModelVersionDeploymentJobState.
        :rtype: str
        """
        return self._job_state

    @job_state.setter
    def job_state(self, job_state):
        """
        Sets the job_state of this ModelVersionDeploymentJobState.
        Job state.


        :param job_state: The job_state of this ModelVersionDeploymentJobState.
        :type: str
        """
        allowed_values = ["DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED", "NOT_SET_UP", "CONNECTED", "NOT_FOUND", "REQUIRED_PARAMETERS_CHANGED"]
        if not value_allowed_none_or_none_sentinel(job_state, allowed_values):
            job_state = 'UNKNOWN_ENUM_VALUE'
        self._job_state = job_state

    @property
    def run_state(self):
        """
        Gets the run_state of this ModelVersionDeploymentJobState.
        Run state.

        Allowed values for this property are: "DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED", "NO_VALID_DEPLOYMENT_JOB_FOUND", "RUNNING", "SUCCEEDED", "FAILED", "PENDING", "APPROVAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The run_state of this ModelVersionDeploymentJobState.
        :rtype: str
        """
        return self._run_state

    @run_state.setter
    def run_state(self, run_state):
        """
        Sets the run_state of this ModelVersionDeploymentJobState.
        Run state.


        :param run_state: The run_state of this ModelVersionDeploymentJobState.
        :type: str
        """
        allowed_values = ["DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED", "NO_VALID_DEPLOYMENT_JOB_FOUND", "RUNNING", "SUCCEEDED", "FAILED", "PENDING", "APPROVAL"]
        if not value_allowed_none_or_none_sentinel(run_state, allowed_values):
            run_state = 'UNKNOWN_ENUM_VALUE'
        self._run_state = run_state

    @property
    def current_task_name(self):
        """
        Gets the current_task_name of this ModelVersionDeploymentJobState.
        Current task name.


        :return: The current_task_name of this ModelVersionDeploymentJobState.
        :rtype: str
        """
        return self._current_task_name

    @current_task_name.setter
    def current_task_name(self, current_task_name):
        """
        Sets the current_task_name of this ModelVersionDeploymentJobState.
        Current task name.


        :param current_task_name: The current_task_name of this ModelVersionDeploymentJobState.
        :type: str
        """
        self._current_task_name = current_task_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
