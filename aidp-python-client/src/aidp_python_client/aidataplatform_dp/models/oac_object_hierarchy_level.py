# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacObjectHierarchyLevel(object):
    """
    Hierarchy level metadata for an Oracle Analytics hierarchical column.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacObjectHierarchyLevel object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param level_id:
            The value to assign to the level_id property of this OacObjectHierarchyLevel.
        :type level_id: str

        :param display_name:
            The value to assign to the display_name property of this OacObjectHierarchyLevel.
        :type display_name: str

        :param desc:
            The value to assign to the desc property of this OacObjectHierarchyLevel.
        :type desc: str

        """
        self.swagger_types = {
            'level_id': 'str',
            'display_name': 'str',
            'desc': 'str'
        }

        self.attribute_map = {
            'level_id': 'levelID',
            'display_name': 'displayName',
            'desc': 'desc'
        }

        self._level_id = None
        self._display_name = None
        self._desc = None

    @property
    def level_id(self):
        """
        Gets the level_id of this OacObjectHierarchyLevel.
        The Oracle Analytics hierarchy level identifier.


        :return: The level_id of this OacObjectHierarchyLevel.
        :rtype: str
        """
        return self._level_id

    @level_id.setter
    def level_id(self, level_id):
        """
        Sets the level_id of this OacObjectHierarchyLevel.
        The Oracle Analytics hierarchy level identifier.


        :param level_id: The level_id of this OacObjectHierarchyLevel.
        :type: str
        """
        self._level_id = level_id

    @property
    def display_name(self):
        """
        Gets the display_name of this OacObjectHierarchyLevel.
        The Oracle Analytics hierarchy level display name.


        :return: The display_name of this OacObjectHierarchyLevel.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this OacObjectHierarchyLevel.
        The Oracle Analytics hierarchy level display name.


        :param display_name: The display_name of this OacObjectHierarchyLevel.
        :type: str
        """
        self._display_name = display_name

    @property
    def desc(self):
        """
        Gets the desc of this OacObjectHierarchyLevel.
        The Oracle Analytics hierarchy level description.


        :return: The desc of this OacObjectHierarchyLevel.
        :rtype: str
        """
        return self._desc

    @desc.setter
    def desc(self, desc):
        """
        Sets the desc of this OacObjectHierarchyLevel.
        The Oracle Analytics hierarchy level description.


        :param desc: The desc of this OacObjectHierarchyLevel.
        :type: str
        """
        self._desc = desc

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
