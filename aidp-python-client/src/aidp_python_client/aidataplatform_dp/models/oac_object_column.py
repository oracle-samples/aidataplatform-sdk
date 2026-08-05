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

        :param sql_info:
            The value to assign to the sql_info property of this OacObjectColumn.
        :type sql_info: object

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'formula': 'str',
            'is_time': 'bool',
            'type': 'str',
            'sql_info': 'object'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'formula': 'formula',
            'is_time': 'isTime',
            'type': 'type',
            'sql_info': 'sqlInfo'
        }

        self._name = None
        self._description = None
        self._formula = None
        self._is_time = None
        self._type = None
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
    def sql_info(self):
        """
        Gets the sql_info of this OacObjectColumn.
        Additional SQL metadata reported by Oracle Analytics for the column.


        :return: The sql_info of this OacObjectColumn.
        :rtype: object
        """
        return self._sql_info

    @sql_info.setter
    def sql_info(self, sql_info):
        """
        Sets the sql_info of this OacObjectColumn.
        Additional SQL metadata reported by Oracle Analytics for the column.


        :param sql_info: The sql_info of this OacObjectColumn.
        :type: object
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
