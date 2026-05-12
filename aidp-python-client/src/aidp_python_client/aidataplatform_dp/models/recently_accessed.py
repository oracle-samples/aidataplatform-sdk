# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RecentlyAccessed(object):
    """
    The resources which were recently accessed by a user.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RecentlyAccessed object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param global_level_resources:
            The value to assign to the global_level_resources property of this RecentlyAccessed.
        :type global_level_resources: list[oci.aidataplatform_dp.models.RecentResourceItem]

        :param workspace_level_resources:
            The value to assign to the workspace_level_resources property of this RecentlyAccessed.
        :type workspace_level_resources: list[oci.aidataplatform_dp.models.RecentResourceItem]

        """
        self.swagger_types = {
            'global_level_resources': 'list[RecentResourceItem]',
            'workspace_level_resources': 'list[RecentResourceItem]'
        }

        self.attribute_map = {
            'global_level_resources': 'globalLevelResources',
            'workspace_level_resources': 'workspaceLevelResources'
        }

        self._global_level_resources = None
        self._workspace_level_resources = None

    @property
    def global_level_resources(self):
        """
        **[Required]** Gets the global_level_resources of this RecentlyAccessed.
        List of recent resources that are global, meaning not contained to workspace example catalog and its subresoruces.


        :return: The global_level_resources of this RecentlyAccessed.
        :rtype: list[oci.aidataplatform_dp.models.RecentResourceItem]
        """
        return self._global_level_resources

    @global_level_resources.setter
    def global_level_resources(self, global_level_resources):
        """
        Sets the global_level_resources of this RecentlyAccessed.
        List of recent resources that are global, meaning not contained to workspace example catalog and its subresoruces.


        :param global_level_resources: The global_level_resources of this RecentlyAccessed.
        :type: list[oci.aidataplatform_dp.models.RecentResourceItem]
        """
        self._global_level_resources = global_level_resources

    @property
    def workspace_level_resources(self):
        """
        **[Required]** Gets the workspace_level_resources of this RecentlyAccessed.
        List of recent resources that are contained in workspace, like clusters.


        :return: The workspace_level_resources of this RecentlyAccessed.
        :rtype: list[oci.aidataplatform_dp.models.RecentResourceItem]
        """
        return self._workspace_level_resources

    @workspace_level_resources.setter
    def workspace_level_resources(self, workspace_level_resources):
        """
        Sets the workspace_level_resources of this RecentlyAccessed.
        List of recent resources that are contained in workspace, like clusters.


        :param workspace_level_resources: The workspace_level_resources of this RecentlyAccessed.
        :type: list[oci.aidataplatform_dp.models.RecentResourceItem]
        """
        self._workspace_level_resources = workspace_level_resources

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
