# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ComputeConfiguration(object):
    """
    Selectable Spark Compute configuration returned by Compute.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ComputeConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param cluster_key:
            The value to assign to the cluster_key property of this ComputeConfiguration.
        :type cluster_key: str

        :param environment_variables:
            The value to assign to the environment_variables property of this ComputeConfiguration.
        :type environment_variables: dict(str, str)

        :param libraries:
            The value to assign to the libraries property of this ComputeConfiguration.
        :type libraries: oci.aidataplatform_dp.models.ComputeConfigurationLibraries

        """
        self.swagger_types = {
            'cluster_key': 'str',
            'environment_variables': 'dict(str, str)',
            'libraries': 'ComputeConfigurationLibraries'
        }

        self.attribute_map = {
            'cluster_key': 'clusterKey',
            'environment_variables': 'environmentVariables',
            'libraries': 'libraries'
        }

        self._cluster_key = None
        self._environment_variables = None
        self._libraries = None

    @property
    def cluster_key(self):
        """
        Gets the cluster_key of this ComputeConfiguration.
        Source cluster key.


        :return: The cluster_key of this ComputeConfiguration.
        :rtype: str
        """
        return self._cluster_key

    @cluster_key.setter
    def cluster_key(self, cluster_key):
        """
        Sets the cluster_key of this ComputeConfiguration.
        Source cluster key.


        :param cluster_key: The cluster_key of this ComputeConfiguration.
        :type: str
        """
        self._cluster_key = cluster_key

    @property
    def environment_variables(self):
        """
        Gets the environment_variables of this ComputeConfiguration.
        Environment-variable keys and authoritative values configured on the source Compute.


        :return: The environment_variables of this ComputeConfiguration.
        :rtype: dict(str, str)
        """
        return self._environment_variables

    @environment_variables.setter
    def environment_variables(self, environment_variables):
        """
        Sets the environment_variables of this ComputeConfiguration.
        Environment-variable keys and authoritative values configured on the source Compute.


        :param environment_variables: The environment_variables of this ComputeConfiguration.
        :type: dict(str, str)
        """
        self._environment_variables = environment_variables

    @property
    def libraries(self):
        """
        Gets the libraries of this ComputeConfiguration.

        :return: The libraries of this ComputeConfiguration.
        :rtype: oci.aidataplatform_dp.models.ComputeConfigurationLibraries
        """
        return self._libraries

    @libraries.setter
    def libraries(self, libraries):
        """
        Sets the libraries of this ComputeConfiguration.

        :param libraries: The libraries of this ComputeConfiguration.
        :type: oci.aidataplatform_dp.models.ComputeConfigurationLibraries
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
