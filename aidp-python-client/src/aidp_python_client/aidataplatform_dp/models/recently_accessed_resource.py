# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecentlyAccessedResource(object):
    """
    The resources which were recently accessed by a user.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RecentlyAccessedResource object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param last_accessed_workspace_key:
            The value to assign to the last_accessed_workspace_key property of this RecentlyAccessedResource.
        :type last_accessed_workspace_key: str

        :param last_accessed_workspace_display_name:
            The value to assign to the last_accessed_workspace_display_name property of this RecentlyAccessedResource.
        :type last_accessed_workspace_display_name: str

        """
        self.swagger_types = {
            'last_accessed_workspace_key': 'str',
            'last_accessed_workspace_display_name': 'str'
        }

        self.attribute_map = {
            'last_accessed_workspace_key': 'lastAccessedWorkspaceKey',
            'last_accessed_workspace_display_name': 'lastAccessedWorkspaceDisplayName'
        }

        self._last_accessed_workspace_key = None
        self._last_accessed_workspace_display_name = None

    @property
    def last_accessed_workspace_key(self):
        """
        **[Required]** Gets the last_accessed_workspace_key of this RecentlyAccessedResource.
        Last active workspaceKey.


        :return: The last_accessed_workspace_key of this RecentlyAccessedResource.
        :rtype: str
        """
        return self._last_accessed_workspace_key

    @last_accessed_workspace_key.setter
    def last_accessed_workspace_key(self, last_accessed_workspace_key):
        """
        Sets the last_accessed_workspace_key of this RecentlyAccessedResource.
        Last active workspaceKey.


        :param last_accessed_workspace_key: The last_accessed_workspace_key of this RecentlyAccessedResource.
        :type: str
        """
        self._last_accessed_workspace_key = last_accessed_workspace_key

    @property
    def last_accessed_workspace_display_name(self):
        """
        **[Required]** Gets the last_accessed_workspace_display_name of this RecentlyAccessedResource.
        Last active workspace display name.


        :return: The last_accessed_workspace_display_name of this RecentlyAccessedResource.
        :rtype: str
        """
        return self._last_accessed_workspace_display_name

    @last_accessed_workspace_display_name.setter
    def last_accessed_workspace_display_name(self, last_accessed_workspace_display_name):
        """
        Sets the last_accessed_workspace_display_name of this RecentlyAccessedResource.
        Last active workspace display name.


        :param last_accessed_workspace_display_name: The last_accessed_workspace_display_name of this RecentlyAccessedResource.
        :type: str
        """
        self._last_accessed_workspace_display_name = last_accessed_workspace_display_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
