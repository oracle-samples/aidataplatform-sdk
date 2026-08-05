# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .schema_summary import SchemaSummary
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KafkaTopicSchemaSummary(SchemaSummary):
    """
    Derived model for topic of a Kafka external catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new KafkaTopicSchemaSummary object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.KafkaTopicSchemaSummary.entity_type` attribute
        of this class is ``KAFKA_TOPIC`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this KafkaTopicSchemaSummary.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "GOOGLE_BIGQUERY", "ORACLE_ANALYTICS"
        :type entity_type: str

        :param key:
            The value to assign to the key property of this KafkaTopicSchemaSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this KafkaTopicSchemaSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this KafkaTopicSchemaSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this KafkaTopicSchemaSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this KafkaTopicSchemaSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this KafkaTopicSchemaSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this KafkaTopicSchemaSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this KafkaTopicSchemaSummary.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING"
        :type lifecycle_state: str

        :param details:
            The value to assign to the details property of this KafkaTopicSchemaSummary.
        :type details: dict(str, str)

        :param last_refresh_status:
            The value to assign to the last_refresh_status property of this KafkaTopicSchemaSummary.
            Allowed values for this property are: "FAILED", "SUCCESS", "IN_PROGRESS"
        :type last_refresh_status: str

        :param time_last_refresh:
            The value to assign to the time_last_refresh property of this KafkaTopicSchemaSummary.
        :type time_last_refresh: datetime

        :param partitions:
            The value to assign to the partitions property of this KafkaTopicSchemaSummary.
        :type partitions: str

        :param replication_factor:
            The value to assign to the replication_factor property of this KafkaTopicSchemaSummary.
        :type replication_factor: str

        """
        self.swagger_types = {
            'entity_type': 'str',
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str',
            'details': 'dict(str, str)',
            'last_refresh_status': 'str',
            'time_last_refresh': 'datetime',
            'partitions': 'str',
            'replication_factor': 'str'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState',
            'details': 'details',
            'last_refresh_status': 'lastRefreshStatus',
            'time_last_refresh': 'timeLastRefresh',
            'partitions': 'partitions',
            'replication_factor': 'replicationFactor'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None
        self._details = None
        self._last_refresh_status = None
        self._time_last_refresh = None
        self._partitions = None
        self._replication_factor = None
        self._entity_type = 'KAFKA_TOPIC'

    @property
    def partitions(self):
        """
        Gets the partitions of this KafkaTopicSchemaSummary.
        The number of partitions in the Kafka topic.


        :return: The partitions of this KafkaTopicSchemaSummary.
        :rtype: str
        """
        return self._partitions

    @partitions.setter
    def partitions(self, partitions):
        """
        Sets the partitions of this KafkaTopicSchemaSummary.
        The number of partitions in the Kafka topic.


        :param partitions: The partitions of this KafkaTopicSchemaSummary.
        :type: str
        """
        self._partitions = partitions

    @property
    def replication_factor(self):
        """
        Gets the replication_factor of this KafkaTopicSchemaSummary.
        The replication factor.


        :return: The replication_factor of this KafkaTopicSchemaSummary.
        :rtype: str
        """
        return self._replication_factor

    @replication_factor.setter
    def replication_factor(self, replication_factor):
        """
        Sets the replication_factor of this KafkaTopicSchemaSummary.
        The replication factor.


        :param replication_factor: The replication_factor of this KafkaTopicSchemaSummary.
        :type: str
        """
        self._replication_factor = replication_factor

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
