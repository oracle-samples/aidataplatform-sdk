# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SearchClusterLogsDetails(object):
    """
    Request payload for searching logs in a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SearchClusterLogsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_begin:
            The value to assign to the time_begin property of this SearchClusterLogsDetails.
        :type time_begin: datetime

        :param time_end:
            The value to assign to the time_end property of this SearchClusterLogsDetails.
        :type time_end: datetime

        :param log_content_type_contains:
            The value to assign to the log_content_type_contains property of this SearchClusterLogsDetails.
        :type log_content_type_contains: str

        :param subject_contains:
            The value to assign to the subject_contains property of this SearchClusterLogsDetails.
        :type subject_contains: str

        :param message_contains:
            The value to assign to the message_contains property of this SearchClusterLogsDetails.
        :type message_contains: str

        :param log_level:
            The value to assign to the log_level property of this SearchClusterLogsDetails.
        :type log_level: str

        :param opc_request_id:
            The value to assign to the opc_request_id property of this SearchClusterLogsDetails.
        :type opc_request_id: str

        :param advanced_filter:
            The value to assign to the advanced_filter property of this SearchClusterLogsDetails.
        :type advanced_filter: str

        :param thread:
            The value to assign to the thread property of this SearchClusterLogsDetails.
        :type thread: str

        :param execution_context_id:
            The value to assign to the execution_context_id property of this SearchClusterLogsDetails.
        :type execution_context_id: str

        :param log_stream_type_contains:
            The value to assign to the log_stream_type_contains property of this SearchClusterLogsDetails.
        :type log_stream_type_contains: str

        :param event_type:
            The value to assign to the event_type property of this SearchClusterLogsDetails.
        :type event_type: str

        """
        self.swagger_types = {
            'time_begin': 'datetime',
            'time_end': 'datetime',
            'log_content_type_contains': 'str',
            'subject_contains': 'str',
            'message_contains': 'str',
            'log_level': 'str',
            'opc_request_id': 'str',
            'advanced_filter': 'str',
            'thread': 'str',
            'execution_context_id': 'str',
            'log_stream_type_contains': 'str',
            'event_type': 'str'
        }

        self.attribute_map = {
            'time_begin': 'timeBegin',
            'time_end': 'timeEnd',
            'log_content_type_contains': 'logContentTypeContains',
            'subject_contains': 'subjectContains',
            'message_contains': 'messageContains',
            'log_level': 'logLevel',
            'opc_request_id': 'opcRequestId',
            'advanced_filter': 'advancedFilter',
            'thread': 'thread',
            'execution_context_id': 'executionContextId',
            'log_stream_type_contains': 'logStreamTypeContains',
            'event_type': 'eventType'
        }

        self._time_begin = None
        self._time_end = None
        self._log_content_type_contains = None
        self._subject_contains = None
        self._message_contains = None
        self._log_level = None
        self._opc_request_id = None
        self._advanced_filter = None
        self._thread = None
        self._execution_context_id = None
        self._log_stream_type_contains = None
        self._event_type = None

    @property
    def time_begin(self):
        """
        **[Required]** Gets the time_begin of this SearchClusterLogsDetails.
        Start filter log's date and time, in RFC 3339 format.


        :return: The time_begin of this SearchClusterLogsDetails.
        :rtype: datetime
        """
        return self._time_begin

    @time_begin.setter
    def time_begin(self, time_begin):
        """
        Sets the time_begin of this SearchClusterLogsDetails.
        Start filter log's date and time, in RFC 3339 format.


        :param time_begin: The time_begin of this SearchClusterLogsDetails.
        :type: datetime
        """
        self._time_begin = time_begin

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this SearchClusterLogsDetails.
        End filter log's date and time, in RFC 3339 format.


        :return: The time_end of this SearchClusterLogsDetails.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this SearchClusterLogsDetails.
        End filter log's date and time, in RFC 3339 format.


        :param time_end: The time_end of this SearchClusterLogsDetails.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def log_content_type_contains(self):
        """
        **[Required]** Gets the log_content_type_contains of this SearchClusterLogsDetails.
        The string represent the type of compute logs
        Common values include `events`, `driver`, `executor`.


        :return: The log_content_type_contains of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._log_content_type_contains

    @log_content_type_contains.setter
    def log_content_type_contains(self, log_content_type_contains):
        """
        Sets the log_content_type_contains of this SearchClusterLogsDetails.
        The string represent the type of compute logs
        Common values include `events`, `driver`, `executor`.


        :param log_content_type_contains: The log_content_type_contains of this SearchClusterLogsDetails.
        :type: str
        """
        self._log_content_type_contains = log_content_type_contains

    @property
    def subject_contains(self):
        """
        Gets the subject_contains of this SearchClusterLogsDetails.
        The string represent the specific of compute nodes
        Common values include `spark-driver`, `spark-executor-1`.


        :return: The subject_contains of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._subject_contains

    @subject_contains.setter
    def subject_contains(self, subject_contains):
        """
        Sets the subject_contains of this SearchClusterLogsDetails.
        The string represent the specific of compute nodes
        Common values include `spark-driver`, `spark-executor-1`.


        :param subject_contains: The subject_contains of this SearchClusterLogsDetails.
        :type: str
        """
        self._subject_contains = subject_contains

    @property
    def message_contains(self):
        """
        Gets the message_contains of this SearchClusterLogsDetails.
        The string represent a filter to search message string from the log
        Supported only when `logContentTypeContains` is `events`.


        :return: The message_contains of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._message_contains

    @message_contains.setter
    def message_contains(self, message_contains):
        """
        Sets the message_contains of this SearchClusterLogsDetails.
        The string represent a filter to search message string from the log
        Supported only when `logContentTypeContains` is `events`.


        :param message_contains: The message_contains of this SearchClusterLogsDetails.
        :type: str
        """
        self._message_contains = message_contains

    @property
    def log_level(self):
        """
        Gets the log_level of this SearchClusterLogsDetails.
        The severity level of the log messages to filter.
        Common values include `INFO`, `WARN`, `ERROR`, `DEBUG`, etc.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :return: The log_level of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._log_level

    @log_level.setter
    def log_level(self, log_level):
        """
        Sets the log_level of this SearchClusterLogsDetails.
        The severity level of the log messages to filter.
        Common values include `INFO`, `WARN`, `ERROR`, `DEBUG`, etc.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :param log_level: The log_level of this SearchClusterLogsDetails.
        :type: str
        """
        self._log_level = log_level

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this SearchClusterLogsDetails.
        The unique request identifier used for tracking the API call.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :return: The opc_request_id of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this SearchClusterLogsDetails.
        The unique request identifier used for tracking the API call.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :param opc_request_id: The opc_request_id of this SearchClusterLogsDetails.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def advanced_filter(self):
        """
        Gets the advanced_filter of this SearchClusterLogsDetails.
        Contains any key and value that you want to search in the logs.
        Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'


        :return: The advanced_filter of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._advanced_filter

    @advanced_filter.setter
    def advanced_filter(self, advanced_filter):
        """
        Sets the advanced_filter of this SearchClusterLogsDetails.
        Contains any key and value that you want to search in the logs.
        Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'


        :param advanced_filter: The advanced_filter of this SearchClusterLogsDetails.
        :type: str
        """
        self._advanced_filter = advanced_filter

    @property
    def thread(self):
        """
        Gets the thread of this SearchClusterLogsDetails.
        The thread identifier that generated the log.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :return: The thread of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._thread

    @thread.setter
    def thread(self, thread):
        """
        Sets the thread of this SearchClusterLogsDetails.
        The thread identifier that generated the log.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :param thread: The thread of this SearchClusterLogsDetails.
        :type: str
        """
        self._thread = thread

    @property
    def execution_context_id(self):
        """
        Gets the execution_context_id of this SearchClusterLogsDetails.
        The execution context identifier associated with the log.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :return: The execution_context_id of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._execution_context_id

    @execution_context_id.setter
    def execution_context_id(self, execution_context_id):
        """
        Sets the execution_context_id of this SearchClusterLogsDetails.
        The execution context identifier associated with the log.
        Supported only when `logContentTypeContains` is `executor` or `driver`.


        :param execution_context_id: The execution_context_id of this SearchClusterLogsDetails.
        :type: str
        """
        self._execution_context_id = execution_context_id

    @property
    def log_stream_type_contains(self):
        """
        Gets the log_stream_type_contains of this SearchClusterLogsDetails.
        Filters logs based on the output stream type.
        - This includes standard output (`stdout`) for regular program output
        - and standard error (`stderr`) for error messages and diagnostics.
        Only supported when logContentTypeContains=executor/driver.


        :return: The log_stream_type_contains of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._log_stream_type_contains

    @log_stream_type_contains.setter
    def log_stream_type_contains(self, log_stream_type_contains):
        """
        Sets the log_stream_type_contains of this SearchClusterLogsDetails.
        Filters logs based on the output stream type.
        - This includes standard output (`stdout`) for regular program output
        - and standard error (`stderr`) for error messages and diagnostics.
        Only supported when logContentTypeContains=executor/driver.


        :param log_stream_type_contains: The log_stream_type_contains of this SearchClusterLogsDetails.
        :type: str
        """
        self._log_stream_type_contains = log_stream_type_contains

    @property
    def event_type(self):
        """
        Gets the event_type of this SearchClusterLogsDetails.
        Filters logs based on the event type.
        Supported only when `logContentTypeContains` is `events`.


        :return: The event_type of this SearchClusterLogsDetails.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """
        Sets the event_type of this SearchClusterLogsDetails.
        Filters logs based on the event type.
        Supported only when `logContentTypeContains` is `events`.


        :param event_type: The event_type of this SearchClusterLogsDetails.
        :type: str
        """
        self._event_type = event_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
