# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateExperimentRunDetails(object):
    """
    The data to update an experiment run.
    """

    #: A constant which can be used with the status property of a UpdateExperimentRunDetails.
    #: This constant has a value of "RUNNING"
    STATUS_RUNNING = "RUNNING"

    #: A constant which can be used with the status property of a UpdateExperimentRunDetails.
    #: This constant has a value of "SCHEDULED"
    STATUS_SCHEDULED = "SCHEDULED"

    #: A constant which can be used with the status property of a UpdateExperimentRunDetails.
    #: This constant has a value of "FINISHED"
    STATUS_FINISHED = "FINISHED"

    #: A constant which can be used with the status property of a UpdateExperimentRunDetails.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a UpdateExperimentRunDetails.
    #: This constant has a value of "KILLED"
    STATUS_KILLED = "KILLED"

    #: A constant which can be used with the status property of a UpdateExperimentRunDetails.
    #: This constant has a value of "INTERNAL_ERROR"
    STATUS_INTERNAL_ERROR = "INTERNAL_ERROR"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateExperimentRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this UpdateExperimentRunDetails.
        :type run_id: str

        :param status:
            The value to assign to the status property of this UpdateExperimentRunDetails.
            Allowed values for this property are: "RUNNING", "SCHEDULED", "FINISHED", "FAILED", "KILLED", "INTERNAL_ERROR"
        :type status: str

        :param end_time:
            The value to assign to the end_time property of this UpdateExperimentRunDetails.
        :type end_time: int

        :param run_name:
            The value to assign to the run_name property of this UpdateExperimentRunDetails.
        :type run_name: str

        """
        self.swagger_types = {
            'run_id': 'str',
            'status': 'str',
            'end_time': 'int',
            'run_name': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'status': 'status',
            'end_time': 'end_time',
            'run_name': 'run_name'
        }

        self._run_id = None
        self._status = None
        self._end_time = None
        self._run_name = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this UpdateExperimentRunDetails.
        Unique identifier for the run.


        :return: The run_id of this UpdateExperimentRunDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this UpdateExperimentRunDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this UpdateExperimentRunDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def status(self):
        """
        Gets the status of this UpdateExperimentRunDetails.
        Updated status of the run.

        Allowed values for this property are: "RUNNING", "SCHEDULED", "FINISHED", "FAILED", "KILLED", "INTERNAL_ERROR"


        :return: The status of this UpdateExperimentRunDetails.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this UpdateExperimentRunDetails.
        Updated status of the run.


        :param status: The status of this UpdateExperimentRunDetails.
        :type: str
        """
        allowed_values = ["RUNNING", "SCHEDULED", "FINISHED", "FAILED", "KILLED", "INTERNAL_ERROR"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def end_time(self):
        """
        Gets the end_time of this UpdateExperimentRunDetails.
        Unix timestamp in milliseconds when the run ended.


        :return: The end_time of this UpdateExperimentRunDetails.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this UpdateExperimentRunDetails.
        Unix timestamp in milliseconds when the run ended.


        :param end_time: The end_time of this UpdateExperimentRunDetails.
        :type: int
        """
        self._end_time = end_time

    @property
    def run_name(self):
        """
        Gets the run_name of this UpdateExperimentRunDetails.
        Updated name of the run.


        :return: The run_name of this UpdateExperimentRunDetails.
        :rtype: str
        """
        return self._run_name

    @run_name.setter
    def run_name(self, run_name):
        """
        Sets the run_name of this UpdateExperimentRunDetails.
        Updated name of the run.


        :param run_name: The run_name of this UpdateExperimentRunDetails.
        :type: str
        """
        self._run_name = run_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
