# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Schema(object):
    """
    Schema in data catalogs are constructs to organize data. Schema can contain tables, which contain structured data,
    and volumes, which contain unstructured data. A default schema is created in all standard catalogs created in the
    Master Catalog. To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
    an administrator. If you're an administrator who needs to write policies to give users access, see
    <a href=\"https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html\" target=\"_blank\" rel=\"noopener noreferrer\">IAM Policies for Oracle AI Data Platform Workbench</a>.
    """

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "ADW"
    ENTITY_TYPE_ADW = "ADW"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "ALH"
    ENTITY_TYPE_ALH = "ALH"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "STANDARD"
    ENTITY_TYPE_STANDARD = "STANDARD"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "KAFKA_TOPIC"
    ENTITY_TYPE_KAFKA_TOPIC = "KAFKA_TOPIC"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "ATP"
    ENTITY_TYPE_ATP = "ATP"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "ORACLE"
    ENTITY_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "EXADATA"
    ENTITY_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "MYSQL"
    ENTITY_TYPE_MYSQL = "MYSQL"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "AZURE_SQLSERVER"
    ENTITY_TYPE_AZURE_SQLSERVER = "AZURE_SQLSERVER"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "SNOWFLAKE"
    ENTITY_TYPE_SNOWFLAKE = "SNOWFLAKE"

    #: A constant which can be used with the entity_type property of a Schema.
    #: This constant has a value of "ORACLE_ANALYTICS"
    ENTITY_TYPE_ORACLE_ANALYTICS = "ORACLE_ANALYTICS"

    #: A constant which can be used with the lifecycle_state property of a Schema.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a Schema.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a Schema.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    def __init__(self, **kwargs):
        """
        Initializes a new Schema object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.OracleSchema`
        * :class:`~oci.aidataplatform_dp.models.AlhSchema`
        * :class:`~oci.aidataplatform_dp.models.AdwSchema`
        * :class:`~oci.aidataplatform_dp.models.KafkaTopicSchema`
        * :class:`~oci.aidataplatform_dp.models.SqlServerOnAzureSchema`
        * :class:`~oci.aidataplatform_dp.models.SnowflakeSchema`
        * :class:`~oci.aidataplatform_dp.models.AtpSchema`
        * :class:`~oci.aidataplatform_dp.models.MysqlSchema`
        * :class:`~oci.aidataplatform_dp.models.StandardSchema`
        * :class:`~oci.aidataplatform_dp.models.OacSchema`
        * :class:`~oci.aidataplatform_dp.models.ExadataSchema`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this Schema.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type entity_type: str

        :param key:
            The value to assign to the key property of this Schema.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this Schema.
        :type display_name: str

        :param description:
            The value to assign to the description property of this Schema.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this Schema.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this Schema.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this Schema.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this Schema.
        :type updated_by: str

        :param properties:
            The value to assign to the properties property of this Schema.
        :type properties: dict(str, str)

        :param catalog_name:
            The value to assign to the catalog_name property of this Schema.
        :type catalog_name: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this Schema.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        :param lifecycle_state_details:
            The value to assign to the lifecycle_state_details property of this Schema.
        :type lifecycle_state_details: str

        :param details:
            The value to assign to the details property of this Schema.
        :type details: dict(str, str)

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
            'details': 'dict(str, str)'
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
            'details': 'details'
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

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['entityType']

        if type == 'ORACLE':
            return 'OracleSchema'

        if type == 'ALH':
            return 'AlhSchema'

        if type == 'ADW':
            return 'AdwSchema'

        if type == 'KAFKA_TOPIC':
            return 'KafkaTopicSchema'

        if type == 'AZURE_SQLSERVER':
            return 'SqlServerOnAzureSchema'

        if type == 'SNOWFLAKE':
            return 'SnowflakeSchema'

        if type == 'ATP':
            return 'AtpSchema'

        if type == 'MYSQL':
            return 'MysqlSchema'

        if type == 'STANDARD':
            return 'StandardSchema'

        if type == 'ORACLE_ANALYTICS':
            return 'OacSchema'

        if type == 'EXADATA':
            return 'ExadataSchema'
        else:
            return 'Schema'

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this Schema.
        An enum to decide the type of the derived model.

        Allowed values for this property are: "ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The entity_type of this Schema.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this Schema.
        An enum to decide the type of the derived model.


        :param entity_type: The entity_type of this Schema.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "STANDARD", "KAFKA_TOPIC", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS"]
        if not value_allowed_none_or_none_sentinel(entity_type, allowed_values):
            entity_type = 'UNKNOWN_ENUM_VALUE'
        self._entity_type = entity_type

    @property
    def key(self):
        """
        **[Required]** Gets the key of this Schema.
        The fully qualified name of the schema in the format <catalog_name>.<schema_name>.


        :return: The key of this Schema.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this Schema.
        The fully qualified name of the schema in the format <catalog_name>.<schema_name>.


        :param key: The key of this Schema.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this Schema.
        Schema name.


        :return: The display_name of this Schema.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this Schema.
        Schema name.


        :param display_name: The display_name of this Schema.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this Schema.
        Schema description.


        :return: The description of this Schema.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Schema.
        Schema description.


        :param description: The description of this Schema.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        Gets the time_created of this Schema.
        The date and time the schema was created.


        :return: The time_created of this Schema.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this Schema.
        The date and time the schema was created.


        :param time_created: The time_created of this Schema.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this Schema.
        The date and time the schema was updated.


        :return: The time_updated of this Schema.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this Schema.
        The date and time the schema was updated.


        :param time_updated: The time_updated of this Schema.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this Schema.
        ID of the user who created the schema.


        :return: The created_by of this Schema.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this Schema.
        ID of the user who created the schema.


        :param created_by: The created_by of this Schema.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this Schema.
        ID of the user who last updated the schema.


        :return: The updated_by of this Schema.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this Schema.
        ID of the user who last updated the schema.


        :param updated_by: The updated_by of this Schema.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def properties(self):
        """
        Gets the properties of this Schema.
        Key-value pair representing a defined tag key and value.


        :return: The properties of this Schema.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this Schema.
        Key-value pair representing a defined tag key and value.


        :param properties: The properties of this Schema.
        :type: dict(str, str)
        """
        self._properties = properties

    @property
    def catalog_name(self):
        """
        Gets the catalog_name of this Schema.
        The name of the catalog to which this schema belongs.


        :return: The catalog_name of this Schema.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this Schema.
        The name of the catalog to which this schema belongs.


        :param catalog_name: The catalog_name of this Schema.
        :type: str
        """
        self._catalog_name = catalog_name

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this Schema.
        The current state of the schema.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this Schema.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this Schema.
        The current state of the schema.


        :param lifecycle_state: The lifecycle_state of this Schema.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    @property
    def lifecycle_state_details(self):
        """
        Gets the lifecycle_state_details of this Schema.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :return: The lifecycle_state_details of this Schema.
        :rtype: str
        """
        return self._lifecycle_state_details

    @lifecycle_state_details.setter
    def lifecycle_state_details(self, lifecycle_state_details):
        """
        Sets the lifecycle_state_details of this Schema.
        A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.


        :param lifecycle_state_details: The lifecycle_state_details of this Schema.
        :type: str
        """
        self._lifecycle_state_details = lifecycle_state_details

    @property
    def details(self):
        """
        Gets the details of this Schema.
        Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.


        :return: The details of this Schema.
        :rtype: dict(str, str)
        """
        return self._details

    @details.setter
    def details(self, details):
        """
        Sets the details of this Schema.
        Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.


        :param details: The details of this Schema.
        :type: dict(str, str)
        """
        self._details = details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
