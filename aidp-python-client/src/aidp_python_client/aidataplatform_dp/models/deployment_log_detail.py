# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogDetail(object):
    """
    One deployment log event with its full message and metadata.
    """

    #: A constant which can be used with the timestamp_source property of a DeploymentLogDetail.
    #: This constant has a value of "EVENT_TIME"
    TIMESTAMP_SOURCE_EVENT_TIME = "EVENT_TIME"

    #: A constant which can be used with the timestamp_source property of a DeploymentLogDetail.
    #: This constant has a value of "PUBLISH_TIME"
    TIMESTAMP_SOURCE_PUBLISH_TIME = "PUBLISH_TIME"

    #: A constant which can be used with the level property of a DeploymentLogDetail.
    #: This constant has a value of "DEBUG"
    LEVEL_DEBUG = "DEBUG"

    #: A constant which can be used with the level property of a DeploymentLogDetail.
    #: This constant has a value of "INFO"
    LEVEL_INFO = "INFO"

    #: A constant which can be used with the level property of a DeploymentLogDetail.
    #: This constant has a value of "WARNING"
    LEVEL_WARNING = "WARNING"

    #: A constant which can be used with the level property of a DeploymentLogDetail.
    #: This constant has a value of "ERROR"
    LEVEL_ERROR = "ERROR"

    #: A constant which can be used with the level property of a DeploymentLogDetail.
    #: This constant has a value of "CRITICAL"
    LEVEL_CRITICAL = "CRITICAL"

    #: A constant which can be used with the level property of a DeploymentLogDetail.
    #: This constant has a value of "UNKNOWN"
    LEVEL_UNKNOWN = "UNKNOWN"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_id:
            The value to assign to the deployment_id property of this DeploymentLogDetail.
        :type deployment_id: str

        :param record_id:
            The value to assign to the record_id property of this DeploymentLogDetail.
        :type record_id: str

        :param log_id:
            The value to assign to the log_id property of this DeploymentLogDetail.
        :type log_id: str

        :param timestamp:
            The value to assign to the timestamp property of this DeploymentLogDetail.
        :type timestamp: datetime

        :param timestamp_source:
            The value to assign to the timestamp_source property of this DeploymentLogDetail.
            Allowed values for this property are: "EVENT_TIME", "PUBLISH_TIME", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type timestamp_source: str

        :param level:
            The value to assign to the level property of this DeploymentLogDetail.
            Allowed values for this property are: "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type level: str

        :param message:
            The value to assign to the message property of this DeploymentLogDetail.
        :type message: oci.aidataplatform_dp.models.DeploymentLogMessage

        :param metadata:
            The value to assign to the metadata property of this DeploymentLogDetail.
        :type metadata: oci.aidataplatform_dp.models.DeploymentLogMetadata

        """
        self.swagger_types = {
            'deployment_id': 'str',
            'record_id': 'str',
            'log_id': 'str',
            'timestamp': 'datetime',
            'timestamp_source': 'str',
            'level': 'str',
            'message': 'DeploymentLogMessage',
            'metadata': 'DeploymentLogMetadata'
        }
        self.attribute_map = {
            'deployment_id': 'deploymentId',
            'record_id': 'recordId',
            'log_id': 'logId',
            'timestamp': 'timestamp',
            'timestamp_source': 'timestampSource',
            'level': 'level',
            'message': 'message',
            'metadata': 'metadata'
        }
        self._deployment_id = None
        self._record_id = None
        self._log_id = None
        self._timestamp = None
        self._timestamp_source = None
        self._level = None
        self._message = None
        self._metadata = None

    @property
    def deployment_id(self):
        """
        **[Required]** Gets the deployment_id of this DeploymentLogDetail.
        The model deployment the log event belongs to.


        :return: The deployment_id of this DeploymentLogDetail.
        :rtype: str
        """
        return self._deployment_id

    @deployment_id.setter
    def deployment_id(self, deployment_id):
        """
        Sets the deployment_id of this DeploymentLogDetail.
        The model deployment the log event belongs to.


        :param deployment_id: The deployment_id of this DeploymentLogDetail.
        :type: str
        """
        self._deployment_id = deployment_id

    @property
    def record_id(self):
        """
        **[Required]** Gets the record_id of this DeploymentLogDetail.
        Stable identity of the ingested log record.


        :return: The record_id of this DeploymentLogDetail.
        :rtype: str
        """
        return self._record_id

    @record_id.setter
    def record_id(self, record_id):
        """
        Sets the record_id of this DeploymentLogDetail.
        Stable identity of the ingested log record.


        :param record_id: The record_id of this DeploymentLogDetail.
        :type: str
        """
        self._record_id = record_id

    @property
    def log_id(self):
        """
        **[Required]** Gets the log_id of this DeploymentLogDetail.
        The opaque, expiring locator this event was resolved from.


        :return: The log_id of this DeploymentLogDetail.
        :rtype: str
        """
        return self._log_id

    @log_id.setter
    def log_id(self, log_id):
        """
        Sets the log_id of this DeploymentLogDetail.
        The opaque, expiring locator this event was resolved from.


        :param log_id: The log_id of this DeploymentLogDetail.
        :type: str
        """
        self._log_id = log_id

    @property
    def timestamp(self):
        """
        **[Required]** Gets the timestamp of this DeploymentLogDetail.
        Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.


        :return: The timestamp of this DeploymentLogDetail.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """
        Sets the timestamp of this DeploymentLogDetail.
        Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.


        :param timestamp: The timestamp of this DeploymentLogDetail.
        :type: datetime
        """
        self._timestamp = timestamp

    @property
    def timestamp_source(self):
        """
        **[Required]** Gets the timestamp_source of this DeploymentLogDetail.
        EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.

        Allowed values for this property are: "EVENT_TIME", "PUBLISH_TIME", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The timestamp_source of this DeploymentLogDetail.
        :rtype: str
        """
        return self._timestamp_source

    @timestamp_source.setter
    def timestamp_source(self, timestamp_source):
        """
        Sets the timestamp_source of this DeploymentLogDetail.
        EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.


        :param timestamp_source: The timestamp_source of this DeploymentLogDetail.
        :type: str
        """
        allowed_values = ["EVENT_TIME", "PUBLISH_TIME"]
        if not value_allowed_none_or_none_sentinel(timestamp_source, allowed_values):
            timestamp_source = 'UNKNOWN_ENUM_VALUE'
        self._timestamp_source = timestamp_source

    @property
    def level(self):
        """
        **[Required]** Gets the level of this DeploymentLogDetail.
        Normalized severity. Unrecognized producer values are returned as UNKNOWN.

        Allowed values for this property are: "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "UNKNOWN", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The level of this DeploymentLogDetail.
        :rtype: str
        """
        return self._level

    @level.setter
    def level(self, level):
        """
        Sets the level of this DeploymentLogDetail.
        Normalized severity. Unrecognized producer values are returned as UNKNOWN.


        :param level: The level of this DeploymentLogDetail.
        :type: str
        """
        allowed_values = ["DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "UNKNOWN"]
        if not value_allowed_none_or_none_sentinel(level, allowed_values):
            level = 'UNKNOWN_ENUM_VALUE'
        self._level = level

    @property
    def message(self):
        """
        **[Required]** Gets the message of this DeploymentLogDetail.

        :return: The message of this DeploymentLogDetail.
        :rtype: oci.aidataplatform_dp.models.DeploymentLogMessage
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this DeploymentLogDetail.

        :param message: The message of this DeploymentLogDetail.
        :type: oci.aidataplatform_dp.models.DeploymentLogMessage
        """
        self._message = message

    @property
    def metadata(self):
        """
        **[Required]** Gets the metadata of this DeploymentLogDetail.

        :return: The metadata of this DeploymentLogDetail.
        :rtype: oci.aidataplatform_dp.models.DeploymentLogMetadata
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """
        Sets the metadata of this DeploymentLogDetail.

        :param metadata: The metadata of this DeploymentLogDetail.
        :type: oci.aidataplatform_dp.models.DeploymentLogMetadata
        """
        self._metadata = metadata

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
