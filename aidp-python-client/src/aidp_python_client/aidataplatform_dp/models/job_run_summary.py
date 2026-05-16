# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JobRunSummary(object):
    """
    Summary information about a job run.
    """

    #: A constant which can be used with the launched property of a JobRunSummary.
    #: This constant has a value of "SCHEDULED"
    LAUNCHED_SCHEDULED = "SCHEDULED"

    #: A constant which can be used with the launched property of a JobRunSummary.
    #: This constant has a value of "MANUAL"
    LAUNCHED_MANUAL = "MANUAL"

    def __init__(self, **kwargs):
        """
        Initializes a new JobRunSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this JobRunSummary.
        :type key: str

        :param name:
            The value to assign to the name property of this JobRunSummary.
        :type name: str

        :param state:
            The value to assign to the state property of this JobRunSummary.
        :type state: oci.aidataplatform_dp.models.State

        :param job_key:
            The value to assign to the job_key property of this JobRunSummary.
        :type job_key: str

        :param job_name:
            The value to assign to the job_name property of this JobRunSummary.
        :type job_name: str

        :param execution_duration:
            The value to assign to the execution_duration property of this JobRunSummary.
        :type execution_duration: int

        :param launched:
            The value to assign to the launched property of this JobRunSummary.
            Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type launched: str

        :param start_time:
            The value to assign to the start_time property of this JobRunSummary.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this JobRunSummary.
        :type end_time: int

        :param time_created:
            The value to assign to the time_created property of this JobRunSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this JobRunSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this JobRunSummary.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this JobRunSummary.
        :type created_by_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'name': 'str',
            'state': 'State',
            'job_key': 'str',
            'job_name': 'str',
            'execution_duration': 'int',
            'launched': 'str',
            'start_time': 'int',
            'end_time': 'int',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'created_by_name': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'name': 'name',
            'state': 'state',
            'job_key': 'jobKey',
            'job_name': 'jobName',
            'execution_duration': 'executionDuration',
            'launched': 'launched',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName'
        }

        self._key = None
        self._name = None
        self._state = None
        self._job_key = None
        self._job_name = None
        self._execution_duration = None
        self._launched = None
        self._start_time = None
        self._end_time = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._created_by_name = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this JobRunSummary.
        The OCID of the job run.


        :return: The key of this JobRunSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this JobRunSummary.
        The OCID of the job run.


        :param key: The key of this JobRunSummary.
        :type: str
        """
        self._key = key

    @property
    def name(self):
        """
        Gets the name of this JobRunSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The name of this JobRunSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this JobRunSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param name: The name of this JobRunSummary.
        :type: str
        """
        self._name = name

    @property
    def state(self):
        """
        Gets the state of this JobRunSummary.

        :return: The state of this JobRunSummary.
        :rtype: oci.aidataplatform_dp.models.State
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this JobRunSummary.

        :param state: The state of this JobRunSummary.
        :type: oci.aidataplatform_dp.models.State
        """
        self._state = state

    @property
    def job_key(self):
        """
        Gets the job_key of this JobRunSummary.
        The OCID of the job.


        :return: The job_key of this JobRunSummary.
        :rtype: str
        """
        return self._job_key

    @job_key.setter
    def job_key(self, job_key):
        """
        Sets the job_key of this JobRunSummary.
        The OCID of the job.


        :param job_key: The job_key of this JobRunSummary.
        :type: str
        """
        self._job_key = job_key

    @property
    def job_name(self):
        """
        Gets the job_name of this JobRunSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :return: The job_name of this JobRunSummary.
        :rtype: str
        """
        return self._job_name

    @job_name.setter
    def job_name(self, job_name):
        """
        Sets the job_name of this JobRunSummary.
        A user-friendly name. Does not have to be unique, and is changeable.


        :param job_name: The job_name of this JobRunSummary.
        :type: str
        """
        self._job_name = job_name

    @property
    def execution_duration(self):
        """
        Gets the execution_duration of this JobRunSummary.
        The time (in milliseconds) taken to complete the job execution.


        :return: The execution_duration of this JobRunSummary.
        :rtype: int
        """
        return self._execution_duration

    @execution_duration.setter
    def execution_duration(self, execution_duration):
        """
        Sets the execution_duration of this JobRunSummary.
        The time (in milliseconds) taken to complete the job execution.


        :param execution_duration: The execution_duration of this JobRunSummary.
        :type: int
        """
        self._execution_duration = execution_duration

    @property
    def launched(self):
        """
        Gets the launched of this JobRunSummary.
        Identify job run launched by schedule or manually.

        Allowed values for this property are: "SCHEDULED", "MANUAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The launched of this JobRunSummary.
        :rtype: str
        """
        return self._launched

    @launched.setter
    def launched(self, launched):
        """
        Sets the launched of this JobRunSummary.
        Identify job run launched by schedule or manually.


        :param launched: The launched of this JobRunSummary.
        :type: str
        """
        allowed_values = ["SCHEDULED", "MANUAL"]
        if not value_allowed_none_or_none_sentinel(launched, allowed_values):
            launched = 'UNKNOWN_ENUM_VALUE'
        self._launched = launched

    @property
    def start_time(self):
        """
        Gets the start_time of this JobRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :return: The start_time of this JobRunSummary.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this JobRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :param start_time: The start_time of this JobRunSummary.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        Gets the end_time of this JobRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :return: The end_time of this JobRunSummary.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this JobRunSummary.
        The time at which the job execution started in epoch milliseconds.


        :param end_time: The end_time of this JobRunSummary.
        :type: int
        """
        self._end_time = end_time

    @property
    def time_created(self):
        """
        Gets the time_created of this JobRunSummary.
        The time at which the job execution started.


        :return: The time_created of this JobRunSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this JobRunSummary.
        The time at which the job execution started.


        :param time_created: The time_created of this JobRunSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this JobRunSummary.
        The time at which the job execution was updated.


        :return: The time_updated of this JobRunSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this JobRunSummary.
        The time at which the job execution was updated.


        :param time_updated: The time_updated of this JobRunSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this JobRunSummary.
        The user who triggered the job execution.


        :return: The created_by of this JobRunSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this JobRunSummary.
        The user who triggered the job execution.


        :param created_by: The created_by of this JobRunSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def created_by_name(self):
        """
        Gets the created_by_name of this JobRunSummary.
        Name of the user who created this record


        :return: The created_by_name of this JobRunSummary.
        :rtype: str
        """
        return self._created_by_name

    @created_by_name.setter
    def created_by_name(self, created_by_name):
        """
        Sets the created_by_name of this JobRunSummary.
        Name of the user who created this record


        :param created_by_name: The created_by_name of this JobRunSummary.
        :type: str
        """
        self._created_by_name = created_by_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
