# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ActiveClusterResources(object):
    """
    Active resources of a cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ActiveClusterResources object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param active_executor_count:
            The value to assign to the active_executor_count property of this ActiveClusterResources.
        :type active_executor_count: float

        :param active_cores:
            The value to assign to the active_cores property of this ActiveClusterResources.
        :type active_cores: float

        :param active_gpu_cores:
            The value to assign to the active_gpu_cores property of this ActiveClusterResources.
        :type active_gpu_cores: float

        :param active_memory_in_gbs:
            The value to assign to the active_memory_in_gbs property of this ActiveClusterResources.
        :type active_memory_in_gbs: float

        :param active_gpu_memory_in_gbs:
            The value to assign to the active_gpu_memory_in_gbs property of this ActiveClusterResources.
        :type active_gpu_memory_in_gbs: float

        """
        self.swagger_types = {
            'active_executor_count': 'float',
            'active_cores': 'float',
            'active_gpu_cores': 'float',
            'active_memory_in_gbs': 'float',
            'active_gpu_memory_in_gbs': 'float'
        }

        self.attribute_map = {
            'active_executor_count': 'activeExecutorCount',
            'active_cores': 'activeCores',
            'active_gpu_cores': 'activeGpuCores',
            'active_memory_in_gbs': 'activeMemoryInGBs',
            'active_gpu_memory_in_gbs': 'activeGpuMemoryInGBs'
        }

        self._active_executor_count = None
        self._active_cores = None
        self._active_gpu_cores = None
        self._active_memory_in_gbs = None
        self._active_gpu_memory_in_gbs = None

    @property
    def active_executor_count(self):
        """
        Gets the active_executor_count of this ActiveClusterResources.
        Count of active executors.


        :return: The active_executor_count of this ActiveClusterResources.
        :rtype: float
        """
        return self._active_executor_count

    @active_executor_count.setter
    def active_executor_count(self, active_executor_count):
        """
        Sets the active_executor_count of this ActiveClusterResources.
        Count of active executors.


        :param active_executor_count: The active_executor_count of this ActiveClusterResources.
        :type: float
        """
        self._active_executor_count = active_executor_count

    @property
    def active_cores(self):
        """
        Gets the active_cores of this ActiveClusterResources.
        Count of active cores.


        :return: The active_cores of this ActiveClusterResources.
        :rtype: float
        """
        return self._active_cores

    @active_cores.setter
    def active_cores(self, active_cores):
        """
        Sets the active_cores of this ActiveClusterResources.
        Count of active cores.


        :param active_cores: The active_cores of this ActiveClusterResources.
        :type: float
        """
        self._active_cores = active_cores

    @property
    def active_gpu_cores(self):
        """
        Gets the active_gpu_cores of this ActiveClusterResources.
        Count of active GPU cores.


        :return: The active_gpu_cores of this ActiveClusterResources.
        :rtype: float
        """
        return self._active_gpu_cores

    @active_gpu_cores.setter
    def active_gpu_cores(self, active_gpu_cores):
        """
        Sets the active_gpu_cores of this ActiveClusterResources.
        Count of active GPU cores.


        :param active_gpu_cores: The active_gpu_cores of this ActiveClusterResources.
        :type: float
        """
        self._active_gpu_cores = active_gpu_cores

    @property
    def active_memory_in_gbs(self):
        """
        Gets the active_memory_in_gbs of this ActiveClusterResources.
        Active memory in GB.


        :return: The active_memory_in_gbs of this ActiveClusterResources.
        :rtype: float
        """
        return self._active_memory_in_gbs

    @active_memory_in_gbs.setter
    def active_memory_in_gbs(self, active_memory_in_gbs):
        """
        Sets the active_memory_in_gbs of this ActiveClusterResources.
        Active memory in GB.


        :param active_memory_in_gbs: The active_memory_in_gbs of this ActiveClusterResources.
        :type: float
        """
        self._active_memory_in_gbs = active_memory_in_gbs

    @property
    def active_gpu_memory_in_gbs(self):
        """
        Gets the active_gpu_memory_in_gbs of this ActiveClusterResources.
        Active GPU memory in GB.


        :return: The active_gpu_memory_in_gbs of this ActiveClusterResources.
        :rtype: float
        """
        return self._active_gpu_memory_in_gbs

    @active_gpu_memory_in_gbs.setter
    def active_gpu_memory_in_gbs(self, active_gpu_memory_in_gbs):
        """
        Sets the active_gpu_memory_in_gbs of this ActiveClusterResources.
        Active GPU memory in GB.


        :param active_gpu_memory_in_gbs: The active_gpu_memory_in_gbs of this ActiveClusterResources.
        :type: float
        """
        self._active_gpu_memory_in_gbs = active_gpu_memory_in_gbs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
