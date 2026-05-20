# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterSpec(object):
    """
    Cluster specification snapshot of a job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterSpec object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param existing_cluster_key:
            The value to assign to the existing_cluster_key property of this ClusterSpec.
        :type existing_cluster_key: str

        :param new_cluster:
            The value to assign to the new_cluster property of this ClusterSpec.
        :type new_cluster: oci.aidataplatform_dp.models.NewClusterConfiguration

        :param libraries:
            The value to assign to the libraries property of this ClusterSpec.
        :type libraries: oci.aidataplatform_dp.models.Libraries

        """
        self.swagger_types = {
            'existing_cluster_key': 'str',
            'new_cluster': 'NewClusterConfiguration',
            'libraries': 'Libraries'
        }

        self.attribute_map = {
            'existing_cluster_key': 'existingClusterKey',
            'new_cluster': 'newCluster',
            'libraries': 'libraries'
        }

        self._existing_cluster_key = None
        self._new_cluster = None
        self._libraries = None

    @property
    def existing_cluster_key(self):
        """
        Gets the existing_cluster_key of this ClusterSpec.
        The key of the cluster.


        :return: The existing_cluster_key of this ClusterSpec.
        :rtype: str
        """
        return self._existing_cluster_key

    @existing_cluster_key.setter
    def existing_cluster_key(self, existing_cluster_key):
        """
        Sets the existing_cluster_key of this ClusterSpec.
        The key of the cluster.


        :param existing_cluster_key: The existing_cluster_key of this ClusterSpec.
        :type: str
        """
        self._existing_cluster_key = existing_cluster_key

    @property
    def new_cluster(self):
        """
        Gets the new_cluster of this ClusterSpec.

        :return: The new_cluster of this ClusterSpec.
        :rtype: oci.aidataplatform_dp.models.NewClusterConfiguration
        """
        return self._new_cluster

    @new_cluster.setter
    def new_cluster(self, new_cluster):
        """
        Sets the new_cluster of this ClusterSpec.

        :param new_cluster: The new_cluster of this ClusterSpec.
        :type: oci.aidataplatform_dp.models.NewClusterConfiguration
        """
        self._new_cluster = new_cluster

    @property
    def libraries(self):
        """
        Gets the libraries of this ClusterSpec.

        :return: The libraries of this ClusterSpec.
        :rtype: oci.aidataplatform_dp.models.Libraries
        """
        return self._libraries

    @libraries.setter
    def libraries(self, libraries):
        """
        Sets the libraries of this ClusterSpec.

        :param libraries: The libraries of this ClusterSpec.
        :type: oci.aidataplatform_dp.models.Libraries
        """
        self._libraries = libraries

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
