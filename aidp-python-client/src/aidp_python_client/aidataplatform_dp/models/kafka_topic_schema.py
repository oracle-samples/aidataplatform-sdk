# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .schema import Schema
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KafkaTopicSchema(Schema):
    """
    Derived model for topic of a Kafka external catalog.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new KafkaTopicSchema object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.KafkaTopicSchema.entity_type` attribute
        of this class is ``KAFKA_TOPIC`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this KafkaTopicSchema.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA"
        :type entity_type: str

        :param key:
            The value to assign to the key property of this KafkaTopicSchema.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this KafkaTopicSchema.
        :type display_name: str

        :param description:
            The value to assign to the description property of this KafkaTopicSchema.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this KafkaTopicSchema.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this KafkaTopicSchema.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this KafkaTopicSchema.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this KafkaTopicSchema.
        :type updated_by: str

        :param properties:
            The value to assign to the properties property of this KafkaTopicSchema.
        :type properties: dict(str, str)

        :param catalog_name:
            The value to assign to the catalog_name property of this KafkaTopicSchema.
        :type catalog_name: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this KafkaTopicSchema.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING"
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this KafkaTopicSchema.
        :type lifecycle_state_details: str

        :param details:
            The value to assign to the details property of this KafkaTopicSchema.
        :type details: dict(str, str)

        :param partitions:
            The value to assign to the partitions property of this KafkaTopicSchema.
        :type partitions: str

        :param replication_factor:
            The value to assign to the replication_factor property of this KafkaTopicSchema.
        :type replication_factor: str

        :param bootstrap_servers:
            The value to assign to the bootstrap_servers property of this KafkaTopicSchema.
        :type bootstrap_servers: str

        :param partition_details:
            The value to assign to the partition_details property of this KafkaTopicSchema.
        :type partition_details: str

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
            'properties': 'dict(str, str)',
            'catalog_name': 'str',
            'lifecycle_state': 'str',
            'lifecycle_state_details': 'str',
            'details': 'dict(str, str)',
            'partitions': 'str',
            'replication_factor': 'str',
            'bootstrap_servers': 'str',
            'partition_details': 'str'
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
            'properties': 'properties',
            'catalog_name': 'catalogName',
            'lifecycle_state': 'lifecycleState',
            'lifecycle_state_details': 'lifecycleStateDetails',
            'details': 'details',
            'partitions': 'partitions',
            'replication_factor': 'replicationFactor',
            'bootstrap_servers': 'bootstrapServers',
            'partition_details': 'partitionDetails'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._description = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._properties = None
        self._catalog_name = None
        self._lifecycle_state = None
        self._lifecycle_state_details = None
        self._details = None
        self._partitions = None
        self._replication_factor = None
        self._bootstrap_servers = None
        self._partition_details = None
        self._entity_type = 'KAFKA_TOPIC'

    @property
    def partitions(self):
        """
        Gets the partitions of this KafkaTopicSchema.
        The number of partitions in the Kafka topic.


        :return: The partitions of this KafkaTopicSchema.
        :rtype: str
        """
        return self._partitions

    @partitions.setter
    def partitions(self, partitions):
        """
        Sets the partitions of this KafkaTopicSchema.
        The number of partitions in the Kafka topic.


        :param partitions: The partitions of this KafkaTopicSchema.
        :type: str
        """
        self._partitions = partitions

    @property
    def replication_factor(self):
        """
        Gets the replication_factor of this KafkaTopicSchema.
        The replication factor.


        :return: The replication_factor of this KafkaTopicSchema.
        :rtype: str
        """
        return self._replication_factor

    @replication_factor.setter
    def replication_factor(self, replication_factor):
        """
        Sets the replication_factor of this KafkaTopicSchema.
        The replication factor.


        :param replication_factor: The replication_factor of this KafkaTopicSchema.
        :type: str
        """
        self._replication_factor = replication_factor

    @property
    def bootstrap_servers(self):
        """
        Gets the bootstrap_servers of this KafkaTopicSchema.
        Bootstrap servers for the Kafka topic.


        :return: The bootstrap_servers of this KafkaTopicSchema.
        :rtype: str
        """
        return self._bootstrap_servers

    @bootstrap_servers.setter
    def bootstrap_servers(self, bootstrap_servers):
        """
        Sets the bootstrap_servers of this KafkaTopicSchema.
        Bootstrap servers for the Kafka topic.


        :param bootstrap_servers: The bootstrap_servers of this KafkaTopicSchema.
        :type: str
        """
        self._bootstrap_servers = bootstrap_servers

    @property
    def partition_details(self):
        """
        **[Required]** Gets the partition_details of this KafkaTopicSchema.
        The details of the partitions in Kafka topic.


        :return: The partition_details of this KafkaTopicSchema.
        :rtype: str
        """
        return self._partition_details

    @partition_details.setter
    def partition_details(self, partition_details):
        """
        Sets the partition_details of this KafkaTopicSchema.
        The details of the partitions in Kafka topic.


        :param partition_details: The partition_details of this KafkaTopicSchema.
        :type: str
        """
        self._partition_details = partition_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
