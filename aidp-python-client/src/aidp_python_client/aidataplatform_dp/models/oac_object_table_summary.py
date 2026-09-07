# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacObjectTableSummary(object):
    """
    Summary information about a table exposed by an Oracle Analytics object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacObjectTableSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OacObjectTableSummary.
        :type id: str

        :param name:
            The value to assign to the name property of this OacObjectTableSummary.
        :type name: str

        :param description:
            The value to assign to the description property of this OacObjectTableSummary.
        :type description: str

        :param child_tables:
            The value to assign to the child_tables property of this OacObjectTableSummary.
        :type child_tables: list[oci.aidataplatform_dp.models.OacObjectTableSummary]

        :param tables:
            The value to assign to the tables property of this OacObjectTableSummary.
        :type tables: list[oci.aidataplatform_dp.models.OacObjectTableSummary]

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'description': 'str',
            'child_tables': 'list[OacObjectTableSummary]',
            'tables': 'list[OacObjectTableSummary]'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'description': 'description',
            'child_tables': 'childTables',
            'tables': 'tables'
        }

        self._id = None
        self._name = None
        self._description = None
        self._child_tables = None
        self._tables = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OacObjectTableSummary.
        The Oracle Analytics table identifier.


        :return: The id of this OacObjectTableSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OacObjectTableSummary.
        The Oracle Analytics table identifier.


        :param id: The id of this OacObjectTableSummary.
        :type: str
        """
        self._id = id

    @property
    def name(self):
        """
        **[Required]** Gets the name of this OacObjectTableSummary.
        The Oracle Analytics table display name.


        :return: The name of this OacObjectTableSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OacObjectTableSummary.
        The Oracle Analytics table display name.


        :param name: The name of this OacObjectTableSummary.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this OacObjectTableSummary.
        The Oracle Analytics table description.


        :return: The description of this OacObjectTableSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OacObjectTableSummary.
        The Oracle Analytics table description.


        :param description: The description of this OacObjectTableSummary.
        :type: str
        """
        self._description = description

    @property
    def child_tables(self):
        """
        Gets the child_tables of this OacObjectTableSummary.
        Child tables nested under this Oracle Analytics table.


        :return: The child_tables of this OacObjectTableSummary.
        :rtype: list[oci.aidataplatform_dp.models.OacObjectTableSummary]
        """
        return self._child_tables

    @child_tables.setter
    def child_tables(self, child_tables):
        """
        Sets the child_tables of this OacObjectTableSummary.
        Child tables nested under this Oracle Analytics table.


        :param child_tables: The child_tables of this OacObjectTableSummary.
        :type: list[oci.aidataplatform_dp.models.OacObjectTableSummary]
        """
        self._child_tables = child_tables

    @property
    def tables(self):
        """
        Gets the tables of this OacObjectTableSummary.
        Additional tables nested under this Oracle Analytics table.


        :return: The tables of this OacObjectTableSummary.
        :rtype: list[oci.aidataplatform_dp.models.OacObjectTableSummary]
        """
        return self._tables

    @tables.setter
    def tables(self, tables):
        """
        Sets the tables of this OacObjectTableSummary.
        Additional tables nested under this Oracle Analytics table.


        :param tables: The tables of this OacObjectTableSummary.
        :type: list[oci.aidataplatform_dp.models.OacObjectTableSummary]
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
