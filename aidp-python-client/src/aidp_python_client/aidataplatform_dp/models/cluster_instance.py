# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterInstance(object):
    """
    The cluster used for this run.
    The value of this field will be set when a new cluster is specified for execution and once the request to create a new cluster is successfully submitted.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterInstance object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param cluster_key:
            The value to assign to the cluster_key property of this ClusterInstance.
        :type cluster_key: str

        :param spark_context_key:
            The value to assign to the spark_context_key property of this ClusterInstance.
        :type spark_context_key: str

        """
        self.swagger_types = {
            'cluster_key': 'str',
            'spark_context_key': 'str'
        }

        self.attribute_map = {
            'cluster_key': 'clusterKey',
            'spark_context_key': 'sparkContextKey'
        }

        self._cluster_key = None
        self._spark_context_key = None

    @property
    def cluster_key(self):
        """
        Gets the cluster_key of this ClusterInstance.
        The cluster key for the cluster configuration on which the job is executed.


        :return: The cluster_key of this ClusterInstance.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this ClusterInstance.
        The cluster key for the cluster configuration on which the job is executed.


        :param cluster_key: The cluster_key of this ClusterInstance.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def spark_context_key(self):
        """
        Gets the spark_context_key of this ClusterInstance.
        The spark context used in the job run.


        :return: The spark_context_key of this ClusterInstance.
        :rtype: str
        """
        return self._spark_context_key

    @spark_context_key.setter
    def spark_context_key(self, spark_context_key):
        """
        Sets the spark_context_key of this ClusterInstance.
        The spark context used in the job run.


        :param spark_context_key: The spark_context_key of this ClusterInstance.
        :type: str
        """
        self._spark_context_key = spark_context_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
