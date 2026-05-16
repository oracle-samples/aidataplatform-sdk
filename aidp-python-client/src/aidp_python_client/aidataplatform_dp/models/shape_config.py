# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ShapeConfig(object):
    """
    Shape of the driver or executor if a flexible shape is used.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ShapeConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param ocpus:
            The value to assign to the ocpus property of this ShapeConfig.
        :type ocpus: int

        :param gpus:
            The value to assign to the gpus property of this ShapeConfig.
        :type gpus: int

        :param memory_in_gbs:
            The value to assign to the memory_in_gbs property of this ShapeConfig.
        :type memory_in_gbs: int

        """
        self.swagger_types = {
            'ocpus': 'int',
            'gpus': 'int',
            'memory_in_gbs': 'int'
        }

        self.attribute_map = {
            'ocpus': 'ocpus',
            'gpus': 'gpus',
            'memory_in_gbs': 'memoryInGBs'
        }

        self._ocpus = None
        self._gpus = None
        self._memory_in_gbs = None

    @property
    def ocpus(self):
        """
        Gets the ocpus of this ShapeConfig.
        Total number of OCPUs used for the driver or workers.


        :return: The ocpus of this ShapeConfig.
        :rtype: int
        """
        return self._ocpus

    @ocpus.setter
    def ocpus(self, ocpus):
        """
        Sets the ocpus of this ShapeConfig.
        Total number of OCPUs used for the driver or workers.


        :param ocpus: The ocpus of this ShapeConfig.
        :type: int
        """
        self._ocpus = ocpus

    @property
    def gpus(self):
        """
        Gets the gpus of this ShapeConfig.
        Total number of GPUs used for the driver or workers.


        :return: The gpus of this ShapeConfig.
        :rtype: int
        """
        return self._gpus

    @gpus.setter
    def gpus(self, gpus):
        """
        Sets the gpus of this ShapeConfig.
        Total number of GPUs used for the driver or workers.


        :param gpus: The gpus of this ShapeConfig.
        :type: int
        """
        self._gpus = gpus

    @property
    def memory_in_gbs(self):
        """
        Gets the memory_in_gbs of this ShapeConfig.
        Amount of memory used for the driver or workers.


        :return: The memory_in_gbs of this ShapeConfig.
        :rtype: int
        """
        return self._memory_in_gbs

    @memory_in_gbs.setter
    def memory_in_gbs(self, memory_in_gbs):
        """
        Sets the memory_in_gbs of this ShapeConfig.
        Amount of memory used for the driver or workers.


        :param memory_in_gbs: The memory_in_gbs of this ShapeConfig.
        :type: int
        """
        self._memory_in_gbs = memory_in_gbs

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
