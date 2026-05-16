# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DataLakeClusterSummary(object):
    """
    Information about the list of AI Data Platform Workbench clusters contained within a workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DataLakeClusterSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param workspace_key:
            The value to assign to the workspace_key property of this DataLakeClusterSummary.
        :type workspace_key: str

        :param workspace_display_name:
            The value to assign to the workspace_display_name property of this DataLakeClusterSummary.
        :type workspace_display_name: str

        :param clusters:
            The value to assign to the clusters property of this DataLakeClusterSummary.
        :type clusters: list[oci.aidataplatform_dp.models.ClusterSummary]

        """
        self.swagger_types = {
            'workspace_key': 'str',
            'workspace_display_name': 'str',
            'clusters': 'list[ClusterSummary]'
        }

        self.attribute_map = {
            'workspace_key': 'workspaceKey',
            'workspace_display_name': 'workspaceDisplayName',
            'clusters': 'clusters'
        }

        self._workspace_key = None
        self._workspace_display_name = None
        self._clusters = None

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this DataLakeClusterSummary.
        Key of the AI Data Platform Workbench workspace.


        :return: The workspace_key of this DataLakeClusterSummary.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this DataLakeClusterSummary.
        Key of the AI Data Platform Workbench workspace.


        :param workspace_key: The workspace_key of this DataLakeClusterSummary.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def workspace_display_name(self):
        """
        **[Required]** Gets the workspace_display_name of this DataLakeClusterSummary.
        Name of the AI Data Platform Workbench workspace.


        :return: The workspace_display_name of this DataLakeClusterSummary.
        :rtype: str
        """
        return self._workspace_display_name

    @workspace_display_name.setter
    def workspace_display_name(self, workspace_display_name):
        """
        Sets the workspace_display_name of this DataLakeClusterSummary.
        Name of the AI Data Platform Workbench workspace.


        :param workspace_display_name: The workspace_display_name of this DataLakeClusterSummary.
        :type: str
        """
        self._workspace_display_name = workspace_display_name

    @property
    def clusters(self):
        """
        Gets the clusters of this DataLakeClusterSummary.
        List of clusters.


        :return: The clusters of this DataLakeClusterSummary.
        :rtype: list[oci.aidataplatform_dp.models.ClusterSummary]
        """
        return self._clusters

    @clusters.setter
    def clusters(self, clusters):
        """
        Sets the clusters of this DataLakeClusterSummary.
        List of clusters.


        :param clusters: The clusters of this DataLakeClusterSummary.
        :type: list[oci.aidataplatform_dp.models.ClusterSummary]
        """
        self._clusters = clusters

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
