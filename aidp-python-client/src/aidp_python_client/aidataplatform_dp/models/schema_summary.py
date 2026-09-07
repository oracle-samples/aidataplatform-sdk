# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SchemaSummary(object):
    """
    Summary information about a schema.
    """

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "ADW"
    ENTITY_TYPE_ADW = "ADW"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "ALH"
    ENTITY_TYPE_ALH = "ALH"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "STANDARD"
    ENTITY_TYPE_STANDARD = "STANDARD"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "KAFKA_TOPIC"
    ENTITY_TYPE_KAFKA_TOPIC = "KAFKA_TOPIC"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "ATP"
    ENTITY_TYPE_ATP = "ATP"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "ORACLE"
    ENTITY_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "EXADATA"
    ENTITY_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "MYSQL"
    ENTITY_TYPE_MYSQL = "MYSQL"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "DB2"
    ENTITY_TYPE_DB2 = "DB2"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "AZURE_SQLSERVER"
    ENTITY_TYPE_AZURE_SQLSERVER = "AZURE_SQLSERVER"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "SNOWFLAKE"
    ENTITY_TYPE_SNOWFLAKE = "SNOWFLAKE"

    #: A constant which can be used with the entity_type property of a SchemaSummary.
    #: This constant has a value of "ORACLE_ANALYTICS"
    ENTITY_TYPE_ORACLE_ANALYTICS = "ORACLE_ANALYTICS"

    #: A constant which can be used with the lifecycle_state property of a SchemaSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a SchemaSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a SchemaSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the last_refresh_status property of a SchemaSummary.
    #: This constant has a value of "FAILED"
    LAST_REFRESH_STATUS_FAILED = "FAILED"

    #: A constant which can be used with the last_refresh_status property of a SchemaSummary.
    #: This constant has a value of "SUCCESS"
    LAST_REFRESH_STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the last_refresh_status property of a SchemaSummary.
    #: This constant has a value of "IN_PROGRESS"
    LAST_REFRESH_STATUS_IN_PROGRESS = "IN_PROGRESS"

    def __init__(self, **kwargs):
        """
        Initializes a new SchemaSummary object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.AlhSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.ExadataSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.OracleSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.MysqlSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.Db2SchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.OacSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.AtpSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.KafkaTopicSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.AdwSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.SqlServerOnAzureSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.SnowflakeSchemaSummary`
        * :class:`~oci.aidataplatform_dp.models.StandardSchemaSummary`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this SchemaSummary.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "DB2", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type entity_type: str

        :param key:
            The value to assign to the key property of this SchemaSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this SchemaSummary.
        :type display_name: str

        :param description:
            The value to assign to the description property of this SchemaSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this SchemaSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this SchemaSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this SchemaSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this SchemaSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this SchemaSummary.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param details:
            The value to assign to the details property of this SchemaSummary.
        :type details: dict(str, str)

        :param last_refresh_status:
            The value to assign to the last_refresh_status property of this SchemaSummary.
            Allowed values for this property are: "FAILED", "SUCCESS", "IN_PROGRESS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type last_refresh_status: str

        :param time_last_refresh:
            The value to assign to the time_last_refresh property of this SchemaSummary.
        :type time_last_refresh: datetime

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
            'time_last_refresh': 'datetime'
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
            'time_last_refresh': 'timeLastRefresh'
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

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['entityType']

        if type == 'ALH':
            return 'AlhSchemaSummary'

        if type == 'EXADATA':
            return 'ExadataSchemaSummary'

        if type == 'ORACLE':
            return 'OracleSchemaSummary'

        if type == 'MYSQL':
            return 'MysqlSchemaSummary'

        if type == 'DB2':
            return 'Db2SchemaSummary'

        if type == 'ORACLE_ANALYTICS':
            return 'OacSchemaSummary'

        if type == 'ATP':
            return 'AtpSchemaSummary'

        if type == 'KAFKA_TOPIC':
            return 'KafkaTopicSchemaSummary'

        if type == 'ADW':
            return 'AdwSchemaSummary'

        if type == 'AZURE_SQLSERVER':
            return 'SqlServerOnAzureSchemaSummary'

        if type == 'SNOWFLAKE':
            return 'SnowflakeSchemaSummary'

        if type == 'STANDARD':
            return 'StandardSchemaSummary'
        else:
            return 'SchemaSummary'

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this SchemaSummary.
        An enum to decide the type of the derived model.

        Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "DB2", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The entity_type of this SchemaSummary.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this SchemaSummary.
        An enum to decide the type of the derived model.


        :param entity_type: The entity_type of this SchemaSummary.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "DB2", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS"]
        if not value_allowed_none_or_none_sentinel(entity_type, allowed_values):
            entity_type = 'UNKNOWN_ENUM_VALUE'
        self._entity_type = entity_type

    @property
    def key(self):
        """
        **[Required]** Gets the key of this SchemaSummary.
        The fully qualified name of the schema in the format <catalog_name>.<schema_name>.


        :return: The key of this SchemaSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this SchemaSummary.
        The fully qualified name of the schema in the format <catalog_name>.<schema_name>.


        :param key: The key of this SchemaSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this SchemaSummary.
        Schema name.


        :return: The display_name of this SchemaSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this SchemaSummary.
        Schema name.


        :param display_name: The display_name of this SchemaSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this SchemaSummary.
        Schema description.


        :return: The description of this SchemaSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this SchemaSummary.
        Schema description.


        :param description: The description of this SchemaSummary.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        Gets the time_created of this SchemaSummary.
        The date and time the schema was created.


        :return: The time_created of this SchemaSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this SchemaSummary.
        The date and time the schema was created.


        :param time_created: The time_created of this SchemaSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this SchemaSummary.
        The date and time the schema was updated.


        :return: The time_updated of this SchemaSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this SchemaSummary.
        The date and time the schema was updated.


        :param time_updated: The time_updated of this SchemaSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this SchemaSummary.
        ID of the user who created the schema.


        :return: The created_by of this SchemaSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this SchemaSummary.
        ID of the user who created the schema.


        :param created_by: The created_by of this SchemaSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this SchemaSummary.
        ID of the user who last updated the schema.


        :return: The updated_by of this SchemaSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this SchemaSummary.
        ID of the user who last updated the schema.


        :param updated_by: The updated_by of this SchemaSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this SchemaSummary.
        The current state of the schema.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this SchemaSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this SchemaSummary.
        The current state of the schema.


        :param lifecycle_state: The lifecycle_state of this SchemaSummary.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def details(self):
        """
        Gets the details of this SchemaSummary.
        Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.


        :return: The details of this SchemaSummary.
        :rtype: dict(str, str)
        """
        return self._details

    @details.setter
    def details(self, details):
        """
        Sets the details of this SchemaSummary.
        Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.


        :param details: The details of this SchemaSummary.
        :type: dict(str, str)
        """
        self._details = details

    @property
    def last_refresh_status(self):
        """
        Gets the last_refresh_status of this SchemaSummary.
        The status for last refresh performed on schema.

        Allowed values for this property are: "FAILED", "SUCCESS", "IN_PROGRESS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The last_refresh_status of this SchemaSummary.
        :rtype: str
        """
        return self._last_refresh_status

    @last_refresh_status.setter
    def last_refresh_status(self, last_refresh_status):
        """
        Sets the last_refresh_status of this SchemaSummary.
        The status for last refresh performed on schema.


        :param last_refresh_status: The last_refresh_status of this SchemaSummary.
        :type: str
        """
        allowed_values = ["FAILED", "SUCCESS", "IN_PROGRESS"]
        if not value_allowed_none_or_none_sentinel(last_refresh_status, allowed_values):
            last_refresh_status = 'UNKNOWN_ENUM_VALUE'
        self._last_refresh_status = last_refresh_status

    @property
    def time_last_refresh(self):
        """
        Gets the time_last_refresh of this SchemaSummary.
        The timestamp for last refresh performed on schema.


        :return: The time_last_refresh of this SchemaSummary.
        :rtype: datetime
        """
        return self._time_last_refresh

    @time_last_refresh.setter
    def time_last_refresh(self, time_last_refresh):
        """
        Sets the time_last_refresh of this SchemaSummary.
        The timestamp for last refresh performed on schema.


        :param time_last_refresh: The time_last_refresh of this SchemaSummary.
        :type: datetime
        """
        self._time_last_refresh = time_last_refresh

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
