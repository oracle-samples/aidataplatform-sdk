# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class JobCluster(object):
    """
    The cluster configuration that can be shared by tasks in the job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new JobCluster object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param cluster_key:
            The value to assign to the cluster_key property of this JobCluster.
        :type cluster_key: str

        :param cluster_name:
            The value to assign to the cluster_name property of this JobCluster.
        :type cluster_name: str

        :param new_cluster:
            The value to assign to the new_cluster property of this JobCluster.
        :type new_cluster: oci.aidataplatform_dp.models.NewClusterConfiguration

        """
        self.swagger_types = {
            'cluster_key': 'str',
            'cluster_name': 'str',
            'new_cluster': 'NewClusterConfiguration'
        }

        self.attribute_map = {
            'cluster_key': 'clusterKey',
            'cluster_name': 'clusterName',
            'new_cluster': 'newCluster'
        }

        self._cluster_key = None
        self._cluster_name = None
        self._new_cluster = None

    @property
    def cluster_key(self):
        """
        Gets the cluster_key of this JobCluster.
        A unique identifier for the job cluster.


        :return: The cluster_key of this JobCluster.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this JobCluster.
        A unique identifier for the job cluster.


        :param cluster_key: The cluster_key of this JobCluster.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def cluster_name(self):
        """
        Gets the cluster_name of this JobCluster.
        A unique name for the job cluster.


        :return: The cluster_name of this JobCluster.
        :rtype: str
        """
        return self._cluster_name

    @cluster_name.setter
    def cluster_name(self, cluster_name):
        """
        Sets the cluster_name of this JobCluster.
        A unique name for the job cluster.


        :param cluster_name: The cluster_name of this JobCluster.
        :type: str
        """
        self._cluster_name = cluster_name

    @property
    def new_cluster(self):
        """
        Gets the new_cluster of this JobCluster.

        :return: The new_cluster of this JobCluster.
        :rtype: oci.aidataplatform_dp.models.NewClusterConfiguration
        """
        return self._new_cluster

    @new_cluster.setter
    def new_cluster(self, new_cluster):
        """
        Sets the new_cluster of this JobCluster.

        :param new_cluster: The new_cluster of this JobCluster.
        :type: oci.aidataplatform_dp.models.NewClusterConfiguration
        """
        self._new_cluster = new_cluster

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
