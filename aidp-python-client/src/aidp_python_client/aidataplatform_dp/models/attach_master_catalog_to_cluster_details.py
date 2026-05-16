# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AttachMasterCatalogToClusterDetails(object):
    """
    Details to attach a Master Catalog to a Cluster
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AttachMasterCatalogToClusterDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param cluster_key:
            The value to assign to the cluster_key property of this AttachMasterCatalogToClusterDetails.
        :type cluster_key: str

        """
        self.swagger_types = {
            'cluster_key': 'str'
        }

        self.attribute_map = {
            'cluster_key': 'clusterKey'
        }

        self._cluster_key = None

    @property
    def cluster_key(self):
        """
        **[Required]** Gets the cluster_key of this AttachMasterCatalogToClusterDetails.
        The key of the Cluster to attach Master Catalog


        :return: The cluster_key of this AttachMasterCatalogToClusterDetails.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this AttachMasterCatalogToClusterDetails.
        The key of the Cluster to attach Master Catalog


        :param cluster_key: The cluster_key of this AttachMasterCatalogToClusterDetails.
        :type: str
        """
        self._cluster_key = cluster_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
