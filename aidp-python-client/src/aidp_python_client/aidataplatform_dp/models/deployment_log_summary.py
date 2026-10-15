# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogSummary(object):
    """
    One deployment lifecycle log event.
    """

    #: A constant which can be used with the timestamp_source property of a DeploymentLogSummary.
    #: This constant has a value of "EVENT_TIME"
    TIMESTAMP_SOURCE_EVENT_TIME = "EVENT_TIME"

    #: A constant which can be used with the timestamp_source property of a DeploymentLogSummary.
    #: This constant has a value of "PUBLISH_TIME"
    TIMESTAMP_SOURCE_PUBLISH_TIME = "PUBLISH_TIME"

    #: A constant which can be used with the level property of a DeploymentLogSummary.
    #: This constant has a value of "DEBUG"
    LEVEL_DEBUG = "DEBUG"

    #: A constant which can be used with the level property of a DeploymentLogSummary.
    #: This constant has a value of "INFO"
    LEVEL_INFO = "INFO"

    #: A constant which can be used with the level property of a DeploymentLogSummary.
    #: This constant has a value of "WARNING"
    LEVEL_WARNING = "WARNING"

    #: A constant which can be used with the level property of a DeploymentLogSummary.
    #: This constant has a value of "ERROR"
    LEVEL_ERROR = "ERROR"

    #: A constant which can be used with the level property of a DeploymentLogSummary.
    #: This constant has a value of "CRITICAL"
    LEVEL_CRITICAL = "CRITICAL"

    #: A constant which can be used with the level property of a DeploymentLogSummary.
    #: This constant has a value of "UNKNOWN"
    LEVEL_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param record_id:
            The value to assign to the record_id property of this DeploymentLogSummary.
        :type record_id: str

        :param log_id:
            The value to assign to the log_id property of this DeploymentLogSummary.
        :type log_id: str

        :param timestamp:
            The value to assign to the timestamp property of this DeploymentLogSummary.
        :type timestamp: datetime

        :param timestamp_source:
            The value to assign to the timestamp_source property of this DeploymentLogSummary.
            Allowed values for this property are: "EVENT_TIME", "PUBLISH_TIME", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type timestamp_source: str

        :param level:
            The value to assign to the level property of this DeploymentLogSummary.
            Allowed values for this property are: "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type level: str

        :param opc_request_id:
            The value to assign to the opc_request_id property of this DeploymentLogSummary.
        :type opc_request_id: str

        :param latency_ms:
            The value to assign to the latency_ms property of this DeploymentLogSummary.
        :type latency_ms: float

        :param replica_id:
            The value to assign to the replica_id property of this DeploymentLogSummary.
        :type replica_id: str

        :param is_detail_available:
            The value to assign to the is_detail_available property of this DeploymentLogSummary.
        :type is_detail_available: bool

        """
        self.swagger_types = {
            'record_id': 'str',
            'log_id': 'str',
            'timestamp': 'datetime',
            'timestamp_source': 'str',
            'level': 'str',
            'opc_request_id': 'str',
            'latency_ms': 'float',
            'replica_id': 'str',
            'is_detail_available': 'bool'
        }
        self.attribute_map = {
            'record_id': 'recordId',
            'log_id': 'logId',
            'timestamp': 'timestamp',
            'timestamp_source': 'timestampSource',
            'level': 'level',
            'opc_request_id': 'opcRequestId',
            'latency_ms': 'latencyMs',
            'replica_id': 'replicaId',
            'is_detail_available': 'isDetailAvailable'
        }
        self._record_id = None
        self._log_id = None
        self._timestamp = None
        self._timestamp_source = None
        self._level = None
        self._opc_request_id = None
        self._latency_ms = None
        self._replica_id = None
        self._is_detail_available = None

    @property
    def record_id(self):
        """
        **[Required]** Gets the record_id of this DeploymentLogSummary.
        Stable identity of the ingested log record.


        :return: The record_id of this DeploymentLogSummary.
        :rtype: str
        """
        return self._record_id

    @record_id.setter
    def record_id(self, record_id):
        """
        Sets the record_id of this DeploymentLogSummary.
        Stable identity of the ingested log record.


        :param record_id: The record_id of this DeploymentLogSummary.
        :type: str
        """
        self._record_id = record_id

    @property
    def log_id(self):
        """
        **[Required]** Gets the log_id of this DeploymentLogSummary.
        Opaque, expiring locator usable with the log detail operation.


        :return: The log_id of this DeploymentLogSummary.
        :rtype: str
        """
        return self._log_id

    @log_id.setter
    def log_id(self, log_id):
        """
        Sets the log_id of this DeploymentLogSummary.
        Opaque, expiring locator usable with the log detail operation.


        :param log_id: The log_id of this DeploymentLogSummary.
        :type: str
        """
        self._log_id = log_id

    @property
    def timestamp(self):
        """
        **[Required]** Gets the timestamp of this DeploymentLogSummary.
        Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.


        :return: The timestamp of this DeploymentLogSummary.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this DeploymentLogSummary.
        Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.


        :param timestamp: The timestamp of this DeploymentLogSummary.
        :type: datetime
        """
        self._timestamp = timestamp

    @property
    def timestamp_source(self):
        """
        **[Required]** Gets the timestamp_source of this DeploymentLogSummary.
        EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.

        Allowed values for this property are: "EVENT_TIME", "PUBLISH_TIME", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The timestamp_source of this DeploymentLogSummary.
        :rtype: str
        """
        return self._timestamp_source

    @timestamp_source.setter
    def timestamp_source(self, timestamp_source):
        """
        Sets the timestamp_source of this DeploymentLogSummary.
        EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.


        :param timestamp_source: The timestamp_source of this DeploymentLogSummary.
        :type: str
        """
        allowed_values = ["EVENT_TIME", "PUBLISH_TIME"]
        if not value_allowed_none_or_none_sentinel(timestamp_source, allowed_values):
            timestamp_source = 'UNKNOWN_ENUM_VALUE'
        self._timestamp_source = timestamp_source

    @property
    def level(self):
        """
        **[Required]** Gets the level of this DeploymentLogSummary.
        Normalized severity. Unrecognized producer values are returned as UNKNOWN.

        Allowed values for this property are: "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The level of this DeploymentLogSummary.
        :rtype: str
        """
        return self._level

    @level.setter
    def level(self, level):
        """
        Sets the level of this DeploymentLogSummary.
        Normalized severity. Unrecognized producer values are returned as UNKNOWN.


        :param level: The level of this DeploymentLogSummary.
        :type: str
        """
        allowed_values = ["DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(level, allowed_values):
            level = 'UNKNOWN_ENUM_VALUE'
        self._level = level

    @property
    def opc_request_id(self):
        """
        Gets the opc_request_id of this DeploymentLogSummary.
        Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.


        :return: The opc_request_id of this DeploymentLogSummary.
        :rtype: str
        """
        return self._opc_request_id

    @opc_request_id.setter
    def opc_request_id(self, opc_request_id):
        """
        Sets the opc_request_id of this DeploymentLogSummary.
        Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.


        :param opc_request_id: The opc_request_id of this DeploymentLogSummary.
        :type: str
        """
        self._opc_request_id = opc_request_id

    @property
    def latency_ms(self):
        """
        Gets the latency_ms of this DeploymentLogSummary.
        Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent.


        :return: The latency_ms of this DeploymentLogSummary.
        :rtype: float
        """
        return self._latency_ms

    @latency_ms.setter
    def latency_ms(self, latency_ms):
        """
        Sets the latency_ms of this DeploymentLogSummary.
        Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent.


        :param latency_ms: The latency_ms of this DeploymentLogSummary.
        :type: float
        """
        self._latency_ms = latency_ms

    @property
    def replica_id(self):
        """
        Gets the replica_id of this DeploymentLogSummary.
        Emitting replica or source scope, when the event carries one.


        :return: The replica_id of this DeploymentLogSummary.
        :rtype: str
        """
        return self._replica_id

    @replica_id.setter
    def replica_id(self, replica_id):
        """
        Sets the replica_id of this DeploymentLogSummary.
        Emitting replica or source scope, when the event carries one.


        :param replica_id: The replica_id of this DeploymentLogSummary.
        :type: str
        """
        self._replica_id = replica_id

    @property
    def is_detail_available(self):
        """
        **[Required]** Gets the is_detail_available of this DeploymentLogSummary.
        Whether the log detail operation can resolve this record.


        :return: The is_detail_available of this DeploymentLogSummary.
        :rtype: bool
        """
        return self._is_detail_available

    @is_detail_available.setter
    def is_detail_available(self, is_detail_available):
        """
        Sets the is_detail_available of this DeploymentLogSummary.
        Whether the log detail operation can resolve this record.


        :param is_detail_available: The is_detail_available of this DeploymentLogSummary.
        :type: bool
        """
        self._is_detail_available = is_detail_available

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
