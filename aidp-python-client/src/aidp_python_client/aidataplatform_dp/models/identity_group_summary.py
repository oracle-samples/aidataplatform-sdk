# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class IdentityGroupSummary(object):
    """
    A group in the tenancy.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new IdentityGroupSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param group_id:
            The value to assign to the group_id property of this IdentityGroupSummary.
        :type group_id: str

        :param group_name:
            The value to assign to the group_name property of this IdentityGroupSummary.
        :type group_name: str

        """
        self.swagger_types = {
            'group_id': 'str',
            'group_name': 'str'
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'group_name': 'groupName'
        }

        self._group_id = None
        self._group_name = None

    @property
    def group_id(self):
        """
        Gets the group_id of this IdentityGroupSummary.
        The ID of the group.


        :return: The group_id of this IdentityGroupSummary.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """
        Sets the group_id of this IdentityGroupSummary.
        The ID of the group.


        :param group_id: The group_id of this IdentityGroupSummary.
        :type: str
        """
        self._group_id = group_id

    @property
    def group_name(self):
        """
        Gets the group_name of this IdentityGroupSummary.
        The name of the group.


        :return: The group_name of this IdentityGroupSummary.
        :rtype: str
        """
        return self._group_name

    @group_name.setter
    def group_name(self, group_name):
        """
        Sets the group_name of this IdentityGroupSummary.
        The name of the group.


        :param group_name: The group_name of this IdentityGroupSummary.
        :type: str
        """
        self._group_name = group_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
