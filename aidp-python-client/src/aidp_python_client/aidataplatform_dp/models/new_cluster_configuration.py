# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NewClusterConfiguration(object):
    """
    The cluster configuration to create a new cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NewClusterConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param num_workers:
            The value to assign to the num_workers property of this NewClusterConfiguration.
        :type num_workers: int

        :param auto_scale:
            The value to assign to the auto_scale property of this NewClusterConfiguration.
        :type auto_scale: oci.aidataplatform_dp.models.AutoScale

        :param cluster_name:
            The value to assign to the cluster_name property of this NewClusterConfiguration.
        :type cluster_name: str

        :param spark_version:
            The value to assign to the spark_version property of this NewClusterConfiguration.
        :type spark_version: str

        :param spark_conf:
            The value to assign to the spark_conf property of this NewClusterConfiguration.
        :type spark_conf: str

        """
        self.swagger_types = {
            'num_workers': 'int',
            'auto_scale': 'AutoScale',
            'cluster_name': 'str',
            'spark_version': 'str',
            'spark_conf': 'str'
        }

        self.attribute_map = {
            'num_workers': 'numWorkers',
            'auto_scale': 'autoScale',
            'cluster_name': 'clusterName',
            'spark_version': 'sparkVersion',
            'spark_conf': 'sparkConf'
        }

        self._num_workers = None
        self._auto_scale = None
        self._cluster_name = None
        self._spark_version = None
        self._spark_conf = None

    @property
    def num_workers(self):
        """
        Gets the num_workers of this NewClusterConfiguration.
        Number of worker nodes configured for this cluster.


        :return: The num_workers of this NewClusterConfiguration.
        :rtype: int
        """
        return self._num_workers

    @num_workers.setter
    def num_workers(self, num_workers):
        """
        Sets the num_workers of this NewClusterConfiguration.
        Number of worker nodes configured for this cluster.


        :param num_workers: The num_workers of this NewClusterConfiguration.
        :type: int
        """
        self._num_workers = num_workers

    @property
    def auto_scale(self):
        """
        Gets the auto_scale of this NewClusterConfiguration.

        :return: The auto_scale of this NewClusterConfiguration.
        :rtype: oci.aidataplatform_dp.models.AutoScale
        """
        return self._auto_scale

    @auto_scale.setter
    def auto_scale(self, auto_scale):
        """
        Sets the auto_scale of this NewClusterConfiguration.

        :param auto_scale: The auto_scale of this NewClusterConfiguration.
        :type: oci.aidataplatform_dp.models.AutoScale
        """
        self._auto_scale = auto_scale

    @property
    def cluster_name(self):
        """
        Gets the cluster_name of this NewClusterConfiguration.
        A unique name for the job cluster.


        :return: The cluster_name of this NewClusterConfiguration.
        :rtype: str
        """
        return self._cluster_name

    @cluster_name.setter
    def cluster_name(self, cluster_name):
        """
        Sets the cluster_name of this NewClusterConfiguration.
        A unique name for the job cluster.


        :param cluster_name: The cluster_name of this NewClusterConfiguration.
        :type: str
        """
        self._cluster_name = cluster_name

    @property
    def spark_version(self):
        """
        Gets the spark_version of this NewClusterConfiguration.
        The Spark version used to run the application.


        :return: The spark_version of this NewClusterConfiguration.
        :rtype: str
        """
        return self._spark_version

    @spark_version.setter
    def spark_version(self, spark_version):
        """
        Sets the spark_version of this NewClusterConfiguration.
        The Spark version used to run the application.


        :param spark_version: The spark_version of this NewClusterConfiguration.
        :type: str
        """
        self._spark_version = spark_version

    @property
    def spark_conf(self):
        """
        Gets the spark_conf of this NewClusterConfiguration.
        The spark configuration in key-value pairs.


        :return: The spark_conf of this NewClusterConfiguration.
        :rtype: str
        """
        return self._spark_conf

    @spark_conf.setter
    def spark_conf(self, spark_conf):
        """
        Sets the spark_conf of this NewClusterConfiguration.
        The spark configuration in key-value pairs.


        :param spark_conf: The spark_conf of this NewClusterConfiguration.
        :type: str
        """
        self._spark_conf = spark_conf

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
