# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TableSummary(object):
    """
    Summary information of table in the schema.
    """

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "ADW"
    ENTITY_TYPE_ADW = "ADW"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "ALH"
    ENTITY_TYPE_ALH = "ALH"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "STANDARD"
    ENTITY_TYPE_STANDARD = "STANDARD"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "ATP"
    ENTITY_TYPE_ATP = "ATP"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "ORACLE"
    ENTITY_TYPE_ORACLE = "ORACLE"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "EXADATA"
    ENTITY_TYPE_EXADATA = "EXADATA"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "MYSQL"
    ENTITY_TYPE_MYSQL = "MYSQL"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "AZURE_SQLSERVER"
    ENTITY_TYPE_AZURE_SQLSERVER = "AZURE_SQLSERVER"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "SNOWFLAKE"
    ENTITY_TYPE_SNOWFLAKE = "SNOWFLAKE"

    #: A constant which can be used with the entity_type property of a TableSummary.
    #: This constant has a value of "ORACLE_ANALYTICS"
    ENTITY_TYPE_ORACLE_ANALYTICS = "ORACLE_ANALYTICS"

    #: A constant which can be used with the table_type property of a TableSummary.
    #: This constant has a value of "MANAGED"
    TABLE_TYPE_MANAGED = "MANAGED"

    #: A constant which can be used with the table_type property of a TableSummary.
    #: This constant has a value of "EXTERNAL"
    TABLE_TYPE_EXTERNAL = "EXTERNAL"

    #: A constant which can be used with the lifecycle_state property of a TableSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a TableSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a TableSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a TableSummary.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    def __init__(self, **kwargs):
        """
        Initializes a new TableSummary object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.StandardTableSummary`
        * :class:`~oci.aidataplatform_dp.models.AlhTableSummary`
        * :class:`~oci.aidataplatform_dp.models.MysqlTableSummary`
        * :class:`~oci.aidataplatform_dp.models.ExadataTableSummary`
        * :class:`~oci.aidataplatform_dp.models.SqlServerOnAzureTableSummary`
        * :class:`~oci.aidataplatform_dp.models.OacTableSummary`
        * :class:`~oci.aidataplatform_dp.models.AdwTableSummary`
        * :class:`~oci.aidataplatform_dp.models.OracleTableSummary`
        * :class:`~oci.aidataplatform_dp.models.AtpTableSummary`
        * :class:`~oci.aidataplatform_dp.models.SnowflakeTableSummary`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this TableSummary.
            Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type entity_type: str

        :param key:
            The value to assign to the key property of this TableSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this TableSummary.
        :type display_name: str

        :param table_type:
            The value to assign to the table_type property of this TableSummary.
            Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type table_type: str

        :param time_created:
            The value to assign to the time_created property of this TableSummary.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this TableSummary.
        :type time_updated: datetime

        :param created_by:
            The value to assign to the created_by property of this TableSummary.
        :type created_by: str

        :param updated_by:
            The value to assign to the updated_by property of this TableSummary.
        :type updated_by: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this TableSummary.
            Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'entity_type': 'str',
            'key': 'str',
            'display_name': 'str',
            'table_type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'created_by': 'str',
            'updated_by': 'str',
            'lifecycle_state': 'str'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'key': 'key',
            'display_name': 'displayName',
            'table_type': 'tableType',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'created_by': 'createdBy',
            'updated_by': 'updatedBy',
            'lifecycle_state': 'lifecycleState'
        }

        self._entity_type = None
        self._key = None
        self._display_name = None
        self._table_type = None
        self._time_created = None
        self._time_updated = None
        self._created_by = None
        self._updated_by = None
        self._lifecycle_state = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['entityType']

        if type == 'STANDARD':
            return 'StandardTableSummary'

        if type == 'ALH':
            return 'AlhTableSummary'

        if type == 'MYSQL':
            return 'MysqlTableSummary'

        if type == 'EXADATA':
            return 'ExadataTableSummary'

        if type == 'AZURE_SQLSERVER':
            return 'SqlServerOnAzureTableSummary'

        if type == 'ORACLE_ANALYTICS':
            return 'OacTableSummary'

        if type == 'ADW':
            return 'AdwTableSummary'

        if type == 'ORACLE':
            return 'OracleTableSummary'

        if type == 'ATP':
            return 'AtpTableSummary'

        if type == 'SNOWFLAKE':
            return 'SnowflakeTableSummary'
        else:
            return 'TableSummary'

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this TableSummary.
        An enum to decide the type of the derived model

        Allowed values for this property are: "ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The entity_type of this TableSummary.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this TableSummary.
        An enum to decide the type of the derived model


        :param entity_type: The entity_type of this TableSummary.
        :type: str
        """
        allowed_values = ["ADW", "ALH", "STANDARD", "ATP", "ORACLE", "EXADATA", "MYSQL", "AZURE_SQLSERVER", "SNOWFLAKE", "ORACLE_ANALYTICS"]
        if not value_allowed_none_or_none_sentinel(entity_type, allowed_values):
            entity_type = 'UNKNOWN_ENUM_VALUE'
        self._entity_type = entity_type

    @property
    def key(self):
        """
        Gets the key of this TableSummary.
        The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.


        :return: The key of this TableSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this TableSummary.
        The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.


        :param key: The key of this TableSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this TableSummary.
        Table name.


        :return: The display_name of this TableSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this TableSummary.
        Table name.


        :param display_name: The display_name of this TableSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def table_type(self):
        """
        Gets the table_type of this TableSummary.
        Type of table. Managed, external or mount table.

        Allowed values for this property are: "MANAGED", "EXTERNAL", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The table_type of this TableSummary.
        :rtype: str
        """
        return self._table_type

    @table_type.setter
    def table_type(self, table_type):
        """
        Sets the table_type of this TableSummary.
        Type of table. Managed, external or mount table.


        :param table_type: The table_type of this TableSummary.
        :type: str
        """
        allowed_values = ["MANAGED", "EXTERNAL"]
        if not value_allowed_none_or_none_sentinel(table_type, allowed_values):
            table_type = 'UNKNOWN_ENUM_VALUE'
        self._table_type = table_type

    @property
    def time_created(self):
        """
        Gets the time_created of this TableSummary.
        The date and time the table was created.


        :return: The time_created of this TableSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this TableSummary.
        The date and time the table was created.


        :param time_created: The time_created of this TableSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this TableSummary.
        The date and time the table was updated.


        :return: The time_updated of this TableSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this TableSummary.
        The date and time the table was updated.


        :param time_updated: The time_updated of this TableSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def created_by(self):
        """
        Gets the created_by of this TableSummary.
        The OCID of the user/principal who created the table.


        :return: The created_by of this TableSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this TableSummary.
        The OCID of the user/principal who created the table.


        :param created_by: The created_by of this TableSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def updated_by(self):
        """
        Gets the updated_by of this TableSummary.
        The ID of the user who last updated the schema.


        :return: The updated_by of this TableSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this TableSummary.
        The ID of the user who last updated the schema.


        :param updated_by: The updated_by of this TableSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this TableSummary.
        The state of the table.

        Allowed values for this property are: "ACTIVE", "CREATING", "DELETING", "UPDATING", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The lifecycle_state of this TableSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this TableSummary.
        The state of the table.


        :param lifecycle_state: The lifecycle_state of this TableSummary.
        :type: str
        """
        allowed_values = ["ACTIVE", "CREATING", "DELETING", "UPDATING"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            lifecycle_state = 'UNKNOWN_ENUM_VALUE'
        self._lifecycle_state = lifecycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
