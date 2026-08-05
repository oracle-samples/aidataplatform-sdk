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

        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'description': 'description'
        }

        self._id = None
        self._name = None
        self._description = None

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

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
