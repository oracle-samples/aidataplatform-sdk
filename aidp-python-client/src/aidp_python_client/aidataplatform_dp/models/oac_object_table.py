# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacObjectTable(object):
    """
    Table and column metadata exposed by an Oracle Analytics object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacObjectTable object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OacObjectTable.
        :type id: str

        :param name:
            The value to assign to the name property of this OacObjectTable.
        :type name: str

        :param description:
            The value to assign to the description property of this OacObjectTable.
        :type description: str

        :param columns:
            The value to assign to the columns property of this OacObjectTable.
        :type columns: list[oci.aidataplatform_dp.models.OacObjectColumn]

        :param child_tables:
            The value to assign to the child_tables property of this OacObjectTable.
        :type child_tables: list[oci.aidataplatform_dp.models.OacObjectTable]

        :param tables:
            The value to assign to the tables property of this OacObjectTable.
        :type tables: list[oci.aidataplatform_dp.models.OacObjectTable]

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'description': 'str',
            'columns': 'list[OacObjectColumn]',
            'child_tables': 'list[OacObjectTable]',
            'tables': 'list[OacObjectTable]'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'description': 'description',
            'columns': 'columns',
            'child_tables': 'childTables',
            'tables': 'tables'
        }

        self._id = None
        self._name = None
        self._description = None
        self._columns = None
        self._child_tables = None
        self._tables = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OacObjectTable.
        The Oracle Analytics table identifier.


        :return: The id of this OacObjectTable.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OacObjectTable.
        The Oracle Analytics table identifier.


        :param id: The id of this OacObjectTable.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this OacObjectTable.
        The Oracle Analytics table display name.


        :return: The name of this OacObjectTable.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OacObjectTable.
        The Oracle Analytics table display name.


        :param name: The name of this OacObjectTable.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this OacObjectTable.
        The Oracle Analytics table description.


        :return: The description of this OacObjectTable.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OacObjectTable.
        The Oracle Analytics table description.


        :param description: The description of this OacObjectTable.
        :type: str
        """
        self._description = description

    @property
    def columns(self):
        """
        Gets the columns of this OacObjectTable.
        The Oracle Analytics columns in the table.


        :return: The columns of this OacObjectTable.
        :rtype: list[oci.aidataplatform_dp.models.OacObjectColumn]
        """
        return self._columns

    @columns.setter
    def columns(self, columns):
        """
        Sets the columns of this OacObjectTable.
        The Oracle Analytics columns in the table.


        :param columns: The columns of this OacObjectTable.
        :type: list[oci.aidataplatform_dp.models.OacObjectColumn]
        """
        self._columns = columns

    @property
    def child_tables(self):
        """
        Gets the child_tables of this OacObjectTable.
        Child tables nested under this Oracle Analytics table.


        :return: The child_tables of this OacObjectTable.
        :rtype: list[oci.aidataplatform_dp.models.OacObjectTable]
        """
        return self._child_tables

    @child_tables.setter
    def child_tables(self, child_tables):
        """
        Sets the child_tables of this OacObjectTable.
        Child tables nested under this Oracle Analytics table.


        :param child_tables: The child_tables of this OacObjectTable.
        :type: list[oci.aidataplatform_dp.models.OacObjectTable]
        """
        self._child_tables = child_tables

    @property
    def tables(self):
        """
        Gets the tables of this OacObjectTable.
        Additional tables nested under this Oracle Analytics table.


        :return: The tables of this OacObjectTable.
        :rtype: list[oci.aidataplatform_dp.models.OacObjectTable]
        """
        return self._tables

    @tables.setter
    def tables(self, tables):
        """
        Sets the tables of this OacObjectTable.
        Additional tables nested under this Oracle Analytics table.


        :param tables: The tables of this OacObjectTable.
        :type: list[oci.aidataplatform_dp.models.OacObjectTable]
        """
        self._tables = tables

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
