# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class State(object):
    """
    The current state of the run.
    """

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "PENDING"
    STATUS_PENDING = "PENDING"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "QUEUED"
    STATUS_QUEUED = "QUEUED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "RUNNING"
    STATUS_RUNNING = "RUNNING"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "SKIPPED"
    STATUS_SKIPPED = "SKIPPED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "INTERNAL_ERROR"
    STATUS_INTERNAL_ERROR = "INTERNAL_ERROR"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "BLOCKED"
    STATUS_BLOCKED = "BLOCKED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "CANCELING"
    STATUS_CANCELING = "CANCELING"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "CANCELED"
    STATUS_CANCELED = "CANCELED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "UPSTREAM_CANCELED"
    STATUS_UPSTREAM_CANCELED = "UPSTREAM_CANCELED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "UPSTREAM_FAILED"
    STATUS_UPSTREAM_FAILED = "UPSTREAM_FAILED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "EXCLUDED"
    STATUS_EXCLUDED = "EXCLUDED"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "TIMED_OUT"
    STATUS_TIMED_OUT = "TIMED_OUT"

    #: A constant which can be used with the status property of a State.
    #: This constant has a value of "PAUSED_MAINTENANCE"
    STATUS_PAUSED_MAINTENANCE = "PAUSED_MAINTENANCE"

    def __init__(self, **kwargs):
        """
        Initializes a new State object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status:
            The value to assign to the status property of this State.
            Allowed values for this property are: "PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELING", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED", "TIMED_OUT", "PAUSED_MAINTENANCE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param state_message:
            The value to assign to the state_message property of this State.
        :type state_message: str

        :param error_trace:
            The value to assign to the error_trace property of this State.
        :type error_trace: str

        :param is_user_canceled_or_timed_out:
            The value to assign to the is_user_canceled_or_timed_out property of this State.
        :type is_user_canceled_or_timed_out: bool

        """
        self.swagger_types = {
            'status': 'str',
            'state_message': 'str',
            'error_trace': 'str',
            'is_user_canceled_or_timed_out': 'bool'
        }

        self.attribute_map = {
            'status': 'status',
            'state_message': 'stateMessage',
            'error_trace': 'errorTrace',
            'is_user_canceled_or_timed_out': 'isUserCanceledOrTimedOut'
        }

        self._status = None
        self._state_message = None
        self._error_trace = None
        self._is_user_canceled_or_timed_out = None

    @property
    def status(self):
        """
        Gets the status of this State.
        Current state of execution.

        Allowed values for this property are: "PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELING", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED", "TIMED_OUT", "PAUSED_MAINTENANCE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this State.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this State.
        Current state of execution.


        :param status: The status of this State.
        :type: str
        """
        allowed_values = ["PENDING", "QUEUED", "RUNNING", "SKIPPED", "INTERNAL_ERROR", "BLOCKED", "SUCCESS", "FAILED", "CANCELING", "CANCELED", "UPSTREAM_CANCELED", "UPSTREAM_FAILED", "EXCLUDED", "TIMED_OUT", "PAUSED_MAINTENANCE"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def state_message(self):
        """
        Gets the state_message of this State.
        A descriptive message of the current state.


        :return: The state_message of this State.
        :rtype: str
        """
        return self._state_message

    @state_message.setter
    def state_message(self, state_message):
        """
        Sets the state_message of this State.
        A descriptive message of the current state.


        :param state_message: The state_message of this State.
        :type: str
        """
        self._state_message = state_message

    @property
    def error_trace(self):
        """
        Gets the error_trace of this State.
        If there was an error executing the run, this field contains any available stack traces.


        :return: The error_trace of this State.
        :rtype: str
        """
        return self._error_trace

    @error_trace.setter
    def error_trace(self, error_trace):
        """
        Sets the error_trace of this State.
        If there was an error executing the run, this field contains any available stack traces.


        :param error_trace: The error_trace of this State.
        :type: str
        """
        self._error_trace = error_trace

    @property
    def is_user_canceled_or_timed_out(self):
        """
        Gets the is_user_canceled_or_timed_out of this State.
        Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.


        :return: The is_user_canceled_or_timed_out of this State.
        :rtype: bool
        """
        return self._is_user_canceled_or_timed_out

    @is_user_canceled_or_timed_out.setter
    def is_user_canceled_or_timed_out(self, is_user_canceled_or_timed_out):
        """
        Sets the is_user_canceled_or_timed_out of this State.
        Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.


        :param is_user_canceled_or_timed_out: The is_user_canceled_or_timed_out of this State.
        :type: bool
        """
        self._is_user_canceled_or_timed_out = is_user_canceled_or_timed_out

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
