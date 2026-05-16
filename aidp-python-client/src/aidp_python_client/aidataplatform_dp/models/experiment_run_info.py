# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentRunInfo(object):
    """
    Run metadata.
    """

    #: A constant which can be used with the status property of a ExperimentRunInfo.
    #: This constant has a value of "RUNNING"
    STATUS_RUNNING = "RUNNING"

    #: A constant which can be used with the status property of a ExperimentRunInfo.
    #: This constant has a value of "SCHEDULED"
    STATUS_SCHEDULED = "SCHEDULED"

    #: A constant which can be used with the status property of a ExperimentRunInfo.
    #: This constant has a value of "FINISHED"
    STATUS_FINISHED = "FINISHED"

    #: A constant which can be used with the status property of a ExperimentRunInfo.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a ExperimentRunInfo.
    #: This constant has a value of "KILLED"
    STATUS_KILLED = "KILLED"

    #: A constant which can be used with the status property of a ExperimentRunInfo.
    #: This constant has a value of "INTERNAL_ERROR"
    STATUS_INTERNAL_ERROR = "INTERNAL_ERROR"

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentRunInfo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this ExperimentRunInfo.
        :type run_id: str

        :param run_name:
            The value to assign to the run_name property of this ExperimentRunInfo.
        :type run_name: str

        :param experiment_id:
            The value to assign to the experiment_id property of this ExperimentRunInfo.
        :type experiment_id: str

        :param status:
            The value to assign to the status property of this ExperimentRunInfo.
            Allowed values for this property are: "RUNNING", "SCHEDULED", "FINISHED", "FAILED", "KILLED", "INTERNAL_ERROR", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param start_time:
            The value to assign to the start_time property of this ExperimentRunInfo.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this ExperimentRunInfo.
        :type end_time: int

        :param artifact_uri:
            The value to assign to the artifact_uri property of this ExperimentRunInfo.
        :type artifact_uri: str

        :param lifecycle_stage:
            The value to assign to the lifecycle_stage property of this ExperimentRunInfo.
        :type lifecycle_stage: str

        :param run_uuid:
            The value to assign to the run_uuid property of this ExperimentRunInfo.
        :type run_uuid: str

        :param user_id:
            The value to assign to the user_id property of this ExperimentRunInfo.
        :type user_id: str

        """
        self.swagger_types = {
            'run_id': 'str',
            'run_name': 'str',
            'experiment_id': 'str',
            'status': 'str',
            'start_time': 'int',
            'end_time': 'int',
            'artifact_uri': 'str',
            'lifecycle_stage': 'str',
            'run_uuid': 'str',
            'user_id': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'run_name': 'run_name',
            'experiment_id': 'experiment_id',
            'status': 'status',
            'start_time': 'start_time',
            'end_time': 'end_time',
            'artifact_uri': 'artifact_uri',
            'lifecycle_stage': 'lifecycle_stage',
            'run_uuid': 'run_uuid',
            'user_id': 'user_id'
        }

        self._run_id = None
        self._run_name = None
        self._experiment_id = None
        self._status = None
        self._start_time = None
        self._end_time = None
        self._artifact_uri = None
        self._lifecycle_stage = None
        self._run_uuid = None
        self._user_id = None

    @property
    def run_id(self):
        """
        Gets the run_id of this ExperimentRunInfo.
        Unique identifier for the run.


        :return: The run_id of this ExperimentRunInfo.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this ExperimentRunInfo.
        Unique identifier for the run.


        :param run_id: The run_id of this ExperimentRunInfo.
        :type: str
        """
        self._run_id = run_id

    @property
    def run_name(self):
        """
        Gets the run_name of this ExperimentRunInfo.
        Name of the run.


        :return: The run_name of this ExperimentRunInfo.
        :rtype: str
        """
        return self._run_name

    @run_name.setter
    def run_name(self, run_name):
        """
        Sets the run_name of this ExperimentRunInfo.
        Name of the run.


        :param run_name: The run_name of this ExperimentRunInfo.
        :type: str
        """
        self._run_name = run_name

    @property
    def experiment_id(self):
        """
        Gets the experiment_id of this ExperimentRunInfo.
        ID of the associated experiment.


        :return: The experiment_id of this ExperimentRunInfo.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this ExperimentRunInfo.
        ID of the associated experiment.


        :param experiment_id: The experiment_id of this ExperimentRunInfo.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def status(self):
        """
        Gets the status of this ExperimentRunInfo.
        Status of the run.

        Allowed values for this property are: "RUNNING", "SCHEDULED", "FINISHED", "FAILED", "KILLED", "INTERNAL_ERROR", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this ExperimentRunInfo.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this ExperimentRunInfo.
        Status of the run.


        :param status: The status of this ExperimentRunInfo.
        :type: str
        """
        allowed_values = ["RUNNING", "SCHEDULED", "FINISHED", "FAILED", "KILLED", "INTERNAL_ERROR"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def start_time(self):
        """
        Gets the start_time of this ExperimentRunInfo.
        Unix timestamp in milliseconds when the run started.


        :return: The start_time of this ExperimentRunInfo.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this ExperimentRunInfo.
        Unix timestamp in milliseconds when the run started.


        :param start_time: The start_time of this ExperimentRunInfo.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this ExperimentRunInfo.
        Unix timestamp in milliseconds when the run ended.


        :return: The end_time of this ExperimentRunInfo.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this ExperimentRunInfo.
        Unix timestamp in milliseconds when the run ended.


        :param end_time: The end_time of this ExperimentRunInfo.
        :type: int
        """
        self._end_time = end_time

    @property
    def artifact_uri(self):
        """
        Gets the artifact_uri of this ExperimentRunInfo.
        Artifact URI of the run.


        :return: The artifact_uri of this ExperimentRunInfo.
        :rtype: str
        """
        return self._artifact_uri

    @artifact_uri.setter
    def artifact_uri(self, artifact_uri):
        """
        Sets the artifact_uri of this ExperimentRunInfo.
        Artifact URI of the run.


        :param artifact_uri: The artifact_uri of this ExperimentRunInfo.
        :type: str
        """
        self._artifact_uri = artifact_uri

    @property
    def lifecycle_stage(self):
        """
        Gets the lifecycle_stage of this ExperimentRunInfo.
        Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.


        :return: The lifecycle_stage of this ExperimentRunInfo.
        :rtype: str
        """
        return self._lifecycle_stage

    @lifecycle_stage.setter
    def lifecycle_stage(self, lifecycle_stage):
        """
        Sets the lifecycle_stage of this ExperimentRunInfo.
        Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.


        :param lifecycle_stage: The lifecycle_stage of this ExperimentRunInfo.
        :type: str
        """
        self._lifecycle_stage = lifecycle_stage

    @property
    def run_uuid(self):
        """
        Gets the run_uuid of this ExperimentRunInfo.
        uuid of the run.


        :return: The run_uuid of this ExperimentRunInfo.
        :rtype: str
        """
        return self._run_uuid

    @run_uuid.setter
    def run_uuid(self, run_uuid):
        """
        Sets the run_uuid of this ExperimentRunInfo.
        uuid of the run.


        :param run_uuid: The run_uuid of this ExperimentRunInfo.
        :type: str
        """
        self._run_uuid = run_uuid

    @property
    def user_id(self):
        """
        Gets the user_id of this ExperimentRunInfo.
        User ID that created the run.


        :return: The user_id of this ExperimentRunInfo.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """
        Sets the user_id of this ExperimentRunInfo.
        User ID that created the run.


        :param user_id: The user_id of this ExperimentRunInfo.
        :type: str
        """
        self._user_id = user_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
