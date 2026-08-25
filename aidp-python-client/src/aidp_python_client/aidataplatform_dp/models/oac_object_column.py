# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacObjectColumn(object):
    """
    Column metadata for a table exposed by an Oracle Analytics object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacObjectColumn object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this OacObjectColumn.
        :type name: str

        :param description:
            The value to assign to the description property of this OacObjectColumn.
        :type description: str

        :param formula:
            The value to assign to the formula property of this OacObjectColumn.
        :type formula: str

        :param is_time:
            The value to assign to the is_time property of this OacObjectColumn.
        :type is_time: bool

        :param type:
            The value to assign to the type property of this OacObjectColumn.
        :type type: str

        :param hierarchy_id:
            The value to assign to the hierarchy_id property of this OacObjectColumn.
        :type hierarchy_id: str

        :param hierarchy_display_name:
            The value to assign to the hierarchy_display_name property of this OacObjectColumn.
        :type hierarchy_display_name: str

        :param dimension_id:
            The value to assign to the dimension_id property of this OacObjectColumn.
        :type dimension_id: str

        :param table_name:
            The value to assign to the table_name property of this OacObjectColumn.
        :type table_name: str

        :param levels:
            The value to assign to the levels property of this OacObjectColumn.
        :type levels: list[oci.aidataplatform_dp.models.OacObjectHierarchyLevel]

        :param sql_info:
            The value to assign to the sql_info property of this OacObjectColumn.
        :type sql_info: oci.aidataplatform_dp.models.OacObjectColumnSqlInfo

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'formula': 'str',
            'is_time': 'bool',
            'type': 'str',
            'hierarchy_id': 'str',
            'hierarchy_display_name': 'str',
            'dimension_id': 'str',
            'table_name': 'str',
            'levels': 'list[OacObjectHierarchyLevel]',
            'sql_info': 'OacObjectColumnSqlInfo'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'formula': 'formula',
            'is_time': 'isTime',
            'type': 'type',
            'hierarchy_id': 'hierarchyID',
            'hierarchy_display_name': 'hierarchyDisplayName',
            'dimension_id': 'dimensionID',
            'table_name': 'tableName',
            'levels': 'levels',
            'sql_info': 'sqlInfo'
        }

        self._name = None
        self._description = None
        self._formula = None
        self._is_time = None
        self._type = None
        self._hierarchy_id = None
        self._hierarchy_display_name = None
        self._dimension_id = None
        self._table_name = None
        self._levels = None
        self._sql_info = None

    @property
    def name(self):
        """
        Gets the name of this OacObjectColumn.
        The Oracle Analytics column name.


        :return: The name of this OacObjectColumn.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OacObjectColumn.
        The Oracle Analytics column name.


        :param name: The name of this OacObjectColumn.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this OacObjectColumn.
        The Oracle Analytics column description.


        :return: The description of this OacObjectColumn.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OacObjectColumn.
        The Oracle Analytics column description.


        :param description: The description of this OacObjectColumn.
        :type: str
        """
        self._description = description

    @property
    def formula(self):
        """
        Gets the formula of this OacObjectColumn.
        The Oracle Analytics expression backing the column.


        :return: The formula of this OacObjectColumn.
        :rtype: str
        """
        return self._formula

    @formula.setter
    def formula(self, formula):
        """
        Sets the formula of this OacObjectColumn.
        The Oracle Analytics expression backing the column.


        :param formula: The formula of this OacObjectColumn.
        :type: str
        """
        self._formula = formula

    @property
    def is_time(self):
        """
        Gets the is_time of this OacObjectColumn.
        Indicates whether this Oracle Analytics column represents time.


        :return: The is_time of this OacObjectColumn.
        :rtype: bool
        """
        return self._is_time

    @is_time.setter
    def is_time(self, is_time):
        """
        Sets the is_time of this OacObjectColumn.
        Indicates whether this Oracle Analytics column represents time.


        :param is_time: The is_time of this OacObjectColumn.
        :type: bool
        """
        self._is_time = is_time

    @property
    def type(self):
        """
        Gets the type of this OacObjectColumn.
        The Oracle Analytics column type.


        :return: The type of this OacObjectColumn.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OacObjectColumn.
        The Oracle Analytics column type.


        :param type: The type of this OacObjectColumn.
        :type: str
        """
        self._type = type

    @property
    def hierarchy_id(self):
        """
        Gets the hierarchy_id of this OacObjectColumn.
        The hierarchy identifier reported for an Oracle Analytics hierarchical column.


        :return: The hierarchy_id of this OacObjectColumn.
        :rtype: str
        """
        return self._hierarchy_id

    @hierarchy_id.setter
    def hierarchy_id(self, hierarchy_id):
        """
        Sets the hierarchy_id of this OacObjectColumn.
        The hierarchy identifier reported for an Oracle Analytics hierarchical column.


        :param hierarchy_id: The hierarchy_id of this OacObjectColumn.
        :type: str
        """
        self._hierarchy_id = hierarchy_id

    @property
    def hierarchy_display_name(self):
        """
        Gets the hierarchy_display_name of this OacObjectColumn.
        The hierarchy display name reported for a hierarchical column in an OAC data object.


        :return: The hierarchy_display_name of this OacObjectColumn.
        :rtype: str
        """
        return self._hierarchy_display_name

    @hierarchy_display_name.setter
    def hierarchy_display_name(self, hierarchy_display_name):
        """
        Sets the hierarchy_display_name of this OacObjectColumn.
        The hierarchy display name reported for a hierarchical column in an OAC data object.


        :param hierarchy_display_name: The hierarchy_display_name of this OacObjectColumn.
        :type: str
        """
        self._hierarchy_display_name = hierarchy_display_name

    @property
    def dimension_id(self):
        """
        Gets the dimension_id of this OacObjectColumn.
        The dimension identifier reported for an Oracle Analytics hierarchical column.


        :return: The dimension_id of this OacObjectColumn.
        :rtype: str
        """
        return self._dimension_id

    @dimension_id.setter
    def dimension_id(self, dimension_id):
        """
        Sets the dimension_id of this OacObjectColumn.
        The dimension identifier reported for an Oracle Analytics hierarchical column.


        :param dimension_id: The dimension_id of this OacObjectColumn.
        :type: str
        """
        self._dimension_id = dimension_id

    @property
    def table_name(self):
        """
        Gets the table_name of this OacObjectColumn.
        The table name reported for a hierarchical column in an OAC data object.


        :return: The table_name of this OacObjectColumn.
        :rtype: str
        """
        return self._table_name

    @table_name.setter
    def table_name(self, table_name):
        """
        Sets the table_name of this OacObjectColumn.
        The table name reported for a hierarchical column in an OAC data object.


        :param table_name: The table_name of this OacObjectColumn.
        :type: str
        """
        self._table_name = table_name

    @property
    def levels(self):
        """
        Gets the levels of this OacObjectColumn.
        The hierarchy levels reported for an Oracle Analytics hierarchical column.


        :return: The levels of this OacObjectColumn.
        :rtype: list[oci.aidataplatform_dp.models.OacObjectHierarchyLevel]
        """
        return self._levels

    @levels.setter
    def levels(self, levels):
        """
        Sets the levels of this OacObjectColumn.
        The hierarchy levels reported for an Oracle Analytics hierarchical column.


        :param levels: The levels of this OacObjectColumn.
        :type: list[oci.aidataplatform_dp.models.OacObjectHierarchyLevel]
        """
        self._levels = levels

    @property
    def sql_info(self):
        """
        Gets the sql_info of this OacObjectColumn.

        :return: The sql_info of this OacObjectColumn.
        :rtype: oci.aidataplatform_dp.models.OacObjectColumnSqlInfo
        """
        return self._sql_info

    @sql_info.setter
    def sql_info(self, sql_info):
        """
        Sets the sql_info of this OacObjectColumn.

        :param sql_info: The sql_info of this OacObjectColumn.
        :type: oci.aidataplatform_dp.models.OacObjectColumnSqlInfo
        """
        self._sql_info = sql_info

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
